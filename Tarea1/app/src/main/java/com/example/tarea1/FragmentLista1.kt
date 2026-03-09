package com.example.tarea1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentLista1 : Fragment(R.layout.fragment_lista1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv = view.findViewById<RecyclerView>(R.id.recyclerViewVertical)

        val datos = listOf("Android 10", "Android 11", "Android 12", "Android 13", "Android 14", "Android 15")

        rv.layoutManager = LinearLayoutManager(requireContext())
        rv.adapter = MiAdaptador(datos)
    }
}