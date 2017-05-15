package com.ewrt1b.drivingtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        ScoreKeeper score = (ScoreKeeper)getIntent().getSerializableExtra("Score");
        int test = score.currentscore;

            }

    public void Q2 (View view) {





    }


}
