package com.example.designpatternstrategy

import android.graphics.Color
import android.graphics.ColorSpace
import android.widget.Button
import android.widget.TextView

class FirstClickOnButton : ClickOnButton {


    override fun changeColor(textView: TextView, button: Button) {
        textView.setBackgroundColor(Color.RED)
        button.setBackgroundColor(Color.RED)
    }
}