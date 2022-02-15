package com.example.project4

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val email: String,
    val gender: String,
    val isAdult: Boolean
) : Parcelable
