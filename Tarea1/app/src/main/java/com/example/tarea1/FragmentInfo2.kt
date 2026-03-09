package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class FragmentInfo2 : Fragment(R.layout.fragment_info2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ivImagen = view.findViewById<ImageView>(R.id.ivImagen)
        val btnOcultar = view.findViewById<Button>(R.id.btnOcultarImagen)

        btnOcultar.setOnClickListener {
            if (ivImagen.visibility == View.VISIBLE) {
                ivImagen.visibility = View.INVISIBLE
            } else {
                ivImagen.visibility = View.VISIBLE
            }
        }
    }
}