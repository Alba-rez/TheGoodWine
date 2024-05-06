package com.example.thegoodwine

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.thegoodwine.databinding.FragmentBlancosBinding
import com.google.android.material.appbar.MaterialToolbar

/**
 * A simple [Fragment] subclass.
 * Use the [BlancosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlancosFragment : Fragment() {

    private var _binding: FragmentBlancosBinding? = null
    private val binding get() = _binding!!

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlancosBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        /*val view= inflater.inflate(R.layout.fragment_blancos, container, false)
        val buttonRBaixas=view.findViewById<Button>(R.id.buttonRBaixas)
        val buttonRibeiro=view.findViewById<Button>(R.id.buttonRibeiro)
        val buttonValdeorras=view.findViewById<Button>(R.id.buttonValdeorras)*/

        binding.buttonRBaixas.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/rias-baixas"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), getString(R.string.enlace), Toast.LENGTH_SHORT).show()
            }
        }
        binding.buttonRibeiro.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/ribeiro"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), getString(R.string.enlace), Toast.LENGTH_SHORT).show()
            }
        }
        binding.buttonValdeorras.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/valdeorras"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), getString(R.string.enlace), Toast.LENGTH_SHORT).show()
            }
        }

        return view


    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_toolbar, menu)

    }


}