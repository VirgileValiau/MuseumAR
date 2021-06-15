package com.ec.MuseumAR.data

import com.ec.MuseumAR.data.model.Parcours

object DataProvider {
    private val parcours = mutableListOf<Parcours>(
        Parcours(1,"decouverte",2),
        Parcours(2,"romantisme",3)
    )

    fun getParcours(): MutableList<Parcours> {
        return parcours
    }
}