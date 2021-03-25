package com.hosam.electronicsebha.screens.sobhanallah

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SobhanallahViewModel:ViewModel()
{
    private val _count=MutableLiveData<Int>()
    val count:LiveData<Int>
    get() = _count
    init {
        _count.value=0
    }
    fun addCount()
    {
        _count.value=(_count.value)?.plus(1)
    }
}