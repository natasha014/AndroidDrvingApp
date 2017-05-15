package com.ewrt1b.drivingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.Serializable;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //serializable method
    public void whenClicked(View view) {
        ScoreKeeper score = new ScoreKeeper(0);
        Intent intent = new Intent(MainActivity.this, Question1.class);
        Bundle scoreBundle = new Bundle();
        scoreBundle.putSerializable("Score", score);
        intent.putExtras(scoreBundle);
        startActivity(intent);

    }

}
