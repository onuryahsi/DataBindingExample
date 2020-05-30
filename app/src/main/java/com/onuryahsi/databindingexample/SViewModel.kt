package com.onuryahsi.databindingexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.onuryahsi.databindingexample.SRepository

class SViewModel : ViewModel() {
    val currentCarName: LiveData<String>
        get() = SRepository.currentCarName

    fun onChangeRandomCarNameClick() = SRepository.changeRandomCarName()
}