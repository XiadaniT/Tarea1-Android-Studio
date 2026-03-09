package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentBoton5 : Fragment(R.layout.fragment_boton5) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnIcono = view.findViewById<Button>(R.id.btnIcono)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        btnIcono.setOnClickListener {
            tvResultado.text = "¡Enviando correo simulado!"
        }
    }
}