package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSeleccion4 : Fragment(R.layout.fragment_seleccion4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val spinner = view.findViewById<Spinner>(R.id.spinnerOpciones)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        val opciones = arrayOf("Elige un lenguaje...", "Kotlin", "Java", "Python", "C++")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, opciones)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position > 0) {
                    tvResultado.text = "Lenguaje favorito: ${opciones[position]}"
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }
}