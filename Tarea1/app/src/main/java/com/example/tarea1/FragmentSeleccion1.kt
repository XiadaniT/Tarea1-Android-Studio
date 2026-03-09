package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSeleccion1 : Fragment(R.layout.fragment_seleccion1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cb1 = view.findViewById<CheckBox>(R.id.cbOpcion1)
        val cb2 = view.findViewById<CheckBox>(R.id.cbOpcion2)
        val btnVerificar = view.findViewById<Button>(R.id.btnVerificar)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        btnVerificar.setOnClickListener {
            var msj = "Seleccionaste:\n"
            if (cb1.isChecked) msj += "- Programar\n"
            if (cb2.isChecked) msj += "- Sacar 10\n"
            if (!cb1.isChecked && !cb2.isChecked) msj = "No seleccionaste nada."
            tvResultado.text = msj
        }
    }
}