package com.example.spaceyangu.ui

import android.content.Intent
import android.os.Bundle
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.spaceyangu.R


class SignUpActivity: AppCompatActivity() {

    private lateinit var client_button: Button
    private lateinit var therapist_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        client_button = findViewById(R.id.client_button)
        therapist_button = findViewById(R.id.therapist_button)

        client_button.setOnClickListener{
            val intent = Intent(this@SignUpActivity, ClientSignUpActivity::class.java)
            startActivity(intent)
        }

    }

}