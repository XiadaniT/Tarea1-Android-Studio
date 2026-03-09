package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentBoton2 : Fragment(R.layout.fragment_boton2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnImagen = view.findViewById<ImageButton>(R.id.btnImagen)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        btnImagen.setOnClickListener {
            tvResultado.text = "¡Clic en el botón de cámara!"
        }
    }
}