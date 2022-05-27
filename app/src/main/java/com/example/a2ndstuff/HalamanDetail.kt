package com.example.a2ndstuff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HalamanDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var back: TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_detail)

        back = findViewById<TextView>(R.id.textView2);
        back.setOnClickListener {
            val detail = Intent(this@HalamanDetail, HalamanAwal::class.java)
            startActivity(detail)
        }
    }
}