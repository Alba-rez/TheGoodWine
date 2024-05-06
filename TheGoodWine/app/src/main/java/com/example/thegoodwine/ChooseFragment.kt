package com.example.thegoodwine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.thegoodwine.databinding.FragmentBlancosBinding
import com.example.thegoodwine.databinding.FragmentChooseBinding
import com.google.android.material.appbar.MaterialToolbar

/**
 * A simple [Fragment] subclass.
 * Use the [ChooseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChooseFragment : Fragment() {

    private var _binding: FragmentChooseBinding? = null
    private val binding get() = _binding!!

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentChooseBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        /*val view=inflater.inflate(R.layout.fragment_choose, container, false)

        val ButtonVioleta=view.findViewById<Button>(R.id.violeta)
        val ButtonRosa=view.findViewById<Button>(R.id.rosa)
        val ButtonAmarillo=view.findViewById<Button>(R.id.amarillo)*/

        binding.violeta.setOnClickListener {
            view.findNavController().navigate(R.id.action_chooseFragment_to_tintosFragment)
        }

        binding.rosa.setOnClickListener {
            view.findNavController().navigate(R.id.action_chooseFragment_to_rosadosFragment)
        }

        binding.amarillo.setOnClickListener {
            view.findNavController().navigate(R.id.action_chooseFragment_to_blancosFragment)
        }

        return view
    }


}