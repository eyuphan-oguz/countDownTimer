package com.eyuphanoguz.sayacprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(15000,1000){
            var contentTextView = findViewById<TextView>(R.id.textView)
            override fun onTick(p0: Long) {
                contentTextView.text= "${p0 / 1000}"
            }

            override fun onFinish() {
                contentTextView.text= "Finish"
            }

        }.start()
    }
}