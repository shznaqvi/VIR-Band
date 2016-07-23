package com.example.hassannaqvi.virband;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.coordinatorLayout)
    View coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        if (!VIRBandApp.locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            buildAlertMessageNoGps();
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FormsDBHelper db = new FormsDBHelper(this);
        Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "Last ID: " + String.valueOf(db.lastInsertId()), Snackbar.LENGTH_LONG);

        snackbar.show();


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

    }

    public void openForm(View v) {
        Intent oF = new Intent(this, sA.class);
        startActivity(oF);
    }

    public void openSA(View v) {
        Intent oF = new Intent(this, sA.class);
        startActivity(oF);
    }

    public void openSB(View v) {
        Intent oF = new Intent(this, sB.class);
        startActivity(oF);
    }

    public void openSC(View v) {
        Intent oF = new Intent(this, sC.class);
        startActivity(oF);
    }

    public void openSD(View v) {
        Intent oF = new Intent(this, sD.class);
        startActivity(oF);
    }

    public void openSE(View v) {
        Intent oF = new Intent(this, sE.class);
        startActivity(oF);
    }

    public void openVD(View v) {
        Intent oF = new Intent(this, sVD.class);
        startActivity(oF);
    }

    public void checkLocation(View v) {
        Intent chkLoc = new Intent(this, CalibrateLocation.class);
        startActivity(chkLoc);
    }

    private void buildAlertMessageNoGps() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, final int id) {
                        startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog, final int id) {
                        dialog.cancel();
                        if (!VIRBandApp.locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
                            buildAlertMessageNoGps();
                        }

                    }
                });
        final AlertDialog alert = builder.create();
        alert.show();

    }




}
