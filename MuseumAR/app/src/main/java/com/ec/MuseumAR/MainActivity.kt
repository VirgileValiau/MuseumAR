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
    }

    private fun toScan(id:Int){
        // Fabrication d'un Bundle de données
        val bdl = Bundle()
        bdl.putInt("idParcours", id)
        // Changer d'activité
        val versScan: Intent
        // Intent explicite
        versScan = Intent(this@MainActivity, ScanActivity::class.java)
        // Ajout d'un bundle à l'intent
        versScan.putExtras(bdl)
        startActivity(versScan)
    }



    private fun alerter(s: String) {

        val t = Toast.makeText(this, s, Toast.LENGTH_SHORT)
        t.show()
    }

    override fun onResume() {
        super.onResume()
        refresh()
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
        var passer : Boolean = false
        var oeuvre : Boolean = false
        var precision : Boolean = false


        for(k in 0..(separateSpeechResult.size -1)){

            var current: String = ""
            for(j in separateSpeechResult[k]){
                current += j
                if(current == "choi"){
                    //Log.i("Traitement","il y a un choi: \t ${separateSpeechResult[k]}")
                    choix = true
                }
                else if (current == "parcou"){
                   // Log.i("Traitement","il y a un parcours: \t ${separateSpeechResult[k]}")
                    parcours = true
                }
                else if(current =="un" || current == "hein" || current == "1"){
                    //Log.i("Traitement","il y a un numero 1: \t ${separateSpeechResult[k]}")
                    numero = 1
                }
                else if(current =="de" || current == "deux" || current == "2"){
                   // Log.i("Traitement","il y a un numero 1: \t ${separateSpeechResult[k]}")
                    numero = 2
                }
                else if(current == "pass" || current == "suiva"){
                    //Log.i("Traitement","il y a un passe: \t ${separateSpeechResult[k]}")
                    passer = true
                }
                else if(current == "oeuvre" || current == "œuvre" ){
                    //Log.i("Traitement","il y a une œuvre: \t ${separateSpeechResult[k]}")
                    oeuvre = true
                }
                else if(current=="precis" || current=="précis" || current == "descri"){
                    //Log.i("Traitement","il y a une précision: \t ${separateSpeechResult[k]}")
                    precision = true
                }

            }
            if(k <= (separateSpeechResult.size -2)  ){
                //Log.i("traitement","k<2 et on a : ${separateSpeechResult[k]} \${separateSpeechResult[k+1]")
                if(separateSpeechResult[k] == "le" && separateSpeechResult[k+1] == "vent"){
                    //Log.i("traitement", "lol le vent: ${separateSpeechResult[k]} ${separateSpeechResult[k+1]}")
                    oeuvre = true
                }
            }
        }
        if(choix && parcours && numero!=null){
            return onResult(numero)
            //alerter("choix du parcours $numero")
        }
        else if(passer && oeuvre){
            //alerter("on passe à l'oeuvre suivante")
            return onResult(GO_NEXT_OEUVRE)
        }
        else if(oeuvre && precision){
            //alerter("précisions sur l'oeuvre")
            return onResult(PRECISION_OEUVRE)
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
        if(STATE == CHOIX_PARCOURS_1){
            alerter("choix du parcours 1")
            //ToDo( quand on choisis le parcours 1)
            dks.closeSpeechOperations()
            toScan(1)
        }
        else if(STATE == CHOIX_PARCOURS_2){
            alerter("choix du parcours 2")
            toScan(2)
        }
        else if(STATE == GO_NEXT_OEUVRE){
            alerter("on passe à l'oeuvre suivante")
            //ToDo( quand on passe à l'oeuvre suivante)
        }
        else if(STATE == PRECISION_OEUVRE){
            alerter("précisions sur l'oeuvre")
            //ToDo( quand on veut des précisions sur l'oeuvre)
        }
        else if(STATE == NO_CORREESPONDANCE){
            alerter("aucune correspondance, veuillez réessayer")

        }
    }

    companion object{
        val CHOIX_PARCOURS_1 = 1
        val CHOIX_PARCOURS_2 = 2
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