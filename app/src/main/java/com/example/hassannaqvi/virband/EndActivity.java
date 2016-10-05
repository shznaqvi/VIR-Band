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
    }

    public void addChild(View v) {
        Intent aC = new Intent(this, sOCI.class);
        VIRBandApp.ageindays = 0;
        startActivity(aC);
    }

    public void closeForm(View v) {
        Intent end = new Intent(this, MainActivity.class);
        sA.fc = null;
        sOCI.occ = null;
        VIRBandApp.OChID = 0;
        VIRBandApp.ageindays = 0;
        startActivity(end);
    }
}
