package com.example.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gallery5 : AppCompatActivity() {
    lateinit var btnPrevious4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery5)
        btnPrevious4 = findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            var intent = Intent(this,gallery4::class.java)
            startActivity(intent)
        }
    }
}