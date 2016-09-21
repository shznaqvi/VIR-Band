package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        VIRBandApp.ageindays = 0;
    }

    public void addChild(View v) {
        Intent aC = new Intent(this, sOCI.class);
        startActivity(aC);
    }
}
