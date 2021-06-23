package com.ec.MuseumAR.data

import android.app.Application
import androidx.room.Room
import com.ec.MuseumAR.data.database.MuseumRoomDatabase
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.Parcours
import com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef

class DbDataProvider (
    val application: Application
) {
    private val roomDatabase =
        Room.databaseBuilder(application, MuseumRoomDatabase::class.java, "museum-room-database")
            .createFromAsset("database/test.db")
            .build()

    private val oeuvresDao = roomDatabase.oeuvreDao()
    private val parcoursDao = roomDatabase.parcoursDao()
    private val parcoursWithOeuvresDao = roomDatabase.parcoursWithOeuvresDao()
    private val positionDao = roomDatabase.positionDao()
    private val parcoursOeuvreCrossRefDao = roomDatabase.parcoursOeuvreCrossRefDao()

    suspend fun getAllOeuvres() = oeuvresDao.getAllOeuvres()

    suspend fun getOeuvreById(oeuvreId: Long) = oeuvresDao.getOeuvreById(oeuvreId)

    suspend fun addNewOeuvre(newOeuvre: Oeuvre) = oeuvresDao.addNewOeuvre(newOeuvre)

    suspend fun getAllParcours() = parcoursDao.getAllParcours()

    suspend fun getParcoursById(parcoursId: Long) = parcoursDao.getParcoursById(parcoursId)

    suspend fun addNewParcours(newParcours: Parcours) = parcoursDao.addNewParcours(newParcours)

    suspend fun getAllParcoursWithOeuvres() = parcoursWithOeuvresDao.getAllParcoursWithOeuvres()

    suspend fun getParcoursWithOeuvresById(parcoursId: Long) = parcoursWithOeuvresDao.getParcoursWithOeuvresById(parcoursId)

    suspend fun getPosition(fromId: Long, toId: Long) = positionDao.getPosition(fromId, "to$toId")

    suspend fun addNewRelations(newRelations: List<ParcoursOeuvreCrossRef>) = parcoursOeuvreCrossRefDao.addNewRelations(newRelations)

    suspend fun deleteRelation(parcoursId: Long, oeuvreId: Long) = parcoursOeuvreCrossRefDao.deleteRelation(parcoursId, oeuvreId)
}