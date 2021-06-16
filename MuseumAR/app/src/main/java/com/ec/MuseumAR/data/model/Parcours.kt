package com.ec.MuseumAR.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Parcours(
    @PrimaryKey(autoGenerate = true)
    val parcoursId: Long,
    val theme: String,
    // duree en minute
    val duree: Int
)