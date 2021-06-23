package com.example.appcreationmuseumar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ec.MuseumAR.data.DbDataProvider
import com.ec.MuseumAR.data.adapters.ParcoursAdapter
import com.ec.MuseumAR.data.model.Parcours
import kotlinx.coroutines.*

class ModificationParcours : AppCompatActivity(), ParcoursAdapter.ActionListener {

    var dataSet: MutableList<Parcours>? = null
    val adapter = newAdapter()
    private lateinit var db: DbDataProvider

    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    var job : Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modification_parcours)

        db = DbDataProvider(this.application)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerModif)

        refresh()

        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
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

    private fun newAdapter(): ParcoursAdapter {

        val adapter = ParcoursAdapter(
            actionListener = this
        )
        return adapter
    }

    override fun onItemClicked(parcours: Parcours) {
        val i = Intent(this, ChoixOeuvres::class.java)
        i.putExtra("id_parcours",parcours.parcoursId)
        startActivity(i)
    }

    fun onClickAjouter(view: View) {

        val theme = findViewById<EditText>(R.id.edTheme).text.toString()
        val duree = findViewById<EditText>(R.id.edDuree).text.toString().toInt()
        val p = Parcours(theme,duree)
        job?.cancel()
        job = activityScope.launch {
            try {
                Log.i("ajout", p.toString())
                db.addNewParcours(p)
            } catch (e: Exception) {
                Log.e("database", e.message.toString())
            }
        }
        refresh()
    }
}