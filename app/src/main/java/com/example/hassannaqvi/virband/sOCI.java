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

public class sOCI extends AppCompatActivity {

    private static final String TAG = "SectionB";

    public static JSONObject soc;
    public static int ageindaysOCI;


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
    }

    public void submitSB(View v) throws JSONException {
        Log.d(TAG, String.valueOf(B06.getCheckedRadioButtonId() + " || " + R.id.B06_male));

        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent SOC = new Intent(this, sVD.class);
                SOC.putExtra("icTP", 0);
                SOC.putExtra("ic", false);
                startActivity(SOC);
            }
        }

    }

    public boolean UpdateDB() {

        Long rowId;
        /*OcsDBHelper db = new OcsDBHelper(this);

        rowId = db.addForm(fc);
        fc.setID(rowId);
        fc.setFormNo(fc.getDeviceID().substring(fc.getDeviceID().length() - 5) + "-" + fc.getID());
        Toast.makeText(sA.this, "Current Form No: " + fc.getFormNo(), Toast.LENGTH_SHORT).show();
*/
        return true;

    }

    public void SaveDraft() throws JSONException {

        soc = new JSONObject();

        String spDateT = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(B07.getCalendarView().getDate());

        soc.put("B05", B05.getText().toString());
        Log.d(TAG, String.valueOf(B06.getCheckedRadioButtonId() + "" + R.id.B06_male));

        int i = B06.getCheckedRadioButtonId();
        if (i == R.id.B06_male) {
            soc.put("B06", "a");

        } else if (i == R.id.B06_female) {
            soc.put("B06", "b");


        } else {
            soc.put("B06", "ns"); // none selected
        }
        soc.put("B07", spDateT);
        soc.put("B08m", B08m.getText().toString());
        soc.put("B08y", B08y.getText().toString());
        soc.put("B08d", B08d.getText().toString());
        if (DOB.isChecked()) {
            Calendar cal = Calendar.getInstance();
            cal.set(B07.getYear(), B07.getMonth(), B07.getDayOfMonth());
            Date date1 = new Date();
            Date date2 = cal.getTime();
            long diff = date1.getTime() - date2.getTime();
            ageindaysOCI = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } else {
            int m2days = (Integer.valueOf(B08m.getText().toString()) * 30);
            int y2days = (Integer.valueOf(B08y.getText().toString()) * 365);
            ageindaysOCI = (m2days + y2days + Integer.valueOf(B08d.getText().toString()));
        }
        Log.d(TAG, "Age in Days: " + ageindaysOCI);

        soc.put("B09", B09.getText().toString());
        soc.put("B10", B10.getText().toString());
        switch (B11.getCheckedRadioButtonId()) {
            case R.id.B11_a:
                soc.put("B11", "a");
                break;
            case R.id.B11_b:
                soc.put("B11", "b");
                break;
            case R.id.B11_c:
                soc.put("B11", "c");
                break;
            case R.id.B11_d:
                soc.put("B11", "d");
                break;
            case R.id.B11_e:
                soc.put("B11", "e");
                break;
            default:
                soc.put("B11", "xx");

        }

        sA.fc.setVB(soc.toString());
        Toast.makeText(sOCI.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        if (B05.getText().toString().isEmpty()) {
            Toast.makeText(sOCI.this, "Please enter index child name", Toast.LENGTH_LONG).show();
            B05.setError("Please enter index child name");
            Log.i(TAG, "Name of Index Child not given");
            return false;
        } else {
            B05.setError(null);
        }

        if (B06.getCheckedRadioButtonId() == -1) {
            Toast.makeText(sOCI.this, "Please select gender", Toast.LENGTH_LONG).show();
            B06_male.setError("Please select gender");
            Log.i(TAG, "Index Child's Gender not selected");
            return false;
        } else {
            B06_male.setError(null);

        }
        Log.d(TAG, String.valueOf(B06.getCheckedRadioButtonId()));
        if (!DOB.isChecked() && (B08m.getText().toString().isEmpty() && B08y.getText().toString().isEmpty() && B08d.getText().toString().isEmpty())) {
            Toast.makeText(sOCI.this, "Please enter age", Toast.LENGTH_LONG).show();
            B08m.setError("Please enter age");
            Log.i(TAG, "Index Child's Age not given");
            return false;
        } else {
            B08m.setError(null);
        }

        if (!B08m.getText().toString().isEmpty()) {
            if (Integer.valueOf(B08m.getText().toString()) > 11) {
                Toast.makeText(sOCI.this, "Months cannot be more than 11", Toast.LENGTH_LONG).show();
                B08m.setError("Months cannot be more than 11");
                Log.i(TAG, "Months cannot be more than 11");
                return false;
            } else {
                B08m.setError(null);
            }
        }

        if (!B08d.getText().toString().isEmpty()) {
            if (Integer.valueOf(B08d.getText().toString()) > 30) {
                Toast.makeText(sOCI.this, "Days cannot be more than 30", Toast.LENGTH_LONG).show();
                B08d.setError("Days cannot be more than 30");
                Log.i(TAG, "Days cannot be more than 30");
                return false;
            } else {
                B08d.setError(null);
            }
        }

        if (!B08y.getText().toString().isEmpty()) {
            if (Integer.valueOf(B08y.getText().toString()) > 2) {
                Toast.makeText(sOCI.this, "Year cannot be more than 2", Toast.LENGTH_LONG).show();
                B08y.setError("Year cannot be more than 2");
                Log.i(TAG, "Year cannot be more than 2");
                return false;
            } else {
                B08y.setError(null);
            }
        }

        if (B09.getText().toString().isEmpty()) {
            Toast.makeText(sOCI.this, "Please enter Mother's Name", Toast.LENGTH_LONG).show();
            B09.setError("Please enter Mother's Name");
            Log.i(TAG, "Mother's Name not given");
            return false;

        } else {
            B09.setError(null);
        }

        if (B10.getText().toString().isEmpty()) {
            Toast.makeText(sOCI.this, "Please enter Father's Name", Toast.LENGTH_LONG).show();
            B10.setError("Please enter Father's Name");
            Log.i(TAG, "Father's Name not given");
            return false;

        } else {
            B10.setError(null);
        }

        if (B11.getCheckedRadioButtonId() == -1) {
            Toast.makeText(sOCI.this, "Please select the Place of Birth", Toast.LENGTH_LONG).show();
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
