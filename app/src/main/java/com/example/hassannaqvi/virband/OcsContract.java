package com.example.hassannaqvi.virband;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 8/25/2016.
 */
public class OcsContract {
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm'Z'";
    private final String TAG = "OcsContact";

    private Context context;

    private Long ID;
    private String OC_ID;
    private String OC_01 = sB.iChildName;
    private String OC_02 = sA.fc.getVA02();
    private String OC_03 = sA.fc.getFormNo();
    private String OC_04;
    private String OC_05;
    private String OC_06;
    private String OC_07;
    private String OC_08;
    private String OC_09;
    private String OC_10;
    private String OC_11;
    private String OC_12;
    private String OC_13;
    private String OC_V1;
    private String OC_V2;
    private String OC_V3;
    private String OC_V4;
    private String OC_V5;
    private String OC_V6;

    public OcsContract(Context context) {
        this.context = context;
    }

    public OcsContract() {
    }

    public OcsContract(String ocId) {
        this.OC_ID = ocId;
    }

    public OcsContract(String ocId, JSONObject oc) throws JSONException {

        this.OC_ID = ocId;
        this.OC_01 = oc.getString("oc_01");
        this.OC_02 = oc.getString("oc_02");
        this.OC_03 = oc.getString("oc_03");
        this.OC_04 = oc.getString("oc_04");
        this.OC_04 = oc.getString("oc_05");
        this.OC_04 = oc.getString("oc_06");
        this.OC_04 = oc.getString("oc_07");
        this.OC_04 = oc.getString("oc_08");
        this.OC_04 = oc.getString("oc_09");
        this.OC_04 = oc.getString("oc_10");
        this.OC_04 = oc.getString("oc_11");
        this.OC_04 = oc.getString("oc_12");
        this.OC_04 = oc.getString("oc_13");

    }


}
