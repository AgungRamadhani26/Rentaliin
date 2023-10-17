package com.example.rentaliin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KendaraanAdapter(private val context: Context, private val kendaraan: List<Kendaraan>, var listener:(Kendaraan)->Unit):
    RecyclerView.Adapter<KendaraanAdapter.KendaraanViewHolder>() {
    class KendaraanViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgKendaraan = view.findViewById<ImageView>(R.id.iv_img_kendaraan)
        val namaKendaraan = view.findViewById<TextView>(R.id.tv_nama_kendaraan)

        fun kendaraanBindView(kendaraan: Kendaraan, listener: (Kendaraan) -> Unit) {
            imgKendaraan.setImageResource(kendaraan.imgKendaraan)
            namaKendaraan.text = kendaraan.namaKendaraan
            itemView.setOnClickListener {
                listener(kendaraan)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KendaraanViewHolder {
        return KendaraanAdapter.KendaraanViewHolder(LayoutInflater.from(context).inflate(R.layout.item_kendaraan, parent, false)
        )
    }

    override fun getItemCount(): Int = kendaraan.size

    override fun onBindViewHolder(holder: KendaraanViewHolder, position: Int) {
        holder.kendaraanBindView(kendaraan[position],listener)
    }
}