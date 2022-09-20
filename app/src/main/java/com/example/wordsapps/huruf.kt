package com.example.wordsapps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordsapps.databinding.HurufBinding


class huruf : Fragment() {


    private var _binding : HurufBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = HurufBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Kata - Kata"

        activity?.title = "Words That Start With ${arguments?.getString("KEY_ALPHABETS")}"

        val aList = arguments?.getStringArrayList("KEY_WORDS")
        val adapter = KataAdapter(aList as ArrayList<String>)

        binding.huruf.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.huruf.adapter = adapter

    }
}