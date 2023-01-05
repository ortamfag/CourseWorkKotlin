package com.example.weatherapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//const val API_KEY = "cfd3109701ae4f0691e123848230401"

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<String>()
    val liveDataList = MutableLiveData<List<String>>()
}