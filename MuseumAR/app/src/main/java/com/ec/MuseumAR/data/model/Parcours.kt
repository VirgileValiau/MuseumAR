package com.ec.MuseumAR.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Parcours(
    @PrimaryKey(autoGenerate = true)
    private val parcoursId: Long,
    private val theme: String,
    // duree en minute
    private val duree: Int,
)