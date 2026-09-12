package com.example.ela2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ela2.data.ExampleAdapter
import com.example.ela2.data.ExampleRepository
import com.example.ela2.data.FavoritesManager

class FavoritesActivity : AppCompatActivity() {
    private lateinit var adapter: ExampleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_list)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title = "My Saved Projects"
        setSupportActionBar(toolbar)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val favIds = FavoritesManager.getFavorites(this)
        val examples = ExampleRepository.examples.filter { favIds.contains(it.id) }
        adapter = ExampleAdapter(examples, this)
        recyclerView.adapter = adapter
    }
}
