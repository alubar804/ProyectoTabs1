package com.example.proyectotabs1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout: TabLayout = findViewById(R.id.appbartabs)
        val toolbar =findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbario)
        supportFragmentManager.beginTransaction().replace(R.id.content_fragment, Fragment1()!!).commit()
        toolbar.title = "TAB 1"
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            lateinit var fragment: Fragment


            override fun onTabSelected(tab: TabLayout.Tab) {

                toolbar.title = tab.text
                when (tab.position) {
                    0 -> { fragment = Fragment1() }
                    1 -> { fragment = Fragment2() }
                    2 -> { fragment = Fragment3() }
                }
                supportFragmentManager.beginTransaction().replace(R.id.content_fragment, fragment!!).commit()
                supportActionBar?.setTitle(tab.text)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}

            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}