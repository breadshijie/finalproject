package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class listen_Mouse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listen_mouse)

        findViewById<Button>(R.id.btn_back3).setOnClickListener{
            val intent = Intent (this, ThirdFragment::class.java)
            startActivity(intent)
            finish()
        }
    }
}