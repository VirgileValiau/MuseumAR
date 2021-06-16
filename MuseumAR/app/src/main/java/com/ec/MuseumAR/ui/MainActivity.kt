package com.ec.MuseumAR.ui

import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ec.MuseumAR.R
import com.ec.MuseumAR.data.DataProvider
import com.ec.MuseumAR.data.adapters.ParcoursAdapter
import com.ec.MuseumAR.data.model.Parcours
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity(), ParcoursAdapter.ActionListener {

    var dataSet: MutableList<Parcours>? = null
    val adapter = newAdapter()

    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    var job : Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerMain)

        refresh()

        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    override fun onResume() {
        super.onResume()
        refresh()
    }

    private fun refresh() {


        job?.cancel()
        job = activityScope.launch {
            try {
                val data = DataProvider.getParcours()

                adapter.showData(data)

            } catch (e: Exception) {
                Toast.makeText(this@MainActivity, "${e.message} ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun newAdapter(): ParcoursAdapter {

        val adapter = ParcoursAdapter(
            actionListener = this
        )
        return adapter
    }

    override fun onItemClicked(parcours: Parcours) {
        /*
        A modifier pour un intent vers activité AR
        val i = Intent(this, ShowListActivity::class.java)
        i.putExtra("id",liste.id)
        startActivity(i)

         */
    }


}