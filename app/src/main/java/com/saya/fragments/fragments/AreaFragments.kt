package com.saya.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.saya.fragments.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AreaFragments.newInstance] factory method to
 * create an instance of this fragment.
 */
class AreaFragments : Fragment() {
    private lateinit var etradius : EditText
    private lateinit var btncalculate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_area_fragments, container, false)
        etradius = view.findViewById(R.id.etradius)
        btncalculate = view.findViewById(R.id.btncalculate)
        btncalculate.setOnClickListener {
            area()
        }

        return view



    }

   private fun area (){
       val radius =etradius.text.toString().toInt()
       val result = (22/7 * (radius*radius))
       Toast.makeText(context,"Area is $result", Toast.LENGTH_SHORT).show()
   }

}