package com.example.tarea1

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapterBotones(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentBoton1()
            1 -> FragmentBoton2()
            2 -> FragmentBoton3()
            3 -> FragmentBoton4()
            4 -> FragmentBoton5()
            else -> FragmentBoton1()
        }
    }
}