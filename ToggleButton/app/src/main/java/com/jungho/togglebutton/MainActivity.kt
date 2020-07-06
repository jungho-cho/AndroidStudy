package com.jungho.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(toggleButton.isChecked)
                textView.text = "true"
            else
                textView.text = "false"
            }

        button2.setOnClickListener {
            toggleButton.isChecked = true
        }

        button3.setOnClickListener {
            toggleButton.isChecked = false
        }

        button4.setOnClickListener {
            toggleButton.toggle()
        }

        toggleButton.setOnClickListener(listener)

        toggleButton2.setOnClickListener {
            if(toggleButton2.isChecked)
                textView.text = "true"
            else
                textView.text = "false"
        }
    }

    val listener = object : View.OnClickListener {
        override fun onClick(p0: View?) {
            if(toggleButton.isChecked)
                textView.text = "true"
            else
                textView.text = "false"
        }
    }
}