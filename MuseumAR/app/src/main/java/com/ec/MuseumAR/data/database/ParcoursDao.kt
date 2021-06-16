package com.ec.MuseumAR.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ec.MuseumAR.data.model.Parcours

@Dao
interface ParcoursDao {
    @Query("SELECT * FROM parcours")
    suspend fun getAllParcours(): MutableList<Parcours>

    @Query("SELECT * FROM parcours WHERE parcoursId = :parcoursId")
    suspend fun getParcoursById(parcoursId: Long): Parcours

    @Insert
    suspend fun addNewParcours(newParcours: Parcours)
}