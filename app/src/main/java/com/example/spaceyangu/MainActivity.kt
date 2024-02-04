package com.example.spaceyangu

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.spaceyangu.ui.Intro1Activity


class MainActivity : ComponentActivity() {

    private lateinit var _bg__logo: View
    private lateinit var _space__yangu: TextView
    private lateinit var _start__entry: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)

        _bg__logo = findViewById(R.id.logo)
        _space__yangu = findViewById(R.id.space_yangu)
        _start__entry = findViewById(R.id.start_entry)

        object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                val intent = Intent(
                    /* packageContext = */ this@MainActivity,
                    /* cls = */ Intro1Activity::class.java
                )
                startActivity(intent)
                if (Build.VERSION.SDK_INT >= 34) {
                    overrideActivityTransition(OVERRIDE_TRANSITION_OPEN,R.anim.slide_in_left, R.anim.slide_out_right)
                } else {
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left)
                }
            }
        }.start()

    }
}
