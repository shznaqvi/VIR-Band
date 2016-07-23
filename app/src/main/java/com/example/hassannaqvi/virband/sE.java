package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sE extends AppCompatActivity {

    private static final String TAG = "SectionE";

    @BindView(R.id.E29)
    RadioGroup E29;
    @BindView(R.id.E29_a)
    RadioButton E29_a;
    @BindView(R.id.E29_b)
    RadioButton E29_b;
    @BindView(R.id.E30)
    RadioGroup E30;
    @BindView(R.id.E30_a)
    RadioButton E30_a;
    @BindView(R.id.E30_b)
    RadioButton E30_b;
    @BindView(R.id.E30_c)
    RadioButton E30_c;
    @BindView(R.id.E30_d)
    RadioButton E30_d;
    @BindView(R.id.E30_e)
    RadioButton E30_e;
    @BindView(R.id.E30_f)
    RadioButton E30_f;
    @BindView(R.id.E31)
    RadioGroup E31;
    @BindView(R.id.E31_a)
    RadioButton E31_a;
    @BindView(R.id.E31_b)
    RadioButton E31_b;
    @BindView(R.id.E31_c)
    RadioButton E31_c;
    @BindView(R.id.E31_d)
    RadioButton E31_d;
    @BindView(R.id.E31_e)
    RadioButton E31_e;
    @BindView(R.id.E31_f)
    RadioButton E31_f;
    @BindView(R.id.E31_g)
    RadioButton E31_g;
    @BindView(R.id.E31_h)
    RadioButton E31_h;
    @BindView(R.id.E31_i)
    RadioButton E31_i;
    @BindView(R.id.E31_j)
    RadioButton E31_j;
    @BindView(R.id.E31_k)
    RadioButton E31_k;
    @BindView(R.id.E31_l)
    RadioButton E31_l;
    @BindView(R.id.E31_m)
    RadioButton E31_m;
    @BindView(R.id.E32_txt)
    TextView E32_txt;
    @BindView(R.id.E32)
    RadioGroup E32;
    @BindView(R.id.E32_a)
    RadioButton E32_a;
    @BindView(R.id.E32_b)
    RadioButton E32_b;
    @BindView(R.id.E32_c)
    RadioButton E32_c;
    @BindView(R.id.E33)
    RadioGroup E33;
    @BindView(R.id.E33_a)
    RadioButton E33_a;
    @BindView(R.id.E33_b)
    RadioButton E33_b;
    @BindView(R.id.E33_c)
    RadioButton E33_c;
    @BindView(R.id.E33_d)
    RadioButton E33_d;
    @BindView(R.id.E33_e)
    RadioButton E33_e;
    @BindView(R.id.E33_f)
    RadioButton E33_f;
    @BindView(R.id.E33_g)
    RadioButton E33_g;
    @BindView(R.id.E34)
    RadioGroup E34;
    @BindView(R.id.E34_a)
    RadioButton E34_a;
    @BindView(R.id.E34_b)
    RadioButton E34_b;
    @BindView(R.id.E34_c)
    RadioButton E34_c;
    @BindView(R.id.E34_d)
    RadioButton E34_d;
    @BindView(R.id.E34_e)
    RadioButton E34_e;
    @BindView(R.id.E34_f)
    RadioButton E34_f;
    @BindView(R.id.E34_g)
    RadioButton E34_g;
    @BindView(R.id.E34_h)
    RadioButton E34_h;
    @BindView(R.id.E34_i)
    RadioButton E34_i;
    @BindView(R.id.E34_j)
    RadioButton E34_j;
    @BindView(R.id.E34_k)
    RadioButton E34_k;
    @BindView(R.id.E35)
    RadioGroup E35;
    @BindView(R.id.E35_a)
    RadioButton E35_a;
    @BindView(R.id.E35_b)
    RadioButton E35_b;
    @BindView(R.id.E35a)
    RadioGroup E35a;
    @BindView(R.id.E35a_1)
    RadioButton E35a_1;
    @BindView(R.id.E35a_2)
    RadioButton E35a_2;
    @BindView(R.id.E35a_3)
    RadioButton E35a_3;
    @BindView(R.id.E35a_4)
    RadioButton E35a_4;
    @BindView(R.id.E36)
    RadioGroup E36;
    @BindView(R.id.E36_a)
    RadioButton E36_a;
    @BindView(R.id.E36_b)
    RadioButton E36_b;
    @BindView(R.id.E36_c)
    RadioButton E36_c;
    @BindView(R.id.E36a)
    RadioGroup E36a;
    @BindView(R.id.E36a_1)
    RadioButton E36a_1;
    @BindView(R.id.E36a_2)
    RadioButton E36a_2;
    @BindView(R.id.E36a_3)
    RadioButton E36a_3;
    @BindView(R.id.E36a_4)
    RadioButton E36a_4;
    @BindView(R.id.E36a_5)
    RadioButton E36a_5;
    @BindView(R.id.E36a_6)
    RadioButton E36a_6;
    @BindView(R.id.E36a_7)
    RadioButton E36a_7;
    @BindView(R.id.E36b)
    RadioGroup E36b;
    @BindView(R.id.E36b_1)
    RadioButton E36b_1;
    @BindView(R.id.E36b_2)
    RadioButton E36b_2;
    @BindView(R.id.E36b_3)
    RadioButton E36b_3;
    @BindView(R.id.E36b_4)
    RadioButton E36b_4;
    @BindView(R.id.E36b_5)
    RadioButton E36b_5;
    @BindView(R.id.E37)
    RadioGroup E37;
    @BindView(R.id.E37_a)
    RadioButton E37_a;
    @BindView(R.id.E37_b)
    RadioButton E37_b;
    @BindView(R.id.E37_c)
    RadioButton E37_c;
    @BindView(R.id.E37_d)
    RadioButton E37_d;
    @BindView(R.id.E37_e)
    RadioButton E37_e;
    @BindView(R.id.E37_f)
    RadioButton E37_f;
    @BindView(R.id.E37_g)
    RadioButton E37_g;
    @BindView(R.id.E38)
    RadioGroup E38;
    @BindView(R.id.E38_a)
    RadioButton E38_a;
    @BindView(R.id.E38_b)
    RadioButton E38_b;
    @BindView(R.id.E38_c)
    RadioButton E38_c;
    @BindView(R.id.E38_d)
    RadioButton E38_d;
    @BindView(R.id.E38_e)
    RadioButton E38_e;
    @BindView(R.id.E38_f)
    RadioButton E38_f;
    RadioGroup E39;
    @BindView(R.id.E39_a)
    RadioButton E39_a;
    @BindView(R.id.E39_b)
    RadioButton E39_b;
    @BindView(R.id.E39_c)
    RadioButton E39_c;
    @BindView(R.id.E39_d)
    RadioButton E39_d;
    @BindView(R.id.E39_e)
    RadioButton E39_e;
    @BindView(R.id.E39_f)
    RadioButton E39_f;
    @BindView(R.id.E40)
    RadioGroup E40;
    @BindView(R.id.E40_a)
    RadioButton E40_a;
    @BindView(R.id.E40_b)
    RadioButton E40_b;
    @BindView(R.id.E40_c)
    RadioButton E40_c;
    @BindView(R.id.E40a)
    RadioGroup E40a;
    @BindView(R.id.E40a_1)
    RadioButton E40a_1;
    @BindView(R.id.E40a_2)
    RadioButton E40a_2;
    @BindView(R.id.E40a_3)
    RadioButton E40a_3;
    @BindView(R.id.E40a_4)
    RadioButton E40a_4;
    @BindView(R.id.E40a_5)
    RadioButton E40a_5;
    @BindView(R.id.E40a_6)
    RadioButton E40a_6;
    @BindView(R.id.E40a_7)
    RadioButton E40a_7;
    @BindView(R.id.E40b)
    RadioGroup E40b;
    @BindView(R.id.E40b_1)
    RadioButton E40b_1;
    @BindView(R.id.E40b_2)
    RadioButton E40b_2;
    @BindView(R.id.E40b_3)
    RadioButton E40b_3;
    @BindView(R.id.E40b_4)
    RadioButton E40b_4;
    @BindView(R.id.E40b_5)
    RadioButton E40b_5;
    @BindView(R.id.E41)
    RadioGroup E41;
    @BindView(R.id.E41_a)
    RadioButton E41_a;
    @BindView(R.id.E41_b)
    RadioButton E41_b;
    @BindView(R.id.E41_c)
    RadioButton E41_c;
    @BindView(R.id.E41_d)
    RadioButton E41_d;
    @BindView(R.id.E41_e)
    RadioButton E41_e;
    @BindView(R.id.E41_f)
    RadioButton E41_f;
    @BindView(R.id.E41_g)
    RadioButton E41_g;
    @BindView(R.id.E41_h)
    RadioButton E41_h;
    @BindView(R.id.E42)
    RadioGroup E42;
    @BindView(R.id.E42_a)
    RadioButton E42_a;
    @BindView(R.id.E42_b)
    RadioButton E42_b;
    @BindView(R.id.E42_c)
    RadioButton E42_c;
    @BindView(R.id.E42_d)
    RadioButton E42_d;
    @BindView(R.id.E42_e)
    RadioButton E42_e;
    @BindView(R.id.E42_f)
    RadioButton E42_f;
    @BindView(R.id.E42_g)
    RadioButton E42_g;
    @BindView(R.id.E43)
    RadioGroup E43;
    @BindView(R.id.E43_a)
    RadioButton E43_a;
    @BindView(R.id.E43_b)
    RadioButton E43_b;
    @BindView(R.id.E43_c)
    RadioButton E43_c;
    @BindView(R.id.E43_d)
    RadioButton E43_d;
    @BindView(R.id.E43_e)
    RadioButton E43_e;
    @BindView(R.id.E43_f)
    RadioButton E43_f;
    @BindView(R.id.E44)
    RadioGroup E44;
    @BindView(R.id.E44_a)
    RadioButton E44_a;
    @BindView(R.id.E44_b)
    RadioButton E44_b;
    @BindView(R.id.E44_c)
    RadioButton E44_c;
    @BindView(R.id.E44_d)
    RadioButton E44_d;
    @BindView(R.id.E44_e)
    RadioButton E44_e;
    @BindView(R.id.E44_f)
    RadioButton E44_f;
    @BindView(R.id.E44_g)
    RadioButton E44_g;
    @BindView(R.id.E45)
    RadioGroup E45;
    @BindView(R.id.E45_a)
    RadioButton E45_a;
    @BindView(R.id.E45_b)
    RadioButton E45_b;
    @BindView(R.id.E45_c)
    RadioButton E45_c;
    @BindView(R.id.E46)
    RadioGroup E46;
    @BindView(R.id.E46_a)
    RadioButton E46_a;
    @BindView(R.id.E46_b)
    RadioButton E46_b;
    @BindView(R.id.E46_c)
    RadioButton E46_c;
    @BindView(R.id.E46_d)
    RadioButton E46_d;
    @BindView(R.id.E46_e)
    RadioButton E46_e;
    @BindView(R.id.E46_f)
    RadioButton E46_f;
    @BindView(R.id.E46_g)
    RadioButton E46_g;
    @BindView(R.id.E46_h)
    RadioButton E46_h;
    @BindView(R.id.E47)
    RadioGroup E47;
    @BindView(R.id.E47_a)
    RadioButton E47_a;
    @BindView(R.id.E47_b)
    RadioButton E47_b;
    @BindView(R.id.E47_c)
    RadioButton E47_c;
    @BindView(R.id.E48)
    RadioGroup E48;
    @BindView(R.id.E48_a)
    RadioButton E48_a;
    @BindView(R.id.E48_b)
    RadioButton E48_b;
    @BindView(R.id.E48_c)
    RadioButton E48_c;
    @BindView(R.id.E48_d)
    RadioButton E48_d;
    @BindView(R.id.E48_e)
    RadioButton E48_e;
    @BindView(R.id.E49)
    RadioGroup E49;
    @BindView(R.id.E49_a)
    RadioButton E49_a;
    @BindView(R.id.E49_b)
    RadioButton E49_b;
    @BindView(R.id.E49_c)
    RadioButton E49_c;
    @BindView(R.id.E49_d)
    RadioButton E49_d;
    @BindView(R.id.E49_e)
    RadioButton E49_e;
    @BindView(R.id.E49_f)
    RadioButton E49_f;
    @BindView(R.id.E49_g)
    RadioButton E49_g;
    @BindView(R.id.E49_h)
    RadioButton E49_h;
    @BindView(R.id.E50)
    RadioGroup E50;
    @BindView(R.id.E50_a)
    RadioButton E50_a;
    @BindView(R.id.E50_b)
    RadioButton E50_b;
    @BindView(R.id.E50_c)
    RadioButton E50_c;
    @BindView(R.id.E50a)
    RadioGroup E50a;
    @BindView(R.id.E50a_1)
    RadioButton E50a_1;
    @BindView(R.id.E50a_2)
    RadioButton E50a_2;
    @BindView(R.id.E50a_3)
    RadioButton E50a_3;
    @BindView(R.id.E50a_4)
    RadioButton E50a_4;
    @BindView(R.id.E50a_5)
    RadioButton E50a_5;
    @BindView(R.id.E50a_6)
    RadioButton E50a_6;
    @BindView(R.id.E50b)
    RadioGroup E50b;
    @BindView(R.id.E50b_1)
    RadioButton E50b_1;
    @BindView(R.id.E50b_2)
    RadioButton E50b_2;
    @BindView(R.id.E50b_3)
    RadioButton E50b_3;
    @BindView(R.id.E50b_4)
    RadioButton E50b_4;
    @BindView(R.id.E50b_5)
    RadioButton E50b_5;
    @BindView(R.id.E50b_6)
    RadioButton E50b_6;
    @BindView(R.id.E51)
    RadioGroup E51;
    @BindView(R.id.E51_a)
    RadioButton E51_a;
    @BindView(R.id.E51_b)
    RadioButton E51_b;
    @BindView(R.id.E51_c)
    RadioButton E51_c;
    @BindView(R.id.E51a)
    RadioGroup E51a;
    @BindView(R.id.E51a_1)
    RadioButton E51a_1;
    @BindView(R.id.E51a_2)
    RadioButton E51a_2;
    @BindView(R.id.E51a_3)
    RadioButton E51a_3;
    @BindView(R.id.E51a_4)
    RadioButton E51a_4;
    @BindView(R.id.E51a_5)
    RadioButton E51a_5;
    @BindView(R.id.E51a_6)
    RadioButton E51a_6;
    @BindView(R.id.E51a_7)
    RadioButton E51a_7;

    @BindView(R.id.fldGrpE40a)
    LinearLayout fldGrpE40a;
    @BindView(R.id.fldGrpE40b)
    LinearLayout fldGrpE40b;
    @BindView(R.id.fldGrpE48)
    LinearLayout fldGrpE48;
    @BindView(R.id.fldGrpE50a)
    LinearLayout fldGrpE50a;
    @BindView(R.id.fldGrpE50b)
    LinearLayout fldGrpE50b;
    @BindView(R.id.fldGrpE51a)
    LinearLayout fldGrpE51a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_e);
        ButterKnife.bind(this);

        // Use Index child's name in Q. 32 (Section E)
        try {
            E32_txt.setText(E32_txt.getText().toString().replace("|||", sB.sb.getString("B05")));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // SKIP PATTERNS
        E40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E40_a.getId()) {
                    fldGrpE40a.setVisibility(View.VISIBLE);
                    fldGrpE40b.setVisibility(View.GONE);
                    E40b.clearCheck();
                } else if ((checkedId == E40_b.getId())) {
                    fldGrpE40b.setVisibility(View.VISIBLE);
                    fldGrpE40a.setVisibility(View.GONE);
                    E40a.clearCheck();
                }
            }
        });

        E40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E40_a.getId()) {
                    fldGrpE40a.setVisibility(View.VISIBLE);
                    fldGrpE40b.setVisibility(View.GONE);
                    E40b.clearCheck();
                } else if ((checkedId == E40_b.getId())) {
                    fldGrpE40b.setVisibility(View.VISIBLE);
                    fldGrpE40a.setVisibility(View.GONE);
                    E40a.clearCheck();
                }
            }
        });

        E47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E47_a.getId()) {
                    fldGrpE48.setVisibility(View.VISIBLE);

                } else {
                    fldGrpE48.setVisibility(View.GONE);
                    E48.clearCheck();
                }
            }
        });

        E50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E50_a.getId()) {
                    fldGrpE50a.setVisibility(View.VISIBLE);
                    fldGrpE50b.setVisibility(View.GONE);
                    E40b.clearCheck();
                } else if ((checkedId == E50_b.getId())) {
                    fldGrpE50b.setVisibility(View.VISIBLE);
                    fldGrpE50a.setVisibility(View.GONE);
                    E50a.clearCheck();
                }
            }
        });

        E51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E50_a.getId()) {
                    fldGrpE51a.setVisibility(View.VISIBLE);

                } else {
                    fldGrpE51a.setVisibility(View.GONE);
                    E51a.clearCheck();
                }
            }
        });

    }

    public void submitSD(View v) throws JSONException {
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent SE = new Intent(this, sVD.class);

                startActivity(SE);
            }
        }

    }

    private boolean UpdateDB() {

        return false;
    }

    private void SaveDraft() {

    }

    private boolean formValidation() {

        if (E29.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E29_b.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        } else {
            E29_b.setError(null);
        }

        if (E30.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E30_f.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        } else {
            E30_f.setError(null);
        }

        if (E31.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E31_m.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        } else {
            E31_m.setError(null);
        }

        if (E32.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E32_c.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        } else {
            E32_c.setError(null);
        }

        if (E33.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E33_g.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        } else {
            E33_g.setError(null);
        }

        if (E34.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E34_k.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        } else {
            E34_k.setError(null);
        }

        if (E35.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E35_b.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        }

        if (E35_b.isChecked() && E35a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E35a_4.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        }

        if (E36.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36_c.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        }

        if (E36_a.isChecked() && E36a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36a_7.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        }

        if (E36_b.isChecked() && E36b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36b_5.setError("Please select select one option");
            Log.i(TAG, "No option selected");
            return false;
        }

        return true;
    }

}
