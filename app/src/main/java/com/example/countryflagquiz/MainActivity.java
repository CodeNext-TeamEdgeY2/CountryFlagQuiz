package com.example.countryflagquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openQuestionsActivity(View view) {
        Intent openQuestionsActivity = new Intent(MainActivity.this, QuestionsActivity.class);
        startActivity(openQuestionsActivity);
    }

    public void openLeaderboardActivity(View view) {
        Intent openLeaderboardActivity = new Intent(MainActivity.this, LeaderboardActivity.class);
        startActivity(openLeaderboardActivity);
    }
}
