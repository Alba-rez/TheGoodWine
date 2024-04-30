package com.example.thegoodwine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [CopasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CopasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_copas, container, false)
        val ButtonNext = view.findViewById<Button>(R.id.next)

        ButtonNext.setOnClickListener {
            view.findNavController().navigate(R.id.action_copasFragment_to_siFragment)
        }

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (activity as AppCompatActivity).supportActionBar?.title ="Beba con moderación"
    }


}