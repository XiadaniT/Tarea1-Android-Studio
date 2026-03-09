package com.example.tarea1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentLista2 : Fragment(R.layout.fragment_lista2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv = view.findViewById<RecyclerView>(R.id.recyclerViewGrid)

        val datos = listOf("Foto 1", "Foto 2", "Foto 3", "Foto 4", "Foto 5", "Foto 6", "Foto 7", "Foto 8")

        rv.layoutManager = GridLayoutManager(requireContext(), 2)
        rv.adapter = MiAdaptador(datos)
    }
}