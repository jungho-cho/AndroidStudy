package com.jungho.textinputlayout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            textView1.text = textInputLayout1.editText?.text

            textInputLayout1.clearFocus()

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(textInputLayout1.editText?.windowToken, 0)
        }

        textInputLayout1.editText?.addTextChangedListener(listner1)
    }

    val listner1 = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            if (p0 != null) {
                if(p0.length > 10) {
                    textInputLayout1.error = "10글자 이하로 입력해주세요"
                } else {
                    textInputLayout1.error = null
                }
            }
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }
    }
}