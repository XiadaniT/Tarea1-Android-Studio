package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentBoton1 : Fragment(R.layout.fragment_boton1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNormal = view.findViewById<Button>(R.id.btnNormal)

        btnNormal.setOnClickListener {

            Toast.makeText(requireContext(), "¡Hola! Soy un Toast desde un Fragment", Toast.LENGTH_SHORT).show()
        }
    }
}