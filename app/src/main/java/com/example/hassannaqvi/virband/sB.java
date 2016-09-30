package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sB extends AppCompatActivity {

    private static final String TAG = "SectionB";

    public static JSONObject sb;
    public static String iChildName;



    @BindView(R.id.B05)
    EditText B05;
    @BindView(R.id.B06)
    RadioGroup B06;
    @BindView(R.id.B06_male)
    RadioButton B06_male;
    @BindView(R.id.B06_female)
    RadioButton B06_female;
    @BindView(R.id.DOB)
    CheckBox DOB;
    @BindView(R.id.B07)
    DatePicker B07;
    @BindView(R.id.B08m)
    EditText B08m;
    @BindView(R.id.B08y)
    EditText B08y;
    @BindView(R.id.B08d)
    EditText B08d;
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

    @BindView(R.id.B11_x)
    EditText B11_x;


    @BindView(R.id.fldGrpDOB)
    LinearLayout fldGrpDOB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_b);
        ButterKnife.bind(this);
        B07.setMaxDate(new Date().getTime());
        B07.setMinDate(new Date().getTime() - (VIRBandApp.MILLISECONDS_IN_YEAR * 2));

        DOB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (DOB.isChecked()) {
                    fldGrpDOB.setVisibility(View.VISIBLE);
                    //B07 = (DatePicker) findViewById(R.id.B07);
                } else {
                    fldGrpDOB.setVisibility(View.GONE);
                    //B07 = null;
                }
            }
        });

        // SKIP PATTERN
        B11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!B11_e.isChecked()) {
                    B11_x.setVisibility(View.GONE);
                    B11_x.setText(null);
                } else {
                    B11_x.setVisibility(View.VISIBLE);

                }
            }
        });
    }

    public void submitSB(View v) throws JSONException {
        Log.d(TAG, String.valueOf(B06.getCheckedRadioButtonId() + " || " + R.id.B06_male));

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

        sb = new JSONObject();

        String spDateT = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(B07.getCalendarView().getDate());

        sb.put("B05", B05.getText().toString());
        iChildName = B05.getText().toString();
        Log.d(TAG, String.valueOf(B06.getCheckedRadioButtonId() + "" + R.id.B06_male));

        int i = B06.getCheckedRadioButtonId();
        if (i == R.id.B06_male) {
            sb.put("B06", "a");

        } else if (i == R.id.B06_female) {
            sb.put("B06", "b");


        } else {
            sb.put("B06", "ns"); // none selected
        }
        sb.put("B07", spDateT);
        sb.put("B08m", B08m.getText().toString());
        sb.put("B08y", B08y.getText().toString());
        sb.put("B08d", B08d.getText().toString());
        if (DOB.isChecked()) {
            Calendar cal = Calendar.getInstance();
            cal.set(B07.getYear(), B07.getMonth(), B07.getDayOfMonth());
            Date date1 = new Date();
            Date date2 = cal.getTime();
            long diff = date1.getTime() - date2.getTime();
            VIRBandApp.ageindays = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } else {
            int m2days = (Integer.valueOf(B08m.getText().toString()) * 30);
            int y2days = (Integer.valueOf(B08y.getText().toString()) * 365);
            VIRBandApp.ageindays = (m2days + y2days + Integer.valueOf(B08d.getText().toString()));
        }
        Log.d(TAG, "Age in Days: " + VIRBandApp.ageindays);

        sb.put("B09", B09.getText().toString());
        sb.put("B10", B10.getText().toString());
        switch (B11.getCheckedRadioButtonId()) {
            case R.id.B11_a:
                sb.put("B11", "a");
                break;
            case R.id.B11_b:
                sb.put("B11", "b");
                break;
            case R.id.B11_c:
                sb.put("B11", "c");
                break;
            case R.id.B11_d:
                sb.put("B11", "d");
                break;
            case R.id.B11_e:
                sb.put("B11", "e");
                break;
            default:
                sb.put("B11", "xx");

        }
        sb.put("B11_x", B11_x.getText().toString());
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
        Log.d(TAG, String.valueOf(B06.getCheckedRadioButtonId()));
        if (!DOB.isChecked() && (B08m.getText().toString().isEmpty() && B08y.getText().toString().isEmpty() && B08d.getText().toString().isEmpty())) {
            Toast.makeText(sB.this, "Please enter age", Toast.LENGTH_LONG).show();
            B08m.setError("Please enter age");
            Log.i(TAG, "Index Child's Age not given");
            return false;
        } else {
            B08m.setError(null);
        }
        if (!DOB.isChecked()) {
            if (B08d.getText().toString().isEmpty()) {
                Toast.makeText(sB.this, "Please enter days (or '0')", Toast.LENGTH_LONG).show();
                B08d.setError("Please enter days (or '0')");
                Log.i(TAG, "Please enter days (or '0')");
                return false;
            } else {
                B08d.setError(null);
            }
            if (B08m.getText().toString().isEmpty()) {
                Toast.makeText(sB.this, "Please enter month (or '0')", Toast.LENGTH_LONG).show();
                B08m.setError("Please enter month (or '0')");
                Log.i(TAG, "Please enter month (or '0')");
                return false;
            } else {
                B08m.setError(null);
            }

            if (B08y.getText().toString().isEmpty()) {
                Toast.makeText(sB.this, "Please enter year (or '0')", Toast.LENGTH_LONG).show();
                B08y.setError("Please enter year (or '0')");
                Log.i(TAG, "Please enter year (or '0')");
                return false;
            } else {
                B08y.setError(null);
            }

            if (!B08m.getText().toString().isEmpty()) {
                if (Integer.valueOf(B08m.getText().toString()) > 11) {
                    Toast.makeText(sB.this, "Months cannot be more than 11", Toast.LENGTH_LONG).show();
                    B08m.setError("Months cannot be more than 11");
                    Log.i(TAG, "Months cannot be more than 11");
                    return false;
                } else {
                    B08m.setError(null);
                }
            }

            if (!B08d.getText().toString().isEmpty()) {
                if (Integer.valueOf(B08d.getText().toString()) > 29) {
                    Toast.makeText(sB.this, "Days cannot be more than 29", Toast.LENGTH_LONG).show();
                    B08d.setError("Days cannot be more than 29");
                    Log.i(TAG, "Days cannot be more than 29");
                    return false;
                } else {
                    B08d.setError(null);
                }
            }

            if (!B08y.getText().toString().isEmpty()) {
                if (Integer.valueOf(B08y.getText().toString()) > 1) {
                    Toast.makeText(sB.this, "Year cannot be more than 1", Toast.LENGTH_LONG).show();
                    B08y.setError("Year cannot be more than 1");
                    Log.i(TAG, "Year cannot be more than 1");
                    return false;
                } else {
                    B08y.setError(null);
                }
            }
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

        if (B11_e.isChecked() && B11_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            B11_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            B11_x.setError(null);
        }

        Toast.makeText(this, "Validation... Successful!", Toast.LENGTH_SHORT).show();
        return true;
    }


}
