package com.example.ela2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.ela2.databinding.ActivitySubmenu22Binding

class Submenu2_2 : AppCompatActivity() {
    private lateinit var binding: ActivitySubmenu22Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubmenu22Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun ImageClick1(view: View) {
        AssetHelper.openPdfFromAssets(this, "ArduinoUNO picture.pdf")
    }

    fun ButtonClick1(view: View) {
        AssetHelper.openPdfFromAssets(this, "ArduinoUNOManual 2.pdf")
    }
}
