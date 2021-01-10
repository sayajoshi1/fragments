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
 * Use the [SumFragments.newInstance] factory method to
 * create an instance of this fragment.
 */
class SumFragments : Fragment() {
  private lateinit var etFirst : EditText
  private lateinit var etSecond : EditText
  private lateinit var btncalculate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_sum_fragments, container, false)
        etFirst = view.findViewById(R.id.etFirst)
        etSecond= view.findViewById(R.id.etSecond)
        btncalculate = view.findViewById(R.id.btncalculate)

        btncalculate.setOnClickListener {
            addTwoNumber()
        }

        return view
    }

    private fun addTwoNumber(){
        val first =etFirst.text.toString().toInt()
        val second =etSecond.text.toString().toInt()
        val result = first + second
        Toast.makeText(context,"Sum is $result", Toast.LENGTH_SHORT).show()
    }
}