package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FragmentBoton3 : Fragment(R.layout.fragment_boton3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        fab.setOnClickListener {
            tvResultado.text = "¡Botón flotante (FAB) presionado!"
        }
    }
}