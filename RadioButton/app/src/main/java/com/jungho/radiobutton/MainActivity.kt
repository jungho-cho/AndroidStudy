package com.jungho.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            radioButton3.isChecked = true
            radioButton6.isChecked = true
        }

        button2.setOnClickListener {
            when(radioGroup1.checkedRadioButtonId) {
                R.id.radioButton -> {
                    textView.text = "radio 1-1 is checked"
                }
                R.id.radioButton2 -> {
                    textView.text = "radio 1-2 is checked"
                }
                R.id.radioButton3 -> {
                    textView.text = "radio 1-3 is checked"
                }
            }

            when(radioGroup2.checkedRadioButtonId) {
                R.id.radioButton4 -> {
                    textView2.text = "radio 2-1 is checked"
                }
                R.id.radioButton5 -> {
                    textView2.text = "radio 2-2 is checked"
                }
                R.id.radioButton6 -> {
                    textView2.text = "radio 2-3 is checked"
                }
            }
        }

        radioGroup1.setOnCheckedChangeListener(listener)
        radioGroup2.setOnCheckedChangeListener { radioGroup, i ->
            when(i) {
                R.id.radioButton4 -> {
                    textView2.text = "radio 2-1 is checked"
                }
                R.id.radioButton5 -> {
                    textView2.text = "radio 2-2 is checked"
                }
                R.id.radioButton6 -> {
                    textView2.text = "radio 2-3 is checked"
                }
            }
        }
    }

    val listener = object : RadioGroup.OnCheckedChangeListener {
        override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
            when(p0?.id) {
                R.id.radioGroup1 -> {
                    when(p1) {
                        R.id.radioButton -> {
                            textView.text = "radio 1-1 is checked"
                        }
                        R.id.radioButton2 -> {
                            textView.text = "radio 1-2 is checked"
                        }
                        R.id.radioButton3 -> {
                            textView.text = "radio 1-3 is checked"
                        }
                    }
                }

                R.id.radioGroup2 -> {
                    when (p1) {
                        R.id.radioButton4 -> {
                            textView2.text = "radio 2-1 is checked"
                        }
                        R.id.radioButton5 -> {
                            textView2.text = "radio 2-2 is checked"
                        }
                        R.id.radioButton6 -> {
                            textView2.text = "radio 2-3 is checked"
                        }
                    }
                }
            }
        }
    }
}