package com.ec.MuseumAR.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Oeuvre(
    val oeuvreTitre: String,
    val description: String,
    val auteur: String,
//    val position: String
    @PrimaryKey(autoGenerate = true)
    val oeuvreId: Long = 0
)