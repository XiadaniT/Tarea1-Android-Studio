package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class FragmentLista4 : Fragment(R.layout.fragment_lista4) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listView = view.findViewById<ListView>(R.id.listViewAntiguo)

        val datos = listOf("Elemento Viejo 1", "Elemento Viejo 2", "Elemento Viejo 3", "Elemento Viejo 4", "Elemento Viejo 5")

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, datos)
        listView.adapter = adapter
    }
}