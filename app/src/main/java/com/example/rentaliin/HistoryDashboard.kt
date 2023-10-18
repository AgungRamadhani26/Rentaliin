package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoryDashboard : AppCompatActivity(), View.OnClickListener {
    companion object{
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_dashboard)

        //Untuk recyclerview
        val historyList = listOf<History>(
            History(
                R.drawable.baseline_account_circle_24,
                namaRentalKendaraan = "Martin Soraya Rental",
                waktuPerentalan = "Jumat-Sabtu, 5-6 Des 2023",
                namaKendaraanRental ="Yamaha Mio Coklat"
            ),
            History(
                R.drawable.baseline_account_circle_24,
                namaRentalKendaraan = "Jaya Abadi Sahabat Rental",
                waktuPerentalan = "Senin-Rabu, 5-6 Okt 2023",
                namaKendaraanRental ="Kawasaki W175"
            ),
            History(
                R.drawable.baseline_account_circle_24,
                namaRentalKendaraan = "Cihuahua Polkadot Rental",
                waktuPerentalan = "minggu, 26 Okt 2022",
                namaKendaraanRental ="Honda Beat Merah"
            ),
            History(
                R.drawable.baseline_account_circle_24,
                namaRentalKendaraan = "Bersama Jaya Agung Rental",
                waktuPerentalan = "Kamis, 5 Jan 2022",
                namaKendaraanRental ="Daihhatsu Ayla Ungu"
            ),
            History(
                R.drawable.baseline_account_circle_24,
                namaRentalKendaraan = "Ramadhani Jaya Rental",
                waktuPerentalan = "Senin-Jumat, 23-27 Apr 2021",
                namaKendaraanRental ="Toyota Avanza Hitam"
            ),
            History(
                R.drawable.baseline_account_circle_24,
                namaRentalKendaraan = "Agung Jaya Rental",
                waktuPerentalan = "Selasa, 28 Mar 2021",
                namaKendaraanRental ="Toyota Lancruiser"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_history)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = HistoryAdapter(this, historyList){
        }

        //Intent ke profil pengguna
        val user: ImageView = findViewById(R.id.iv_profile)
        user.setOnClickListener(this)

        //Intent ke history
        val home: ImageView = findViewById(R.id.iv_home)
        home.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.iv_profile -> {
                val intent = Intent(this@HistoryDashboard, ProfilePengguna::class.java)
                startActivity(intent)
            }

            R.id.iv_home -> {
                val intent = Intent(this@HistoryDashboard, Dashboard::class.java)
                startActivity(intent)
            }
        }
    }
}