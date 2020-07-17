package com.qoolqas.miayam.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    val image: Int? = null,
    val name: String? = null,
    val harga: String? = null,
    val deskripsi: String? = null
) : Parcelable