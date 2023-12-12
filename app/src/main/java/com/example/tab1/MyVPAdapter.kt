package com.example.tab1


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tab1.ChatFragment
import com.example.tab1.ProfileFragment

class MyVPAdapter(fa:FragmentActivity) :FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->ChatFragment()
            1->ProfileFragment()
            else->ChatFragment()
        }
    }

}