package com.example.hassannaqvi.virband;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class sVD
        extends AppCompatActivity {


    private static final String TAG = "SectionVD";
    public static JSONObject IChild;

    public int updcount;
    public Integer icTP;
    public boolean ic;

    @BindView(R.id.GL53)
    GridLayout gL53;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.textView6)
    TextView textView6;
    @BindView(R.id.VACNAME_01)
    RadioGroup vACNAME01;
    @BindView(R.id.VACNAME_01_a)
    RadioButton vACNAME01A;
    @BindView(R.id.VACNAME_01_b)
    RadioButton vACNAME01B;
    @BindView(R.id.VACNAME_01_c)
    RadioButton vACNAME01C;
    @BindView(R.id.VACNAME_01_d)
    RadioButton vACNAME01D;
    @BindView(R.id.VACNAME_01_e)
    RadioButton vACNAME01E;
    @BindView(R.id.VACNAME_01_f)
    RadioButton vACNAME01F;
    @BindView(R.id.VACNAME_01_g)
    RadioButton vACNAME01G;
    @BindView(R.id.VACNAME_01_h)
    RadioButton vACNAME01H;
    @BindView(R.id.VACNAME_01_i)
    RadioButton vACNAME01I;
    @BindView(R.id.VACNAME_02)
    RadioGroup vACNAME02;
    @BindView(R.id.VACNAME_02_a)
    RadioButton vACNAME02A;
    @BindView(R.id.VACNAME_02_b)
    RadioButton vACNAME02B;
    @BindView(R.id.VACNAME_02_c)
    RadioButton vACNAME02C;
    @BindView(R.id.VACNAME_02_d)
    RadioButton vACNAME02D;
    @BindView(R.id.VACNAME_02_e)
    RadioButton vACNAME02E;
    @BindView(R.id.VACNAME_02_f)
    RadioButton vACNAME02F;
    @BindView(R.id.VACNAME_02_g)
    RadioButton vACNAME02G;
    @BindView(R.id.VACNAME_02_h)
    RadioButton vACNAME02H;
    @BindView(R.id.VACNAME_02_i)
    RadioButton vACNAME02I;
    @BindView(R.id.VACNAME_03)
    RadioGroup vACNAME03;
    @BindView(R.id.VACNAME_03_a)
    RadioButton vACNAME03A;
    @BindView(R.id.VACNAME_03_b)
    RadioButton vACNAME03B;
    @BindView(R.id.VACNAME_03_c)
    RadioButton vACNAME03C;
    @BindView(R.id.VACNAME_03_d)
    RadioButton vACNAME03D;
    @BindView(R.id.VACNAME_03_e)
    RadioButton vACNAME03E;
    @BindView(R.id.VACNAME_03_f)
    RadioButton vACNAME03F;
    @BindView(R.id.VACNAME_03_g)
    RadioButton vACNAME03G;
    @BindView(R.id.VACNAME_03_h)
    RadioButton vACNAME03H;
    @BindView(R.id.VACNAME_03_i)
    RadioButton vACNAME03I;
    @BindView(R.id.GL55)
    GridLayout gL55;
    @BindView(R.id.PLACE_V1)
    TextView pLACEV1;
    @BindView(R.id.PLACE_V2)
    TextView pLACEV2;
    @BindView(R.id.PLACE_V3)
    TextView pLACEV3;
    @BindView(R.id.PLACE_01)
    RadioGroup pLACE01;
    @BindView(R.id.PLACE_01_a)
    RadioButton pLACE01A;
    @BindView(R.id.PLACE_01_b)
    RadioButton pLACE01B;
    @BindView(R.id.PLACE_01_c)
    RadioButton pLACE01C;
    @BindView(R.id.PLACE_01_d)
    RadioButton pLACE01D;
    @BindView(R.id.PLACE_01_e)
    RadioButton pLACE01E;
    @BindView(R.id.PLACE_01_f)
    RadioButton pLACE01F;
    @BindView(R.id.PLACE_01_g)
    RadioButton pLACE01G;
    @BindView(R.id.PLACE_01_h)
    RadioButton pLACE01H;
    @BindView(R.id.PLACE_02)
    RadioGroup pLACE02;
    @BindView(R.id.PLACE_02_a)
    RadioButton pLACE02A;
    @BindView(R.id.PLACE_02_b)
    RadioButton pLACE02B;
    @BindView(R.id.PLACE_02_c)
    RadioButton pLACE02C;
    @BindView(R.id.PLACE_02_d)
    RadioButton pLACE02D;
    @BindView(R.id.PLACE_02_e)
    RadioButton pLACE02E;
    @BindView(R.id.PLACE_02_f)
    RadioButton pLACE02F;
    @BindView(R.id.PLACE_02_g)
    RadioButton pLACE02G;
    @BindView(R.id.PLACE_02_h)
    RadioButton pLACE02H;
    @BindView(R.id.PLACE_03)
    RadioGroup pLACE03;
    @BindView(R.id.PLACE_03_a)
    RadioButton pLACE03A;
    @BindView(R.id.PLACE_03_b)
    RadioButton pLACE03B;
    @BindView(R.id.PLACE_03_c)
    RadioButton pLACE03C;
    @BindView(R.id.PLACE_03_d)
    RadioButton pLACE03D;
    @BindView(R.id.PLACE_03_e)
    RadioButton pLACE03E;
    @BindView(R.id.PLACE_03_f)
    RadioButton pLACE03F;
    @BindView(R.id.PLACE_03_g)
    RadioButton pLACE03G;
    @BindView(R.id.PLACE_03_h)
    RadioButton pLACE03H;
    @BindView(R.id.VD54)
    RadioGroup vD54;
    @BindView(R.id.VD54_a)
    RadioButton vD54A;
    @BindView(R.id.VD54_b)
    RadioButton vD54B;
    @BindView(R.id.VD54_c)
    RadioButton vD54C;
    @BindView(R.id.VD54_d)
    RadioButton vD54D;
    @BindView(R.id.VD54_e)
    RadioButton vD54E;
    @BindView(R.id.VD54_f)
    RadioButton vD54F;
    @BindView(R.id.DOV)
    DatePicker DOV;
    @BindView(R.id.VD56)
    RadioGroup vD56;
    @BindView(R.id.VD56_a)
    RadioButton vD56A;
    @BindView(R.id.VD56_b)
    RadioButton vD56B;
    @BindView(R.id.VD56_c)
    RadioButton vD56C;
    @BindView(R.id.VD56_d)
    RadioButton vD56D;
    @BindView(R.id.VD56_e)
    RadioButton vD56E;
    @BindView(R.id.VD56_f)
    RadioButton vD56F;
    @BindView(R.id.VD57)
    EditText vD57;

    @BindView(R.id.VD54_x)
    EditText vD54_x;



    @BindView(R.id.fldGrpVD56)
    LinearLayout fldGrpVD56;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_vd);
        ButterKnife.bind(this);

        icTP = getIntent().getIntExtra("icTP", 0);
        icTP += 1;
        ic = getIntent().getBooleanExtra("ic", false);
        long minDate = getIntent().getLongExtra("minDate", 0);
        DOV.setMaxDate(new Date().getTime());
        switch (icTP) {
            case 1:
                DOV.setMinDate(new Date().getTime() - (VIRBandApp.MILLISECONDS_IN_YEAR * 2));
                break;
            default:
                DOV.setMinDate(minDate);
                break;
        }
        vACNAME01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                pLACE01.setVisibility(View.VISIBLE);
                vACNAME02.setVisibility(View.VISIBLE);

                int count = vACNAME01.getChildCount();
                ArrayList<RadioButton> listOfRadioButtons = new ArrayList<RadioButton>();
                for (int i1 = 0; i1 < count; i1++) {
                    RadioButton o = (RadioButton) vACNAME02.getChildAt(i1);
                    RadioButton p = (RadioButton) vACNAME03.getChildAt(i1);
                    if (!o.isChecked())
                        p.setEnabled(true);
                    if (!p.isChecked())
                        o.setEnabled(true);

                }

                View radioButton = vACNAME01.findViewById(i);
                int idx = vACNAME01.indexOfChild(radioButton);
                pLACEV1.setText("V1");
                pLACE01.clearCheck();

                if (!(i == R.id.VACNAME_01_a || i == R.id.VACNAME_01_b || i == R.id.VACNAME_01_i)) {

                    vACNAME02.getChildAt(idx).setEnabled(false);
                    //vACNAME02.clearCheck();

                    vACNAME03.getChildAt(idx).setEnabled(false);
                    //vACNAME03.clearCheck();

                    switch (i) {
                        case R.id.VACNAME_01_c:
                            pLACEV1.setText("BCG");
                            break;
                        case R.id.VACNAME_01_d:
                            pLACEV1.setText("PENTA");
                            break;
                        case R.id.VACNAME_01_e:
                            pLACEV1.setText("PCV");
                            break;
                        case R.id.VACNAME_01_f:
                            pLACEV1.setText("OPV");
                            break;
                        case R.id.VACNAME_01_g:
                            pLACEV1.setText("Pneumococcal");
                            break;
                        case R.id.VACNAME_01_h:
                            pLACEV1.setText("Measles");
                            break;

                    }
                }
            }
        });
        vACNAME02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                pLACE02.setVisibility(View.VISIBLE);
                vACNAME03.setVisibility(View.VISIBLE);
                int count = vACNAME02.getChildCount();
                ArrayList<RadioButton> listOfRadioButtons = new ArrayList<RadioButton>();
                for (int i1 = 0; i1 < count; i1++) {

                    RadioButton o = (RadioButton) vACNAME01.getChildAt(i1);
                    RadioButton p = (RadioButton) vACNAME03.getChildAt(i1);
                    if (!o.isChecked()) {
                        p.setEnabled(true);
                    }
                    if (!p.isChecked()) {
                        o.setEnabled(true);
                    }

                }

                View radioButton = vACNAME02.findViewById(i);
                int idx = vACNAME02.indexOfChild(radioButton);
                pLACEV2.setText("V2");
                pLACE02.clearCheck();
                if (!(i == R.id.VACNAME_02_a || i == R.id.VACNAME_02_b || i == R.id.VACNAME_02_i)) {

                    vACNAME01.getChildAt(idx).setEnabled(false);
                    //vACNAME01.clearCheck();

                    vACNAME03.getChildAt(idx).setEnabled(false);
                    //vACNAME03.clearCheck();

                    switch (i) {
                        case R.id.VACNAME_02_c:
                            pLACEV2.setText(getString(R.string.BCG));
                            break;
                        case R.id.VACNAME_02_d:
                            pLACEV2.setText(getString(R.string.PENTA));
                            break;
                        case R.id.VACNAME_02_e:
                            pLACEV2.setText(getString(R.string.PCV));
                            break;
                        case R.id.VACNAME_02_f:
                            pLACEV2.setText(getString(R.string.OPV));
                            break;
                        case R.id.VACNAME_02_g:
                            pLACEV2.setText(getString(R.string.IPV));
                            break;
                        case R.id.VACNAME_02_h:
                            pLACEV2.setText(getString(R.string.MSL));
                            break;

                    }
                }
            }
        });

        vACNAME03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                pLACE03.setVisibility(View.VISIBLE);
                int count = vACNAME03.getChildCount();
                ArrayList<RadioButton> listOfRadioButtons = new ArrayList<RadioButton>();
                for (int i1 = 0; i1 < count; i1++) {


                    RadioButton o = (RadioButton) vACNAME01.getChildAt(i1);
                    RadioButton p = (RadioButton) vACNAME02.getChildAt(i1);

                    if (!o.isChecked())
                        p.setEnabled(true);
                    if (!p.isChecked())
                        o.setEnabled(true);

                }

                View radioButton = vACNAME03.findViewById(i);
                int idx = vACNAME03.indexOfChild(radioButton);
                pLACEV3.setText("V3");
                pLACE03.clearCheck();

                if (!(i == R.id.VACNAME_03_a || i == R.id.VACNAME_03_b || i == R.id.VACNAME_03_i)) {

                    vACNAME01.getChildAt(idx).setEnabled(false);
                    //vACNAME01.clearCheck();

                    vACNAME02.getChildAt(idx).setEnabled(false);
                    //vACNAME02.clearCheck();

                    switch (i) {
                        case R.id.VACNAME_03_c:
                            pLACEV3.setText("BCG");
                            break;
                        case R.id.VACNAME_03_d:
                            pLACEV3.setText("PENTA");
                            break;
                        case R.id.VACNAME_03_e:
                            pLACEV3.setText("PCV");
                            break;
                        case R.id.VACNAME_03_f:
                            pLACEV3.setText("OPV");
                            break;
                        case R.id.VACNAME_03_g:
                            pLACEV3.setText("Pneumococcal");
                            break;
                        case R.id.VACNAME_03_h:
                            pLACEV3.setText("Measles");
                            break;

                    }
                }
            }
        });


        // SKIP PATTERN

        vD54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!vD54F.isChecked()) {
                    vD54_x.setVisibility(View.GONE);
                    vD54_x.setText(null);

                } else {
                    vD54_x.setVisibility(View.VISIBLE);

                }
            }
        });

        vD56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == vD56B.getId() || i == vD56C.getId()) {
                    fldGrpVD56.setVisibility(View.VISIBLE);
                } else {
                    fldGrpVD56.setVisibility(View.GONE);
                    vD57.setText(null);
                }
            }
        });


    }

    @OnClick(R.id.btnsubmitSD)
    void onBtnsubmitSDClick() {
        if (formValidation()) {
            try {
                if (SaveDraft()) {
                    if (UpdateDB()) {
                        if (icTP < 6) {
                            if (
                                    ((icTP == 1) && ((sB.ageindays / 7) > VIRBandApp.TP_02w))
                                            || ((icTP == 2) && ((sB.ageindays / 7) > VIRBandApp.TP_03w))
                                            || ((icTP == 3) && ((sB.ageindays / 7) > VIRBandApp.TP_04w))
                                            || ((icTP == 4) && ((sB.ageindays / 30) > VIRBandApp.TP_05m))
                                            || ((icTP == 5) && ((sB.ageindays / 30) > VIRBandApp.TP_06m))
                                    ) {
                            Intent sVD = new Intent(this, sVD.class);
                            sVD.putExtra("icTP", icTP);
                            sVD.putExtra("ic", true);
                                sVD.putExtra("minDate", DOV.getCalendarView().getDate());
                            startActivity(sVD);
                            } else {
                                Intent ending = new Intent(this, MainActivity.class);
                                startActivity(ending);
                            }
                        } else {
                            Intent ending = new Intent(this, MainActivity.class);
                            startActivity(ending);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }

    @OnLongClick(R.id.btnsubmitSD)
    boolean onBtnsubmitSDLongClick() {
        //TODO implement
        return true;
    }

    private boolean UpdateDB() {
        FormsDBHelper db = new FormsDBHelper(this);

        switch (icTP) {
            case 1:
                updcount = db.updateIChild1();
                break;
            case 2:
                updcount = db.updateIChild2();
                break;
            case 3:
                updcount = db.updateIChild3();
                break;
            case 4:
                updcount = db.updateIChild4();
                break;
            case 5:
                updcount = db.updateIChild5();
                break;
            case 6:
                updcount = db.updateIChild6();
                break;

        }

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();

        }

        return true;
    }

    @TargetApi(Build.VERSION_CODES.N)
    private boolean SaveDraft() throws JSONException {

        IChild = new JSONObject();
        String tp = "TP" + icTP + "_";

        switch (vACNAME01.getCheckedRadioButtonId()) {
            case R.id.VACNAME_01_a:
                IChild.put(tp + "VACNAME", "a");
                break;
            case R.id.VACNAME_01_b:
                IChild.put(tp + "VACNAME", "b");
                break;
            case R.id.VACNAME_01_c:
                IChild.put(tp + "VACNAME", "c");
                break;
            case R.id.VACNAME_01_d:
                IChild.put(tp + "VACNAME", "d");
                break;
            case R.id.VACNAME_01_e:
                IChild.put(tp + "VACNAME", "e");
                break;
            case R.id.VACNAME_01_f:
                IChild.put(tp + "VACNAME", "f");
                break;
            case R.id.VACNAME_01_g:
                IChild.put(tp + "VACNAME", "g");
                break;
            case R.id.VACNAME_01_h:
                IChild.put(tp + "VACNAME", "h");
                break;
            case R.id.VACNAME_01_i:
                IChild.put(tp + "VACNAME", "i");
                break;
        }

        switch (vACNAME01.getCheckedRadioButtonId()) {
            case R.id.VACNAME_01_a:
                IChild.put(tp + "VACNAME_01", "a");
                break;
            case R.id.VACNAME_01_b:
                IChild.put(tp + "VACNAME_01", "b");
                break;
            case R.id.VACNAME_01_c:
                IChild.put(tp + "VACNAME_01", "c");
                break;
            case R.id.VACNAME_01_d:
                IChild.put(tp + "VACNAME_01", "d");
                break;
            case R.id.VACNAME_01_e:
                IChild.put(tp + "VACNAME_01", "e");
                break;
            case R.id.VACNAME_01_f:
                IChild.put(tp + "VACNAME_01", "f");
                break;
            case R.id.VACNAME_01_g:
                IChild.put(tp + "VACNAME_01", "g");
                break;
            case R.id.VACNAME_01_h:
                IChild.put(tp + "VACNAME_01", "h");
                break;
            case R.id.VACNAME_01_i:
                IChild.put(tp + "VACNAME_01", "i");
                break;
        }

        switch (vACNAME02.getCheckedRadioButtonId()) {
            case R.id.VACNAME_02_a:
                IChild.put(tp + "VACNAME_02", "a");
                break;
            case R.id.VACNAME_02_b:
                IChild.put(tp + "VACNAME_02", "b");
                break;
            case R.id.VACNAME_02_c:
                IChild.put(tp + "VACNAME_02", "c");
                break;
            case R.id.VACNAME_02_d:
                IChild.put(tp + "VACNAME_02", "d");
                break;
            case R.id.VACNAME_02_e:
                IChild.put(tp + "VACNAME_02", "e");
                break;
            case R.id.VACNAME_02_f:
                IChild.put(tp + "VACNAME_02", "f");
                break;
            case R.id.VACNAME_02_g:
                IChild.put(tp + "VACNAME_02", "g");
                break;
            case R.id.VACNAME_02_h:
                IChild.put(tp + "VACNAME_02", "h");
                break;
            case R.id.VACNAME_02_i:
                IChild.put(tp + "VACNAME_02", "i");
                break;
        }

        switch (vACNAME03.getCheckedRadioButtonId()) {
            case R.id.VACNAME_03_a:
                IChild.put(tp + "VACNAME_03", "a");
                break;
            case R.id.VACNAME_03_b:
                IChild.put(tp + "VACNAME_03", "b");
                break;
            case R.id.VACNAME_03_c:
                IChild.put(tp + "VACNAME_03", "c");
                break;
            case R.id.VACNAME_03_d:
                IChild.put(tp + "VACNAME_03", "d");
                break;
            case R.id.VACNAME_03_e:
                IChild.put(tp + "VACNAME_03", "e");
                break;
            case R.id.VACNAME_03_f:
                IChild.put(tp + "VACNAME_03", "f");
                break;
            case R.id.VACNAME_03_g:
                IChild.put(tp + "VACNAME_03", "g");
                break;
            case R.id.VACNAME_03_h:
                IChild.put(tp + "VACNAME_03", "h");
                break;
            case R.id.VACNAME_03_i:
                IChild.put(tp + "VACNAME_03", "i");
                break;
        }

        switch (pLACE01.getCheckedRadioButtonId()) {
            case R.id.PLACE_01_a:
                IChild.put(tp + "PLACE_01", "a");
                break;
            case R.id.PLACE_01_b:
                IChild.put(tp + "PLACE_01", "b");
                break;
            case R.id.PLACE_01_c:
                IChild.put(tp + "PLACE_01", "c");
                break;
            case R.id.PLACE_01_d:
                IChild.put(tp + "PLACE_01", "d");
                break;
            case R.id.PLACE_01_e:
                IChild.put(tp + "PLACE_01", "e");
                break;
            case R.id.PLACE_01_f:
                IChild.put(tp + "PLACE_01", "f");
                break;
            case R.id.PLACE_01_g:
                IChild.put(tp + "PLACE_01", "g");
                break;
            case R.id.PLACE_01_h:
                IChild.put(tp + "PLACE_01", "h");
                break;
        }

        switch (pLACE02.getCheckedRadioButtonId()) {
            case R.id.PLACE_02_a:
                IChild.put(tp + "PLACE_02", "a");
                break;
            case R.id.PLACE_02_b:
                IChild.put(tp + "PLACE_02", "b");
                break;
            case R.id.PLACE_02_c:
                IChild.put(tp + "PLACE_02", "c");
                break;
            case R.id.PLACE_02_d:
                IChild.put(tp + "PLACE_02", "d");
                break;
            case R.id.PLACE_02_e:
                IChild.put(tp + "PLACE_02", "e");
                break;
            case R.id.PLACE_02_f:
                IChild.put(tp + "PLACE_02", "f");
                break;
            case R.id.PLACE_02_g:
                IChild.put(tp + "PLACE_02", "g");
                break;
            case R.id.PLACE_02_h:
                IChild.put(tp + "PLACE_02", "h");
                break;
        }

        switch (pLACE03.getCheckedRadioButtonId()) {
            case R.id.PLACE_03_a:
                IChild.put(tp + "PLACE_03", "a");
                break;
            case R.id.PLACE_03_b:
                IChild.put(tp + "PLACE_03", "b");
                break;
            case R.id.PLACE_03_c:
                IChild.put(tp + "PLACE_03", "c");
                break;
            case R.id.PLACE_03_d:
                IChild.put(tp + "PLACE_03", "d");
                break;
            case R.id.PLACE_03_e:
                IChild.put(tp + "PLACE_03", "e");
                break;
            case R.id.PLACE_03_f:
                IChild.put(tp + "PLACE_03", "f");
                break;
            case R.id.PLACE_03_g:
                IChild.put(tp + "PLACE_03", "g");
                break;
            case R.id.PLACE_03_h:
                IChild.put(tp + "PLACE_03", "h");
                break;
        }

        String spDateT = new SimpleDateFormat("dd-MM-yy").format(DOV.getCalendarView().getDate());

        IChild.put(tp + "DOV", spDateT);

        switch (vD54.getCheckedRadioButtonId()) {
            case R.id.VD54_a:
                IChild.put(tp + "VD54", "a");
                break;
            case R.id.VD54_b:
                IChild.put(tp + "VD54", "b");
                break;
            case R.id.VD54_c:
                IChild.put(tp + "VD54", "c");
                break;
            case R.id.VD54_d:
                IChild.put(tp + "VD54", "d");
                break;
            case R.id.VD54_e:
                IChild.put(tp + "VD54", "e");
                break;
            case R.id.VD54_f:
                IChild.put(tp + "VD54", "f");
                break;
        }
        IChild.put(tp + "VD54_x", vD54_x.getText().toString());


        switch (vD56.getCheckedRadioButtonId()) {
            case R.id.VD56_a:
                IChild.put(tp + "VD56", "a");
                break;
            case R.id.VD56_b:
                IChild.put(tp + "VD56", "b");
                break;
            case R.id.VD56_c:
                IChild.put(tp + "VD56", "c");
                break;
            case R.id.VD56_d:
                IChild.put(tp + "VD56", "d");
                break;
            case R.id.VD56_e:
                IChild.put(tp + "VD56", "e");
                break;
            case R.id.VD56_f:
                IChild.put(tp + "VD56", "f");
                break;
        }
        IChild.put(tp + "VD57", vD57.getText().toString());

        switch (icTP) {
            case 1:
                sA.fc.setIChild1(IChild.toString());
                Toast.makeText(this, "Saving Dose# 1 Draft... Successful!", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                sA.fc.setIChild2(IChild.toString());
                Toast.makeText(this, "Saving Dose# 2 Draft... Successful!", Toast.LENGTH_SHORT).show();
                return true;
            case 3: 
                sA.fc.setIChild3(IChild.toString());
                Toast.makeText(this, "Saving Dose# 3 Draft... Successful!", Toast.LENGTH_SHORT).show();
                return true;
            case 4:
                sA.fc.setIChild4(IChild.toString());
                Toast.makeText(this, "Saving Dose# 4 Draft... Successful!", Toast.LENGTH_SHORT).show();
                return true;
            case 5:
                sA.fc.setIChild5(IChild.toString());
                Toast.makeText(this, "Saving Dose# 5 Draft... Successful!", Toast.LENGTH_SHORT).show();
                return true;
            case 6:
                sA.fc.setIChild6(IChild.toString());
                Toast.makeText(this, "Saving Dose# 6 Draft... Successful!", Toast.LENGTH_SHORT).show();
                return true;

        }

        return false;
    }

    private boolean formValidation() {

        if (vACNAME01.getCheckedRadioButtonId() == -1 && vACNAME02.getCheckedRadioButtonId() == -1 && vACNAME03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option \r\n" + getString(R.string.VD53), Toast.LENGTH_LONG).show();
            vACNAME01I.setError("Please select one option");
            Log.i(TAG, "VACNAME: No option selected");
            return false;
        } else {
            vACNAME01I.setError(null);
        }

        if (vACNAME01.getCheckedRadioButtonId() != -1 && pLACE01.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option \r\n" + getString(R.string.VD55), Toast.LENGTH_LONG).show();
            pLACE01H.setError("Please select one option");
            Log.i(TAG, "PLACE: No option selected");
            return false;
        } else {
            pLACE01H.setError(null);
        }

        if (vACNAME02.getCheckedRadioButtonId() != -1 && pLACE02.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option \r\n" + getString(R.string.VD55), Toast.LENGTH_LONG).show();
            pLACE02H.setError("Please select select one option");
            Log.i(TAG, "PLACE: No option selected");
            return false;
        } else {
            pLACE02H.setError(null);
        }

        if (vACNAME03.getCheckedRadioButtonId() != -1 && pLACE03.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option \r\n" + getString(R.string.VD55), Toast.LENGTH_LONG).show();
            pLACE03H.setError("Please select one option");
            Log.i(TAG, "PLACE: No option selected");
            return false;
        } else {
            pLACE03H.setError(null);
        }

        if (vD54.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option \r\n" + getString(R.string.VD54), Toast.LENGTH_LONG).show();
            vD54F.setError("Please select one option");
            Log.i(TAG, "VD54: No option selected");
            return false;
        } else {
            vD54F.setError(null);
        }

        if (vD56.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Please select one option \r\n" + getString(R.string.VD56), Toast.LENGTH_LONG).show();
            vD56F.setError("Please select  one option");
            Log.i(TAG, "VD56: No option selected");
            return false;
        } else {
            vD56F.setError(null);
        }

        if ((vD56.getCheckedRadioButtonId() == vD56B.getId() || vD56.getCheckedRadioButtonId() == vD56C.getId()) && vD57.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please Enter the Reason \r\n" + getString(R.string.VD57), Toast.LENGTH_LONG).show();
            vD57.setError("Please enter the reason");
            Log.i(TAG, "VD57: No reason given");
            return false;
        } else {
            vD57.setError(null);
        }


        return true;
    }

}

