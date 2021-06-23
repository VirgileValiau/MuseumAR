package com.ec.MuseumAR

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FinParcours: AppCompatActivity() {

    lateinit var decompte:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fin)
        decompte = findViewById(R.id.decompte)
        countDownTimer.start()
    }



    var countDownTimer: CountDownTimer = object : CountDownTimer(300 * 1000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            var nbSec:Int = millisUntilFinished.toInt()/1000
            var nbMin:Int = (nbSec/60)
            nbSec = nbSec-nbMin*60
            decompte.setText((nbMin).toString() + ":" + (nbSec).toString())
        }

        override fun onFinish() {
            // Changer d'activité
            val versScan: Intent
            // Intent explicite
            versScan = Intent(this@FinParcours, MainActivity::class.java)
            startActivity(versScan)
        }
    }
}