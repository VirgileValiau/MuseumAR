package com.ec.MuseumAR

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.ec.MuseumAR.data.DbDataProvider
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.ParcoursWithOeuvres
import github.com.vikramezhil.dks.speech.Dks
import github.com.vikramezhil.dks.speech.DksListener
import kotlinx.coroutines.*


class InformationsActivity: AppCompatActivity() {

    private lateinit var db: DbDataProvider
    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    private lateinit var dks: Dks
    val RecordAudioRequestCode = 1
    var job : Job? = null
    private lateinit var idParcours:String
    private lateinit var idOeuvre:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informations)
        db = DbDataProvider(this.application)

        //Récupération de l'id de l'oeuvre et de l'id du parcours
        val bdl = this.intent.extras
        idOeuvre = bdl!!.getString("idOeuvre").toString()
        idParcours = bdl!!.getString("idParcours").toString()
        if (idOeuvre != null) {
            alerter(idOeuvre)
            AfficherContenuOeuvre(idOeuvre)
        }else{
            alerter("id nulle")
        }



        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.RECORD_AUDIO
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            checkPermission()
        }
        DKSCreation()


    }

    private fun AfficherContenuOeuvre(id: String){
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

    private fun toScan(idParcours: String){
        job = activityScope.launch {
            try {
                //On récupère l'id de la première oeuvre du parcours choisi
                val parcours : ParcoursWithOeuvres = db.getParcoursWithOeuvresById(idParcours.toLong())
                val Oeuvres:List<Oeuvre> = parcours.oeuvres
                var ordre:Int = 0
                var fin:Boolean = false
                for (i in Oeuvres.indices){
                    if (Oeuvres[i].oeuvreId == idOeuvre.toLong()){
                        if (i==Oeuvres.lastIndex){
                            fin=true
                        }else{
                            ordre = i+1
                        }
                    }
                }

                if (fin){

                }else{
                    //récupération de l'id de l'oeuvre suivante et de sa direction
                    val idNextOeuvre:Long = Oeuvres[ordre].oeuvreId
                    val directionNextOeuvre:String = Oeuvres[ordre].position
                    // Fabrication d'un Bundle de données
                    val bdl = Bundle()
                    bdl.putString("idParcours", idParcours)
                    bdl.putString("idNextOeuvre", idNextOeuvre.toString())
                    bdl.putString("direction", directionNextOeuvre)
                    // Changer d'activité
                    val versScan: Intent
                    // Intent explicite
                    versScan = Intent(this@InformationsActivity, ScanActivity::class.java)
                    // Ajout d'un bundle à l'intent
                    versScan.putExtras(bdl)
                    startActivity(versScan)
                }
            } catch (e: Exception) {
                Log.e("database", e.message.toString())
            }
        }
    }

    private fun DKSCreation(){

        dks = Dks(application, supportFragmentManager, object : DksListener {
            override fun onDksLiveSpeechResult(liveSpeechResult: String) {
                Log.d(application.packageName, "Speech result - $liveSpeechResult")
            }

            override fun onDksFinalSpeechResult(speechResult: String) {
                Log.d(application.packageName, "Final speech result - $speechResult")
                traitementResultInfo(speechResult)
            }

            override fun onDksLiveSpeechFrequency(frequency: Float) {}

            override fun onDksLanguagesAvailable(
                defaultLanguage: String?,
                supportedLanguages: ArrayList<String>?
            ) {
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

    }

    override fun onResume(){
        super.onResume()
        DKSCreation()
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop","STOP")
        dks.closeSpeechOperations()
        dks.continuousSpeechRecognition = false

    }



    fun traitementResultInfo(speechResult:String){
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

        var passer : Boolean = false
        var oeuvre : Boolean = false
        var precision : Boolean = false


        for(k in 0..(separateSpeechResult.size -1)) {

                var current: String = ""
                for (j in separateSpeechResult[k]) {
                    current += j
                     if (current == "pass" || current == "suiva" || current == "suiva") {
                        //Log.i("Traitement","il y a un passe: \t ${separateSpeechResult[k]}")
                        passer = true
                    } else if (current == "oeuvre" || current == "œuvre") {
                        //Log.i("Traitement","il y a une œuvre: \t ${separateSpeechResult[k]}")
                        oeuvre = true
                    } else if (current == "precis" || current == "précis" || current == "descri") {
                        //Log.i("Traitement","il y a une précision: \t ${separateSpeechResult[k]}")
                        precision = true
                    }

                }
                if (k <= (separateSpeechResult.size - 2)) {
                    //Log.i("traitement","k<2 et on a : ${separateSpeechResult[k]} \${separateSpeechResult[k+1]")
                    if (separateSpeechResult[k] == "le" && separateSpeechResult[k + 1] == "vent") {
                        //Log.i("traitement", "lol le vent: ${separateSpeechResult[k]} ${separateSpeechResult[k+1]}")
                        oeuvre = true
                    }
                }

        }

        if(passer && oeuvre){
            //alerter("on passe à l'oeuvre suivante")
            return onResult(MainActivity.GO_NEXT_OEUVRE)
        }
        else if(oeuvre && precision){
            //alerter("précisions sur l'oeuvre")
            return onResult(MainActivity.PRECISION_OEUVRE)
        }
        else{
            return onResult(MainActivity.NO_CORREESPONDANCE)
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

    fun onResult(STATE: Int?){

        if(STATE == GO_NEXT_OEUVRE){
            alerter("oeuvre suivante")
            dks.closeSpeechOperations()
            dks.continuousSpeechRecognition = false
            toScan(idParcours)
        }
        else if(STATE == PRECISION_OEUVRE){
            alerter("précisions sur l'oeuvre")
            //ToDo( quand on veut des précisions sur l'oeuvre)
        }
        else if(STATE == NO_CORREESPONDANCE){
            dks.startSpeechRecognition()
            dks.continuousSpeechRecognition = true
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
}