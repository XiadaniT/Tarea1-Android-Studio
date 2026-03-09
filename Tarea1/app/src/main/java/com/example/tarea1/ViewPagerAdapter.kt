package com.example.tarea1

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentText1()
            1 -> FragmentText2()
            2 -> FragmentText3()
            3 -> FragmentText4()
            4 -> FragmentText5()
            else -> FragmentText1()
        }
    }
}