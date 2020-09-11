package com.example.designpatternstrategy

import android.widget.Button
import android.widget.TextView

interface ClickOnButton {
    fun changeColor (textView: TextView, button: Button)
}