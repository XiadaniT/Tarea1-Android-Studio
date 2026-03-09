package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSeleccion2 : Fragment(R.layout.fragment_seleccion2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultado)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbAndroid -> tvResultado.text = "Elegiste: Android"
                R.id.rbIOS -> tvResultado.text = "Elegiste: iOS"
            }
        }
    }
}