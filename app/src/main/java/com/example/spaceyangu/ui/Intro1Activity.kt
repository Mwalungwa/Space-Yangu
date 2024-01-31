package com.example.spaceyangu.ui

import android.content.Intent
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

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_1)

        nxt_button = findViewById(R.id.nxt_button)
        skip_button = findViewById(R.id.skip_button)

        nxt_button.setOnClickListener{
            val intent = Intent(this@Intro1Activity, Intro2Activity::class.java)
            startActivity(intent)
        }

        skip_button.setOnClickListener{
            val intent =Intent(this@Intro1Activity, SignInSignUpActivity::class.java)
            startActivity(intent)
        }

    }
}