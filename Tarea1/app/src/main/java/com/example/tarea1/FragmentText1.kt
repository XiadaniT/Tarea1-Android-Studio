package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentText1 : Fragment(R.layout.fragment_text1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etEntrada = view.findViewById<EditText>(R.id.etEntrada)
        val btnAccion = view.findViewById<Button>(R.id.btnAccion)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        btnAccion.setOnClickListener {
            val texto = etEntrada.text.toString()
            if (texto.isNotEmpty()) {
                tvResultado.text = "¡Hola, $texto! Buen trabajo."
            } else {
                tvResultado.text = "Por favor escribe algo."
            }
        }
    }
}