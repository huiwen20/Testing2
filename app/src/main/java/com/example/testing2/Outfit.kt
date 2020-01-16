package com.example.testing2

import androidx.room.Entity

@Entity(tableName = "outfit")
data class Outfit (
    val image: Int,
    val imageType: String,
    val imageDesc: String

)