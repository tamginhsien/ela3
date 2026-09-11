package com.example.ela2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ela2.databinding.ActivityPinsArduinounoPictureBinding

class PinsArduinoUnoPicture : AppCompatActivity() {
    private lateinit var binding: ActivityPinsArduinounoPictureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinsArduinounoPictureBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
