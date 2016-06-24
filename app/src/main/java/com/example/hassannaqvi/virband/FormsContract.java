package com.example.hassannaqvi.virband;

/**
 * Created by hassan.naqvi on 6/24/2016.
 */

import android.content.Context;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;


public final class FormsContract {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm'Z'";
    private final String TAG = "FormsContact";
    private Long ID;
    private String FormNo;
    private String VA_01;
    private String VA_02;
    private String VA_03;
    private String VA_04;
    private JSONObject VC;
    private JSONObject VD;
    private JSONObject VE;

    private Context context;

    private Long formId = null; //Long.valueOf(-1);
    private Boolean debug = false;

    public FormsContract(Context context) {
        this.context = context;
    }

    public FormsContract() {
    }

    public FormsContract(String formNo) {
        this.FormNo = formNo;
    }

    public FormsContract(String formNo, JSONObject fc) throws JSONException {

        this.FormNo = formNo;
        this.VA_01 = fc.getString("va_01");
        this.VA_02 = fc.getString("va_02");
        this.VA_03 = fc.getString("va_03");
        this.VA_04 = fc.getString("va_04");

    }

    public Long getID() {
        return this.ID;
    }

    public void setID(Long id) {
        this.ID = id;
    }

    public String getVA01() {
        return this.VA_01;
    }

    public void setVA01(String va01) {
        this.VA_01 = va01;
    }

    public String getVA02() {
        return this.VA_02;
    }

    public void setVA02(String va02) {
        this.VA_02 = va02;
    }

    public String getVA03() {
        return this.VA_03;
    }

    public void setVA03(String va03) {
        this.VA_03 = va03;
    }

    public String getVA04() {
        return this.VA_04;
    }

    public void setVA04(String va04) {
        this.VA_04 = va04;
    }

    public JSONObject getVC() {
        return this.VC;
    }

    public void setVC(JSONObject VC) {
        this.VC = VC;
    }

    public JSONObject getVD() {
        return this.VD;
    }

    public void setVD(JSONObject VD) {
        this.VD = VD;
    }

    public JSONObject getVE() {
        return this.VE;
    }

    public void setVE(JSONObject VE) {
        this.VE = VE;
    }


    public static abstract class VIRForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_FORM_ID = "formid";
        public static final String COLUMN_NAME_VA_FORMNO = "va_frmno";
        public static final String COLUMN_NAME_VA_01 = "va_01";
        public static final String COLUMN_NAME_VA_02 = "va_02";
        public static final String COLUMN_NAME_VA_03 = "va_03";
        public static final String COLUMN_NAME_VA_04 = "va_04";
        public static final String COLUMN_NAME_VC = "vc";
        public static final String COLUMN_NAME_VD = "vd";
        public static final String COLUMN_NAME_VE = "ve";
    }
}
