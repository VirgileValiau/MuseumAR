package com.ec.MuseumAR


import android.Manifest
import android.content.Intent
import android.graphics.Camera
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.ec.MuseumAR.data.DbDataProvider
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.ParcoursWithOeuvres
import com.google.zxing.Result
import kotlinx.coroutines.*
import me.dm7.barcodescanner.zxing.ZXingScannerView
import kotlin.properties.Delegates


class ScanActivity: AppCompatActivity(), ZXingScannerView.ResultHandler {

    lateinit var mScannerView: ZXingScannerView
    lateinit var mCameraView: FrameLayout
    lateinit var message: TextView
    lateinit var fleche: ImageView
    lateinit var idParcours:String
    lateinit var idNextOeuvre:String
    lateinit var direction:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scan_activity)

        message = findViewById(R.id.mes)
        mCameraView = findViewById(R.id.camera_preview)
        fleche = findViewById(R.id.fleche)

        //  initialise le scanner view
        mScannerView = ZXingScannerView(this)
        mScannerView.setAutoFocus(true)
        mCameraView.addView(mScannerView)

        val bdl = this.intent.extras
        if (bdl != null) {
            idParcours = bdl.getString("idParcours").toString()
            idNextOeuvre = bdl.getString("idNextOeuvre").toString()
            direction = bdl.getString("direction").toString()
            if ((direction == "Droite") || (direction == "droite")){
                fleche.setImageResource(R.drawable.fleche_droite)
            }else if ((direction == "Gauche") || (direction == "gauche")){
                fleche.setImageResource(R.drawable.fleche_gauche)
            }else{
                fleche.setImageResource(R.drawable.fleche_haut)
            }
        }


        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 1)

        // Register ourselves as a handler for scan results. handler to save results of the scan
        mScannerView.setResultHandler(this)
        //Start scanning
        mScannerView.startCamera()

    }

    override fun handleResult(result: Result) {
        Log.i("scaned", result.getText()) // affiche le resultat
        val idOeuvre = result.getText()
        if (result.getText() == idNextOeuvre){
            toInfos(idOeuvre)
        }else{
            alerter("Ce n'est pas l'oeuvre attendu, rééssayez")
            mScannerView.startCamera()
            // Fabrication d'un Bundle de données
            val bdl = Bundle()
            bdl.putString("idParcours", idParcours)
            bdl.putString("idNextOeuvre", idNextOeuvre)
            bdl.putString("direction", direction)
            // Changer d'activité
            val versScan: Intent
            // Intent explicite
            versScan = Intent(this@ScanActivity, ScanActivity::class.java)
            // Ajout d'un bundle à l'intent
            versScan.putExtras(bdl)
            startActivity(versScan)
        }
    }

    private fun alerter(s: String) {
        Log.i("PROJET", s)
        val t = Toast.makeText(this, s, Toast.LENGTH_SHORT)
        t.show()
    }

    private fun toInfos(idOeuvre: String){
        // Fabrication d'un Bundle de données
        val bdl = Bundle()
        bdl.putString("idOeuvre", idOeuvre)
        bdl.putString("idParcours", idParcours.toString())
        // Changer d'activité
        val versInfos: Intent
        // Intent explicite
        versInfos = Intent(this@ScanActivity, InformationsActivity::class.java)
        // Ajout d'un bundle à l'intent
        versInfos.putExtras(bdl)
        startActivity(versInfos)
    }

/*
    override fun onPause() {
        //Called when activity is paused
        super.onPause()
        mScannerView.stopCamera() // Stop camera on pause
    }

 */
}

