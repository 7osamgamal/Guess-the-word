package com.hosam.electronicsebha.screens.sobhanallah

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.hosam.electronicsebha.R
import com.hosam.electronicsebha.databinding.FragmentSobhanAllahBinding

class SobhanallahFragment : Fragment() {

private lateinit var viewModel: SobhanallahViewModel
    var binding: FragmentSobhanAllahBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding=
            DataBindingUtil.inflate(inflater,
                R.layout.fragment_sobhan_allah_, container, false)
//        binding!!.btn.setOnClickListener {
//            count++
//            binding!!.btn.text=count.toString()
//                binding!!.btn.textSize=23f
//
//        }
        viewModel=ViewModelProviders.of(this).get(SobhanallahViewModel::class.java)
        binding!!.sobhanallahViewModel=viewModel
        binding!!.setLifecycleOwner (this)
        setHasOptionsMenu(true)

        return binding!!.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.share_menu,menu)
        if (null==getshareintent().resolveActivity(requireActivity().packageManager))
        {
            menu?.findItem(R.id.share)?.setVisible(false)
        }
    }
    private fun getshareintent():Intent{
        val shareintent=Intent(Intent.ACTION_SEND)
        shareintent.setType("text/plain")
            .putExtra(Intent.EXTRA_TEXT,binding!!.btn.text.toString())
        return shareintent
    }
    private fun sharesuccess(){
        startActivity(getshareintent())
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item!!.itemId){
            R.id.share ->sharesuccess()
        }
        return super.onOptionsItemSelected(item)
    }

}