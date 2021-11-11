package com.example.belajarfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val go = view.findViewById<Button>(R.id.btn_go2)

        go.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.second_to_activity)
        }

        view.btn_back.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.second_to_first)
        }

        return view
    }

}