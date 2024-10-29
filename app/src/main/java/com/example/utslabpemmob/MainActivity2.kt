package com.example.utslabpemmob

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

            val myLayout = findViewById<View>(R.id.main)

        myLayout?.setOnApplyWindowInsetsListener { view, insets ->
            view.onApplyWindowInsets(insets)

        }

        val btnSeemore = findViewById<Button>(R.id.buttSeemore)
        btnSeemore.setOnClickListener {
            val url = "https://www.accuweather.com/en/id/medan/211298/weather-forecast/211298"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}