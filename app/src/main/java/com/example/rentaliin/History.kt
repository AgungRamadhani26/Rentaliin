package com.example.rentaliin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class History(
    val imgRentalKendaraan: Int,
    val namaRentalKendaraan: String,
    val namaKendaraanRental: String,
    val waktuPerentalan: String
):Parcelable
