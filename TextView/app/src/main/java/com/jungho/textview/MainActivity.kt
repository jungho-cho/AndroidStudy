package com.jungho.textview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text1 = findViewById<TextView>(R.id.text1)
        text1.text = "Hallo!!!"
        text2.text = "Wie geht es dir???"

        //text2.setBackgroundColor(Color.RED)
        //text2.setBackgroundColor(Color.rgb(100,200,150))
        text2.setBackgroundColor(Color.argb(100, 100, 200, 150))

        text2.setTextColor(Color.RED)

        text2.append("\nMir geht gut")
    }
}