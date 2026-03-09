package com.example.tarea1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutInfo)
        val viewPager = findViewById<ViewPager2>(R.id.viewPagerInfo)
        val btnFinalizar = findViewById<Button>(R.id.btnFinalizar)

        val adapter = ViewPagerAdapterInfo(this)
        viewPager.adapter = adapter

        val titulosPestañas = arrayOf("Texto", "Imagen", "Carga", "Progreso", "Rating")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titulosPestañas[position]
        }.attach()

        btnFinalizar.setOnClickListener {
            Toast.makeText(this, "ES TODO", Toast.LENGTH_LONG).show()
            finishAffinity()
        }
    }
}