package com.example.wordsapps

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapps.databinding.ItemBinding


class HurufAdapter(private val list: ArrayList<data>) :
    RecyclerView.Adapter<HurufAdapter.CardViewHolder>() {

    class CardViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list:data) {
            binding.btnhuruf.text = list.huruf

            binding.btnhuruf.setOnClickListener {
                val activity = itemView.context as MainActivity
                activity.setWordFragment(huruf(list.kata))
            }}}

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bind(list[position])
    }


    override fun getItemCount() = list.size



}