package com.example.wordsapps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordsapps.databinding.HomeBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

class home : Fragment(){
    private var _binding: HomeBinding? = null
    private val binding get() = _binding as HomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeBinding.inflate(inflater, container, false)
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "WordsApps"
        binding.home.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = HurufAdapter(katakata)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
    override fun onDestroy() {
        super.onDestroy()
    }
}