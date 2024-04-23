package com.example.thegoodwine

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

/**
 * A simple [Fragment] subclass.
 * Use the [BlancosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlancosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_blancos, container, false)
        val buttonRBaixas=view.findViewById<Button>(R.id.buttonRBaixas)
        val buttonRibeiro=view.findViewById<Button>(R.id.buttonRibeiro)
        val buttonValdeorras=view.findViewById<Button>(R.id.buttonValdeorras)

        buttonRBaixas.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/rias-baixas"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }
        buttonRibeiro.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/ribeiro"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }
        buttonValdeorras.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/valdeorras"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }

        return view


    }


}