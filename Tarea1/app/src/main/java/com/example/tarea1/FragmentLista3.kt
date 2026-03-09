package com.example.tarea1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentLista3 : Fragment(R.layout.fragment_lista3) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv = view.findViewById<RecyclerView>(R.id.recyclerViewHorizontal)

        val datos = listOf("Historia 1", "Historia 2", "Historia 3", "Historia 4", "Historia 5", "Historia 6")

        rv.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        rv.adapter = MiAdaptador(datos)
    }
}