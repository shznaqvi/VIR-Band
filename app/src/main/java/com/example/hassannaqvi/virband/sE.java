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
import org.json.JSONObject;

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
    @BindView(R.id.E52)
    RadioGroup E52;
    @BindView(R.id.E52_a)
    RadioButton E52_a;
    @BindView(R.id.E52_b)
    RadioButton E52_b;
    @BindView(R.id.E52_c)
    RadioButton E52_c;

    @BindView(R.id.fldGrpE35a)
    LinearLayout fldGrpE35a;
    @BindView(R.id.fldGrpE36a)
    LinearLayout fldGrpE36a;
    @BindView(R.id.fldGrpE36b)
    LinearLayout fldGrpE36b;
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
            if (sB.sb != null) {
                E32_txt.setText(E32_txt.getText().toString().replace("|||", sB.sb.getString("B05")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // SKIP PATTERNS
        E35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E35_b.getId()) {
                    fldGrpE35a.setVisibility(View.VISIBLE);
                } else {
                    fldGrpE35a.setVisibility(View.GONE);
                    E35a.clearCheck();
                }
            }
        });

        E36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E36_a.getId()) {
                    fldGrpE36a.setVisibility(View.VISIBLE);
                    fldGrpE36b.setVisibility(View.GONE);
                    E36b.clearCheck();
                } else if ((checkedId == E36_b.getId())) {
                    fldGrpE36b.setVisibility(View.VISIBLE);
                    fldGrpE36a.setVisibility(View.GONE);
                    E36a.clearCheck();
                } else if ((checkedId == E36_c.getId())) {
                    fldGrpE36a.setVisibility(View.GONE);
                    fldGrpE36b.setVisibility(View.GONE);
                    E36a.clearCheck();
                    E36b.clearCheck();
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
                } else {
                    fldGrpE50a.setVisibility(View.GONE);
                    fldGrpE50b.setVisibility(View.GONE);
                    E50a.clearCheck();
                    E40b.clearCheck();
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

    public void submitSE(View v) throws JSONException {
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent SE = new Intent(this, sVD.class);

                startActivity(SE);
            }
        }

    }

    private boolean UpdateDB() {
        FormsDBHelper db = new FormsDBHelper(this);

        int updcount = db.updateSE();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();

        }

        return true;
    }

    private void SaveDraft() throws JSONException {

        JSONObject se = new JSONObject();

        switch (E29.getCheckedRadioButtonId()) {
            case R.id.E29_a:
                se.put("E29", "a");
            case R.id.E29_b:
                se.put("E29", "b");


        }

        switch (E30.getCheckedRadioButtonId()) {
            case R.id.E30_a:
                se.put("E30", "a");
            case R.id.E30_b:
                se.put("E30", "b");
            case R.id.E30_c:
                se.put("E30", "c");
            case R.id.E30_d:
                se.put("E30", "d");
            case R.id.E30_e:
                se.put("E30", "e");
            case R.id.E30_f:
                se.put("E30", "f");


        }

        switch (E31.getCheckedRadioButtonId()) {
            case R.id.E31_a:
                se.put("E31", "a");
            case R.id.E31_b:
                se.put("E31", "b");
            case R.id.E31_c:
                se.put("E31", "c");
            case R.id.E31_d:
                se.put("E31", "d");
            case R.id.E31_e:
                se.put("E31", "e");
            case R.id.E31_f:
                se.put("E31", "f");
            case R.id.E31_g:
                se.put("E31", "g");
            case R.id.E31_h:
                se.put("E31", "h");
            case R.id.E31_i:
                se.put("E31", "i");
            case R.id.E31_j:
                se.put("E31", "j");
            case R.id.E31_k:
                se.put("E31", "k");
            case R.id.E31_l:
                se.put("E31", "l");
            case R.id.E31_m:
                se.put("E31", "m");


        }

        switch (E32.getCheckedRadioButtonId()) {
            case R.id.E32_a:
                se.put("E32", "a");
            case R.id.E32_b:
                se.put("E32", "b");
            case R.id.E32_c:
                se.put("E32", "c");


        }

        switch (E33.getCheckedRadioButtonId()) {
            case R.id.E33_a:
                se.put("E33", "a");
            case R.id.E33_b:
                se.put("E33", "b");
            case R.id.E33_c:
                se.put("E33", "c");
            case R.id.E33_d:
                se.put("E33", "d");
            case R.id.E33_e:
                se.put("E33", "e");
            case R.id.E33_f:
                se.put("E33", "f");
            case R.id.E33_g:
                se.put("E33", "g");


        }

        switch (E34.getCheckedRadioButtonId()) {
            case R.id.E34_a:
                se.put("E34", "a");
            case R.id.E34_b:
                se.put("E34", "b");
            case R.id.E34_c:
                se.put("E34", "c");
            case R.id.E34_d:
                se.put("E34", "d");
            case R.id.E34_e:
                se.put("E34", "e");
            case R.id.E34_f:
                se.put("E34", "f");
            case R.id.E34_g:
                se.put("E34", "g");
            case R.id.E34_h:
                se.put("E34", "h");
            case R.id.E34_i:
                se.put("E34", "i");
            case R.id.E34_j:
                se.put("E34", "j");
            case R.id.E34_k:
                se.put("E34", "k");


        }

        switch (E35.getCheckedRadioButtonId()) {
            case R.id.E35_a:
                se.put("E35", "a");
            case R.id.E35_b:
                se.put("E35", "b");


        }

        switch (E35a.getCheckedRadioButtonId()) {
            case R.id.E35a_1:
                se.put("E35a", "1");
            case R.id.E35a_2:
                se.put("E35a", "2");
            case R.id.E35a_3:
                se.put("E35a", "3");
            case R.id.E35a_4:
                se.put("E35a", "4");


        }

        switch (E36.getCheckedRadioButtonId()) {
            case R.id.E36_a:
                se.put("E36", "a");
            case R.id.E36_b:
                se.put("E36", "b");
            case R.id.E36_c:
                se.put("E36", "c");


        }

        switch (E36a.getCheckedRadioButtonId()) {
            case R.id.E36a_1:
                se.put("E36a", "1");
            case R.id.E36a_2:
                se.put("E36a", "2");
            case R.id.E36a_3:
                se.put("E36a", "3");
            case R.id.E36a_4:
                se.put("E36a", "4");
            case R.id.E36a_5:
                se.put("E36a", "5");
            case R.id.E36a_6:
                se.put("E36a", "6");
            case R.id.E36a_7:
                se.put("E36a", "7");


        }

        switch (E36b.getCheckedRadioButtonId()) {
            case R.id.E36b_1:
                se.put("E36b", "1");
            case R.id.E36b_2:
                se.put("E36b", "2");
            case R.id.E36b_3:
                se.put("E36b", "3");
            case R.id.E36b_4:
                se.put("E36b", "4");
            case R.id.E36b_5:
                se.put("E36b", "5");


        }

        switch (E37.getCheckedRadioButtonId()) {
            case R.id.E37_a:
                se.put("E37", "a");
            case R.id.E37_b:
                se.put("E37", "b");
            case R.id.E37_c:
                se.put("E37", "c");
            case R.id.E37_d:
                se.put("E37", "d");
            case R.id.E37_e:
                se.put("E37", "e");

        }

        switch (E38.getCheckedRadioButtonId()) {
            case R.id.E38_a:
                se.put("E38", "a");
            case R.id.E38_b:
                se.put("E38", "b");
            case R.id.E38_c:
                se.put("E38", "c");
            case R.id.E38_d:
                se.put("E38", "d");
            case R.id.E38_e:
                se.put("E38", "e");
            case R.id.E38_f:
                se.put("E38", "f");


        }

        switch (E39.getCheckedRadioButtonId()) {
            case R.id.E39_a:
                se.put("E39", "a");
            case R.id.E39_b:
                se.put("E39", "b");
            case R.id.E39_c:
                se.put("E39", "c");
            case R.id.E39_d:
                se.put("E39", "d");
            case R.id.E39_e:
                se.put("E39", "e");
            case R.id.E39_f:
                se.put("E39", "f");


        }

        switch (E40.getCheckedRadioButtonId()) {
            case R.id.E40_a:
                se.put("E40", "a");
            case R.id.E40_b:
                se.put("E40", "b");
            case R.id.E40_c:
                se.put("E40", "c");


        }

        switch (E40a.getCheckedRadioButtonId()) {
            case R.id.E40a_1:
                se.put("E40a", "1");
            case R.id.E40a_2:
                se.put("E40a", "2");
            case R.id.E40a_3:
                se.put("E40a", "3");
            case R.id.E40a_4:
                se.put("E40a", "4");
            case R.id.E40a_5:
                se.put("E40a", "5");
            case R.id.E40a_6:
                se.put("E40a", "6");
            case R.id.E40a_7:
                se.put("E40a", "7");


        }

        switch (E40b.getCheckedRadioButtonId()) {
            case R.id.E40b_1:
                se.put("E40b", "1");
            case R.id.E40b_2:
                se.put("E40b", "2");
            case R.id.E40b_3:
                se.put("E40b", "3");
            case R.id.E40b_4:
                se.put("E40b", "4");
            case R.id.E40b_5:
                se.put("E40b", "5");


        }

        switch (E41.getCheckedRadioButtonId()) {
            case R.id.E41_a:
                se.put("E41", "a");
            case R.id.E41_b:
                se.put("E41", "b");
            case R.id.E41_c:
                se.put("E41", "c");
            case R.id.E41_d:
                se.put("E41", "d");
            case R.id.E41_e:
                se.put("E41", "e");
            case R.id.E41_f:
                se.put("E41", "f");
            case R.id.E41_g:
                se.put("E41", "g");
            case R.id.E41_h:
                se.put("E41", "h");

        }

        switch (E42.getCheckedRadioButtonId()) {
            case R.id.E42_a:
                se.put("E42", "a");
            case R.id.E42_b:
                se.put("E42", "b");
            case R.id.E42_c:
                se.put("E42", "c");
            case R.id.E42_d:
                se.put("E42", "d");
            case R.id.E42_e:
                se.put("E42", "e");
            case R.id.E42_f:
                se.put("E42", "f");
            case R.id.E42_g:
                se.put("E42", "g");


        }

        switch (E43.getCheckedRadioButtonId()) {
            case R.id.E43_a:
                se.put("E43", "a");
            case R.id.E43_b:
                se.put("E43", "b");
            case R.id.E43_c:
                se.put("E43", "c");
            case R.id.E43_d:
                se.put("E43", "d");
            case R.id.E43_e:
                se.put("E43", "e");
            case R.id.E43_f:
                se.put("E43", "f");


        }

        switch (E44.getCheckedRadioButtonId()) {
            case R.id.E44_a:
                se.put("E44", "a");
            case R.id.E44_b:
                se.put("E44", "b");
            case R.id.E44_c:
                se.put("E44", "c");
            case R.id.E44_d:
                se.put("E44", "d");
            case R.id.E44_e:
                se.put("E44", "e");
            case R.id.E44_f:
                se.put("E44", "f");
            case R.id.E44_g:
                se.put("E44", "g");


        }

        switch (E45.getCheckedRadioButtonId()) {
            case R.id.E45_a:
                se.put("E45", "a");
            case R.id.E45_b:
                se.put("E45", "b");
            case R.id.E45_c:
                se.put("E45", "c");


        }

        switch (E46.getCheckedRadioButtonId()) {
            case R.id.E46_a:
                se.put("E46", "a");
            case R.id.E46_b:
                se.put("E46", "b");
            case R.id.E46_c:
                se.put("E46", "c");
            case R.id.E46_d:
                se.put("E46", "d");
            case R.id.E46_e:
                se.put("E46", "e");
            case R.id.E46_f:
                se.put("E46", "f");
            case R.id.E46_g:
                se.put("E46", "g");
            case R.id.E46_h:
                se.put("E46", "h");


        }

        switch (E47.getCheckedRadioButtonId()) {
            case R.id.E47_a:
                se.put("E47", "a");
            case R.id.E47_b:
                se.put("E47", "b");
            case R.id.E47_c:
                se.put("E47", "c");


        }

        switch (E48.getCheckedRadioButtonId()) {
            case R.id.E48_a:
                se.put("E48", "a");
            case R.id.E48_b:
                se.put("E48", "b");
            case R.id.E48_c:
                se.put("E48", "c");
            case R.id.E48_d:
                se.put("E48", "d");
            case R.id.E48_e:
                se.put("E48", "e");


        }

        switch (E49.getCheckedRadioButtonId()) {
            case R.id.E49_a:
                se.put("E49", "a");
            case R.id.E49_b:
                se.put("E49", "b");
            case R.id.E49_c:
                se.put("E49", "c");
            case R.id.E49_d:
                se.put("E49", "d");
            case R.id.E49_e:
                se.put("E49", "e");
            case R.id.E49_f:
                se.put("E49", "f");
            case R.id.E49_g:
                se.put("E49", "g");
            case R.id.E49_h:
                se.put("E49", "h");


        }

        switch (E50.getCheckedRadioButtonId()) {
            case R.id.E50_a:
                se.put("E50", "a");
            case R.id.E50_b:
                se.put("E50", "b");
            case R.id.E50_c:
                se.put("E50", "c");


        }

        switch (E50a.getCheckedRadioButtonId()) {
            case R.id.E50a_1:
                se.put("E50a", "1");
            case R.id.E50a_2:
                se.put("E50a", "2");
            case R.id.E50a_3:
                se.put("E50a", "3");
            case R.id.E50a_4:
                se.put("E50a", "4");
            case R.id.E50a_5:
                se.put("E50a", "5");
            case R.id.E50a_6:
                se.put("E50a", "6");


        }

        switch (E50b.getCheckedRadioButtonId()) {
            case R.id.E50b_1:
                se.put("E50b", "1");
            case R.id.E50b_2:
                se.put("E50b", "2");
            case R.id.E50b_3:
                se.put("E50b", "3");
            case R.id.E50b_4:
                se.put("E50b", "4");
            case R.id.E50b_5:
                se.put("E50b", "5");
            case R.id.E50b_6:
                se.put("E50b", "6");


        }

        switch (E51.getCheckedRadioButtonId()) {
            case R.id.E51_a:
                se.put("E51", "a");
            case R.id.E51_b:
                se.put("E51", "b");
            case R.id.E51_c:
                se.put("E51", "c");

        }

        switch (E51a.getCheckedRadioButtonId()) {
            case R.id.E51a_1:
                se.put("E51a", "1");
            case R.id.E51a_2:
                se.put("E51a", "2");
            case R.id.E51a_3:
                se.put("E51a", "3");
            case R.id.E51a_4:
                se.put("E51a", "4");
            case R.id.E51a_5:
                se.put("E51a", "5");
            case R.id.E51a_6:
                se.put("E51a", "6");
            case R.id.E51a_7:
                se.put("E51a", "7");


        }

        switch (E52.getCheckedRadioButtonId()) {
            case R.id.E52_a:
                se.put("E52", "a");
            case R.id.E52_b:
                se.put("E52", "b");
            case R.id.E52_c:
                se.put("E52", "c");


        }

    }

    private boolean formValidation() {

        if (E29.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E29_b.setError("Please select select one option");
            Log.i(TAG, "E29: No option selected");
            return false;
        } else {
            E29_b.setError(null);
        }

        if (E30.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E30_f.setError("Please select select one option");
            Log.i(TAG, "E30: No option selected");
            return false;
        } else {
            E30_f.setError(null);
        }

        if (E31.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E31_m.setError("Please select select one option");
            Log.i(TAG, "E31: No option selected");
            return false;
        } else {
            E31_m.setError(null);
        }

        if (E32.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E32_c.setError("Please select select one option");
            Log.i(TAG, "E32: No option selected");
            return false;
        } else {
            E32_c.setError(null);
        }

        if (E33.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E33_g.setError("Please select select one option");
            Log.i(TAG, "E33: No option selected");
            return false;
        } else {
            E33_g.setError(null);
        }

        if (E34.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E34_k.setError("Please select select one option");
            Log.i(TAG, "E34: No option selected");
            return false;
        } else {
            E34_k.setError(null);
        }

        if (E35.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E35_b.setError("Please select select one option");
            Log.i(TAG, "E35: No option selected");
            return false;
        } else {
            E35_b.setError(null);
        }

        if (E35_b.isChecked() && E35a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E35a_4.setError("Please select select one option");
            Log.i(TAG, "E35a: No option selected");
            return false;
        } else {
            E35a_4.setError(null);
        }

        if (E36.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36_c.setError("Please select select one option");
            Log.i(TAG, "E36: No option selected");
            return false;
        } else {
            E36_c.setError(null);
        }

        if (E36_a.isChecked() && E36a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36a_7.setError("Please select select one option");
            Log.i(TAG, "E36a: No option selected");
            return false;
        } else {
            E36a_7.setError(null);
        }

        if (E36_b.isChecked() && E36b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36b_5.setError("Please select select one option");
            Log.i(TAG, "E36b: No option selected");
            return false;
        } else {
            E36b_5.setError(null);
        }

        if (E37.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E37_g.setError("Please select select one option");
            Log.i(TAG, "E37: No option selected");
            return false;
        } else {
            E37_g.setError(null);
        }

        if (E38.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E38_f.setError("Please select select one option");
            Log.i(TAG, "E38: No option selected");
            return false;
        } else {
            E38_f.setError(null);
        }

        if (E39.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E39_f.setError("Please select select one option");
            Log.i(TAG, "E39: No option selected");
            return false;
        } else {
            E39_f.setError(null);
        }

        if (E40.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E40_b.setError("Please select select one option");
            Log.i(TAG, "E40: No option selected");
            return false;
        } else {
            E40_b.setError(null);
        }

        if (E40_a.isChecked() && E40a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E40a_7.setError("Please select select one option");
            Log.i(TAG, "E40a: No option selected (E40 == a)");
            return false;
        } else {
            E40a_7.setError(null);
        }

        if (E40_b.isChecked() && E40b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E40b_5.setError("Please select select one option");
            Log.i(TAG, "E40b: No option selected (E40 == b)");
            return false;
        } else {
            E40b_5.setError(null);
        }

        if (E41.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E41_h.setError("Please select select one option");
            Log.i(TAG, "E41: No option selected");
            return false;
        } else {
            E41_h.setError(null);
        }

        if (E42.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E42_g.setError("Please select select one option");
            Log.i(TAG, "E42: No option selected");
            return false;
        } else {
            E42_g.setError(null);
        }

        if (E43.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E43_f.setError("Please select select one option");
            Log.i(TAG, "E43: No option selected");
            return false;
        } else {
            E43_f.setError(null);
        }

        if (E44.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E44_g.setError("Please select select one option");
            Log.i(TAG, "E44: No option selected");
            return false;
        } else {
            E44_g.setError(null);
        }

        if (E45.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E45_c.setError("Please select select one option");
            Log.i(TAG, "E45: No option selected");
            return false;
        } else {
            E45_c.setError(null);
        }

        if (E46.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E46_h.setError("Please select select one option");
            Log.i(TAG, "E46: No option selected");
            return false;
        } else {
            E46_h.setError(null);
        }

        if (E47.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E47_c.setError("Please select select one option");
            Log.i(TAG, "E47: No option selected");
            return false;
        } else {
            E47_c.setError(null);
        }

        if ((E47_b.isChecked() || E47_c.isChecked()) && E48.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E48_e.setError("Please select select one option");
            Log.i(TAG, "E48: No option selected");
            return false;
        } else {
            E48_e.setError(null);
        }

        if (E49.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E49_h.setError("Please select select one option");
            Log.i(TAG, "E49: No option selected");
            return false;
        } else {
            E49_h.setError(null);
        }

        if (E50.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E50_c.setError("Please select select one option");
            Log.i(TAG, "E50: No option selected");
            return false;
        } else {
            E50_c.setError(null);
        }

        if (E50_a.isChecked() && E50a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E50a_6.setError("Please select select one option");
            Log.i(TAG, "E50a: No option selected");
            return false;
        } else {
            E50a_6.setError(null);
        }

        if (E50_b.isChecked() && E50b.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E50b_6.setError("Please select select one option");
            Log.i(TAG, "E50b: No option selected");
            return false;
        } else {
            E50b_6.setError(null);
        }

        if (E51.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E51_c.setError("Please select select one option");
            Log.i(TAG, "E51: No option selected");
            return false;
        } else {
            E51_c.setError(null);
        }

        if (E51_a.isChecked() && E51a.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E51a_7.setError("Please select select one option");
            Log.i(TAG, "E51a: No option selected");
            return false;
        } else {
            E51a_7.setError(null);
        }

        if (E52.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E52_c.setError("Please select select one option");
            Log.i(TAG, "E52: No option selected");
            return false;
        } else {
            E52_c.setError(null);
        }

        return true;
    }

}
