package com.example.thegoodwine

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.appbar.MaterialToolbar


/**
 * A simple [Fragment] subclass.
 * Use the [SiFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class SiFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_si, container, false)

        val ButtonStart=view.findViewById<Button>(R.id.start)
        val ButtonKnow=view.findViewById<Button>(R.id.know)

        ButtonStart.setOnClickListener {
            view.findNavController().navigate(R.id.action_siFragment_to_chooseFragment)
        }
        ButtonKnow.setOnClickListener {
            view.findNavController().navigate(R.id.action_siFragment_to_curiosidadesFragment)
        }
        return view
    }


}

