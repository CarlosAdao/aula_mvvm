package com.example.aula31mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    val soma = MutableLiveData<Int>().apply {
        value = 0
    }

    fun doSun(number: Int){
        soma.value?.let {
            soma.value = it + number
        }
    }
}