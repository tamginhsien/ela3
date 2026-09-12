package com.example.ela2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import com.example.ela2.data.ExampleAdapter
import com.example.ela2.data.ExampleRepository

class Submenu3_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_list)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.title = "Arduino MEGA Examples"
        setSupportActionBar(toolbar)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        val examples = ExampleRepository.getExamplesByCategory("MEGA")
        recyclerView.adapter = ExampleAdapter(examples, this)
    }
}
