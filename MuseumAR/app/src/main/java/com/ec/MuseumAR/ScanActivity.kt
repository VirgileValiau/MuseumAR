package com.ec.MuseumAR


import android.Manifest
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.zxing.Result
import me.dm7.barcodescanner.zxing.ZXingScannerView


class ScanActivity: AppCompatActivity(), ZXingScannerView.ResultHandler {

    lateinit var mScannerView: ZXingScannerView
    lateinit var mCameraView: FrameLayout
    lateinit var message: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scan_activity)

        message = findViewById(R.id.mes)
        mCameraView = findViewById(R.id.camera_preview)

        //  initialise le scanner view
        mScannerView = ZXingScannerView(this)

        mCameraView.addView(mScannerView)


        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 1)

        // Register ourselves as a handler for scan results. handler to save results of the scan
        mScannerView.setResultHandler(this)
        //Start scanning
        mScannerView.startCamera()

    }

    override fun handleResult(result: Result) {
        Log.v("TAG RESULTAT", result.getText()) // affiche le resultat
        Log.v("TAG", result.getBarcodeFormat().toString())
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("Scan Result")
        builder.setMessage(result.getText())
        val alert1: AlertDialog = builder.create()
        alert1.show()
    }

    override fun onPause() {
        //Called when activity is paused
        super.onPause()
        mScannerView.stopCamera() // Stop camera on pause
    }
}

