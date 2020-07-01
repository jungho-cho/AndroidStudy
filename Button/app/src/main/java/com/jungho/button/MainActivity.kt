package com.jungho.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(listener1)
        imageButton1.setOnClickListener(listener2)

        button2.setOnClickListener(listener3)
        button3.setOnClickListener(listener3)

        button4.setOnClickListener {
            text1.text = "Fuenfte Button is gedrueckt."
        }
    }

    val listener1 = object : View.OnClickListener {
        override fun onClick(v: View?) {
            text1.text = "Erste Button is gedrueckt."
        }
    }

    val listener2 = object : View.OnClickListener {
        override fun onClick(v: View?) {
            text1.text = "Zweite Button is gedrueckt."
        }
    }

    val listener3 = object : View.OnClickListener {
        override fun onClick(v: View?) {
            when(v?.id) {
                R.id.button2 -> {
                    text1.text = "Dritte Button is gedrueckt."
                }

                R.id.button3 -> {
                    text1.text = "Vierte Button is gedrueckt."
                }
            }
        }
    }
}