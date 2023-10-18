package com.example.rentaliin

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProfileKendaraan : AppCompatActivity(), View.OnClickListener {
    //Deklarasi tipe dari variabel
    private lateinit var btnPesanSekarang:Button
    private lateinit var arrowBackKendaraan: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_kendaraan)

        //Mendapatkan data dari profile rental
        val kendaraan = intent.getParcelableExtra<Kendaraan>(ProfileRental.INTENT_PARCELABLE)
        val imgKendaraan = findViewById<ImageView>(R.id.iv_img_kendaraan)
        val namaKendaraan = findViewById<TextView>(R.id.nama_mobil)
        val tahun = findViewById<TextView>(R.id.tahun)
        val pajak = findViewById<TextView>(R.id.pajak)
        val sistemTransmisi = findViewById<TextView>(R.id.sistem_transmisi)
        val keterangan = findViewById<TextView>(R.id.keterangan)

        //agar ketika kendaraan dihalaman profile rental di klik maka akan muncul data kendaraan yang sesuai pada profile kendaraan
        if (kendaraan != null) {
            imgKendaraan.setImageResource(kendaraan.imgKendaraan)
            namaKendaraan.text = kendaraan.namaKendaraan
            tahun.text = kendaraan.tahun.toString()
            pajak.text = kendaraan.pajak
            sistemTransmisi.text = kendaraan.sistemTransmisi
            keterangan.text = kendaraan.keterangan
        }


        //intent ke detail pesanan
        btnPesanSekarang = findViewById(R.id.btn_pesan_sekarang)
        btnPesanSekarang.setOnClickListener(this)

        //inten ke halaman profilerental
        arrowBackKendaraan = findViewById(R.id.arrow_back_kendaraan)
        arrowBackKendaraan.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_pesan_sekarang -> {
                val intent = Intent(this@ProfileKendaraan, DetailPesanan::class.java)
                startActivity(intent)
            }

            R.id.arrow_back_kendaraan -> {
                val intent=Intent(this@ProfileKendaraan, ProfileRental::class.java)
                startActivity(intent)
            }
        }
    }
}