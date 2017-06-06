package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Question3 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        final Intent Q4= new Intent(this, Question4.class);//FINAL?




        new CountDownTimer(5000, 1000){
            TextView timertext= (TextView) findViewById(R.id.timertext);
            public void onTick(long millisUntilFinished) {
                timertext.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Bundle scoreBundle = new Bundle();
                ScoreKeeper score3 = (ScoreKeeper)getIntent().getSerializableExtra("Score");
                CheckBox correct = (CheckBox) findViewById(R.id.checkBox8);
                if (correct.isChecked())
                {
                    score3.currentscore= score3.currentscore+2;

                }
                scoreBundle.putSerializable("Score", score3);
                Q4.putExtras(scoreBundle);
                startActivity(Q4);
            }
        }.start();

    }

}




