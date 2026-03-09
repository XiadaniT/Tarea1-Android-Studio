package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSeleccion3 : Fragment(R.layout.fragment_seleccion3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val switchNotis = view.findViewById<Switch>(R.id.switchNotis)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        switchNotis.setOnCheckedChangeListener { _, isChecked ->
            tvResultado.text = if (isChecked) "Notificaciones ACTIVADAS" else "Notificaciones DESACTIVADAS"
        }
    }
}