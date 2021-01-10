package com.saya.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.saya.fragments.fragments.AreaFragments
import com.saya.fragments.fragments.SumFragments

class MainActivity : AppCompatActivity() {

    private lateinit var btnSumFragment : Button
    private lateinit var btnAreaFragment : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAreaFragment= findViewById(R.id.btnAreaFragment)
        btnSumFragment= findViewById(R.id.btnSumFragment)

        btnSumFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer,SumFragments())
                addToBackStack(null)
                commit()
            }
        }
        btnAreaFragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer,AreaFragments())
                addToBackStack(null)
                commit()
            }
        }




    }
}