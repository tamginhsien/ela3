package com.example.ela2

import com.google.android.material.color.DynamicColors
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ela2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
                DynamicColors.applyToActivitiesIfAvailable(application)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
