package com.example.appcreationmuseumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ec.MuseumAR.data.DbDataProvider
import com.ec.MuseumAR.data.model.Oeuvre
import com.ec.MuseumAR.data.model.ParcoursOeuvreCrossRef
import com.example.appcreationmuseumar.adapters.OeuvreAdapter
import kotlinx.coroutines.*

class ChoixOeuvres : AppCompatActivity(), OeuvreAdapter.ActionListener {

    var dataSet: MutableList<Oeuvre>? = null
    val adapter = newAdapter()
    private var id_parcours: Long = 0
    private lateinit var db: DbDataProvider

    private val activityScope = CoroutineScope(
        SupervisorJob() +
                Dispatchers.Main
    )
    var job : Job? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choix_oeuvres)
        db = DbDataProvider(this.application)
        id_parcours = this.intent.getLongExtra("id_parcours",0)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerChoix)

        recyclerview.adapter = adapter
        recyclerview.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        refresh()
    }

    private fun refresh() {
        Log.i("choix oeuvres","refresh")
        job?.cancel()
        job = activityScope.launch {
            try {
                val data = db.getAllOeuvres().toMutableList()
                adapter.oeuvresParcours.clear()
                for (o: Oeuvre in db.getParcoursWithOeuvresById(id_parcours).oeuvres){
                    adapter.oeuvresParcours.add(o.oeuvreId)
                }
                adapter.showData(data)

            } catch (e: Exception) {
                Toast.makeText(this@ChoixOeuvres, "${e.message} ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun newAdapter(): OeuvreAdapter {

        val adapter = OeuvreAdapter(
            actionListener = this
        )
        return adapter
    }

    override fun onItemClicked(item: Oeuvre, checked: Boolean) {
        Log.i("choix oeuvres", "onclick ${item.oeuvreId} : ${checked}")
        val ref = ParcoursOeuvreCrossRef(id_parcours, item.oeuvreId)
        if(checked){
            //db.addNewRelations(listOf(ref))
        }else{
            //db.deleteRelation(id_parcours, item.oeuvreId)
        }
    }
}