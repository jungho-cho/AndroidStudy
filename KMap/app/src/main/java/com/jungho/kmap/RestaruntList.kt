package com.jungho.kmap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class RestaruntList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restarunt_list)

        val selectedCity = intent.getStringExtra("city")
        Log.i("KMap", "selected city : ${selectedCity}")
    }
}