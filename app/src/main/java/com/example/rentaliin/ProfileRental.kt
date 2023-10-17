package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfileRental : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_rental)

        //mendapatkan data dari dashboard
        val rental_kendaraan = intent.getParcelableExtra<RentalKendaraan>(Dashboard.INTENT_PARCELABLE)
        val imgRental = findViewById<ImageView>(R.id.iv_gambarrental)
        val namaRental = findViewById<TextView>(R.id.tv_namarental)
        val alamatRental = findViewById<TextView>(R.id.tv_alamatrental)

        imgRental.setImageResource(rental_kendaraan?.imgRental!!)
        namaRental.text = rental_kendaraan.namaRental
        alamatRental.text = rental_kendaraan.alamatRental

        //Untuk recyclerview
        val kendaraanList = listOf<Kendaraan>(
            Kendaraan(
                R.drawable.kendaraanlandcruiser,
                namaKendaraan = "Toyota Lancruiser",
                tahun = 2016,
                pajak =  "Aktif Hingga 12 Oktober 2024",
                sistemTransmisi = "Manual",
                keterangan = "Sebuah mobil SUV 7 Seater dengan kondisi yang baik dan memadai untuk perjalanan jauh."
            ),
            Kendaraan(
                R.drawable.kendaraanavanzahitam,
                namaKendaraan = "Toyota Avanza Hitam",
                tahun = 2018,
                pajak =  "Aktif Hingga 11 September 2025",
                sistemTransmisi = "Manual",
                keterangan = "Sebuah mobil SUV 6 Seater dengan kondisi yang baik dan memadai untuk perjalanan jauh."
            ),
            Kendaraan(
                R.drawable.kendaraanayla,
                namaKendaraan = "Daihhatsu Ayla Ungu",
                tahun = 2017,
                pajak =  "Aktif Hingga 27 Oktober 2025",
                sistemTransmisi = "Matic",
                keterangan = "Sebuah mobil SUV 5 Seater dengan kondisi yang baik dan memadai untuk perjalanan jauh."
            ),
            Kendaraan(
                R.drawable.kendaraanbeat,
                namaKendaraan = "Honda Beat Merah",
                tahun = 2021,
                pajak =  "Aktif Hingga 06 Januari 2026",
                sistemTransmisi = "Matic",
                keterangan = "Sepeda motor matic yang gesit dan nyaman digunakan"
            ),
            Kendaraan(
                R.drawable.kendaraankawasakiw175,
                namaKendaraan = "Kawasaki W175",
                tahun = 2021,
                pajak =  "Aktif Hingga 12 Februari 2026",
                sistemTransmisi = "Manual",
                keterangan = "Sepeda motor keren, cocok untuk perjalanan jauh"
            ),
            Kendaraan(
                R.drawable.kendaraanmio,
                namaKendaraan = "Yamaha Beat Coklat",
                tahun = 2021,
                pajak =  "Aktif Hingga 26 Maret 2024",
                sistemTransmisi = "Matic",
                keterangan = "Sepeda motor matic yang nyaman dan hemat BBM"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kendaraan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = KendaraanAdapter(this, kendaraanList){
            val intent = Intent(this, ProfileKendaraan::class.java)
            intent.putExtra(ProfileRental.INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}