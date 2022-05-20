package com.example.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gallery3 : AppCompatActivity() {
    lateinit var btnPrevious2 : Button
    lateinit var btnNext3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery3)
        btnNext3 = findViewById(R.id.btnNext3)
        btnPrevious2 = findViewById(R.id.btnPrevious2)
        btnNext3.setOnClickListener {
           val intent = Intent(this,gallery4::class.java)
            startActivity(intent)
        }
        btnPrevious2.setOnClickListener {
            val intent = Intent(this,gallery2::class.java)
            startActivity(intent)
        }
    }
}