package com.feriefendi.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    private  val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> { return Homefragment()}
            1 -> { return Videofragment()}
            2 -> { return Profilfragment()}
            else -> { return Videofragment()}
        }
    }

    override fun getItemCount(): Int {
        return  JUMLAH_MENU
    }
}