package com.ec.MuseumAR.data.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.ec.MuseumAR.data.model.ParcoursWithOeuvres

@Dao
interface ParcoursWithOeuvresDao {
    @Transaction
    @Query("SELECT * FROM parcours")
    suspend fun getAllParcoursWithOeuvres(): List<ParcoursWithOeuvres>

    @Transaction
    @Query("SELECT * FROM parcours WHERE parcoursId = :parcoursId")
    suspend fun getParcoursWithOeuvresById(parcoursId: Long): ParcoursWithOeuvres
}