package com.taras.sunriseapp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.taras.sunriseapp.R
import com.taras.sunriseapp.databinding.FragmentSunriseSunsetBinding
import com.taras.sunriseapp.presentation.adapters.PageAdapter

class SunriseSunsetFragment : Fragment() {

    private lateinit var mBinding: FragmentSunriseSunsetBinding

    companion object {
        fun newInstance() = SunriseSunsetFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentSunriseSunsetBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setAdapterViewPager()
    }

    private fun setAdapterViewPager() {
        val pageAdapter = PageAdapter(childFragmentManager)
        pageAdapter
                .add(getString(R.string.tab_current_location), CurrentLocationFragment.newInstance())
                .add(getString(R.string.tab_search_city), SearchCityFragment.newInstance())
        mBinding.viewPager.adapter = pageAdapter
        mBinding.viewPager.offscreenPageLimit = 2
        mBinding.tabLayout.tabMode = TabLayout.MODE_FIXED
        mBinding.tabLayout.tabGravity = TabLayout.GRAVITY_FILL
        mBinding.tabLayout.setupWithViewPager(mBinding.viewPager)
    }
}