package com.example.ela2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.ela2.databinding.ActivitySubmenu21Binding

class Submenu2_1 : AppCompatActivity() {
    private lateinit var binding: ActivitySubmenu21Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubmenu21Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun ImageClick1(view: View) {
        AssetHelper.openPdfFromAssets(this, "ArduinoMEGA picture.pdf")
    }

    fun ButtonClick1(view: View) {
        AssetHelper.openPdfFromAssets(this, "ArduinoMEGAManual 2.pdf")
    }
}
