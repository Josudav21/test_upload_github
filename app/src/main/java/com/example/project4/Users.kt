package com.example.project4

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Users(
    var listOfUser: List<User>
) : Parcelable
