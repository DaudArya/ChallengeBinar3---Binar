package com.example.wordsapps

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapps.databinding.ItemBinding

class KataAdapter(private val list: ArrayList<String>) :
    RecyclerView.Adapter<KataAdapter.CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }
    override fun getItemCount() = list.size
    class CardViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list: ArrayList<String>) {
            binding.apply {
                btnhuruf.text = list[position]
            }
        }
    }
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(list)
        holder.itemView.setOnClickListener {
            val uri = Uri.parse("https://www.google.com/search?q=${list[position]}")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            it.context.startActivity(intent)
        }
    }
}