package com.example.wordsapps


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class HurufAdapter() : RecyclerView.Adapter<HurufAdapter.AlphabetViewHolder>() {

    private var diffCallBack = object: DiffUtil.ItemCallback<data>(){
        override fun areItemsTheSame(oldItem: data, newItem: data): Boolean{
            return oldItem.alphabet == newItem.alphabet
        }

        override fun areContentsTheSame(oldItem: data, newItem: data): Boolean {
            return oldItem.hashCode() == newItem.hashCode()}
    }

    private var differ = AsyncListDiffer(this, diffCallBack)
    fun submitData(value: ArrayList<data>) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): AlphabetViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return AlphabetViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlphabetViewHolder, position: Int){
        val data = differ.currentList[position]

        val mBundle = Bundle()
        mBundle.putChar("KEY_ALPHABETS", data.alphabet)
        mBundle.putStringArrayList("KEY_WORDS", data.list)

        with(holder){
            button.text = differ.currentList[position].alphabet.toString()
            button.setOnClickListener{
                itemView.findNavController().navigate(R.id.action_home2_to_huruf2, mBundle)
            }
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

    inner class AlphabetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val button: Button = itemView.findViewById(R.id.btnhuruf)
    }
}