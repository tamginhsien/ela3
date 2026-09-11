package com.example.ela2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ela2.databinding.ActivitySubmenu32Binding

class Submenu3_2 : AppCompatActivity() {
    private lateinit var binding: ActivitySubmenu32Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubmenu32Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun openComments(view: android.view.View) {
        val exampleId = view.tag.toString()
        val intent = android.content.Intent(this, CommentsActivity::class.java).apply {
            putExtra("EXAMPLE_ID", exampleId)
        }
        startActivity(intent)
    }
}