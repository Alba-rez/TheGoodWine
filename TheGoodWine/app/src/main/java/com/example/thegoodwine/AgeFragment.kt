package com.example.thegoodwine

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
 * Use the [AgeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AgeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_age, container, false)


        val ButtonMayor = view.findViewById<Button>(R.id.age)
        val ButtonMenor = view.findViewById<Button>(R.id.no_age)

        ButtonMayor.setOnClickListener {
            view.findNavController().navigate(R.id.action_ageFragment_to_siFragment)
        }

        ButtonMenor.setOnClickListener {
            view.findNavController().navigate(R.id.action_ageFragment_to_noFragment)
        }

        return view
    }
}