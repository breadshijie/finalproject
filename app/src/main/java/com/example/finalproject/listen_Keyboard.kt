package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class listen_Keyboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listen_keyboard)

        findViewById<Button>(R.id.btn_back2).setOnClickListener{
            val intent = Intent (this, SecondFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}