package com.example.praktikum8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvhasil = findViewById<TextView>(R.id.tvhasil)

        val nama = intent.getStringExtra("EXTRA_NAMA")
        val usia = intent.getStringExtra("EXTRA_USIA")
        val kota = intent.getStringExtra("EXTRA_KOTA")

        val hasildata = "Nama anda adalah : $nama \n"+
                "Usia anda : $usia \n" +
                "Alamat anda : $kota \n"

        tvhasil.text = hasildata

        val btnClick2 = findViewById<Button>(R.id.btnBack)
        btnClick2.setOnClickListener {
            finish()
        }
    }
}