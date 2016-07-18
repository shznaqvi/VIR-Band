package com.example.hassannaqvi.virband;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class sC extends AppCompatActivity {

    private static final String TAG = "SectionC";

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_c);
        ButterKnife.bind(this);
    }

    public void submitSC(View v) {

        if (formValidation()) {
            SaveDraft();
            if (UpdateDB()) {
                Intent SC = new Intent(this, sD.class);
                startActivity(SC);
            }
        }


    }

    private boolean UpdateDB() {

        return true;
    }

    private void SaveDraft() {
    }

    private boolean formValidation() {


        return true;
    }
}
