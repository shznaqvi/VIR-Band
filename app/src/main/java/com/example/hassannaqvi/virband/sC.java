package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sC extends AppCompatActivity {

    private static final String TAG = "SectionC";
    private static final Integer MIN_RESP_AGE = 14;
    public static boolean respIsParent = false;
    @BindView(R.id.C12)
    EditText C12;
    @BindView(R.id.C13)
    EditText C13;
    @BindView(R.id.C14)
    RadioGroup C14;
    @BindView(R.id.C14_male)
    RadioButton C14_male;
    @BindView(R.id.C14_female)
    RadioButton C14_female;
    @BindView(R.id.C15)
    EditText C15;
    @BindView(R.id.C16)
    RadioGroup C16;
    @BindView(R.id.C16_a)
    RadioButton C16_a;
    @BindView(R.id.C16_b)
    RadioButton C16_b;
    @BindView(R.id.C17_a)
    EditText C17_a;
    @BindView(R.id.C17_b)
    EditText C17_b;
    @BindView(R.id.C18)
    RadioGroup C18;
    @BindView(R.id.C18_a)
    RadioButton C18_a;
    @BindView(R.id.C18_b)
    RadioButton C18_b;
    @BindView(R.id.C18_c)
    RadioButton C18_c;
    @BindView(R.id.C18_d)
    RadioButton C18_d;
    @BindView(R.id.C19)
    RadioGroup C19;
    @BindView(R.id.C19_a)
    RadioButton C19_a;
    @BindView(R.id.C19_b)
    RadioButton C19_b;
    @BindView(R.id.C20)
    RadioGroup C20;
    @BindView(R.id.C20_a)
    RadioButton C20_a;
    @BindView(R.id.C20_b)
    RadioButton C20_b;
    @BindView(R.id.C20_c)
    RadioButton C20_c;
    @BindView(R.id.C20_d)
    RadioButton C20_d;
    @BindView(R.id.C20_e)
    RadioButton C20_e;
    @BindView(R.id.C20_f)
    RadioButton C20_f;
    @BindView(R.id.C20_g)
    RadioButton C20_g;
    @BindView(R.id.C21)
    RadioGroup C21;
    @BindView(R.id.C21_a)
    RadioButton C21_a;
    @BindView(R.id.C21_b)
    RadioButton C21_b;
    @BindView(R.id.C21_c)
    RadioButton C21_c;
    @BindView(R.id.C21_d)
    RadioButton C21_d;
    @BindView(R.id.C21_e)
    RadioButton C21_e;
    @BindView(R.id.C22)
    RadioGroup C22;
    @BindView(R.id.C22_a)
    RadioButton C22_a;
    @BindView(R.id.C22_b)
    RadioButton C22_b;
    @BindView(R.id.C22_c)
    RadioButton C22_c;
    @BindView(R.id.C22_d)
    RadioButton C22_d;
    @BindView(R.id.C22_e)
    RadioButton C22_e;

    @BindView(R.id.C18_x)
    EditText C18_x;
    @BindView(R.id.C20_x)
    EditText C20_x;
    @BindView(R.id.C22_x)
    EditText C22_x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c);
        ButterKnife.bind(this);

        // SKIP PATTERN
        C18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!C18_d.isChecked()) {
                    C18_x.setVisibility(View.GONE);
                    C18_x.setText(null);
                } else {
                    C18_x.setVisibility(View.VISIBLE);

                }
            }
        });

        C20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!C20_g.isChecked()) {
                    C20_x.setVisibility(View.GONE);
                    C20_x.setText(null);

                } else {
                    C20_x.setVisibility(View.VISIBLE);

                }
            }
        });

        C22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!C22_e.isChecked()) {
                    C22_x.setVisibility(View.GONE);
                    C22_x.setText(null);

                } else {
                    C22_x.setVisibility(View.VISIBLE);

                }
            }
        });

    }

    public void submitSC(View v) throws JSONException {

        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {

                // Skip pattern check for D23
                if (C22_a.isChecked() || C22_b.isChecked()) {
                    respIsParent = true;
                }

                Intent SC = new Intent(this, sD.class);
                startActivity(SC);
            }
        }


    }

    private boolean UpdateDB() {

        FormsDBHelper db = new FormsDBHelper(this);

        int updcount = db.updateSC();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();

        }
        return true;

    }

    private void SaveDraft() throws JSONException {

        JSONObject sc = new JSONObject();


        sc.put("C12", C12.getText().toString());
        sc.put("C13", C13.getText().toString());
        switch (C14.getCheckedRadioButtonId()) {
            case R.id.C14_male:
                sc.put("C14", "a");
                break;
            case R.id.C14_female:
                sc.put("C14", "b");
                break;

        }
        sc.put("C15", C15.getText().toString());
        switch (C16.getCheckedRadioButtonId()) {
            case R.id.C16_a:
                sc.put("C16", "a");
                break;
            case R.id.C16_b:
                sc.put("C16", "b");
                break;

        }
        sc.put("C17_a", C17_a.getText().toString());
        sc.put("C17_b", C17_b.getText().toString());
        switch (C18.getCheckedRadioButtonId()) {
            case R.id.C18_a:
                sc.put("C18", "a");
                break;
            case R.id.C18_b:
                sc.put("C18", "b");
                break;
            case R.id.C18_c:
                sc.put("C18", "c");
                break;
            case R.id.C18_d:
                sc.put("C18", "d");
                break;
        }

        sc.put("C18_x", C18_x.getText().toString());

        switch (C19.getCheckedRadioButtonId()) {
            case R.id.C19_a:
                sc.put("C19", "a");
                break;
            case R.id.C19_b:
                sc.put("C19", "b");
                break;
        }

        switch (C20.getCheckedRadioButtonId()) {
            case R.id.C20_a:
                sc.put("C20", "a");
                break;
            case R.id.C20_b:
                sc.put("C20", "b");
                break;
            case R.id.C20_c:
                sc.put("C20", "c");
                break;
            case R.id.C20_d:
                sc.put("C20", "d");
                break;
            case R.id.C20_e:
                sc.put("C20", "e");
                break;
            case R.id.C20_f:
                sc.put("C20", "f");
                break;
            case R.id.C20_g:
                sc.put("C20", "g");
                break;
        }

        sc.put("C20_x", C20_x.getText().toString());

        switch (C21.getCheckedRadioButtonId()) {
            case R.id.C21_a:
                sc.put("C21", "a");
                break;
            case R.id.C21_b:
                sc.put("C21", "b");
                break;
            case R.id.C21_c:
                sc.put("C21", "c");
                break;
            case R.id.C21_d:
                sc.put("C21", "d");
                break;
            case R.id.C21_e:
                sc.put("C21", "e");
                break;

        }
        switch (C22.getCheckedRadioButtonId()) {
            case R.id.C22_a:
                sc.put("C22", "a");
                break;
            case R.id.C22_b:
                sc.put("C22", "b");
                break;
            case R.id.C22_c:
                sc.put("C22", "c");
                break;
            case R.id.C22_d:
                sc.put("C22", "d");
                break;
            case R.id.C22_e:
                sc.put("C22", "e");
                break;
        }

        sc.put("C20_x", C18_x.getText().toString());

        sA.fc.setVC(sc.toString());
        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        if (C12.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter Respondent Name", Toast.LENGTH_LONG).show();
            C12.setError("Please enter respondent name");
            Log.i(TAG, "Name of Respondent not given");
            return false;
        } else {
            C12.setError(null);

        }

        if (C13.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter Age of Respondent", Toast.LENGTH_LONG).show();
            C13.setError("Please enter respondent age");
            Log.i(TAG, "Age of Respondent not given");
            return false;
        } else if (Integer.parseInt(C13.getText().toString()) < MIN_RESP_AGE) {
            Toast.makeText(this, "Respondent is Under age limit (" + MIN_RESP_AGE + ")", Toast.LENGTH_LONG).show();
            C13.setError("Respondent is under Age limit (" + MIN_RESP_AGE + ")");
            Log.i(TAG, "Age of Respondent is under limit (" + MIN_RESP_AGE + ")");
            return false;
        } else {
            C13.setError(null);

        }

        if (C14.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select gender", Toast.LENGTH_LONG).show();
            C14_female.setError("Please select gender");
            Log.i(TAG, "Index Child's Gender not selected");
            return false;
        } else {
            C14_female.setError(null);
        }

        if (C15.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter Address", Toast.LENGTH_LONG).show();
            C15.setError("Please enter Address");
            Log.i(TAG, "Adress not given");
            return false;
        } else {
            C15.setError(null);
        }

        if (C16.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select residence type", Toast.LENGTH_LONG).show();
            C16_b.setError("Please select residence type");
            Log.i(TAG, "Residence Type not selected");
            return false;
        } else {
            C16_b.setError(null);
        }

        if (C17_a.getText().toString().isEmpty() && C17_b.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter Phone number", Toast.LENGTH_LONG).show();
            C17_b.setError("Please enter Phone number");
            C17_a.setError("Please enter Phone number");
            Log.i(TAG, "Phone number not given");
            return false;
        } else {
            C17_a.setError(null);
            C17_b.setError(null);
        }

        if (C18.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select religion", Toast.LENGTH_LONG).show();
            C18_d.setError("Please select religion");
            Log.i(TAG, "Religion not selected");
            return false;
        } else {
            C18_d.setError(null);
        }

        if (C18_d.isChecked() && C18_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            C18_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            C18_x.setError(null);
        }

        if (C19.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select family type", Toast.LENGTH_LONG).show();
            C19_b.setError("Please select family type");
            Log.i(TAG, "Family type not selected");
            return false;
        } else {
            C19_b.setError(null);
        }

        if (C20.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Language", Toast.LENGTH_LONG).show();
            C20_g.setError("Please select language");
            Log.i(TAG, "Language not selected");
            return false;
        } else {
            C20_g.setError(null);
        }

        if (C20_g.isChecked() && C20_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            C20_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            C20_x.setError(null);
        }

        if (C21.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Marital Status", Toast.LENGTH_LONG).show();
            C21_e.setError("Please select marital status");
            Log.i(TAG, "Marital status not selected");
            return false;
        } else {
            C21_e.setError(null);
        }

        if (C22.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Relation", Toast.LENGTH_LONG).show();
            C22_d.setError("Please select Relation");
            Log.i(TAG, "Relation not selected");
            return false;
        } else if (C14_female.isChecked() && C22_b.isChecked()) {
            Toast.makeText(this, "Relation DO NOT match with Gender", Toast.LENGTH_LONG).show();
            C22_b.setError("Relation DO NOT match with Gender");
            C14_female.setError("Relation DO NOT match with Gender");
            Log.i(TAG, "Relation DO NOT match with Gender");
            return false;
        } else if (C14_male.isChecked() && !(C22_b.isChecked() || C22_e.isChecked())) {
            Toast.makeText(this, "Relation DO NOT match with Gender", Toast.LENGTH_LONG).show();
            C22_d.setError("Relation DO NOT match with Gender");
            C14_male.setError("Relation DO NOT match with Gender");
            Log.i(TAG, "Relation DO NOT match with Gender");
            return false;
        } else {
            C22_d.setError(null);
            C22_b.setError(null);
            C14_female.setError(null);
            C14_male.setError(null);
        }

        if (C22_e.isChecked() && C22_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            C22_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            C22_x.setError(null);
        }

        Toast.makeText(this, "Validation... Successful!", Toast.LENGTH_SHORT).show();

        return true;
    }
}
