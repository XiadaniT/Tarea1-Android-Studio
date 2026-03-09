package com.example.tarea1

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapterListas(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentLista1()
            1 -> FragmentLista2()
            2 -> FragmentLista3()
            3 -> FragmentLista4()
            4 -> FragmentLista5()
            else -> FragmentLista1()
        }
    }
}