package com.example.ela2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.ela2.databinding.ActivitySubmenu23Binding

class Submenu2_3 : AppCompatActivity() {
    private lateinit var binding: ActivitySubmenu23Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubmenu23Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun ImageClick1(view: View) {
        AssetHelper.openPdfFromAssets(this, "ArduinoNANO picture.pdf")
    }

    fun ButtonClick1(view: View) {
        AssetHelper.openPdfFromAssets(this, "ArduinoNanoManual.pdf")
    }
}
