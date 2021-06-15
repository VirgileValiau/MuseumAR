package com.ec.MuseumAR.data.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation

@Entity(primaryKeys = ["parcoursId", "oeuvreId"])
data class ParcoursOeuvreCrossRef(
    val parcoursId: Long,
    val oeuvreId: Long
)

data class ParcoursWithOeuvres(
    @Embedded val parcours: Parcours,
    @Relation(
        parentColumn = "parcoursId",
        entityColumn = "oeuvreId",
        associateBy = Junction(ParcoursOeuvreCrossRef::class)
    )
    val oeuvres: List<Oeuvre>
)