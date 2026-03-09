package com.example.tarea1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class SeleccionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutSeleccion)
        val viewPager = findViewById<ViewPager2>(R.id.viewPagerSeleccion)
        val btnSiguiente = findViewById<Button>(R.id.btnSiguienteActivity3)

        val adapter = ViewPagerAdapterSeleccion(this)
        viewPager.adapter = adapter

        val titulosPestañas = arrayOf("CheckBox", "Radio", "Switch", "Spinner", "Slider")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titulosPestañas[position]
        }.attach()

        btnSiguiente.setOnClickListener {
             val intent = android.content.Intent(this, ListasActivity::class.java)
             startActivity(intent)
        }
    }
}