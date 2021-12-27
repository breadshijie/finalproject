package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity","onCreate");
        val adapter = ViewPagerAdapter(supportFragmentManager)
        findViewById<ViewPager>(R.id.viewPager).adapter = adapter

        val btn_choice = findViewById<Button>(R.id.btn_choice)?.setOnClickListener{
            val intent = Intent (this,listen_mic::class.java)
            startActivity(intent)
        }
    }


    override fun onRestart() {
        super.onRestart()
        Log.e("<MainActivity","onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }

}

class ViewPagerAdapter(fm: androidx.fragment.app.FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(position: Int) = when(position){
        0 -> FirstFragment()
        1 -> SecondFragment()
        else -> ThirdFragment()
    }
    override fun getCount() = 3
}