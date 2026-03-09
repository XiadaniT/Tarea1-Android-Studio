package com.example.tarea1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.fragment.app.Fragment

class FragmentLista5 : Fragment(R.layout.fragment_lista5) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gridView = view.findViewById<GridView>(R.id.gridViewAntiguo)

        val datos = listOf("App 1", "App 2", "App 3", "App 4", "App 5", "App 6")

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, datos)
        gridView.adapter = adapter
    }
}