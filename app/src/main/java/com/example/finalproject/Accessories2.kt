package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Accessories2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accessories2)

        findViewById<Button>(R.id.btn_back1_2).setOnClickListener{
            finish()
        }

        findViewById<Button>(R.id.btn_forward1_1).setOnClickListener{
            val intent = Intent (this, Accessories::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<Button>(R.id.btn_next1_2).setOnClickListener{
            val intent = Intent (this, Accessories3::class.java)
            startActivity(intent)
            finish()
        }
    }
}