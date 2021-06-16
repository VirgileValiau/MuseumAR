package com.ec.MuseumAR.data.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ec.MuseumAR.R
import com.ec.MuseumAR.data.model.Parcours

class ParcoursAdapter (
    private val actionListener: ActionListener
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        private val dataSet: MutableList<Parcours> = mutableListOf()

        override fun getItemCount(): Int = dataSet.size

        fun showData(newDataSet: MutableList<Parcours>) {
            dataSet.clear()
            dataSet.addAll(newDataSet)
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return ListeViewHolder(inflater.inflate(R.layout.parcours_view, parent, false))
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            Log.d("ListeAdapter", "onBindViewHolder $position")
            when(holder) {
                is ListeViewHolder -> holder.bind(dataSet[position])
            }
        }

        inner class ListeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val id: TextView = itemView.findViewById(R.id.textID)
            private val theme: TextView = itemView.findViewById(R.id.textTheme)
            private val duree: TextView = itemView.findViewById(R.id.textDuree)

            init {

                itemView.setOnClickListener {
                    val listePosition = adapterPosition
                    if (listePosition != RecyclerView.NO_POSITION) {
                        val clickedListe = dataSet[listePosition]
                        actionListener.onItemClicked(clickedListe)
                    }

                }
            }

            fun bind(parcours: Parcours) {
                id.text = parcours.parcoursId.toString()
                theme.text = parcours.theme
                duree.text = "Durée : ${parcours.duree} min"
            }
        }

        interface ActionListener {
            fun onItemClicked(parcours: Parcours)
        }

    }