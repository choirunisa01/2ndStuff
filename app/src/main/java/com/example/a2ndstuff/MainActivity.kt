package com.example.a2ndstuff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button


class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var btnMulai: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMulai = findViewById(R.id.btn_mulai)
        btnMulai.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_mulai -> {
                val Halaman = Intent(this@MainActivity, HalamanAwal::class.java)
                startActivity(Halaman)
            }
        }
    }

}