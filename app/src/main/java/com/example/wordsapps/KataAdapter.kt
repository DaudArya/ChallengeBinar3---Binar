package com.example.wordsapps

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class KataAdapter(private val list: ArrayList<String>): RecyclerView.Adapter<KataAdapter.WordViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return WordViewHolder(view)
    }

    override fun getItemCount(): Int = list.size
    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.btnhuruf)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val data = list[position]
        with(holder) {
            button.text = data
            button.setOnClickListener {
                val uri = Uri.parse("https://www.google.com/search?q=${list[position]}")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                it.context.startActivity(intent)

            }
        }
    }
}