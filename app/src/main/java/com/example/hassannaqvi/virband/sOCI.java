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
    public static OtherChildContract occ;

    public static JSONObject soc;
    public static int ageindaysOCI;


    @BindView(R.id.OC04)
    EditText OC04;
    @BindView(R.id.OC05)
    RadioGroup OC05;
    @BindView(R.id.OC05_male)
    RadioButton OC05_male;
    @BindView(R.id.OC05_female)
    RadioButton OC05_female;
    @BindView(R.id.DOB)
    CheckBox DOB;
    @BindView(R.id.OC06)
    DatePicker OC06;
    @BindView(R.id.OC07m)
    EditText OC07m;
    @BindView(R.id.OC07y)
    EditText OC07y;
    @BindView(R.id.OC07d)
    EditText OC07d;
    @BindView(R.id.OC08)
    EditText OC08;
    @BindView(R.id.OC09)
    EditText OC09;
    @BindView(R.id.OC10)
    RadioGroup OC10;
    @BindView(R.id.OC10_a)
    RadioButton OC10_a;
    @BindView(R.id.OC10_b)
    RadioButton OC10_b;
    @BindView(R.id.OC10_c)
    RadioButton OC10_c;
    @BindView(R.id.OC10_d)
    RadioButton OC10_d;
    @BindView(R.id.OC10_e)
    RadioButton OC10_e;
    @BindView(R.id.fldGrpDOB)
    LinearLayout fldGrpDOB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_b);
        ButterKnife.bind(this);
        OC06.setMaxDate(new Date().getTime());
        OC06.setMinDate(new Date().getTime() - (VIRBandApp.MILLISECONDS_IN_YEAR * 2));

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
        Log.d(TAG, String.valueOf(OC05.getCheckedRadioButtonId() + " || " + R.id.OC05_male));

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

        String spDateT = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(OC06.getCalendarView().getDate());

        soc.put("OC04", OC04.getText().toString());
        Log.d(TAG, String.valueOf(OC05.getCheckedRadioButtonId() + "" + R.id.B06_male));

        int i = OC05.getCheckedRadioButtonId();
        if (i == R.id.OC05_male) {
            soc.put("OC05", "a");

        } else if (i == R.id.OC05_female) {
            soc.put("OC05", "b");


        } else {
            soc.put("OC05", "ns"); // none selected
        }
        soc.put("OC06", spDateT);
        soc.put("OC07m", OC07m.getText().toString());
        soc.put("OC07y", OC07y.getText().toString());
        soc.put("OC07d", OC07d.getText().toString());
        if (DOB.isChecked()) {
            Calendar cal = Calendar.getInstance();
            cal.set(OC06.getYear(), OC06.getMonth(), OC06.getDayOfMonth());
            Date date1 = new Date();
            Date date2 = cal.getTime();
            long diff = date1.getTime() - date2.getTime();
            ageindaysOCI = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } else {
            int m2days = (Integer.valueOf(OC07m.getText().toString()) * 30);
            int y2days = (Integer.valueOf(OC07y.getText().toString()) * 365);
            ageindaysOCI = (m2days + y2days + Integer.valueOf(OC07d.getText().toString()));
        }
        Log.d(TAG, "Age in Days: " + ageindaysOCI);

        soc.put("OC08", OC08.getText().toString());
        soc.put("OC09", OC09.getText().toString());
        switch (OC10.getCheckedRadioButtonId()) {
            case R.id.OC10_a:
                soc.put("OC10", "a");
                break;
            case R.id.OC10_b:
                soc.put("OC10", "b");
                break;
            case R.id.OC10_c:
                soc.put("OC10", "c");
                break;
            case R.id.OC10_d:
                soc.put("OC10", "d");
                break;
            case R.id.OC10_e:
                soc.put("OC10", "e");
                break;
            default:
                soc.put("OC10", "xx");

        }

        occ = new OtherChildContract(sA.fc.getID().toString(), soc);
        Toast.makeText(sOCI.this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();

    }

    private boolean formValidation() {

        if (OC04.getText().toString().isEmpty()) {
            Toast.makeText(sOCI.this, "Please enter index child name", Toast.LENGTH_LONG).show();
            OC04.setError("Please enter index child name");
            Log.i(TAG, "Name of Index Child not given");
            return false;
        } else {
            OC04.setError(null);
        }

        if (OC05.getCheckedRadioButtonId() == -1) {
            Toast.makeText(sOCI.this, "Please select gender", Toast.LENGTH_LONG).show();
            OC05_male.setError("Please select gender");
            Log.i(TAG, "Index Child's Gender not selected");
            return false;
        } else {
            OC05_male.setError(null);

        }
        Log.d(TAG, String.valueOf(OC05.getCheckedRadioButtonId()));
        if (!DOB.isChecked() && (OC07m.getText().toString().isEmpty() && OC07y.getText().toString().isEmpty() && OC07d.getText().toString().isEmpty())) {
            Toast.makeText(sOCI.this, "Please enter age", Toast.LENGTH_LONG).show();
            OC07m.setError("Please enter age");
            Log.i(TAG, "Index Child's Age not given");
            return false;
        } else {
            OC07m.setError(null);
        }

        if (!OC07m.getText().toString().isEmpty()) {
            if (Integer.valueOf(OC07m.getText().toString()) > 11) {
                Toast.makeText(sOCI.this, "Months cannot be more than 11", Toast.LENGTH_LONG).show();
                OC07m.setError("Months cannot be more than 11");
                Log.i(TAG, "Months cannot be more than 11");
                return false;
            } else {
                OC07m.setError(null);
            }
        }

        if (!OC07d.getText().toString().isEmpty()) {
            if (Integer.valueOf(OC07d.getText().toString()) > 30) {
                Toast.makeText(sOCI.this, "Days cannot be more than 30", Toast.LENGTH_LONG).show();
                OC07d.setError("Days cannot be more than 30");
                Log.i(TAG, "Days cannot be more than 30");
                return false;
            } else {
                OC07d.setError(null);
            }
        }

        if (!OC07y.getText().toString().isEmpty()) {
            if (Integer.valueOf(OC07y.getText().toString()) > 2) {
                Toast.makeText(sOCI.this, "Year cannot be more than 2", Toast.LENGTH_LONG).show();
                OC07y.setError("Year cannot be more than 2");
                Log.i(TAG, "Year cannot be more than 2");
                return false;
            } else {
                OC07y.setError(null);
            }
        }

        if (OC08.getText().toString().isEmpty()) {
            Toast.makeText(sOCI.this, "Please enter Mother's Name", Toast.LENGTH_LONG).show();
            OC08.setError("Please enter Mother's Name");
            Log.i(TAG, "Mother's Name not given");
            return false;

        } else {
            OC08.setError(null);
        }

        if (OC09.getText().toString().isEmpty()) {
            Toast.makeText(sOCI.this, "Please enter Father's Name", Toast.LENGTH_LONG).show();
            OC09.setError("Please enter Father's Name");
            Log.i(TAG, "Father's Name not given");
            return false;

        } else {
            OC09.setError(null);
        }

        if (OC10.getCheckedRadioButtonId() == -1) {
            Toast.makeText(sOCI.this, "Please select the Place of Birth", Toast.LENGTH_LONG).show();
            OC10_e.setError("Please select the Place of Birth");
            Log.i(TAG, "Place of Birth not selected");
            return false;
        } else {
            OC10_e.setError(null);
        }


        Toast.makeText(this, "Validation... Successful!", Toast.LENGTH_SHORT).show();
        return true;
    }


}
