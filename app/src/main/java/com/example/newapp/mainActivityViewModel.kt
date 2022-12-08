package com.example.newapp

import androidx.lifecycle.ViewModel

class mainActivityViewModel:ViewModel() {
    var num = 0
    fun add(){
        num++
    }
}