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
 * Use the [ChooseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_choose, container, false)

        val ButtonVioleta=view.findViewById<Button>(R.id.violeta)
        val ButtonRosa=view.findViewById<Button>(R.id.rosa)
        val ButtonAmarillo=view.findViewById<Button>(R.id.amarillo)

        ButtonVioleta.setOnClickListener {
            view.findNavController().navigate(R.id.action_chooseFragment_to_tintosFragment)
        }

        ButtonRosa.setOnClickListener {
            view.findNavController().navigate(R.id.action_chooseFragment_to_rosadosFragment)
        }

        ButtonAmarillo.setOnClickListener {
            view.findNavController().navigate(R.id.action_chooseFragment_to_blancosFragment)
        }

        return view
    }


}