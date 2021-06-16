package com.ec.MuseumAR.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ec.MuseumAR.data.model.Oeuvre

@Dao
interface OeuvreDao {
    @Query("SELECT * FROM oeuvre")
    suspend fun getAllOeuvres(): List<Oeuvre>

    @Query("SELECT * FROM oeuvre WHERE oeuvreId = :oeuvreId")
    suspend fun getOeuvreById(oeuvreId: Long): Oeuvre

    @Insert
    suspend fun addNewOeuvre(newOeuvre: Oeuvre)
}