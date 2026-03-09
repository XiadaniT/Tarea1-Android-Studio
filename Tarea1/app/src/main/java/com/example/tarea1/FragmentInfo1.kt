package com.example.tarea1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentInfo1 : Fragment(R.layout.fragment_info1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvTexto = view.findViewById<TextView>(R.id.tvTextoDinamico)
        val btnCambiar = view.findViewById<Button>(R.id.btnCambiarTexto)

        btnCambiar.setOnClickListener {
            tvTexto.text = "¡Ahora soy un texto rojo y genial!"
            tvTexto.setTextColor(Color.RED)
            tvTexto.textSize = 24f
        }
    }
}