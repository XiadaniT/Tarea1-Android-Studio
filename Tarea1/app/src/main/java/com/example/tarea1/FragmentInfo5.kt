package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.RatingBar
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentInfo5 : Fragment(R.layout.fragment_info5) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val ratingBar = view.findViewById<RatingBar>(R.id.ratingBar)
        val tvCalificacion = view.findViewById<TextView>(R.id.tvCalificacion)

        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            if (rating == 5.0f) {
                tvCalificacion.text = "¡Un $rating! ¡Calificación perfecta de 100!"
            } else {
                tvCalificacion.text = "Le diste $rating estrellas."
            }
        }
    }
}