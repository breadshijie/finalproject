package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Accessories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessories)

        findViewById<Button>(R.id.btn_back1_1).setOnClickListener{
            finish()
        }

        findViewById<Button>(R.id.btn_next1_1).setOnClickListener{
            val intent = Intent (this, Accessories2::class.java)
            startActivity(intent)
            finish()
        }
    }
}