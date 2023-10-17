package com.example.rentaliin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RentalKendaraan(
    val imgRental: Int,
    val namaRental: String,
    val alamatRental: String,
    val bintangRental: Int
):Parcelable
