package com.ec.MuseumAR

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ec.MuseumAR.data.DbDataProvider
import kotlinx.coroutines.*

class InformationsActivity: AppCompatActivity() {

    private lateinit var db: DbDataProvider
    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    var job : Job? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informations)
        db = DbDataProvider(this.application)

        //Récupération de l'id de l'oeuvre
        val bdl = this.intent.extras
        val idOeuvre = bdl!!.getString("idOeuvre")
        if (idOeuvre != null) {
            alerter(idOeuvre)
            AfficherContenuOeuvre(idOeuvre)
        }else{
            alerter("id nulle")
        }
    }

    private fun AfficherContenuOeuvre(id:String){
        job = activityScope.launch {
            try {
                val oeuvre = db.getOeuvreById(id.toLong())
                alerter(oeuvre.toString())

                val titre_db:String = oeuvre.oeuvreTitre
                val des_db:String = oeuvre.description
                val auteur_db:String = oeuvre.auteur

                val titre_ly: TextView = findViewById(R.id.Titre)
                val des_ly: TextView = findViewById(R.id.Description)
                val auteur_ly: TextView = findViewById(R.id.Auteur)

                titre_ly.setText(titre_db)
                des_ly.setText(des_db)
                auteur_ly.setText(auteur_db)

            } catch (e: Exception) {
                Log.e("PROJET", e.message.toString())
            }
        }
    }

    private fun alerter(s: String) {
        Log.i("PROJET", s)
        val t = Toast.makeText(this, s, Toast.LENGTH_SHORT)
        t.show()
    }


}