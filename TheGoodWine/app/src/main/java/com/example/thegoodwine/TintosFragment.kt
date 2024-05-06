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
import com.example.thegoodwine.databinding.FragmentRosadosBinding
import com.example.thegoodwine.databinding.FragmentTintosBinding
import com.google.android.material.appbar.MaterialToolbar

/**
 * A simple [Fragment] subclass.
 * Use the [TintosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TintosFragment : Fragment() {

    private var _binding: FragmentTintosBinding? = null
    private val binding get() = _binding!!
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTintosBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        /*val view= inflater.inflate(R.layout.fragment_tintos, container, false)
        val buttonToro=view.findViewById<Button>(R.id.buttonToro)
        val buttonRioja=view.findViewById<Button>(R.id.buttonRioja)
        val buttonRibera=view.findViewById<Button>(R.id.buttonRibera)*/

        binding.buttonToro.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/toro"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), getString(R.string.enlace), Toast.LENGTH_SHORT).show()
            }
        }
        binding.buttonRioja.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/rioja"
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(requireActivity().packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(requireContext(), getString(R.string.enlace), Toast.LENGTH_SHORT).show()
            }
        }
        binding.buttonRibera.setOnClickListener {
            val url="https://www.ideavinos.com/denominacion/ribera-del-duero"
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