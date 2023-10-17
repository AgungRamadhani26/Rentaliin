package com.example.rentaliin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dashboard : AppCompatActivity(), View.OnClickListener {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        //Untuk recyclerview
        val rentalKendaraanList = listOf<RentalKendaraan>(
            RentalKendaraan(
                R.drawable.baseline_account_circle_24,
                namaRental = "Agung Jaya Rental",
                alamatRental = "Jl. Pegangsaan Timur No. 45",
                R.drawable.baseline_star_24
            ),
            RentalKendaraan(
                R.drawable.baseline_account_circle_24,
                namaRental = "Ramadhani Jaya Rental",
                alamatRental = "Jl. Timoho Raya Timur No. 45",
                R.drawable.baseline_star_24
            ),
            RentalKendaraan(
                R.drawable.baseline_account_circle_24,
                namaRental = "Bersama Jaya Agung Rental",
                alamatRental = "Jl. Rajamin Purba Sh No. 16",
                R.drawable.baseline_star_24
            ),
            RentalKendaraan(
                R.drawable.baseline_account_circle_24,
                namaRental = "Cihuahua Polkadot Rental",
                alamatRental = "Jl. Semarang Barat No. 5",
                R.drawable.baseline_star_24
            ),
            RentalKendaraan(
                R.drawable.baseline_account_circle_24,
                namaRental = "Jaya Abadi Sahabat Rental",
                alamatRental = "Jl. Semarang Timur No. 8",
                R.drawable.baseline_star_24
            ),
            RentalKendaraan(
                R.drawable.baseline_account_circle_24,
                namaRental = "Martin Soraya Rental",
                alamatRental = "Jl. Medan Timur No. 9",
                R.drawable.baseline_star_24
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_rentalkendaraan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = RentalKendaraanAdapter(this, rentalKendaraanList){
            val intent = Intent(this, ProfileRental::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        //Intent ke profil pengguna
        val user: ImageView = findViewById(R.id.iv_profile)
        user.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.iv_profile -> {
                val intent = Intent(this@Dashboard, ProfilePengguna::class.java)
                startActivity(intent)
            }
        }
    }
}