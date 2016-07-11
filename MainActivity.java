package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0;
    int TeamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int value)
    {
        TextView t = (TextView) findViewById(R.id.display_TeamAScore);
        t.setText(String.valueOf(value));
    }

    public void displayB(int value)
    {
        TextView t = (TextView) findViewById(R.id.display_TeamBScore);
        t.setText(String.valueOf(value));
    }

    public void OnClickA3(View view) {
        TeamAScore += 3;
        displayA(TeamAScore);
    }
    public void OnClickA2(View view) {
        TeamAScore += 2;
        displayA(TeamAScore);
    }
    public void OnClickA1(View view) {
        TeamAScore += 1;
        displayA(TeamAScore);
    }

    public void OnClickB3(View view) {
        TeamBScore += 3;
        displayB(TeamBScore);
    }
    public void OnClickB2(View view) {
        TeamBScore += 2;
        displayB(TeamBScore);
    }
    public void OnClickB1(View view) {
        TeamBScore += 1;
        displayB(TeamBScore);
    }

    public void OnClickReset(View view) {
        TeamBScore = 0;
        TeamAScore = 0;
        displayA(TeamAScore);
        displayB(TeamBScore);
    }
}
