package com.hosam.electronicsebha.screens.alhamllah

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.hosam.electronicsebha.R
import com.hosam.electronicsebha.databinding.FragmentAlhamdllahBinding


class AlhamdllahFragment : Fragment() {
private lateinit var viewModel: AlhamdllahViewModel
   var count=1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentAlhamdllahBinding=
            DataBindingUtil.inflate(inflater,
                R.layout.fragment_alhamdllah,container,false)
//        binding.btn.setOnClickListener {
//            count++
//            binding.btn.text=count.toString()
//            binding.btn.textSize=23f
//
//        }
        viewModel=ViewModelProviders.of(this).get(AlhamdllahViewModel::class.java)
   binding.alhamdllahViewModel=viewModel
        binding.setLifecycleOwner (this)
        return binding.root
    }




}