package com.example.hassannaqvi.virband;

import android.content.Context;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 8/25/2016.
 */
public class OtherChildContract {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm'Z'";
    private final String TAG = "OcsContact";

    private Context context;

    private Long ID;
    private String OC_ID;
    private String FormID;
    private String OC_01 = sB.iChildName;
    private String OC_02 = sA.fc.getVA02();
    private String OC_03 = sA.fc.getFormNo();
    private String OC_04;
    private String OC_05;
    private String OC_06;
    private String OC_DOB;
    private String OC_07d;
    private String OC_07m;
    private String OC_07y;
    private String OC_08;
    private String OC_09;
    private String OC_10;
    private String OC_11;
    private String OC_12;
    private String OC_13;
    private String OC_14;
    private String OC_V1;
    private String OC_V2;
    private String OC_V3;
    private String OC_V4;
    private String OC_V5;
    private String OC_V6;

    public OtherChildContract(Context context) {
        this.context = context;
    }

    public OtherChildContract() {
    }

    public OtherChildContract(String ocId) {
        this.OC_ID = ocId;
    }

    public OtherChildContract(String formId, JSONObject oc) throws JSONException {

        this.FormID = formId;
        this.OC_01 = oc.getString("OC01");
        this.OC_02 = oc.getString("OC02");
        this.OC_03 = oc.getString("OC03");
        this.OC_04 = oc.getString("OC04");
        this.OC_05 = oc.getString("OC05");
        this.OC_06 = oc.getString("OC06");
        this.OC_07d = oc.getString("OC07d");
        this.OC_07m = oc.getString("OC07m");
        this.OC_07y = oc.getString("OC07y");
        this.OC_08 = oc.getString("OC08");
        this.OC_09 = oc.getString("OC09");
        this.OC_10 = oc.getString("OC10");
        this.OC_11 = oc.getString("OC11");
        this.OC_12 = oc.getString("OC12");
        this.OC_13 = oc.getString("OC13");
        this.OC_14 = oc.getString("OC14");

    }

    public static abstract class OtherChild implements BaseColumns {

        public static final String TABLE_NAME = "other_child";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
    }


}
