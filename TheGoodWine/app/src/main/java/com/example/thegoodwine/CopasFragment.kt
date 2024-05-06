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
import com.example.thegoodwine.databinding.FragmentCopasBinding

/**
 * A simple [Fragment] subclass.
 * Use the [CopasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CopasFragment : Fragment() {

    private var _binding: FragmentCopasBinding? = null
    private val binding get() = _binding!!

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCopasBinding.inflate(inflater, container, false)
        val view = binding.root
        // Inflate the layout for this fragment
        /*val view= inflater.inflate(R.layout.fragment_copas, container, false)
        val ButtonNext = view.findViewById<Button>(R.id.next)*/

        binding.next.setOnClickListener {
            view.findNavController().navigate(R.id.action_copasFragment_to_siFragment)
        }

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (activity as AppCompatActivity).supportActionBar?.title =getString(R.string.moderacion)
    }


}