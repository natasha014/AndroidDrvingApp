package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);


            }

    public void Q2 (View view) {
        Intent failIntent2 = new Intent(this, FailResult.class);
        ScoreKeeper score2 = (ScoreKeeper)getIntent().getSerializableExtra("Score");
        CheckBox noneOther = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox oneOther = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox moreOther = (CheckBox) findViewById(R.id.checkBox6);
        if (oneOther.isChecked() && moreOther.isChecked())
        {
            //TextView selectionerror = (TextView) (findViewById(R.id.textView4));
            //error.getContentView();
            //error.setContentView(textview4);
        }
        else if (noneOther.isChecked()){
            score2.currentscore= score2.currentscore +2;
            Intent intentQ3 = new Intent(this, Question3.class);
            Bundle scoreBundle = new Bundle();
            scoreBundle.putSerializable("Score", score2);
            intentQ3.putExtras(scoreBundle);
            startActivity(intentQ3);

        }
        else if (moreOther.isChecked()) {
            startActivity(failIntent2);
        }
        else if (oneOther.isChecked() && score2.currentscore==1 ) {
            int test=score2.currentscore;
            startActivity(failIntent2);
        }
        else{
            score2.currentscore++;
            Intent intentQ3 = new Intent(this, Question3.class);
            startActivity(intentQ3);
        }




    }


}
