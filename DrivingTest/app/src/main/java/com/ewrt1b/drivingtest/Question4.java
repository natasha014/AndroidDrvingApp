package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        final Intent Q5= new Intent(this, Question5.class);//FINAL?




        new CountDownTimer(5000, 1000){
            TextView timertext2= (TextView) findViewById(R.id.timertext2);
            public void onTick(long millisUntilFinished) {
                timertext2.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Bundle scoreBundle = new Bundle();
                ScoreKeeper score4 = (ScoreKeeper)getIntent().getSerializableExtra("Score");
                CheckBox correct2 = (CheckBox) findViewById(R.id.checkBox12);
                if (correct2.isChecked())
                {
                    score4.currentscore= score4.currentscore+2;
                }
                scoreBundle.putSerializable("Score", score4);
                Q5.putExtras(scoreBundle);
                startActivity(Q5);
            }
        }.start();

    }


}
