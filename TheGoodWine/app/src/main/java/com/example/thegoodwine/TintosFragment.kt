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
 * Use the [TintosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TintosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_tintos, container, false)
        val buttonToro=view.findViewById<Button>(R.id.buttonToro)
        val buttonRioja=view.findViewById<Button>(R.id.buttonRioja)
        val buttonRibera=view.findViewById<Button>(R.id.buttonRibera)

        buttonToro.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/toro"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }
        buttonRioja.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/rioja"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), "No se puede abrir el enlace.", Toast.LENGTH_SHORT).show()
            }
        }
        buttonRibera.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/ribera-del-duero"
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