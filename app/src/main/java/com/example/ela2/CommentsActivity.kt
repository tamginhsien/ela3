package com.example.ela2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class CommentItem(
    val id: String = "",
    val text: String = "",
    val timestamp: Long = 0L
)

class CommentsAdapter(private var comments: List<CommentItem>) : RecyclerView.Adapter<CommentsAdapter.CommentViewHolder>() {

    class CommentViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textBody: TextView = view.findViewById(R.id.text_comment_body)
        val textTime: TextView = view.findViewById(R.id.text_comment_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comment, parent, false)
        return CommentViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
        val comment = comments[position]
        holder.textBody.text = comment.text
        
        val sdf = SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault())
        holder.textTime.text = sdf.format(Date(comment.timestamp))
    }

    override fun getItemCount() = comments.size

    fun updateData(newComments: List<CommentItem>) {
        comments = newComments
        notifyDataSetChanged()
    }
}

class CommentsActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private lateinit var adapter: CommentsAdapter
    private var exampleId: String = "General"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comments)

        exampleId = intent.getStringExtra("EXAMPLE_ID") ?: "General"
        findViewById<TextView>(R.id.text_comments_title).text = "Discussion: "

        val recycler = findViewById<RecyclerView>(R.id.recycler_comments)
        recycler.layoutManager = LinearLayoutManager(this)
        adapter = CommentsAdapter(emptyList())
        recycler.adapter = adapter

        val btnSend = findViewById<View>(R.id.button_send_comment)
        val editInput = findViewById<TextView>(R.id.edit_comment_input)

        btnSend.setOnClickListener {
            val text = editInput.text.toString().trim()
            if (text.isNotEmpty()) {
                sendComment(text)
                editInput.text = ""
            }
        }

        loadComments()
    }

    private fun loadComments() {
        db.collection("Comments").document(exampleId).collection("Messages")
            .orderBy("timestamp", Query.Direction.ASCENDING)
            .addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Toast.makeText(this, "Error: " + e.message, Toast.LENGTH_LONG).show()
                    return@addSnapshotListener
                }
                
                if (snapshot != null) {
                    val commentsList = snapshot.documents.mapNotNull { doc ->
                        val text = doc.getString("text") ?: return@mapNotNull null
                        val timestamp = doc.getLong("timestamp") ?: 0L
                        CommentItem(doc.id, text, timestamp)
                    }
                    adapter.updateData(commentsList)
                    if (commentsList.isNotEmpty()) {
                        findViewById<RecyclerView>(R.id.recycler_comments).scrollToPosition(commentsList.size - 1)
                    }
                }
            }
    }

    private fun sendComment(text: String) {
        val message = hashMapOf(
            "text" to text,
            "timestamp" to System.currentTimeMillis()
        )
        
        db.collection("Comments").document(exampleId).collection("Messages")
            .add(message)
            .addOnFailureListener { e ->
                Toast.makeText(this, "Send Error: " + e.message, Toast.LENGTH_LONG).show()
            }
    }
}
