package com.ec.MuseumAR.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.Parcours
import com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef

@Database(
    entities = [
        Oeuvre::class,
        Parcours::class,
        ParcoursOeuvreCrossRef::class
    ],
    version = 1
)
abstract class MuseumRoomDatabase : RoomDatabase() {
    abstract fun oeuvreDao(): OeuvreDao
    abstract fun parcoursDao(): ParcoursDao
    abstract fun parcoursWithOeuvresDao(): ParcoursWithOeuvresDao
}