package com.example.tarea1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val btnSiguiente = findViewById<Button>(R.id.btnSiguienteActivity)

        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        val titulosPestañas = arrayOf("Normal", "Password", "Email", "Teléfono", "Multilínea")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titulosPestañas[position]
        }.attach()

        btnSiguiente.setOnClickListener {
            val intent = android.content.Intent(this, BotonesActivity::class.java)
            startActivity(intent)
        }
    }
}