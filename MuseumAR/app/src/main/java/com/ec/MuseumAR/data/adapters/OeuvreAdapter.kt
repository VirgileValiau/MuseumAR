package com.example.appcreationmuseumar.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ec.MuseumAR.data.model.Oeuvre
import com.example.appcreationmuseumar.R

class OeuvreAdapter(private val actionListener: ActionListener)
: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val dataSet: MutableList<Oeuvre> = mutableListOf()
    val oeuvresParcours: MutableList<Long> = mutableListOf()

    override fun getItemCount(): Int = dataSet.size

    fun showData(newDataSet: MutableList<Oeuvre>) {
        dataSet.clear()
        dataSet.addAll(newDataSet)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(inflater.inflate(R.layout.oeuvre_view, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("ItemAdapter", "onBindViewHolder $position")
        when(holder) {
            is ItemViewHolder -> holder.bind(dataSet[position])
        }
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val description: TextView = itemView.findViewById(
            R.id.titreOeuvre
        )
        private val checkbox: CheckBox = itemView.findViewById(R.id.checkBox)

        init {

            checkbox.setOnClickListener {
                val itemPosition = adapterPosition
                if (itemPosition != RecyclerView.NO_POSITION) {
                    val clickedItem = dataSet[itemPosition]
                    actionListener.onItemClicked(clickedItem, checkbox.isChecked)
                }

            }
        }

        fun bind(item: Oeuvre) {
            description.text = item.oeuvreTitre
            checkbox.isChecked = oeuvresParcours.contains(item.oeuvreId)
        }
    }

    interface ActionListener {
        fun onItemClicked(item: Oeuvre, checked: Boolean)
    }

}