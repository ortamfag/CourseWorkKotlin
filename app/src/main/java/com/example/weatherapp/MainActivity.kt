package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weatherapp.databinding.ActivityMainBinding

const val API_KEY = "cfd3109701ae4f0691e123848230401"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bGet.setOnClickListener{
            getResult("London")
        }
    }

    private fun getResult(name: String) {
        var url = "https://api.weatherapi.com/v1/current.json?" +
                "key=$API_KEY&q=$name&aqi=no"
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET,
            url,

            {
                response->
                Log.d("MyLog", "Response: $response")
            },

            {
                Log.d("MyLog", "Volley error: $it.")
            }
        )
        queue.add(stringRequest)
    }
}