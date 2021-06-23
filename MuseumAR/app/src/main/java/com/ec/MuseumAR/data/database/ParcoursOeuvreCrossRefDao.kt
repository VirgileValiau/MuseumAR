package com.ec.MuseumAR.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef

@Dao
interface ParcoursOeuvreCrossRefDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNewRelations(newRelations: List<ParcoursOeuvreCrossRef>)

    @Query("DELETE FROM ParcoursOeuvreCrossRef WHERE parcoursId = :parcoursId AND oeuvreId = :oeuvreId")
    suspend fun deleteRelation(parcoursId: Long, oeuvreId: Long)
}