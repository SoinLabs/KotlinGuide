package com.effeta.miparroquiaandroid.views.adapters

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import kotlinguide.skeleton.common.BaseFragment

/**
 * Created by aulate on 1/2/18.
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    val fragments = ArrayList<BaseFragment>()

    override fun getItem(position: Int): BaseFragment? {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    fun addFragment(f: BaseFragment) {
        fragments.add(f)
    }

}