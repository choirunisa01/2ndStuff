package com.example.a2ndstuff

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity

class HalamanAwal : AppCompatActivity() {
    lateinit var gridView: GridView
    private lateinit var detailInfo: TextView

    private var title = arrayOf("Jas Laboratorium", "Buku Kalkulus Edisi 5", "Buku Fisika Dasar 1", "Buku Biologi Umum", "Keyboard Mekanik Bekas", "Pipet Tetes (10 Pcs)")
    private var price = arrayOf("Rp 50.000", "Rp 40.000", "Rp 45.000", "Rp 50.000", "Rp 60.000", "Rp 20.000")
    private var images = intArrayOf(R.drawable.jas, R.drawable.kalkulus, R.drawable.fisika, R.drawable.biologi,
                         R.drawable.background, R.drawable.background, R.drawable.background, R.drawable.background, R.drawable.background)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_awal)
        gridView = findViewById(R.id.gridView)
        val mainAdapter = MainAdapter(this@HalamanAwal, title, price, images)
        gridView.adapter = mainAdapter

        gridView.onItemClickListener = OnItemClickListener { _, _, position, _ ->
           // Toast.makeText(applicationContext, "You Clicked" + title[+position], Toast.LENGTH_SHORT).show()
            val halamanDetail = Intent(this@HalamanAwal, HalamanDetail::class.java)
            startActivity(halamanDetail)
        }

        detailInfo = findViewById<TextView>(R.id.detail);
        detailInfo.setOnClickListener {
            val halamanInfo = Intent(this@HalamanAwal, HalamanInfo::class.java)
            startActivity(halamanInfo)
        }
    }
}