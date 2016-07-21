package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sB extends AppCompatActivity {

    private static final String TAG = "SectionB";


    @BindView(R.id.B05)
    EditText B05;
    @BindView(R.id.B06)
    RadioGroup B06;
    @BindView(R.id.B06_male)
    RadioButton B06_male;
    @BindView(R.id.B06_female)
    RadioButton B06_female;
    @BindView(R.id.B07)
    DatePicker B07;
    @BindView(R.id.B08)
    EditText B08;
    @BindView(R.id.B09)
    EditText B09;
    @BindView(R.id.B10)
    EditText B10;
    @BindView(R.id.B11)
    RadioGroup B11;
    @BindView(R.id.B11_a)
    RadioButton B11_a;
    @BindView(R.id.B11_b)
    RadioButton B11_b;
    @BindView(R.id.B11_c)
    RadioButton B11_c;
    @BindView(R.id.B11_d)
    RadioButton B11_d;
    @BindView(R.id.B11_e)
    RadioButton B11_e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_b);
        ButterKnife.bind(this);


    }

    public void submitSB(View v) throws JSONException {

        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent SB = new Intent(this, sC.class);
                startActivity(SB);
            }
        }

    }

    public boolean UpdateDB() {

        FormsDBHelper db = new FormsDBHelper(this);

        int updcount = db.updateSB();

        if (updcount == 1) {
            Toast.makeText(sB.this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(sB.this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();

        }
        return true;

    }

    public void SaveDraft() throws JSONException {

        JSONObject sb = new JSONObject();

        String spDateT = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(B07.getCalendarView().getDate());

        sb.put("B05", B05.getText().toString());
        switch (B06.getCheckedRadioButtonId()) {
            case R.id.B06_male:
                sb.put("B06", "a");
            case R.id.B06_female:
                sb.put("B06", "b");
            default:
                sb.put("B06", "ns"); // none selected
        }
        sb.put("B07", spDateT);
        sb.put("B08", B08.getText().toString());
        sb.put("B09", B09.getText().toString());
        sb.put("B10", B10.getText().toString());
        switch (B11.getCheckedRadioButtonId()) {
            case R.id.B11_a:
                sb.put("B11", "a");
            case R.id.B11_b:
                sb.put("B11", "b");
            case R.id.B11_c:
                sb.put("B11", "c");
            case R.id.B11_d:
                sb.put("B11", "d");
            case R.id.B11_e:
                sb.put("B11", "e");
            default:
                sb.put("B11", "ns"); // none selected

        }


        sA.fc.setVB(sb.toString());

        Toast.makeText(sB.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        if (B05.getText().toString().isEmpty()) {
            Toast.makeText(sB.this, "Please enter index child name", Toast.LENGTH_LONG).show();
            B05.setError("Please enter index child name");
            Log.i(TAG, "Name of Index Child not given");
            return false;
        } else {
            B05.setError(null);
        }

        if (B06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(sB.this, "Please select gender", Toast.LENGTH_LONG).show();
            B06_male.setError("Please select gender");
            Log.i(TAG, "Index Child's Gender not selected");
            return false;
        } else {
            B06_male.setError(null);
        }

        if (B08.getText().toString().isEmpty()) {
            Toast.makeText(sB.this, "Please enter age", Toast.LENGTH_LONG).show();
            B08.setError("Please enter age");
            Log.i(TAG, "Index Child's Age not given");
            return false;
        } else {
            B08.setError(null);
        }

        if (B09.getText().toString().isEmpty()) {
            Toast.makeText(sB.this, "Please enter Mother's Name", Toast.LENGTH_LONG).show();
            B09.setError("Please enter Mother's Name");
            Log.i(TAG, "Mother's Name not given");
            return false;

        } else {
            B09.setError(null);
        }

        if (B10.getText().toString().isEmpty()) {
            Toast.makeText(sB.this, "Please enter Father's Name", Toast.LENGTH_LONG).show();
            B10.setError("Please enter Father's Name");
            Log.i(TAG, "Father's Name not given");
            return false;

        } else {
            B10.setError(null);
        }

        if (B11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(sB.this, "Please select the Place of Birth", Toast.LENGTH_LONG).show();
            B11_e.setError("Please select the Place of Birth");
            Log.i(TAG, "Place of Birth not selected");
            return false;
        } else {
            B11_e.setError(null);
        }


        Toast.makeText(this, "Validation... Successful!", Toast.LENGTH_SHORT).show();

        return true;
    }


}
