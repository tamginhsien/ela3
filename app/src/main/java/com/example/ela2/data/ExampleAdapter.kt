package com.example.ela2.data

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ela2.CommentsActivity
import com.example.ela2.R
import com.example.ela2.utils.ArduinoSyntaxHighlighter

class ExampleAdapter(
    private val examples: List<Example>,
    private val context: Context
) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    inner class ExampleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textTitle: TextView = view.findViewById(R.id.textTitle)
        val textCode: TextView = view.findViewById(R.id.textCode)
        val buttonCopy: View = view.findViewById(R.id.buttonCopy)
        val buttonFavorite: ImageButton = view.findViewById(R.id.buttonFavorite)
        val imageWiring: ImageView = view.findViewById(R.id.imageWiring)
        val textVideo: TextView = view.findViewById(R.id.textVideo)
        val buttonComments: View = view.findViewById(R.id.buttonComments)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_example, parent, false)
        return ExampleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val example = examples[position]
        
        holder.textTitle.text = example.title
        
        // Highlight Code
        val rawCode = context.getString(example.codeResId)
        holder.textCode.text = ArduinoSyntaxHighlighter.highlight(rawCode)
        
        
        // Favorite Button
        val isFav = FavoritesManager.isFavorite(context, example.id)
        holder.buttonFavorite.setImageResource(if (isFav) R.drawable.ic_heart_filled else R.drawable.ic_heart_outline)
        
        holder.buttonFavorite.setOnClickListener {
            val nowFav = FavoritesManager.toggleFavorite(context, example.id)
            holder.buttonFavorite.setImageResource(if (nowFav) R.drawable.ic_heart_filled else R.drawable.ic_heart_outline)
            val msg = if (nowFav) "Added to Favorites!" else "Removed from Favorites"
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
        
        // Copy Button
        holder.buttonCopy.setOnClickListener {
            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Arduino Code", rawCode)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(context, "Code copied to clipboard!", Toast.LENGTH_SHORT).show()
        }
        
        holder.imageWiring.setImageResource(example.imageResId)
        holder.textVideo.text = example.videoUrl
        
        holder.buttonComments.setOnClickListener {
            val intent = Intent(context, CommentsActivity::class.java).apply {
                putExtra("EXAMPLE_ID", example.title + " (" + example.category + ")")
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = examples.size
}
