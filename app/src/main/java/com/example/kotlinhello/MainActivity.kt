package com.example.kotlinhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello = findViewById<TextView>(R.id.btnHello)
        val tvHello = findViewById<TextView>(R.id.tvHello)
        btnHello.setOnClickListener {
            tvHello.text = "Hello from kotlin"
        }
    }
}