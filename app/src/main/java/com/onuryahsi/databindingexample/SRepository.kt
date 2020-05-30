package com.onuryahsi.databindingexample

import androidx.lifecycle.MutableLiveData
import java.util.*;

object SRepository {
    private val carNames: List<String> = listOf("Opel", "Audi", "BMW", "Mercedes", "Lamborghini", "Ferrari", "McLaren", "Infiniti", "Dodge", "Fiat")

    private val mCurrentCarName = MutableLiveData<String>()

    val currentCarName: MutableLiveData<String>
        get() = mCurrentCarName

    init {
        mCurrentCarName.value = carNames.firstOrNull()
    }

    private fun getRandomCarName(): String {
        val random = Random()
        return carNames[random.nextInt(carNames.size)]
    }

    fun changeRandomCarName() {
        mCurrentCarName.value = getRandomCarName()
    }
}