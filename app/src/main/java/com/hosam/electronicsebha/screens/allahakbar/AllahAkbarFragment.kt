package com.hosam.electronicsebha.screens.allahakbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.hosam.electronicsebha.R
import com.hosam.electronicsebha.databinding.FragmentAllahAkbarBinding

class AllahAkbarFragment : Fragment() {

private lateinit var viewModel: AllahViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentAllahAkbarBinding=
            DataBindingUtil.inflate(inflater,
                R.layout.fragment_allah_akbar,container,false)

        viewModel=ViewModelProviders.of(this).get(AllahViewModel::class.java)
        binding.allahViewModel=viewModel
        binding.setLifecycleOwner (this)

       return binding.root
    }



}