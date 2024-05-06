package com.example.thegoodwine

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar


/**
 * A simple [Fragment] subclass.
 * Use the [NoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NoFragment : Fragment() {

    private val delayMillis: Long = 3000
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_no, container, false)

        Handler().postDelayed({
            activity?.finish()
        }, delayMillis)

        return view
    }


}