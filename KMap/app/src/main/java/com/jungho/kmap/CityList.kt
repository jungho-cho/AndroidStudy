package com.jungho.kmap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_city_list.*

class CityList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_list)

        buttonFrankfurt.setOnClickListener {
            val intent = Intent(applicationContext, RestaruntList::class.java)
            intent.putExtra("city", "frankfurt")

            startActivity(intent)
        }
    }
}