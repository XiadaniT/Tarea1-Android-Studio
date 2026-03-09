package com.example.tarea1

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapterSeleccion(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentSeleccion1()
            1 -> FragmentSeleccion2()
            2 -> FragmentSeleccion3()
            3 -> FragmentSeleccion4()
            4 -> FragmentSeleccion5()
            else -> FragmentSeleccion1()
        }
    }
}