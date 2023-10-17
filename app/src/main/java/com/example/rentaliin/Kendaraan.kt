package com.example.rentaliin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Kendaraan(
    val imgKendaraan: Int,
    val namaKendaraan: String,
    val tahun: Int,
    val pajak: String,
    val sistemTransmisi: String,
    val keterangan: String
): Parcelable