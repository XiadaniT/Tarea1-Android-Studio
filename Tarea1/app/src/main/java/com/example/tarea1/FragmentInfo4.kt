package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentInfo4 : Fragment(R.layout.fragment_info4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBarHorizontal)
        val tvPorcentaje = view.findViewById<TextView>(R.id.tvPorcentaje)
        val btnDescargar = view.findViewById<Button>(R.id.btnDescargar)

        btnDescargar.setOnClickListener {
            var progresoActual = progressBar.progress
            if (progresoActual < 100) {
                progresoActual += 20
                progressBar.progress = progresoActual
                tvPorcentaje.text = "$progresoActual%"
            } else {
                progressBar.progress = 0
                tvPorcentaje.text = "0%"
            }
        }
    }
}