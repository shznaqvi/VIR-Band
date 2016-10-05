package com.example.hassannaqvi.virband;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sA extends AppCompatActivity {

    private static final String TAG = "SectionA";
    public static FormsContract fc;
    public static String HHNo;
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    String deviceId;


    @BindView(R.id.A02)
    EditText A02;
    @BindView(R.id.A105)
    EditText A105;
    @BindView(R.id.A04)
    RadioGroup A04;
    @BindView(R.id.A04_a)
    RadioButton A04_a;
    @BindView(R.id.A04_b)
    RadioButton A04_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_a);
        TypefaceUtil.overrideFont(getApplicationContext(), "sans", "fonts/JameelNooriNastaleeq.ttf");
        ButterKnife.bind(this);
        deviceId = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                Settings.Secure.ANDROID_ID);

    }

    public void submitSA(View v) {

        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) ;
            Intent SA = new Intent(this, sB.class);
            startActivity(SA);
        }

    }

    private boolean UpdateDB() {
        Long rowId;
        FormsDBHelper db = new FormsDBHelper(this);
        rowId = null;
        rowId = db.addForm(fc);

        fc.setID(rowId);

        if (rowId != null) {
            Toast.makeText(sA.this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            fc.setFormNo(fc.getDeviceID().substring(fc.getDeviceID().length() - 5) + "-" + fc.getID());
            Toast.makeText(sA.this, "Current Form No: " + fc.getFormNo(), Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(sA.this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void SaveDraft() {
        fc = new FormsContract();

        fc.setVA101(dtToday);
        fc.setVA102("TestUser");

        fc.setVA02(A02.getText().toString());
        fc.setVA105(A105.getText().toString());

        switch (A04.getCheckedRadioButtonId()) {
            case R.id.A04_a:
                fc.setVA04("a");
                break;
            case R.id.A04_b:
                fc.setVA04("b");
                break;
            default:
                fc.setVA04("xx");
        }

        fc.setVA109("3");
        fc.setDeviceID(deviceId);
        setGPS();
        String msg = "Saving Draft... Successful!";
        Msg.t(getApplicationContext(), msg);
        Msg.m(msg);
        //Toast.makeText(sA.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    public Boolean formValidation() {

        if (A02.getText().toString().isEmpty()) {
            Toast.makeText(this, "Household Number not given!", Toast.LENGTH_LONG).show();
            A02.setError("Household Number not given!");
            Log.i(TAG, "A02- Household is empty");
            return false;
        } else {
            A02.setError(null);
            HHNo = A02.getText().toString();
        }

        if (A105.getText().toString().isEmpty()) {
            Toast.makeText(this, "Cluster Number not given!", Toast.LENGTH_LONG).show();
            A105.setError("Cluster Number not given!");
            Log.i(TAG, "A105- Cluster is empty");
            return false;
        } else {
            A105.setError(null);
        }

        if (A04.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select an Area!", Toast.LENGTH_LONG).show();
            A04_b.setError("Please select an Area!");
            Log.i(TAG, "A04- Area not selected");
            return false;
        } else {
            A04_b.setError(null);
        }
        if (Integer.valueOf(A105.getText().toString()) <= 20 && Integer.valueOf(A105.getText().toString()) > 0) {
            A105.setError(null);
            if (A04_a.isChecked() && Integer.valueOf(A105.getText().toString()) < 14) {
                Toast.makeText(this, "Area do not match cluster!", Toast.LENGTH_LONG).show();
                A04_b.setError(null);
                A04_a.setError("Area do not match cluster!");
                Log.i(TAG, "A04- Area do not match");
                return false;
            } else if (A04_b.isChecked() && Integer.valueOf(A105.getText().toString()) >= 14) {
                Toast.makeText(this, "Area do not match cluster!", Toast.LENGTH_LONG).show();
                A04_a.setError(null);
                A04_b.setError("Area do not match cluster!");
                Log.i(TAG, "A04- Area do not match");
                return false;
            } else {
                A04_b.setError(null);
                A04_a.setError(null);
            }
        } else {
            Toast.makeText(this, "Invalid Cluster Number!", Toast.LENGTH_LONG).show();
            A105.setError("Invalid Cluster Number!");
            Log.i(TAG, "A105- Invalid Cluster Number!");
            return false;
        }

        Toast.makeText(sA.this, "Validation... Successful!", Toast.LENGTH_SHORT).show();
        return true;
    }

    public void setGPS() {
        SharedPreferences GPSPref = getSharedPreferences("GPSCoordinates", Context.MODE_PRIVATE);

        String date = DateFormat.format("dd-MM-yyyy HH:mm", Long.parseLong(GPSPref.getString("Time", "0"))).toString();

        fc.setGPSLat(GPSPref.getString("Latitude", "0"));
        fc.setGPSLng(GPSPref.getString("Longitude", "0"));
        fc.setGPSAcc(GPSPref.getString("Accuracy", "0"));
        fc.setGPSTime(GPSPref.getString(date, "0"));

        Toast.makeText(sA.this, "GPS set", Toast.LENGTH_SHORT).show();
    }
}
