package com.jungho.edittext

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener() {
            textView1.text = editText1.text

            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(editText1.windowToken, 0)

            editText1.clearFocus()
        }

        editText1.addTextChangedListener(listener1)
        editText1.setOnEditorActionListener { textView, i, keyEvent ->
            textView1.text = "엔터 버튼을 눌렀습니다."
            textView2.text = editText1.text
            false
        }
    }

    val listener1 = object : TextWatcher{
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            textView1.text = "before : $p0"
        }

        override fun afterTextChanged(p0: Editable?) {

            textView2.text = "after : $p0"
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            textView3.text = "onText : $p0"
        }
    }
}