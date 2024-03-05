package com.example.spaceyangu.ui

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceyangu.R
import android.content.Intent

class SignInSignUpActivity: AppCompatActivity() {

    private lateinit var _signin__button: Button
    private lateinit var _signup__button:Button

    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_signup)

        _signin__button = findViewById(R.id.signin_button)
        _signup__button = findViewById(R.id.signup_button)

        _signin__button.setOnClickListener{
            val intent = Intent(this@SignInSignUpActivity, SignInActivity::class.java)
            startActivity(intent)

        }

        _signin__button.setOnClickListener{
            val intent = Intent(this@SignInSignUpActivity,SignInActivity::class.java)
            startActivity(intent)
        }

        _signup__button.setOnClickListener {
            val intent = Intent(this@SignInSignUpActivity, SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}