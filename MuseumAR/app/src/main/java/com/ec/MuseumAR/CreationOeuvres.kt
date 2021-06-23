package com.example.appcreationmuseumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.ec.MuseumAR.data.DbDataProvider
import com.ec.MuseumAR.data.model.Oeuvre
import kotlinx.coroutines.*

class CreationOeuvres : AppCompatActivity() {

    private lateinit var db:DbDataProvider

    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    var job : Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creation_oeuvres)

        db = DbDataProvider(this.application)

    }

    fun onClick(view: View) {
        val titre = findViewById<EditText>(R.id.edTitre).text.toString()
        val auteur = findViewById<EditText>(R.id.edAuteur).text.toString()
        val description = findViewById<EditText>(R.id.edDescription).text.toString()
        val o = Oeuvre(titre,description,auteur,"gauche")
        Log.i("oeuvre","${o.oeuvreId}")
        job?.cancel()
        job = activityScope.launch {
            try {
                db.addNewOeuvre(o)
            } catch (e: Exception) {
                Log.e("database", e.message.toString())
            }
        }
    }
}