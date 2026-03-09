package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton
import androidx.fragment.app.Fragment

class FragmentBoton4 : Fragment(R.layout.fragment_boton4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnToggle = view.findViewById<ToggleButton>(R.id.btnToggle)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        btnToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                tvResultado.text = "Estado: ENCENDIDO"
            } else {
                tvResultado.text = "Estado: APAGADO"
            }
        }
    }
}