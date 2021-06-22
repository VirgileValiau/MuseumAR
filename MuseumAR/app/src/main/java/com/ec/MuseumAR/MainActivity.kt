package com.ec.MuseumAR

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.ec.MuseumAR.data.model.Parcours
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ec.MuseumAR.R
import com.ec.MuseumAR.data.DataProvider
import com.ec.MuseumAR.data.DbDataProvider
import com.ec.MuseumAR.data.adapters.ParcoursAdapter
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.ParcoursWithOeuvres
import github.com.vikramezhil.dks.speech.Dks
import github.com.vikramezhil.dks.speech.DksListener
import kotlinx.coroutines.*


class MainActivity : AppCompatActivity(), ParcoursAdapter.ActionListener {

    var dataSet: MutableList<Parcours>? = null
    val adapter = newAdapter()
    private lateinit var db:DbDataProvider

    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    var job : Job? = null

    private lateinit var dks: Dks
    val RecordAudioRequestCode = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = DbDataProvider(this.application)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerMain)

        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.RECORD_AUDIO
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            checkPermission()
        }
        dks = Dks(application, supportFragmentManager, object: DksListener {
            override fun onDksLiveSpeechResult(liveSpeechResult: String) {
                Log.d(application.packageName, "Speech result - $liveSpeechResult")
            }

            override fun onDksFinalSpeechResult(speechResult: String) {
                Log.d(application.packageName, "Final speech result - $speechResult")
                traitementResult(speechResult)
            }

            override fun onDksLiveSpeechFrequency(frequency: Float) {}

            override fun onDksLanguagesAvailable(defaultLanguage: String?, supportedLanguages: ArrayList<String>?) {
                Log.i("test", "defaultLanguage - $defaultLanguage")
                Log.i("test", "supportedLanguages - $supportedLanguages")

                if (supportedLanguages != null && supportedLanguages.contains("fr-FR")) {
                    // Setting the speech recognition language to english india if found
                    dks.currentSpeechLanguage = "fr-FR"
                }
            }

            override fun onDksSpeechError(errMsg: String) {
                Toast.makeText(application, errMsg, Toast.LENGTH_SHORT).show()
            }
        })

        dks.continuousSpeechRecognition = true
        dks.startSpeechRecognition()

        refresh()

        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        //toScan(1)
        /*
        val vers: Intent
        vers = Intent(this@MainActivity, FinParcours::class.java)
        startActivity(vers)
        */
         
    }

    private fun toScan(idParcours:String){
        job = activityScope.launch {
            try {
                //On récupère l'id de la première oeuvre du parcours choisi
                val parcours : ParcoursWithOeuvres = db.getParcoursWithOeuvresById(idParcours.toLong())
                val Oeuvres:List<Oeuvre> = parcours.oeuvres
                val idFirstOeuvre:Long = Oeuvres[1].oeuvreId
                val direction:String = Oeuvres[1].position
                // Fabrication d'un Bundle de données
                val bdl = Bundle()
                bdl.putString("idParcours", idParcours)
                bdl.putString("idNextOeuvre", idFirstOeuvre.toString())
                bdl.putString("direction", direction)
                // Changer d'activité
                val versScan: Intent
                // Intent explicite
                versScan = Intent(this@MainActivity, ScanActivity::class.java)
                // Ajout d'un bundle à l'intent
                versScan.putExtras(bdl)
                startActivity(versScan)
            } catch (e: Exception) {
                Log.e("database", e.message.toString())
                alerter("Il n'y a pas de parcours $idParcours")
            }
        }
    }

    override fun onPause() {
        super.onPause()
        dks.continuousSpeechRecognition = false
        dks.closeSpeechOperations()
    }

    private fun alerter(s: String) {

        val t = Toast.makeText(this, s, Toast.LENGTH_SHORT)
        t.show()
    }

    override fun onResume() {
        super.onResume()
        refresh()
        dks.continuousSpeechRecognition = true
        dks.startSpeechRecognition()
    }

    private fun refresh() {


        job?.cancel()
        job = activityScope.launch {
            try {
                val data = db.getAllParcours()
                adapter.showData(data)

            } catch (e: Exception) {
                Log.e("database", e.message.toString())
            }
        }
    }

    fun traitementResult(speechResult:String){
        var separateSpeechResult :ArrayList<String> = ArrayList()
        var currentword :String =""
        for(k in 0..(speechResult.length -1)){
            //Log.i("test","k: " + k.toString() + "\t dernier élément: " + speechResult.last().toString())
            //Log.i("test",speechResult)


            if(speechResult[k].toString()== " " ){
                separateSpeechResult.add(currentword)
                currentword = ""
            }
            else if(k == (speechResult.length-1)){
                currentword += speechResult[k].toString()
                separateSpeechResult.add(currentword)
                currentword = ""
            }
            else{
                currentword += speechResult[k].toString()
            }
        }

        var choix :Boolean = false
        var parcours: Boolean = false
        var numero: Int? = null



        for(k in 0..(separateSpeechResult.size -1)) {
            if (separateSpeechResult[k].toIntOrNull() != null) {
                numero = separateSpeechResult[k].toIntOrNull()
                Log.i("Traitement", "il y a un numero $numero: \t ${separateSpeechResult[k]}")
            } else {
                var current: String = ""
                for (j in separateSpeechResult[k]) {
                    current += j
                    if (current == "choi") {
                        //Log.i("Traitement","il y a un choi: \t ${separateSpeechResult[k]}")
                        choix = true
                    } else if (current == "parcou") {
                        // Log.i("Traitement","il y a un parcours: \t ${separateSpeechResult[k]}")
                        parcours = true
                    } else if (current == "un" || current == "hein" || current == "1") {
                        //Log.i("Traitement","il y a un numero 1: \t ${separateSpeechResult[k]}")
                        numero = 1
                    } else if (current == "de" || current == "deu" || current == "2") {
                        // Log.i("Traitement","il y a un numero 2: \t ${separateSpeechResult[k]}")
                        numero = 2
                    } else if (current == "troi" || current == "3") {
                        numero = 3
                        Log.i("Traitement", "il y a un numero 3: \t ${separateSpeechResult[k]}")
                    } else if (current == "quatr" || current == "4") {
                        numero = 4
                        Log.i("Traitement", "il y a un numero 4: \t ${separateSpeechResult[k]}")
                    } else if (current == "cinq" || current == "5") {
                        numero = 5
                        Log.i("Traitement", "il y a un numero 5: \t ${separateSpeechResult[k]}")
                    } else if (current == "six" || current == "6") {
                        numero = 6
                        Log.i("Traitement", "il y a un numero 6: \t ${separateSpeechResult[k]}")
                    }

                }
            }
        }
        if(choix && parcours && numero!=null){
            return onResult(numero)
            //alerter("choix du parcours $numero")
        }

        else{
            return onResult(NO_CORREESPONDANCE)
        }


        //Log.i("Traitement", "choix: $choix \t parcours: $parcours \t numero: $numero \t passer: $passer  \t oeuvre: $oeuvre \t précision: $precision")

    }

    private fun checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.RECORD_AUDIO),
                RecordAudioRequestCode
            )
        }
        //dks.continuousSpeechRecognition = true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == RecordAudioRequestCode && grantResults.size > 0) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) Toast.makeText(
                this,
                "Permission Granted",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    fun onResult(STATE : Int?){

        if(STATE!! < 99){
            dks.closeSpeechOperations()
            dks.continuousSpeechRecognition = false
            toScan(STATE.toString())
        }


        else if(STATE == NO_CORREESPONDANCE){
            alerter("aucune correspondance, veuillez réessayer")

        }
    }

    companion object{
        val CHOIX_PARCOURS_1 = 1
        val CHOIX_PARCOURS_2 = 2
        val CHOIX_PARCOURS_3 = 3
        val CHOIX_PARCOURS_4 = 4
        val CHOIX_PARCOURS_5 = 5
        val CHOIX_PARCOURS_6 = 6
        val GO_NEXT_OEUVRE = 100
        val PRECISION_OEUVRE = 101
        val NO_CORREESPONDANCE = 404

    }

    private fun newAdapter(): ParcoursAdapter {

        val adapter = ParcoursAdapter(
            actionListener = this
        )
        return adapter
    }

    override fun onItemClicked(parcours: Parcours) {
        //ToDo(ajouter les intent vers scan activity)
    }


}