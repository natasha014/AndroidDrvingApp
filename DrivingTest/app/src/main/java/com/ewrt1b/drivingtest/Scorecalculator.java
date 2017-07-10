package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Scorecalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorecalculator);
        ScoreKeeper finalScore = (ScoreKeeper)getIntent().getSerializableExtra("Score");
        double finalsc = finalScore.currentscore;
        double total= finalScore.totalscore;
        if ((finalsc/total)>=0.80) {
            Intent PassActivity = new Intent(this, Passactivity.class);
            startActivity(PassActivity);
        }
        else{
            Intent FailActivity = new Intent(this, FailResult.class);
            startActivity(FailActivity);
        }
    }
}

