package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sD extends AppCompatActivity {

    private static final String TAG = "SectionD";

    @BindView(R.id.fldGrpD23)
    LinearLayout fldGrpD23;


    @BindView(R.id.D23)
    RadioGroup D23;
    @BindView(R.id.D23_a)
    RadioButton D23_a;
    @BindView(R.id.D23_b)
    RadioButton D23_b;
    @BindView(R.id.D23_c)
    RadioButton D23_c;
    @BindView(R.id.D23_d)
    RadioButton D23_d;
    @BindView(R.id.D23_e)
    RadioButton D23_e;
    @BindView(R.id.D23_f)
    RadioButton D23_f;
    @BindView(R.id.D23_g)
    RadioButton D23_g;
    @BindView(R.id.D23_h)
    RadioButton D23_h;
    @BindView(R.id.D23_i)
    RadioButton D23_i;
    @BindView(R.id.D23_j)
    RadioButton D23_j;
    @BindView(R.id.D24)
    RadioGroup D24;
    @BindView(R.id.D24_a)
    RadioButton D24_a;
    @BindView(R.id.D24_b)
    RadioButton D24_b;
    @BindView(R.id.D24_c)
    RadioButton D24_c;
    @BindView(R.id.D24_d)
    RadioButton D24_d;
    @BindView(R.id.D24_e)
    RadioButton D24_e;
    @BindView(R.id.D24_f)
    RadioButton D24_f;
    @BindView(R.id.D24_g)
    RadioButton D24_g;
    @BindView(R.id.D24_h)
    RadioButton D24_h;
    @BindView(R.id.D24_i)
    RadioButton D24_i;
    @BindView(R.id.D24_j)
    RadioButton D24_j;
    @BindView(R.id.D25)
    RadioGroup D25;
    @BindView(R.id.D25_a)
    RadioButton D25_a;
    @BindView(R.id.D25_b)
    RadioButton D25_b;
    @BindView(R.id.D25_c)
    RadioButton D25_c;
    @BindView(R.id.D25_d)
    RadioButton D25_d;
    @BindView(R.id.D25_e)
    RadioButton D25_e;
    @BindView(R.id.D25_f)
    RadioButton D25_f;
    @BindView(R.id.D25_g)
    RadioButton D25_g;
    @BindView(R.id.D25_h)
    RadioButton D25_h;
    @BindView(R.id.D25_i)
    RadioButton D25_i;
    @BindView(R.id.D25_j)
    RadioButton D25_j;
    @BindView(R.id.D26)
    RadioGroup D26;
    @BindView(R.id.D26_a)
    RadioButton D26_a;
    @BindView(R.id.D26_b)
    RadioButton D26_b;
    @BindView(R.id.D26_c)
    RadioButton D26_c;
    @BindView(R.id.D26_d)
    RadioButton D26_d;
    @BindView(R.id.D26_e)
    RadioButton D26_e;
    @BindView(R.id.D26_f)
    RadioButton D26_f;
    @BindView(R.id.D27)
    RadioGroup D27;
    @BindView(R.id.D27_a)
    RadioButton D27_a;
    @BindView(R.id.D27_b)
    RadioButton D27_b;
    @BindView(R.id.D27_c)
    RadioButton D27_c;
    @BindView(R.id.D27_d)
    RadioButton D27_d;
    @BindView(R.id.D27_e)
    RadioButton D27_e;
    @BindView(R.id.D27_f)
    RadioButton D27_f;
    @BindView(R.id.D27_g)
    RadioButton D27_g;
    @BindView(R.id.D28)
    RadioGroup D28;
    @BindView(R.id.D28_a)
    RadioButton D28_a;
    @BindView(R.id.D28_b)
    RadioButton D28_b;
    @BindView(R.id.D28_c)
    RadioButton D28_c;
    @BindView(R.id.D28_d)
    RadioButton D28_d;
    @BindView(R.id.D28_e)
    RadioButton D28_e;
    @BindView(R.id.D28_f)
    RadioButton D28_f;

    @BindView(R.id.D23_x)
    EditText D23_x;
    @BindView(R.id.D24_x)
    EditText D24_x;
    @BindView(R.id.D25_x)
    EditText D25_x;
    @BindView(R.id.D26_x)
    EditText D26_x;
    @BindView(R.id.D27_x)
    EditText D27_x;
    @BindView(R.id.D28_x)
    EditText D28_x;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_d);
        ButterKnife.bind(this);


        //SKIP PATTERNS

        if (sC.respIsParent) {
            fldGrpD23.setVisibility(View.GONE);
            D23.clearCheck();
        } else {
            fldGrpD23.setVisibility(View.VISIBLE);
        }

        D23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!D23_j.isChecked()) {
                    D23_x.setVisibility(View.GONE);
                    D23_x.setText(null);
                } else {
                    D23_x.setVisibility(View.VISIBLE);

                }
            }
        });
        D24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!D24_j.isChecked()) {
                    D24_x.setVisibility(View.GONE);
                    D24_x.setText(null);
                } else {
                    D24_x.setVisibility(View.VISIBLE);

                }
            }
        });
        D25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!D25_j.isChecked()) {
                    D25_x.setVisibility(View.GONE);
                    D25_x.setText(null);
                } else {
                    D25_x.setVisibility(View.VISIBLE);

                }
            }
        });
        D26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!D26_f.isChecked()) {
                    D26_x.setVisibility(View.GONE);
                    D26_x.setText(null);
                } else {
                    D26_x.setVisibility(View.VISIBLE);

                }
            }
        });
        D27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!D27_g.isChecked()) {
                    D27_x.setVisibility(View.GONE);
                    D27_x.setText(null);
                } else {
                    D27_x.setVisibility(View.VISIBLE);

                }
            }
        });
        D28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!D28_f.isChecked()) {
                    D28_x.setVisibility(View.GONE);
                    D28_x.setText(null);
                } else {
                    D28_x.setVisibility(View.VISIBLE);

                }
            }
        });
    }

    public void submitSD(View v) throws JSONException {
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent SD = new Intent(this, sE.class);
                startActivity(SD);
            }
        }

    }

    private boolean UpdateDB() {

        FormsDBHelper db = new FormsDBHelper(this);

        int updcount = db.updateSD();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();

        }

        return true;
    }

    private void SaveDraft() throws JSONException {


        JSONObject sd = new JSONObject();

        switch (D23.getCheckedRadioButtonId()) {
            case R.id.D23_a:
                sd.put("D23", "a");
                break;
            case R.id.D23_b:
                sd.put("D23", "b");
                break;
            case R.id.D23_c:
                sd.put("D23", "c");
                break;
            case R.id.D23_d:
                sd.put("D23", "d");
                break;
            case R.id.D23_e:
                sd.put("D23", "e");
                break;
            case R.id.D23_f:
                sd.put("D23", "f");
                break;
            case R.id.D23_g:
                sd.put("D23", "g");
                break;
            case R.id.D23_h:
                sd.put("D23", "h");
                break;
            case R.id.D23_i:
                sd.put("D23", "i");
                break;
            case R.id.D23_j:
                sd.put("D23", "j");
                break;
        }
        sd.put("D23_x", D23_x.getText().toString());

        switch (D24.getCheckedRadioButtonId()) {
            case R.id.D24_a:
                sd.put("D24", "a");
                break;
            case R.id.D24_b:
                sd.put("D24", "b");
                break;
            case R.id.D24_c:
                sd.put("D24", "c");
                break;
            case R.id.D24_d:
                sd.put("D24", "d");
                break;
            case R.id.D24_e:
                sd.put("D24", "e");
                break;
            case R.id.D24_f:
                sd.put("D24", "f");
                break;
            case R.id.D24_g:
                sd.put("D24", "g");
                break;
            case R.id.D24_h:
                sd.put("D24", "h");
                break;
            case R.id.D24_i:
                sd.put("D24", "i");
                break;
            case R.id.D24_j:
                sd.put("D24", "j");
                break;
        }
        sd.put("D24_x", D24_x.getText().toString());

        switch (D25.getCheckedRadioButtonId()) {
            case R.id.D25_a:
                sd.put("D25", "a");
                break;
            case R.id.D25_b:
                sd.put("D25", "b");
                break;
            case R.id.D25_c:
                sd.put("D25", "c");
                break;
            case R.id.D25_d:
                sd.put("D25", "d");
                break;
            case R.id.D25_e:
                sd.put("D25", "e");
                break;
            case R.id.D25_f:
                sd.put("D25", "f");
                break;
            case R.id.D25_g:
                sd.put("D25", "g");
                break;
            case R.id.D25_h:
                sd.put("D25", "h");
                break;
            case R.id.D25_i:
                sd.put("D25", "i");
                break;
            case R.id.D25_j:
                sd.put("D25", "j");
                break;
        }
        sd.put("D25_x", D25_x.getText().toString());

        switch (D26.getCheckedRadioButtonId()) {
            case R.id.D26_a:
                sd.put("D26", "a");
                break;
            case R.id.D26_b:
                sd.put("D26", "b");
                break;
            case R.id.D26_c:
                sd.put("D26", "c");
                break;
            case R.id.D26_d:
                sd.put("D26", "d");
                break;
            case R.id.D26_e:
                sd.put("D26", "e");
                break;
            case R.id.D26_f:
                sd.put("D26", "f");
                break;
        }
        sd.put("D26_x", D26_x.getText().toString());

        switch (D27.getCheckedRadioButtonId()) {
            case R.id.D27_a:
                sd.put("D27", "a");
                break;
            case R.id.D27_b:
                sd.put("D27", "b");
                break;
            case R.id.D27_c:
                sd.put("D27", "c");
                break;
            case R.id.D27_d:
                sd.put("D27", "d");
                break;
            case R.id.D27_e:
                sd.put("D27", "e");
                break;
            case R.id.D27_f:
                sd.put("D27", "f");
                break;
            case R.id.D27_g:
                sd.put("D27", "g");
                break;
        }
        sd.put("D27_x", D27_x.getText().toString());

        switch (D28.getCheckedRadioButtonId()) {
            case R.id.D28_a:
                sd.put("D28", "a");
                break;
            case R.id.D28_b:
                sd.put("D28", "b");
                break;
            case R.id.D28_c:
                sd.put("D28", "c");
                break;
            case R.id.D28_d:
                sd.put("D28", "d");
                break;
            case R.id.D28_e:
                sd.put("D28", "e");
                break;
            case R.id.D28_f:
                sd.put("D28", "f");
                break;
        }
        sd.put("D28_x", D28_x.getText().toString());


        sA.fc.setVD(sd.toString());
        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();
    }

    private boolean formValidation() {

        if (!sC.respIsParent && D23.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Respondent Education", Toast.LENGTH_LONG).show();
            D23_j.setError("Please select Respondent Education");
            Log.i(TAG, "Respondent's Education not selected");
            return false;
        }
        if (D23_d.isChecked() && D23_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            D23_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            D23_x.setError(null);
        }
        if (D24.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Mother's Education", Toast.LENGTH_LONG).show();
            D24_j.setError("Please select Mother's Education");
            Log.i(TAG, "Mother's Education not selected");
            return false;
        }
        if (D24_d.isChecked() && D24_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            D24_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            D24_x.setError(null);
        }
        if (D25.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Father's Education", Toast.LENGTH_LONG).show();
            D25_j.setError("Please select Father's Education");
            Log.i(TAG, "Fathers's Education not selected");
            return false;
        }
        if (D25_d.isChecked() && D25_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            D25_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            D25_x.setError(null);
        }
        if (D26.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Father's Profession", Toast.LENGTH_LONG).show();
            D26_f.setError("Please select Father's Profession");
            Log.i(TAG, "Father's Profession not selected");
            return false;
        }
        if (D26_d.isChecked() && D26_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            D26_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            D26_x.setError(null);
        }
        if (D27.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Mother's Profession", Toast.LENGTH_LONG).show();
            D27_g.setError("Please select Mother's Profession");
            Log.i(TAG, "Mother's Profession not selected");
            return false;
        }
        if (D27_d.isChecked() && D27_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            D27_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            D27_x.setError(null);
        }
        if (D28.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select Income", Toast.LENGTH_LONG).show();
            D28_f.setError("Please select Income");
            Log.i(TAG, "Income not selected");
            return false;
        }
        if (D28_d.isChecked() && D28_x.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please give detail of others", Toast.LENGTH_LONG).show();
            D28_x.setError("Please give detail of others");
            Log.i(TAG, "Detail of Others not given");
            return false;
        } else {
            D28_x.setError(null);
        }

        Toast.makeText(this, "Validation... Successful!", Toast.LENGTH_SHORT).show();

        return true;
    }
}
