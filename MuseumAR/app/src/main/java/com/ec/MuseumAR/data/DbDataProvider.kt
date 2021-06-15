package com.ec.MuseumAR.data

import android.app.Application
import androidx.room.Room
import com.ec.MuseumAR.data.database.MuseumRoomDatabase
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.Parcours

class DbDataProvider (
    application: Application
) {
    private val roomDatabase =
        Room.databaseBuilder(application, MuseumRoomDatabase::class.java, "museum-room-database.db")
            .build()

    private val oeuvresDao = roomDatabase.oeuvreDao()
    private val parcoursDao = roomDatabase.parcoursDao()
    private val parcoursWithOeuvresDao = roomDatabase.parcoursWithOeuvresDao()

    suspend fun getAllOeuvres() = oeuvresDao.getAllOeuvres()

    suspend fun getOeuvreById(oeuvreId: Long) = oeuvresDao.getOeuvreById(oeuvreId)

    suspend fun addNewOeuvre(newOeuvre: Oeuvre) = oeuvresDao.addNewOeuvre(newOeuvre)

    suspend fun getAllParcours() = parcoursDao.getAllParcours()

    suspend fun getParcoursById(parcoursId: Long) = parcoursDao.getParcoursById(parcoursId)

    suspend fun addNewParcours(newParcours: Parcours) = parcoursDao.addNewParcours(newParcours)

    suspend fun getAllParcoursWithOeuvres() = parcoursWithOeuvresDao.getAllParcoursWithOeuvres()

    suspend fun getParcoursWithOeuvresById(parcoursId: Long) = parcoursWithOeuvresDao.getParcoursWithOeuvresById(parcoursId)
}