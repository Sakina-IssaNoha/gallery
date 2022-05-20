package com.example.gallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class gallery4 : AppCompatActivity() {
    lateinit var btnPrevious3 : Button
    lateinit var btnNext4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery4)
        btnPrevious3 = findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            val intent = Intent(this,gallery3::class.java)
            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent = Intent(this,gallery5::class.java)
            startActivity(intent)
        }
    }
}