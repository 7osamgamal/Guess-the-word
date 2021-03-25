package com.hosam.electronicsebha.screens.nogodelseallah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.hosam.electronicsebha.R
import com.hosam.electronicsebha.databinding.FragmentNoGodElseAllaBinding

class NoGodElseAllaFragment : Fragment() {
    private lateinit var viewModel: NogodViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentNoGodElseAllaBinding =
            DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_no_god_else_alla, container, false
            )
        viewModel = ViewModelProviders.of(this).get(NogodViewModel::class.java)
        binding.nogodViewModel = viewModel
        binding.setLifecycleOwner(this)

        return binding.root
    }


}