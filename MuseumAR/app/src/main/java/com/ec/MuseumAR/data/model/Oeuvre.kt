package com.ec.MuseumAR.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Oeuvre(
    @PrimaryKey(autoGenerate = true)
    val oeuvreId: Long,
    val oeuvreTitre: String,
    val description: String,
    val auteur: String
//    val position: String
)