package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Accessories3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessories3)

        findViewById<Button>(R.id.btn_back1_3).setOnClickListener{
            finish()
        }

        findViewById<Button>(R.id.btn_forward1_2).setOnClickListener{
            val intent = Intent (this, Accessories2::class.java)
            startActivity(intent)
            finish()
        }



    }
}