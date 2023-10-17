package com.example.rentaliin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RentalKendaraanAdapter(private val context: Context, private val rental_kendaraan: List<RentalKendaraan>, var listener:(RentalKendaraan)->Unit):
    RecyclerView.Adapter<RentalKendaraanAdapter.RentalKendaraanViewHolder>(){
    class RentalKendaraanViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgRental = view.findViewById<ImageView>(R.id.iv_gambarrental)
        val namaRental = view.findViewById<TextView>(R.id.tv_namarental)
        val alamatRental = view.findViewById<TextView>(R.id.tv_alamatrental)
        val bintangRental = view.findViewById<ImageView>(R.id.iv_bintangrental)

        fun rentalBindView(rental_kendaraan: RentalKendaraan, listener: (RentalKendaraan) -> Unit){
            imgRental.setImageResource(rental_kendaraan.imgRental)
            namaRental.text = rental_kendaraan.namaRental
            alamatRental.text = rental_kendaraan.alamatRental
            bintangRental.setImageResource(rental_kendaraan.bintangRental)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RentalKendaraanViewHolder {
        return RentalKendaraanViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rental_kendaraan, parent, false))
    }

    override fun getItemCount(): Int = rental_kendaraan.size

    override fun onBindViewHolder(holder: RentalKendaraanViewHolder, position: Int) {
        holder.rentalBindView(rental_kendaraan[position],listener)
    }

}