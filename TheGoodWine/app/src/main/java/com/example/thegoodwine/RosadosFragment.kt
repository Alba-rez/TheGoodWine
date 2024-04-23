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
 * Use the [RosadosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RosadosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_rosados, container, false)
        val buttonPenedes=view.findViewById<Button>(R.id.buttonPenedes)
        val buttonEmporda=view.findViewById<Button>(R.id.buttonEmporda)
        val buttonCatalunya=view.findViewById<Button>(R.id.buttonCatalunya)

        buttonPenedes.setOnClickListener {
            val url="https://www.grauonline.es/vinos-rosados/vinos-do-penedes-rosados.html"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }
        buttonEmporda.setOnClickListener {
            val url="https://www.grauonline.es/vinos-rosados/vinos-do-emporda-rosados.html"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }
        buttonCatalunya.setOnClickListener {
            val url="https://www.grauonline.es/vinos-rosados/vinos-do-catalunya-rosados.html"
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