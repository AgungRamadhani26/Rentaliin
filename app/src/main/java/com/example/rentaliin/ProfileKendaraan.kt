package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ProfileKendaraan : AppCompatActivity(), View.OnClickListener {
    //Deklarasi tipe dari variabel
    private lateinit var btnPesanSekarang:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_kendaraan)

        //assign varibael yang sudah di Deklarasi
        btnPesanSekarang = findViewById(R.id.btn_pesan_sekarang)
        btnPesanSekarang.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_pesan_sekarang -> {
                val intent = Intent(this@ProfileKendaraan, DetailPesanan::class.java)
                startActivity(intent)
            }
        }
    }
}