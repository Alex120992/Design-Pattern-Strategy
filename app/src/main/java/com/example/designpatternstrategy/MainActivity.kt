package com.example.designpatternstrategy

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatternstrategy.FirstClickOnButton as FirstClickOnButton1

class MainActivity : AppCompatActivity() {
    private lateinit var mButton: Button
    private lateinit var mTextView: TextView
    private lateinit var firstclickOnButton: ClickOnButton
    private lateinit var secondclickOnButton: ClickOnButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById(R.id.button)
        mTextView = findViewById(R.id.textView)
        firstclickOnButton = FirstClickOnButton1()
        secondclickOnButton = SecondClickOnButton()

        var count: Int = 0

        mButton.setOnClickListener(View.OnClickListener {

            count++
            if (count >= 2) count = 0
            when (count) {
                1 -> firstclickOnButton.changeColor(mTextView, mButton)
                0 -> secondclickOnButton.changeColor(mTextView, mButton)
            }
        })

    }
}