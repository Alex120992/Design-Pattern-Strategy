package com.example.designpatternstrategy

import android.graphics.Color
import android.widget.Button
import android.widget.TextView

class SecondClickOnButton: ClickOnButton {
    override fun changeColor(textView: TextView, button: Button) {
        textView.setBackgroundColor(Color.WHITE)
        button.setBackgroundColor(Color.WHITE)
    }
}