package com.jungho.checkedtextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckedTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = ""

            if (checkedTextView.isChecked)
                textView.append("첫 번째 체크 박스가 체크되어 있습니다.\n")
            else
                textView.append("첫 번째 체크 박스가 체크되어 있지 않습니다.\n")

            if (checkedTextView2.isChecked)
                textView.append("두 번째 체크 박스가 체크되어 있습니다.\n")
            else
                textView.append("두 번째 체크 박스가 체크되어 있지 않습니다.\n")

            if (checkedTextView3.isChecked)
                textView.append("세 번째 체크 박스가 체크되어 있습니다.\n")
            else
                textView.append("세 번째 체크 박스가 체크되어 있지 않습니다.\n")

            if (checkedTextView4.isChecked)
                textView.append("첫 번째 라디오 버튼이 선택되어 있습니다.\n")
            else if (checkedTextView5.isChecked)
                textView.append("두 번째 라디오 버튼이 선택되어 있습니다.\n")
            else if (checkedTextView6.isChecked)
                textView.append("세 번째 라디오 버튼이 선택되어 있습니다.\n")
        }

        button2.setOnClickListener {
            checkedTextView.isChecked = false
            checkedTextView2.isChecked = true
            checkedTextView3.isChecked = true

            checkedTextView4.isChecked = false
            checkedTextView5.isChecked = false
            checkedTextView6.isChecked = true
        }

        checkedTextView.setOnClickListener(listener1)
        checkedTextView2.setOnClickListener(listener1)
        checkedTextView3.setOnClickListener(listener1)

        checkedTextView4.setOnClickListener(listener2)
        checkedTextView5.setOnClickListener(listener2)
        checkedTextView6.setOnClickListener(listener2)
    }

    val listener1 = object : View.OnClickListener {
        override fun onClick(checkedTextView: View?) {
            val obj = checkedTextView as CheckedTextView
            if (obj.isChecked)
                obj.isChecked = false
            else
                obj.isChecked = true
        }
    }

    val listener2 = object : View.OnClickListener {
        override fun onClick(v: View?) {
            checkedTextView4.isChecked = false
            checkedTextView5.isChecked = false
            checkedTextView6.isChecked = false

            val obj = v as CheckedTextView
            obj.isChecked = true
        }
    }
}