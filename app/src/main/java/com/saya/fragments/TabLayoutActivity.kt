package com.saya.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewAnimationUtils
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.saya.fragments.fragments.AreaFragments
import com.saya.fragments.fragments.SumFragments
import com.saya.fragments.fragments.adapter.ViewPagerAdapter

class TabLayoutActivity : AppCompatActivity() {
    private lateinit var lstTitle: ArrayList<String>
    private lateinit var lstFragmennts :ArrayList<Fragment>
    private lateinit var viewPager : ViewPager2
    private lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        populateList()
        val adapter = ViewPagerAdapter(lstFragmennts,supportFragmentManager,lifecycle)
        viewPager.adapter=adapter

        TabLayoutMediator(tabLayout,viewPager){tab,position ->
            tab.text=lstTitle[position]
        }.attach()
    }
    private fun populateList(){
        lstTitle = ArrayList<String>()
        lstTitle.add("Sum")
        lstTitle.add("Area of circle")
        lstFragmennts= ArrayList<Fragment>()
        lstFragmennts.add(SumFragments())
        lstFragmennts.add(AreaFragments())
    }
}