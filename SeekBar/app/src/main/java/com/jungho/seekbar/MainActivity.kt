package com.jungho.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.text = "SeekBar = ${seekBar.progress}"
            textView2.text = "SeekBar2 = ${seekBar2.progress}"
        }

        button2.setOnClickListener {
            seekBar.progress = 3
            seekBar2.progress = 8
        }

        button3.setOnClickListener {
            seekBar.incrementProgressBy(1)
        }

        button4.setOnClickListener {
            seekBar.incrementProgressBy(-1)
        }

        seekBar.setOnSeekBarChangeListener(listener)
        seekBar2.setOnSeekBarChangeListener(listener)
    }

    val listener = object : SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            when(p0?.id) {
                R.id.seekBar -> {
                    textView.text = "seekbar = ${p1}\n"
                }

                R.id.seekBar2 -> {
                    textView.text = "seekbar2 = ${p1}\n"
                }
            }

            if(p2)
                textView2.text = "사용자에 의해 설정되었습니다."
            else
                textView2.text = "코드에 의해 설정되었습니다."
        }

        override fun onStartTrackingTouch(p0: SeekBar?) {
            when(p0?.id) {
                R.id.seekBar -> {
                    textView.append("첫 번째 SeekBar 사용자 터치 시작\n")
                }

                R.id.seekBar2 -> {
                    textView.append("두 번째 SeekBar 사용자 터치 시작\n")
                }
            }
        }

        override fun onStopTrackingTouch(p0: SeekBar?) {
            when(p0?.id) {
                R.id.seekBar -> {
                    textView.append("첫 번째 SeekBar 사용자 터치 종료\n")
                }

                R.id.seekBar2 -> {
                    textView.append("두 번째 SeekBar 사용자 터치 종료\n")
                }
            }
        }
    }
}