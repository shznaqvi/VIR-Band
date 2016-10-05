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
    private String FormID; // Redundent of OC_03
    private String OC_01 = sB.iChildName;
    private String OC_02 = sA.fc.getVA02();
    private String OC_03 = sA.fc.getFormNo();
    private String OC;
    private String OCV1;
    private String OCV2;
    private String OCV3;
    private String OCV4;
    private String OCV5;
    private String OCV6;
    private String DEVICEID = VIRBandApp.deviceid;

    public OtherChildContract() {
    }

    public OtherChildContract(String formNo) {
        this.FormID = formNo;
    }

    public OtherChildContract(String formID, String OC) {
        FormID = formID;
        this.OC = OC;
    }


    public Long getID() {
        return this.ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getOC_ID() {
        return OC_ID;
    }

    public void setOC_ID(String OC_ID) {
        this.OC_ID = OC_ID;
    }

    public String getFormID() {
        return FormID;
    }

    public void setFormID(String formID) {
        FormID = formID;
    }

    public String getOC_01() {
        return OC_01;
    }

    public void setOC_01(String OC_01) {
        this.OC_01 = OC_01;
    }

    public String getOC_02() {
        return OC_02;
    }

    public void setOC_02(String OC_02) {
        this.OC_02 = OC_02;
    }

    public String getOC_03() {
        return OC_03;
    }

    public void setOC_03(String OC_03) {
        this.OC_03 = OC_03;
    }

    public String getOC() {
        return OC;
    }

    public void setOC(String OC) {
        this.OC = OC;
    }

    public String getOCV1() {
        return OCV1;
    }

    public void setOCV1(String OCV1) {
        this.OCV1 = OCV1;
    }

    public String getOCV2() {
        return OCV2;
    }

    public void setOCV2(String OCV2) {
        this.OCV2 = OCV2;
    }

    public String getOCV3() {
        return OCV3;
    }

    public void setOCV3(String OCV3) {
        this.OCV3 = OCV3;
    }

    public String getOCV4() {
        return OCV4;
    }

    public void setOCV4(String OCV4) {
        this.OCV4 = OCV4;
    }

    public String getOCV5() {
        return OCV5;
    }

    public void setOCV5(String OCV5) {
        this.OCV5 = OCV5;
    }

    public String getOCV6() {
        return OCV6;
    }

    public void setOCV6(String OCV6) {
        this.OCV6 = OCV6;
    }

    public String getDeviceID() {
        return DEVICEID;
    }

    public void setDeviceID(String deviceID) {
        this.DEVICEID = deviceID;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(OCs._ID, this.ID);
        json.put(OCs.COLUMN_NAME_FORMNO, this.FormID);
        json.put(OCs.COLUMN_NAME_OC_ID, this.OC_ID);
        json.put(OCs.COLUMN_NAME_OC_01, this.OC_01);
        json.put(OCs.COLUMN_NAME_OC_02, this.OC_02);
        json.put(OCs.COLUMN_NAME_OC_03, this.OC_03);
        json.put(OCs.COLUMN_NAME_OC, this.OC);
        json.put(OCs.COLUMN_NAME_OCV1, this.OCV1);
        json.put(OCs.COLUMN_NAME_OCV2, this.OCV2);
        json.put(OCs.COLUMN_NAME_OCV3, this.OCV3);
        json.put(OCs.COLUMN_NAME_OCV4, this.OCV4);
        json.put(OCs.COLUMN_NAME_OCV5, this.OCV5);
        json.put(OCs.COLUMN_NAME_OCV6, this.OCV6);
        json.put(OCs.COLUMN_NAME_DEVICE_ID, this.DEVICEID);


        return json;

    }

    public static abstract class OCs implements BaseColumns {

        public static final String TABLE_NAME = "ocs";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_NAME_FORMNO = "oc_frmno";
        public static final String COLUMN_NAME_OC_ID = "oc_odid";
        public static final String COLUMN_NAME_OC_01 = "oc_01";
        public static final String COLUMN_NAME_OC_02 = "oc_02";
        public static final String COLUMN_NAME_OC_03 = "oc_03";
        public static final String COLUMN_NAME_OC = "oc";
        public static final String COLUMN_NAME_OCV1 = "ocv1";
        public static final String COLUMN_NAME_OCV2 = "ocv2";
        public static final String COLUMN_NAME_OCV3 = "ocv3";
        public static final String COLUMN_NAME_OCV4 = "ocv4";
        public static final String COLUMN_NAME_OCV5 = "ocv5";
        public static final String COLUMN_NAME_OCV6 = "ocv6";
        public static final String COLUMN_NAME_DEVICE_ID = "device_id";
    }

}
