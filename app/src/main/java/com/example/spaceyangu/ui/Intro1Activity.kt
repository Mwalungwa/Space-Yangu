package com.example.spaceyangu.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceyangu.R

class Intro1Activity: AppCompatActivity() {

    private lateinit var _space__yangu: TextView
    private lateinit var _intro__1__entry: TextView
    private lateinit var nxt_button: Button
    private lateinit var skip_button: Button
    private lateinit var logo: View
    private lateinit var back: ImageButton


    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_1)
    }
}