package com.jungho.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = ""

            if (checkBox.isChecked)
                textView.append("first check box is checked\n")
            else
                textView.append("first check box is unchecked\n")

            if (checkBox2.isChecked)
                textView.append("second check box is checked\n")
            else
                textView.append("second check box is unchecked\n")

            if (checkBox3.isChecked)
                textView.append("third check box is checked\n")
            else
                textView.append("third check box is unchecked\n")
        }

        button2.setOnClickListener {
            checkBox.isChecked = true
            checkBox2.isChecked = true
            checkBox3.isChecked = true
        }

        button3.setOnClickListener {
            checkBox.isChecked = false
            checkBox2.isChecked = false
            checkBox3.isChecked = false
        }

        button4.setOnClickListener {
            checkBox.toggle()
            checkBox2.toggle()
            checkBox3.toggle()
        }

        checkBox.setOnCheckedChangeListener(listener)
        checkBox2.setOnCheckedChangeListener(listener)
        checkBox3.setOnCheckedChangeListener { compoundButton, b ->
            if (b)
                textView.text = "third checkbox is checked"
            else
                textView.text = "third checkbox is unchecked"
        }
    }

    val listener = object : CompoundButton.OnCheckedChangeListener {
        override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
            when(p0?.id) {
                R.id.checkBox -> {
                    if (p1)
                        textView.text = "first checkbox is checked"
                    else
                        textView.text = "first checkbox is unchecked"
                }

                R.id.checkBox2 -> {
                    if (p1)
                        textView.text = "second checkbox is checked"
                    else
                        textView.text = "second checkbox is unchecked"
                }

                R.id.checkBox3 -> {
                    if (p1)
                        textView.text = "third checkbox is checked"
                    else
                        textView.text = "third checkbox is unchecked"
                }
            }
        }
    }
}