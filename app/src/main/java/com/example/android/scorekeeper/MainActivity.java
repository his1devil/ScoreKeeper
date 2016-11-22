package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    int scoreOfClv = 0;
    int scoreOfSan = 0;
    int foulOfClv = 0;
    int foulOfSan = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsClv(View v) {
        scoreOfClv = scoreOfClv + 3;
        displayScoreOfClv(scoreOfClv);
    }

    public void twoPointsClv(View v) {
        scoreOfClv = scoreOfClv + 2;
        displayScoreOfClv(scoreOfClv);
    }

    public void onePointsClv(View v) {
        scoreOfClv = scoreOfClv + 1;
        displayScoreOfClv(scoreOfClv);
    }

    public void threePointsSan(View v) {
        scoreOfSan = scoreOfSan + 3;
        displayScoreOfSan(scoreOfSan);
    }

    public void twoPointsSan(View v) {
        scoreOfSan = scoreOfSan + 2;
        displayScoreOfSan(scoreOfSan);
    }

    public void onePointsSan(View v) {
        scoreOfSan = scoreOfSan + 1;
        displayScoreOfSan(scoreOfSan);
    }

    public void setFoulOfClv(View v) {
        foulOfClv = foulOfClv + 1;
        String message = "FOULS: " + foulOfClv;
        displayFoulsOfClv(message);
    }

    public void setFoulOfSan(View v) {
        foulOfSan = foulOfSan + 1;
        String message = "FOULS: " + foulOfSan;
        displayFoulsOfSan(message);
    }

    public void reset(View v) {
        scoreOfClv = 0;
        scoreOfSan = 0;
        foulOfClv = 0;
        foulOfSan = 0;
        String message = "FOULS: " + 0;
        displayScoreOfClv(scoreOfClv);
        displayScoreOfSan(scoreOfSan);
        displayFoulsOfClv(message);
        displayFoulsOfSan(message);
    }

    public void displayScoreOfClv(int count) {
        TextView countView = (TextView) findViewById(R.id.scoreOfClv);
        countView.setText(String.valueOf(count));
    }

    public void displayScoreOfSan(int count) {
        TextView countView = (TextView) findViewById(R.id.scoreOfSan);
        countView.setText(String.valueOf(count));
    }

    public void displayFoulsOfClv(String message) {
        TextView countView = (TextView) findViewById(R.id.foulsOfClv);
        countView.setText(message);
    }

    public void displayFoulsOfSan(String message) {
        TextView countView = (TextView) findViewById(R.id.foulsOfSan);
        countView.setText(message);
    }
}
