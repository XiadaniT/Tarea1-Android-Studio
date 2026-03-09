package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.fragment.app.Fragment

class FragmentInfo3 : Fragment(R.layout.fragment_info3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBarCircular)
        val btnCargar = view.findViewById<Button>(R.id.btnCargar)

        btnCargar.setOnClickListener {
            if (progressBar.visibility == View.INVISIBLE) {
                progressBar.visibility = View.VISIBLE
                btnCargar.text = "Detener Carga"
            } else {
                progressBar.visibility = View.INVISIBLE
                btnCargar.text = "Simular Carga de Datos"
            }
        }
    }
}