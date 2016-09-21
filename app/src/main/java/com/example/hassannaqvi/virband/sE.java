package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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
    @BindView(R.id.E30_a)
    CheckBox E30_a;
    @BindView(R.id.E30_b)
    CheckBox E30_b;
    @BindView(R.id.E30_c)
    CheckBox E30_c;
    @BindView(R.id.E30_d)
    CheckBox E30_d;
    @BindView(R.id.E30_e)
    CheckBox E30_e;
    @BindView(R.id.E30_f)
    CheckBox E30_f;
    @BindView(R.id.E31_a)
    CheckBox E31_a;
    @BindView(R.id.E31_b)
    CheckBox E31_b;
    @BindView(R.id.E31_c)
    CheckBox E31_c;
    @BindView(R.id.E31_d)
    CheckBox E31_d;
    @BindView(R.id.E31_e)
    CheckBox E31_e;
    @BindView(R.id.E31_f)
    CheckBox E31_f;
    @BindView(R.id.E31_g)
    CheckBox E31_g;
    @BindView(R.id.E31_h)
    CheckBox E31_h;
    @BindView(R.id.E31_i)
    CheckBox E31_i;
    @BindView(R.id.E31_j)
    CheckBox E31_j;
    @BindView(R.id.E31_k)
    CheckBox E31_k;
    @BindView(R.id.E31_l)
    CheckBox E31_l;
    @BindView(R.id.E31_m)
    CheckBox E31_m;
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
    @BindView(R.id.E33_a)
    CheckBox E33_a;
    @BindView(R.id.E33_b)
    CheckBox E33_b;
    @BindView(R.id.E33_c)
    CheckBox E33_c;
    @BindView(R.id.E33_d)
    CheckBox E33_d;
    @BindView(R.id.E33_e)
    CheckBox E33_e;
    @BindView(R.id.E33_f)
    CheckBox E33_f;
    @BindView(R.id.E33_g)
    CheckBox E33_g;
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
    @BindView(R.id.E36a_1)
    CheckBox E36a_1;
    @BindView(R.id.E36a_2)
    CheckBox E36a_2;
    @BindView(R.id.E36a_3)
    CheckBox E36a_3;
    @BindView(R.id.E36a_4)
    CheckBox E36a_4;
    @BindView(R.id.E36a_5)
    CheckBox E36a_5;
    @BindView(R.id.E36a_6)
    CheckBox E36a_6;
    @BindView(R.id.E36a_7)
    CheckBox E36a_7;
    @BindView(R.id.E36b_1)
    CheckBox E36b_1;
    @BindView(R.id.E36b_2)
    CheckBox E36b_2;
    @BindView(R.id.E36b_3)
    CheckBox E36b_3;
    @BindView(R.id.E36b_4)
    CheckBox E36b_4;
    @BindView(R.id.E36b_5)
    CheckBox E36b_5;
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
    @BindView(R.id.E39)
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
    @BindView(R.id.E46_a)
    CheckBox E46_a;
    @BindView(R.id.E46_b)
    CheckBox E46_b;
    @BindView(R.id.E46_c)
    CheckBox E46_c;
    @BindView(R.id.E46_d)
    CheckBox E46_d;
    @BindView(R.id.E46_e)
    CheckBox E46_e;
    @BindView(R.id.E46_f)
    CheckBox E46_f;
    @BindView(R.id.E46_g)
    CheckBox E46_g;
    @BindView(R.id.E46_h)
    CheckBox E46_h;
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

    @BindView(R.id.E49_a)
    CheckBox E49_a;
    @BindView(R.id.E49_b)
    CheckBox E49_b;
    @BindView(R.id.E49_c)
    CheckBox E49_c;
    @BindView(R.id.E49_d)
    CheckBox E49_d;
    @BindView(R.id.E49_e)
    CheckBox E49_e;
    @BindView(R.id.E49_f)
    CheckBox E49_f;
    @BindView(R.id.E49_g)
    CheckBox E49_g;
    @BindView(R.id.E49_h)
    CheckBox E49_h;
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

    @BindView(R.id.E51a_1)
    CheckBox E51a_1;
    @BindView(R.id.E51a_2)
    CheckBox E51a_2;
    @BindView(R.id.E51a_3)
    CheckBox E51a_3;
    @BindView(R.id.E51a_4)
    CheckBox E51a_4;
    @BindView(R.id.E51a_5)
    CheckBox E51a_5;
    @BindView(R.id.E51a_6)
    CheckBox E51a_6;
    @BindView(R.id.E51a_7)
    CheckBox E51a_7;
    @BindView(R.id.E52)
    RadioGroup E52;
    @BindView(R.id.E52_a)
    RadioButton E52_a;
    @BindView(R.id.E52_b)
    RadioButton E52_b;
    @BindView(R.id.E52_c)
    RadioButton E52_c;

    @BindView(R.id.E30_x)
    EditText E30_x;
    @BindView(R.id.E31_x)
    EditText E31_x;
    @BindView(R.id.E33_x)
    EditText E33_x;
    @BindView(R.id.E34_x)
    EditText E34_x;
    @BindView(R.id.E35a_x)
    EditText E35a_x;
    @BindView(R.id.E36a_x)
    EditText E36a_x;
    @BindView(R.id.E36b_x)
    EditText E36b_x;
    @BindView(R.id.E37_x)
    EditText E37_x;
    @BindView(R.id.E38_x)
    EditText E38_x;
    @BindView(R.id.E39_x)
    EditText E39_x;
    @BindView(R.id.E40a_x)
    EditText E40a_x;
    @BindView(R.id.E40b_x)
    EditText E40b_x;
    @BindView(R.id.E41_x)
    EditText E41_x;
    @BindView(R.id.E42_x)
    EditText E42_x;
    @BindView(R.id.E43_x)
    EditText E43_x;
    @BindView(R.id.E44_x)
    EditText E44_x;
    @BindView(R.id.E46_x)
    EditText E46_x;
    @BindView(R.id.E48_x)
    EditText E48_x;
    @BindView(R.id.E49_x)
    EditText E49_x;
    @BindView(R.id.E50a_x)
    EditText E50a_x;
    @BindView(R.id.E50b_x)
    EditText E50b_x;
    @BindView(R.id.E51a_x)
    EditText E51a_x;


    @BindView(R.id.fldGrpE29)
    LinearLayout fldGrpE29;
    @BindView(R.id.fldGrpE32)
    LinearLayout fldGrpE32;
    @BindView(R.id.fldGrpE32b)
    LinearLayout fldGrpE32b;
    @BindView(R.id.fldGrpE35a)
    LinearLayout fldGrpE35a;
    @BindView(R.id.fldGrpE36a)
    LinearLayout fldGrpE36a;
    @BindView(R.id.fldGrpE36b)
    LinearLayout fldGrpE36b;
    @BindView(R.id.fldGrpE37)
    LinearLayout fldGrpE37;
    @BindView(R.id.fldGrpE40a)
    LinearLayout fldGrpE40a;
    @BindView(R.id.fldGrpE40b)
    LinearLayout fldGrpE40b;
    @BindView(R.id.fldGrpE42)
    LinearLayout fldGrpE42;
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

        E29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (E29_b.isChecked()) {
                    fldGrpE29.setVisibility(View.GONE);
                    E30_a.setChecked(false);
                    E30_b.setChecked(false);
                    E30_c.setChecked(false);
                    E30_d.setChecked(false);
                    E30_e.setChecked(false);
                    E30_f.setChecked(false);
                    E31_a.setChecked(false);
                    E31_b.setChecked(false);
                    E31_c.setChecked(false);
                    E31_d.setChecked(false);
                    E31_e.setChecked(false);
                    E31_f.setChecked(false);
                    E31_g.setChecked(false);
                    E31_h.setChecked(false);
                    E31_i.setChecked(false);
                    E31_j.setChecked(false);
                    E31_k.setChecked(false);
                    E31_l.setChecked(false);
                    E31_m.setChecked(false);
                } else {
                    fldGrpE29.setVisibility(View.VISIBLE);
                }
            }
        });

        E30_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E30_f.isChecked()) {
                    E30_x.setVisibility(View.GONE);
                    E30_x.setText(null);

                } else {
                    E30_x.setVisibility(View.VISIBLE);

                }
            }
        });
        E31_m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E31_m.isChecked()) {
                    E31_x.setVisibility(View.GONE);
                    E31_x.setText(null);

                } else {
                    E31_x.setVisibility(View.VISIBLE);

                }
            }
        });
        E33_g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E33_g.isChecked()) {
                    E33_x.setVisibility(View.GONE);
                    E33_x.setText(null);

                } else {
                    E33_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E34_k.isChecked()) {
                    E34_x.setVisibility(View.GONE);
                    E34_x.setText(null);

                } else {
                    E34_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E35a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E35a_4.isChecked()) {
                    E35a_x.setVisibility(View.GONE);
                    E35a_x.setText(null);

                } else {
                    E35a_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E36a_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E36a_7.isChecked()) {
                    E36a_x.setVisibility(View.GONE);
                    E36a_x.setText(null);

                } else {
                    E36a_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E36b_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E36b_5.isChecked()) {
                    E36b_x.setVisibility(View.GONE);
                    E36b_x.setText(null);

                } else {
                    E36b_x.setVisibility(View.VISIBLE);

                }
            }
        });


        E32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (E32_b.isChecked()) {
                    fldGrpE32.setVisibility(View.GONE);
                    fldGrpE32b.setVisibility(View.GONE);

                    E33_a.setChecked(false);
                    E33_b.setChecked(false);
                    E33_c.setChecked(false);
                    E33_d.setChecked(false);
                    E33_e.setChecked(false);
                    E33_f.setChecked(false);
                    E33_g.setChecked(false);

                    E41.clearCheck();
                    E42.clearCheck();
                    E43.clearCheck();
                    E44.clearCheck();

                } else {
                    fldGrpE32.setVisibility(View.VISIBLE);
                    fldGrpE32b.setVisibility(View.VISIBLE);
                }
            }
        });
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
                    E36b_1.setChecked(false);
                    E36b_2.setChecked(false);
                    E36b_3.setChecked(false);
                    E36b_4.setChecked(false);
                    E36b_5.setChecked(false);

                } else if ((checkedId == E36_b.getId())) {
                    fldGrpE36b.setVisibility(View.VISIBLE);
                    fldGrpE36a.setVisibility(View.GONE);
                    E36a_1.setChecked(false);
                    E36a_2.setChecked(false);
                    E36a_3.setChecked(false);
                    E36a_4.setChecked(false);
                    E36a_5.setChecked(false);
                    E36a_6.setChecked(false);
                    E36a_7.setChecked(false);
                    if (E29_b.isChecked() && E32_b.isChecked() && E35_b.isChecked() && E36_b.isChecked()) {

                    }
                } else if ((checkedId == E36_c.getId())) {
                    fldGrpE36a.setVisibility(View.GONE);
                    fldGrpE36b.setVisibility(View.GONE);
                    E36b_1.setChecked(false);
                    E36b_2.setChecked(false);
                    E36b_3.setChecked(false);
                    E36b_4.setChecked(false);
                    E36b_5.setChecked(false);
                    E36a_1.setChecked(false);
                    E36a_2.setChecked(false);
                    E36a_3.setChecked(false);
                    E36a_4.setChecked(false);
                    E36a_5.setChecked(false);
                    E36a_6.setChecked(false);
                    E36a_7.setChecked(false);

                }
            }
        });
        E37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // Question Skip
                if (E37_a.isChecked()) {
                    fldGrpE37.setVisibility(View.GONE);
                    E38.clearCheck();
                } else {
                    fldGrpE37.setVisibility(View.VISIBLE);
                }

                // Other Skip
                if (!E37_g.isChecked()) {
                    E37_x.setVisibility(View.GONE);
                    E37_x.setText(null);

                } else {
                    E37_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E38_f.isChecked()) {
                    E38_x.setVisibility(View.GONE);
                    E38_x.setText(null);

                } else {
                    E38_x.setVisibility(View.VISIBLE);

                }
            }
        });
        E39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E39_f.isChecked()) {
                    E39_x.setVisibility(View.GONE);
                    E39_x.setText(null);

                } else {
                    E39_x.setVisibility(View.VISIBLE);

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
                } else if (checkedId == E40_b.getId()) {
                    fldGrpE40b.setVisibility(View.VISIBLE);
                    fldGrpE40a.setVisibility(View.GONE);
                    E40a.clearCheck();
                } else if (checkedId == E40_c.getId()) {
                    fldGrpE40b.setVisibility(View.GONE);
                    fldGrpE40a.setVisibility(View.GONE);
                    E40a.clearCheck();
                    E40b.clearCheck();
                }
            }
        });

        E40a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E40a_7.isChecked()) {
                    E40a_x.setVisibility(View.GONE);
                    E40a_x.setText(null);

                } else {
                    E40a_x.setVisibility(View.VISIBLE);

                }
            }
        });
        E40b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E40b_5.isChecked()) {
                    E40b_x.setVisibility(View.GONE);
                    E40b_x.setText(null);

                } else {
                    E40b_x.setVisibility(View.VISIBLE);

                }
            }
        });
        E41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E41_h.isChecked()) {
                    E41_x.setVisibility(View.GONE);
                    E41_x.setText(null);

                } else {
                    E41_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // Question Skip
                if (E42_a.isChecked()) {
                    fldGrpE42.setVisibility(View.GONE);
                    E44.clearCheck();
                } else {
                    fldGrpE42.setVisibility(View.VISIBLE);
                }

                // Others Skip
                if (!E42_g.isChecked()) {
                    E42_x.setVisibility(View.GONE);
                    E42_x.setText(null);
                } else {
                    E42_x.setVisibility(View.VISIBLE);

                }
            }
        });

        E43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E43_f.isChecked()) {
                    E43_x.setVisibility(View.GONE);
                    E43_x.setText(null);
                } else {
                    E43_x.setVisibility(View.VISIBLE);
                }
            }
        });
        E44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E44_g.isChecked()) {
                    E44_x.setVisibility(View.GONE);
                    E44_x.setText(null);
                } else {
                    E44_x.setVisibility(View.VISIBLE);
                }
            }
        });

        E46_h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E46_h.isChecked()) {
                    E46_x.setVisibility(View.GONE);
                    E46_x.setText(null);
                } else {
                    E46_x.setVisibility(View.VISIBLE);
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
        E48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E48_e.isChecked()) {
                    E48_x.setVisibility(View.GONE);
                    E48_x.setText(null);
                } else {
                    E48_x.setVisibility(View.VISIBLE);
                }
            }
        });
        E49_h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E49_h.isChecked()) {
                    E49_x.setVisibility(View.GONE);
                    E49_x.setText(null);
                } else {
                    E49_x.setVisibility(View.VISIBLE);
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
                } else if (checkedId == E50_b.getId()) {
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

        E50a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E50a_6.isChecked()) {
                    E50a_x.setVisibility(View.GONE);
                    E50a_x.setText(null);
                } else {
                    E50a_x.setVisibility(View.VISIBLE);
                }
            }
        });
        E50b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!E50b_6.isChecked()) {
                    E50b_x.setVisibility(View.GONE);
                    E50b_x.setText(null);
                } else {
                    E50b_x.setVisibility(View.VISIBLE);
                }
            }
        });

        E51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == E51_a.getId()) {
                    fldGrpE51a.setVisibility(View.VISIBLE);

                } else {
                    fldGrpE51a.setVisibility(View.GONE);
                    E51a_1.setChecked(false);
                    E51a_2.setChecked(false);
                    E51a_3.setChecked(false);
                    E51a_4.setChecked(false);
                    E51a_5.setChecked(false);
                    E51a_6.setChecked(false);
                    E51a_7.setChecked(false);
                }
            }
        });
        E51a_7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!E51a_7.isChecked()) {
                    E51a_x.setVisibility(View.GONE);
                    E51a_x.setText(null);
                } else {
                    E51a_x.setVisibility(View.VISIBLE);
                }
            }
        });


    }

    public void activeRefusal() throws JSONException {
        Toast.makeText(sE.this, "ACTIVE REFUSAL CASE!", Toast.LENGTH_SHORT).show();
        SaveDraft();
        sA.fc.setVA109("4"); //
        if (UpdateDB()) {
            Intent ending = new Intent(this, MainActivity.class);
            startActivity(ending);
        }
    }

    public void submitSE(View v) throws JSONException {
        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                if (!E32_b.isChecked()) {
                    Intent SE = new Intent(this, sVD.class);
                    SE.putExtra("icTP", 0);
                    SE.putExtra("ic", true);

                    startActivity(SE);
                } else {
                    Intent ending = new Intent(this, MainActivity.class);
                    startActivity(ending);
                }
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
                break;
            case R.id.E29_b:
                se.put("E29", "b");
                break;
            default:
                se.put("E29", "xx");
        }

        se.put("E30_a", E30_a.isChecked() ? "a" : "");
        se.put("E30_b", E30_b.isChecked() ? "b" : "");
        se.put("E30_c", E30_c.isChecked() ? "c" : "");
        se.put("E30_d", E30_d.isChecked() ? "d" : "");
        se.put("E30_e", E30_e.isChecked() ? "e" : "");
        se.put("E30_f", E30_f.isChecked() ? "f" : "");


        se.put("E31_a", E31_a.isChecked() ? "a" : "");
        se.put("E31_b", E31_b.isChecked() ? "b" : "");
        se.put("E31_c", E31_c.isChecked() ? "c" : "");
        se.put("E31_d", E31_d.isChecked() ? "d" : "");
        se.put("E31_e", E31_e.isChecked() ? "e" : "");
        se.put("E31_f", E31_f.isChecked() ? "f" : "");
        se.put("E31_g", E31_g.isChecked() ? "g" : "");
        se.put("E31_h", E31_h.isChecked() ? "h" : "");
        se.put("E31_i", E31_i.isChecked() ? "i" : "");
        se.put("E31_j", E31_j.isChecked() ? "j" : "");
        se.put("E31_k", E31_k.isChecked() ? "k" : "");
        se.put("E31_l", E31_l.isChecked() ? "l" : "");
        se.put("E31_m", E31_m.isChecked() ? "m" : "");


        switch (E32.getCheckedRadioButtonId()) {
            case R.id.E32_a:
                se.put("E32", "a");
                break;
            case R.id.E32_b:
                se.put("E32", "b");
                break;
            case R.id.E32_c:
                se.put("E32", "c");
                break;
            default:
                se.put("E32", "xx");


        }

        se.put("E33_a", E33_a.isChecked() ? "a" : "");
        se.put("E33_b", E33_b.isChecked() ? "b" : "");
        se.put("E33_c", E33_c.isChecked() ? "c" : "");
        se.put("E33_d", E33_d.isChecked() ? "d" : "");
        se.put("E33_e", E33_e.isChecked() ? "e" : "");
        se.put("E33_f", E33_f.isChecked() ? "f" : "");
        se.put("E33_g", E33_g.isChecked() ? "g" : "");

        switch (E34.getCheckedRadioButtonId()) {
            case R.id.E34_a:
                se.put("E34", "a");
                break;
            case R.id.E34_b:
                se.put("E34", "b");
                break;
            case R.id.E34_c:
                se.put("E34", "c");
                break;
            case R.id.E34_d:
                se.put("E34", "d");
                break;
            case R.id.E34_e:
                se.put("E34", "e");
                break;
            case R.id.E34_f:
                se.put("E34", "f");
                break;
            case R.id.E34_g:
                se.put("E34", "g");
                break;
            case R.id.E34_h:
                se.put("E34", "h");
                break;
            case R.id.E34_i:
                se.put("E34", "i");
                break;
            case R.id.E34_j:
                se.put("E34", "j");
                break;
            case R.id.E34_k:
                se.put("E34", "k");
                break;
            default:
                se.put("E34", "xx");


        }

        switch (E35.getCheckedRadioButtonId()) {
            case R.id.E35_a:
                se.put("E35", "a");
                break;
            case R.id.E35_b:
                se.put("E35", "b");
                break;
            default:
                se.put("E34", "xx");


        }

        switch (E35a.getCheckedRadioButtonId()) {
            case R.id.E35a_1:
                se.put("E35a", "1");
                break;
            case R.id.E35a_2:
                se.put("E35a", "2");
                break;
            case R.id.E35a_3:
                se.put("E35a", "3");
                break;
            case R.id.E35a_4:
                se.put("E35a", "4");
                break;
            default:
                se.put("E35a", "xx");

        }

        switch (E36.getCheckedRadioButtonId()) {
            case R.id.E36_a:
                se.put("E36", "a");
                break;
            case R.id.E36_b:
                se.put("E36", "b");
                break;
            case R.id.E36_c:
                se.put("E36", "c");
                break;
            default:
                se.put("E36", "xx");

        }
        // E36a
        se.put("E36a_1", E36a_1.isChecked() ? "1" : "");
        se.put("E36a_2", E36a_2.isChecked() ? "2" : "");
        se.put("E36a_3", E36a_3.isChecked() ? "3" : "");
        se.put("E36a_4", E36a_4.isChecked() ? "4" : "");
        se.put("E36a_5", E36a_5.isChecked() ? "5" : "");
        se.put("E36a_6", E36a_6.isChecked() ? "6" : "");
        se.put("E36a_7", E36a_7.isChecked() ? "7" : "");
        // E36b
        se.put("E36b_1", E36b_1.isChecked() ? "1" : "");
        se.put("E36b_2", E36b_2.isChecked() ? "2" : "");
        se.put("E36b_3", E36b_3.isChecked() ? "3" : "");
        se.put("E36b_4", E36b_4.isChecked() ? "4" : "");
        se.put("E36b_5", E36b_5.isChecked() ? "5" : "");


        switch (E37.getCheckedRadioButtonId()) {
            case R.id.E37_a:
                se.put("E37", "a");
                break;
            case R.id.E37_b:
                se.put("E37", "b");
                break;
            case R.id.E37_c:
                se.put("E37", "c");
                break;
            case R.id.E37_d:
                se.put("E37", "d");
                break;
            case R.id.E37_e:
                se.put("E37", "e");
                break;
            default:
                se.put("E37", "xx");

        }

        switch (E38.getCheckedRadioButtonId()) {
            case R.id.E38_a:
                se.put("E38", "a");
                break;
            case R.id.E38_b:
                se.put("E38", "b");
                break;
            case R.id.E38_c:
                se.put("E38", "c");
                break;
            case R.id.E38_d:
                se.put("E38", "d");
                break;
            case R.id.E38_e:
                se.put("E38", "e");
                break;
            case R.id.E38_f:
                se.put("E38", "f");
                break;
            default:
                se.put("E38", "xx");
        }

        switch (E39.getCheckedRadioButtonId()) {
            case R.id.E39_a:
                se.put("E39", "a");
                break;
            case R.id.E39_b:
                se.put("E39", "b");
                break;
            case R.id.E39_c:
                se.put("E39", "c");
                break;
            case R.id.E39_d:
                se.put("E39", "d");
                break;
            case R.id.E39_e:
                se.put("E39", "e");
                break;
            case R.id.E39_f:
                se.put("E39", "f");
                break;
            default:
                se.put("E39", "xx");


        }

        switch (E40.getCheckedRadioButtonId()) {
            case R.id.E40_a:
                se.put("E40", "a");
                break;
            case R.id.E40_b:
                se.put("E40", "b");
                break;
            case R.id.E40_c:
                se.put("E40", "c");
                break;
            default:
                se.put("E40", "xx");
        }

        switch (E40a.getCheckedRadioButtonId()) {
            case R.id.E40a_1:
                se.put("E40a", "1");
                break;
            case R.id.E40a_2:
                se.put("E40a", "2");
                break;
            case R.id.E40a_3:
                se.put("E40a", "3");
                break;
            case R.id.E40a_4:
                se.put("E40a", "4");
                break;
            case R.id.E40a_5:
                se.put("E40a", "5");
                break;
            case R.id.E40a_6:
                se.put("E40a", "6");
                break;
            case R.id.E40a_7:
                se.put("E40a", "7");
                break;
            default:
                se.put("E40a", "xx");

        }

        switch (E40b.getCheckedRadioButtonId()) {
            case R.id.E40b_1:
                se.put("E40b", "1");
                break;
            case R.id.E40b_2:
                se.put("E40b", "2");
                break;
            case R.id.E40b_3:
                se.put("E40b", "3");
                break;
            case R.id.E40b_4:
                se.put("E40b", "4");
                break;
            case R.id.E40b_5:
                se.put("E40b", "5");
                break;
            default:
                se.put("E40b", "xx");
        }

        switch (E41.getCheckedRadioButtonId()) {
            case R.id.E41_a:
                se.put("E41", "a");
                break;
            case R.id.E41_b:
                se.put("E41", "b");
                break;
            case R.id.E41_c:
                se.put("E41", "c");
                break;
            case R.id.E41_d:
                se.put("E41", "d");
                break;
            case R.id.E41_e:
                se.put("E41", "e");
                break;
            case R.id.E41_f:
                se.put("E41", "f");
                break;
            case R.id.E41_g:
                se.put("E41", "g");
                break;
            case R.id.E41_h:
                se.put("E41", "h");
                break;
            default:
                se.put("E41", "xx");

        }

        switch (E42.getCheckedRadioButtonId()) {
            case R.id.E42_a:
                se.put("E42", "a");
                break;
            case R.id.E42_b:
                se.put("E42", "b");
                break;
            case R.id.E42_c:
                se.put("E42", "c");
                break;
            case R.id.E42_d:
                se.put("E42", "d");
                break;
            case R.id.E42_e:
                se.put("E42", "e");
                break;
            case R.id.E42_f:
                se.put("E42", "f");
                break;
            case R.id.E42_g:
                se.put("E42", "g");
                break;
            default:
                se.put("E42", "xx");
        }

        switch (E43.getCheckedRadioButtonId()) {
            case R.id.E43_a:
                se.put("E43", "a");
                break;
            case R.id.E43_b:
                se.put("E43", "b");
                break;
            case R.id.E43_c:
                se.put("E43", "c");
                break;
            case R.id.E43_d:
                se.put("E43", "d");
                break;
            case R.id.E43_e:
                se.put("E43", "e");
                break;
            case R.id.E43_f:
                se.put("E43", "f");
                break;
            default:
                se.put("E43", "xx");
        }

        switch (E44.getCheckedRadioButtonId()) {
            case R.id.E44_a:
                se.put("E44", "a");
                break;
            case R.id.E44_b:
                se.put("E44", "b");
                break;
            case R.id.E44_c:
                se.put("E44", "c");
                break;
            case R.id.E44_d:
                se.put("E44", "d");
                break;
            case R.id.E44_e:
                se.put("E44", "e");
                break;
            case R.id.E44_f:
                se.put("E44", "f");
                break;
            case R.id.E44_g:
                se.put("E44", "g");
                break;
            default:
                se.put("E44", "xx");
        }

        switch (E45.getCheckedRadioButtonId()) {
            case R.id.E45_a:
                se.put("E45", "a");
                break;
            case R.id.E45_b:
                se.put("E45", "b");
                break;
            case R.id.E45_c:
                se.put("E45", "c");
                break;
            default:
                se.put("E45", "xx");
        }

        se.put("E46_a", E46_a.isChecked() ? "a" : "");
        se.put("E46_b", E46_b.isChecked() ? "b" : "");
        se.put("E46_c", E46_c.isChecked() ? "c" : "");
        se.put("E46_d", E46_d.isChecked() ? "d" : "");
        se.put("E46_e", E46_e.isChecked() ? "e" : "");
        se.put("E46_f", E46_f.isChecked() ? "f" : "");
        se.put("E46_g", E46_g.isChecked() ? "g" : "");
        se.put("E46_h", E46_h.isChecked() ? "h" : "");

        switch (E47.getCheckedRadioButtonId()) {
            case R.id.E47_a:
                se.put("E47", "a");
                break;
            case R.id.E47_b:
                se.put("E47", "b");
                break;
            case R.id.E47_c:
                se.put("E47", "c");
                break;
            default:
                se.put("E47", "xx");

        }

        switch (E48.getCheckedRadioButtonId()) {
            case R.id.E48_a:
                se.put("E48_a", "a");
                break;
            case R.id.E48_b:
                se.put("E48", "b");
                break;
            case R.id.E48_c:
                se.put("E48", "c");
                break;
            case R.id.E48_d:
                se.put("E48", "d");
                break;
            case R.id.E48_e:
                se.put("E48", "e");
                break;
            default:
                se.put("E48", "xx");
        }

        se.put("E49_a", E49_a.isChecked() ? "a" : "");
        se.put("E49_b", E49_b.isChecked() ? "b" : "");
        se.put("E49_c", E49_c.isChecked() ? "c" : "");
        se.put("E49_d", E49_d.isChecked() ? "d" : "");
        se.put("E49_e", E49_e.isChecked() ? "e" : "");
        se.put("E49_f", E49_f.isChecked() ? "f" : "");
        se.put("E49_g", E49_g.isChecked() ? "g" : "");
        se.put("E49_h", E49_h.isChecked() ? "h" : "");

        switch (E50.getCheckedRadioButtonId()) {
            case R.id.E50_a:
                se.put("E50", "a");
                break;
            case R.id.E50_b:
                se.put("E50", "b");
                break;
            case R.id.E50_c:
                se.put("E50", "c");
                break;
            default:
                se.put("E50", "xx");
        }

        switch (E50a.getCheckedRadioButtonId()) {
            case R.id.E50a_1:
                se.put("E50a", "1");
                break;
            case R.id.E50a_2:
                se.put("E50a", "2");
                break;
            case R.id.E50a_3:
                se.put("E50a", "3");
                break;
            case R.id.E50a_4:
                se.put("E50a", "4");
                break;
            case R.id.E50a_5:
                se.put("E50a", "5");
                break;
            case R.id.E50a_6:
                se.put("E50a", "6");
                break;
            default:
                se.put("E50a", "xx");
        }


        switch (E50b.getCheckedRadioButtonId()) {
            case R.id.E50b_1:
                se.put("E50b", "1");
                break;
            case R.id.E50b_2:
                se.put("E50b", "2");
                break;
            case R.id.E50b_3:
                se.put("E50b", "3");
                break;
            case R.id.E50b_4:
                se.put("E50b", "4");
                break;
            case R.id.E50b_5:
                se.put("E50b", "5");
                break;
            case R.id.E50b_6:
                se.put("E50b", "6");
                break;
            default:
                se.put("E50b", "xx");
        }

        switch (E51.getCheckedRadioButtonId()) {
            case R.id.E51_a:
                se.put("E51", "a");
                break;
            case R.id.E51_b:
                se.put("E51", "b");
                break;
            case R.id.E51_c:
                se.put("E51", "c");
                break;
            default:
                se.put("E51", "xx");
        }
        se.put("E51a_1", E51a_1.isChecked() ? "1" : "");
        se.put("E51a_1", E51a_1.isChecked() ? "2" : "");
        se.put("E51a_1", E51a_1.isChecked() ? "3" : "");
        se.put("E51a_1", E51a_1.isChecked() ? "4" : "");
        se.put("E51a_1", E51a_1.isChecked() ? "5" : "");
        se.put("E51a_1", E51a_1.isChecked() ? "6" : "");
        se.put("E51a_1", E51a_1.isChecked() ? "7" : "");

        switch (E52.getCheckedRadioButtonId()) {
            case R.id.E52_a:
                se.put("E52", "a");
                break;
            case R.id.E52_b:
                se.put("E52", "b");
                break;
            case R.id.E52_c:
                se.put("E52", "c");
                break;
            default:
                se.put("E52", "xx");

        }

        se.put("E30_x", E30_x.getText().toString());
        se.put("E31_x", E31_x.getText().toString());
        se.put("E33_x", E33_x.getText().toString());
        se.put("E34_x", E34_x.getText().toString());
        se.put("E35a_x", E35a_x.getText().toString());
        se.put("E36a_x", E36a_x.getText().toString());
        se.put("E36b_x", E36b_x.getText().toString());
        se.put("E37_x", E37_x.getText().toString());
        se.put("E38_x", E38_x.getText().toString());
        se.put("E39_x", E39_x.getText().toString());
        se.put("E40a_x", E40a_x.getText().toString());
        se.put("E40b_x", E40b_x.getText().toString());
        se.put("E41_x", E41_x.getText().toString());
        se.put("E42_x", E42_x.getText().toString());
        se.put("E43_x", E43_x.getText().toString());
        se.put("E44_x", E44_x.getText().toString());
        se.put("E46_x", E46_x.getText().toString());
        se.put("E48_x", E48_x.getText().toString());
        se.put("E49_x", E49_x.getText().toString());
        se.put("E50a_x", E50a_x.getText().toString());
        se.put("E50b_x", E50b_x.getText().toString());
        se.put("E51a_x", E51a_x.getText().toString());

        sA.fc.setVA109("2");

        sA.fc.setVE(se.toString());

        Toast.makeText(this, "Saving Draft... Successful!", Toast.LENGTH_SHORT).show();


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

        if (E29_a.isChecked()
                && (!(E30_a.isChecked() || E30_b.isChecked() || E30_c.isChecked() || E30_d.isChecked() || E30_e.isChecked() || E30_f.isChecked()))) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E30_f.setError("Please select select one option");
            Log.i(TAG, "E30: No option selected");
            return false;
        } else {
            E30_f.setError(null);
        }

        if (E29_a.isChecked()
                && (!(E31_a.isChecked() || E31_b.isChecked() || E31_c.isChecked() || E31_d.isChecked() || E31_e.isChecked() || E31_f.isChecked() || E31_g.isChecked()
                || E31_h.isChecked() || E31_i.isChecked() || E31_j.isChecked() || E31_k.isChecked() || E31_l.isChecked() || E31_m.isChecked()))) {
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

        if (!E32_b.isChecked()
                && (!(E33_a.isChecked() || E33_b.isChecked() || E33_c.isChecked() || E33_d.isChecked() || E33_e.isChecked() || E33_f.isChecked() || E33_g.isChecked()
        ))) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E33_g.setError("Please select select one option");
            Log.i(TAG, "E33: No option selected");
            return false;
        } else {
            E33_g.setError(null);
        }

        if (E33_f.isChecked() && ((E33_a.isChecked() || E33_b.isChecked() || E33_c.isChecked() || E33_d.isChecked() || E33_e.isChecked() || E33_g.isChecked()))) {
            Toast.makeText(this, "Cannot Select Nothing with anyother option", Toast.LENGTH_LONG).show();
            E33_g.setError("Cannot Select Nothing with anyother option");
            Log.i(TAG, "E33: Cannot Select Nothing with anyother option");
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

        if (E36_a.isChecked() &&
                !(E36a_1.isChecked() || E36a_2.isChecked() || E36a_3.isChecked() || E36a_4.isChecked() || E36a_5.isChecked() || E36a_6.isChecked() || E36a_7.isChecked())
                ) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E36a_7.setError("Please select select one option");
            Log.i(TAG, "E36a: No option selected");
            return false;
        } else {
            E36a_7.setError(null);
        }

        if (E36_b.isChecked() &&
                !(E36b_1.isChecked() || E36b_2.isChecked() || E36b_3.isChecked() || E36b_4.isChecked() || E36b_5.isChecked())
                ) {
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

        if (!E37_a.isChecked() && E38.getCheckedRadioButtonId() == -1) {
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

        if (!E32_b.isChecked() && E41.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E41_h.setError("Please select select one option");
            Log.i(TAG, "E41: No option selected");
            return false;
        } else {
            E41_h.setError(null);
        }

        if (!E32_b.isChecked() && E42.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E42_g.setError("Please select select one option");
            Log.i(TAG, "E42: No option selected");
            return false;
        } else {
            E42_g.setError(null);
        }

        if (!E32_b.isChecked() && E43.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E43_f.setError("Please select select one option");
            Log.i(TAG, "E43: No option selected");
            return false;
        } else {
            E43_f.setError(null);
        }

        if (!E32_b.isChecked() && !E42_a.isChecked() && E44.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E44_g.setError("Please select select one option");
            Log.i(TAG, "E44: No option selected");
            return false;
        } else {
            E44_g.setError(null);
        }

        if (E36a_6.isChecked() && (E36a_1.isChecked() || E36a_2.isChecked() || E36a_3.isChecked() ||
                E36a_4.isChecked() || E36a_5.isChecked() || E36a_7.isChecked())) {
            Toast.makeText(this, "Incorrect Selection: Don't know selected with other options", Toast.LENGTH_LONG).show();
            E36a_6.setError("Incorrect Selection: Don't know selected with other options");
            Log.i(TAG, "E36a: Incorrect Selection: Don't know selected with other options");
            return false;
        } else {
            E36a_6.setError(null);
        }
        if (E36b_4.isChecked() && (E36b_1.isChecked() || E36b_2.isChecked() || E36b_3.isChecked() ||
                E36b_5.isChecked())) {
            Toast.makeText(this, "Incorrect Selection: Don't know selected with other options", Toast.LENGTH_LONG).show();
            E36b_4.setError("Incorrect Selection: Don't know selected with other options");
            Log.i(TAG, "E36b: Incorrect Selection: Don't know selected with other options");
            return false;
        } else {
            E36b_4.setError(null);
        }

        if (E45.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E45_c.setError("Please select select one option");
            Log.i(TAG, "E45: No option selected");
            return false;
        } else {
            E45_c.setError(null);
        }

        if (!(E46_a.isChecked() || E46_b.isChecked() || E46_c.isChecked() || E46_d.isChecked() || E46_e.isChecked() || E46_f.isChecked() || E46_g.isChecked() || E46_h.isChecked())) {
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

        if (E47_a.isChecked() && E48.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option", Toast.LENGTH_LONG).show();
            E48_e.setError("Please select select one option");
            Log.i(TAG, "E48: No option selected");
            return false;
        } else {
            E48_e.setError(null);
        }

        if (
                !(E49_a.isChecked() ||
                        E49_b.isChecked() ||
                        E49_c.isChecked() ||
                        E49_d.isChecked() ||
                        E49_e.isChecked() ||
                        E49_f.isChecked() ||
                        E49_g.isChecked() ||
                        E49_h.isChecked())
                ) {
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

        if (E51_a.isChecked() && !(
                E51a_1.isChecked() ||
                        E51a_2.isChecked() ||
                        E51a_3.isChecked() ||
                        E51a_4.isChecked() ||
                        E51a_5.isChecked() ||
                        E51a_6.isChecked() ||
                        E51a_7.isChecked()
        )) {
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
