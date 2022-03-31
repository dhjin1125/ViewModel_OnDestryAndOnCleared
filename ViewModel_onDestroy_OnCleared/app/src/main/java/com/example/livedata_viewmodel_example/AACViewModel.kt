package com.example.livedata_viewmodel_example

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AACViewModel : ViewModel() {
    var number = 0

    fun getCountText() : Int {
        return number
    }
    fun addNumber(): Int {
        number += 1
        return number
    }
}