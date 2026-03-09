package com.example.tarea1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ListasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listas)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutListas)
        val viewPager = findViewById<ViewPager2>(R.id.viewPagerListas)
        val btnSiguiente = findViewById<Button>(R.id.btnSiguienteActivity4)

        val adapter = ViewPagerAdapterListas(this)
        viewPager.adapter = adapter

        val titulosPestañas = arrayOf("RecyclerView", "Grid", "Horizontal", "ListView", "GridView")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titulosPestañas[position]
        }.attach()

        btnSiguiente.setOnClickListener {
             val intent = android.content.Intent(this, InfoActivity::class.java)
             startActivity(intent)
        }
    }
}