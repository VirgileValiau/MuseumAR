package com.ec.MuseumAR.data.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface PositionDao {
    @Query("SELECT :toId FROM Position WHERE id = :fromId")
    suspend fun getPosition(fromId: Long, toId: String): String?
}