package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        final Intent ScoreCalc = new Intent(this, Scorecalculator.class);//FINAL?




        new CountDownTimer(5000, 1000){
            TextView timertext3= (TextView) findViewById(R.id.timertext3);
            public void onTick(long millisUntilFinished) {
                timertext3.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Bundle scoreBundle = new Bundle();
                ScoreKeeper score5 = (ScoreKeeper)getIntent().getSerializableExtra("Score");
                CheckBox correct3 = (CheckBox) findViewById(R.id.checkBox13);
                if (correct3.isChecked())
                {
                    score5.currentscore= score5.currentscore+2;
                }
                scoreBundle.putSerializable("Score", score5);
                ScoreCalc.putExtras(scoreBundle);
                startActivity(ScoreCalc);
            }
        }.start();

    }
}

