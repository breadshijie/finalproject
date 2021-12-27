package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class listen_mic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_production_mic)

        findViewById<Button>(R.id.btn_back1).setOnClickListener{
            val intent = Intent (this, FirstFragment::class.java)
            startActivity(intent)
            finish()
        }

    }
}