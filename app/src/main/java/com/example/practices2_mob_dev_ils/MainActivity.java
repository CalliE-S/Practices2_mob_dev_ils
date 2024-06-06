package com.example.practices2_mob_dev_ils;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView moneyTextView;
    public int moneyEarned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyTextView = findViewById(R.id.previous_money);
        ImageView playToContinue = findViewById(R.id.play);
        moneyEarned = 0;

        updateDisplay();
    }

    public void updateDisplay() {
        moneyTextView.setText("Money:" + moneyEarned);
    }

    private void addMoney(int amount) {
        moneyEarned += amount;
        updateDisplay();
    }

    private void playerEarnsMoney() {
        int moneyEarnedThisRound = 100;
        addMoney(moneyEarnedThisRound);
    }



}

