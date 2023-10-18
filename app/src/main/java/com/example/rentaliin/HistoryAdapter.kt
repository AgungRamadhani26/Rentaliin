package com.example.rentaliin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter(private val context: Context, private val history: List<History>, var listener:(History)->Unit):
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>(){
        class HistoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val imgRentalKendaraan = view.findViewById<ImageView>(R.id.iv_img_rental_kendaraan)
            val namaRentalKendaraan = view.findViewById<TextView>(R.id.tv_nama_rental_kendaraan)
            val namaKendaraanRental = view.findViewById<TextView>(R.id.tv_nama_kendaraan_rental)
            val waktuPerentalan = view.findViewById<TextView>(R.id.tv_waktu_perentalan)

            fun historyBindView(history: History, listener: (History) -> Unit) {
                imgRentalKendaraan.setImageResource(history.imgRentalKendaraan)
                namaRentalKendaraan.text = history.namaRentalKendaraan
                namaKendaraanRental.text = history.namaKendaraanRental
                waktuPerentalan.text = history.waktuPerentalan
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        return HistoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_history, parent, false))
    }

    override fun getItemCount(): Int = history.size

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.historyBindView(history[position],listener)
    }
}