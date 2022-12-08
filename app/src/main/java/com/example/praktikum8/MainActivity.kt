package com.example.praktikum8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val edNama = findViewById<EditText>(R.id.edNama)
        val edUsia = findViewById<EditText>(R.id.edUsia)
        val edKota = findViewById<EditText>(R.id.edKota)

        btnSubmit.setOnClickListener {
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString()
            val kota = edKota.text.toString()

            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAMA",nama)
                it.putExtra("EXTRA_USIA",usia)
                it.putExtra("EXTRA_KOTA",kota)
                startActivity(it)
            }
        }
    }
}