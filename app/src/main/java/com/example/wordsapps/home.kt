package com.example.wordsapps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordsapps.databinding.HomeBinding

class home : Fragment() {
    private var _binding : HomeBinding? = null
    private val binding get() = _binding!!
    private val dataSet = MainActivity().katakata

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Words Apps"
        val adapter = HurufAdapter()
        adapter.submitData(dataSet)

        binding.home.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.home.adapter = adapter
    }


}


