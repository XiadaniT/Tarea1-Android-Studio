package com.example.tarea1

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapterInfo(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentInfo1()
            1 -> FragmentInfo2()
            2 -> FragmentInfo3()
            3 -> FragmentInfo4()
            4 -> FragmentInfo5()
            else -> FragmentInfo1()
        }
    }
}