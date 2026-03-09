package com.example.tarea1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class BotonesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutBotones)
        val viewPager = findViewById<ViewPager2>(R.id.viewPagerBotones)
        val btnSiguiente = findViewById<Button>(R.id.btnSiguienteActivity2)

        val adapter = ViewPagerAdapterBotones(this)
        viewPager.adapter = adapter

        val titulosPestañas = arrayOf("Button", "ImageButton", "FAB", "Toggle", "Material")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titulosPestañas[position]
        }.attach()

        btnSiguiente.setOnClickListener {
             val intent = android.content.Intent(this, SeleccionActivity::class.java)
             startActivity(intent)
        }
    }
}