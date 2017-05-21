package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.PopupWindow;
import android.widget.TextView;

import static android.R.attr.button;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        TextView displayScore = (TextView) findViewById(R.id.textView2);
        //ScoreKeeper score = (ScoreKeeper)getIntent().getSerializableExtra("Score");



    }
    public void Q1 (View view){
        ScoreKeeper score1 = (ScoreKeeper)getIntent().getSerializableExtra("Score");
        CheckBox oneBeer = (CheckBox) findViewById(R.id.checkBox);
        CheckBox moreThanOne = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox none = (CheckBox) findViewById(R.id.checkBox2);
        PopupWindow error = new PopupWindow();

        if (oneBeer.isChecked() && moreThanOne.isChecked())
        {
           //TextView selectionerror = (TextView) (findViewById(R.id.textView4));
            //error.getContentView();
            //error.setContentView(textview4);
        }
        else if (none.isChecked()){
            score1.currentscore= score1.currentscore + 2;
            Intent intentQ2 = new Intent(this, question2.class);
            Bundle scoreBundle = new Bundle();
            scoreBundle.putSerializable("Score", score1);
            intentQ2.putExtras(scoreBundle);
            startActivity(intentQ2);

        }
        else if (moreThanOne.isChecked()) {
            Intent failIntent = new Intent(this, FailResult.class);
            startActivity(failIntent);
        }
        else{
            score1.currentscore++;
            Intent intentQ2 = new Intent(this, question2.class);
            Bundle scoreBundle = new Bundle();
            scoreBundle.putSerializable("Score", score1);
            intentQ2.putExtras(scoreBundle);
            startActivity(intentQ2);
        }


    }




}
