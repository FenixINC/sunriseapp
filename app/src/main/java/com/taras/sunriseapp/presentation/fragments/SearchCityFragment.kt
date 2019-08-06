package com.taras.sunriseapp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.taras.sunriseapp.databinding.FragmentSearchCityBinding

class SearchCityFragment : Fragment() {

    private lateinit var mBinding: FragmentSearchCityBinding

    companion object {
        fun newInstance() = SearchCityFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = FragmentSearchCityBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}