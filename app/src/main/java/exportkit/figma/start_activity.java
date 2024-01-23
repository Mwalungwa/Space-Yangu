package exportkit.figma;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;


import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import com.example.spaceyangu.R;

    public class start_activity extends Activity {


        private View _bg__shape;
        private View _bg__logo;
        private TextView _space__yangu;
        private TextView _start__entry;

        @SuppressLint("MissingInflatedId")
        @Override
        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.start);

            _bg__logo = (View) findViewById(R.id.logo);
            _space__yangu = (TextView) findViewById(R.id.space_yangu);
            _start__entry = (TextView) findViewById(R.id.start_entry);

            new CountDownTimer(5000, 1000){
                public void onTick(long millisUntilFinished) {
                }

                @Override
                public void onFinish() {
                    Intent intent = new Intent(start_activity.this, intro_1_activity.class);
                    startActivity(intent);
                }
            }.start();
        }
    }
	
	