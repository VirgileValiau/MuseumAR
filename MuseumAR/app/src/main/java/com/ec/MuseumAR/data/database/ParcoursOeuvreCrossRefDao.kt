package com.ec.MuseumAR.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef

@Dao
interface ParcoursOeuvreCrossRefDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNewRelations(newRelations: List<ParcoursOeuvreCrossRef>)
}