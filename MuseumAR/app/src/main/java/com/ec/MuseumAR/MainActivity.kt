package com.ec.MuseumAR

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toScan()
    }

    private fun toScan(){
        // Changer d'activité
        val versScan: Intent
        // Intent explicite
        versScan = Intent(this@MainActivity, InformationsActivity::class.java)
        startActivity(versScan)
    }
}