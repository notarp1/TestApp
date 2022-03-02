package com.notarmaso.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var buttonPress by mutableStateOf(false)


    fun OnButtonPressed(){
        buttonPress = !buttonPress
    }


}