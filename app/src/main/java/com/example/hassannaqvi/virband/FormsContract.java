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
    private String FormNo; //FrmNo
    private String VA_101; // Date of Interview
    private String VA_101TIME; // Time of Interview
    private String VA_102; // Name of Interviewer
    private String VA_01; // Form No
    private String VA_02; // Household #
    private String VA_03 = "Gulshan Town, District East, Karachi Division, Karachi"; // Project Area / Town
    private String VA_04; // Area / UC
    private String VA_109; // Interview Status (1 = Complete; 2 = Incomplete; 3 = In-progress)
    private String VB;
    private String VC;
    private String VD;
    private String VE;
    private String IChild1;
    private String IChild2;
    private String IChild3;
    private String IChild4;
    private String IChild5;
    private String IChild6;
    private String DEVICEID;
    private String GPSLat;
    private String GPSLng;
    private String GPSAcc;
    private String GPSTime;
    private Boolean Synced = false;
    private String SyncedDateTime ;
    

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


    public String getFormNo() {
        return this.FormNo;
    }

    public void setFormNo(String formNo) {
        this.FormNo = formNo;
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

    public String getVB() {
        return this.VB;
    }

    public void setVB(String VB) {
        this.VB = VB;
    }


    public String getVC() {
        return this.VC;
    }

    public void setVC(String VC) {
        this.VC = VC;
    }

    public String getVD() {
        return this.VD;
    }

    public void setVD(String VD) {
        this.VD = VD;
    }

    public String getVE() {
        return this.VE;
    }

    public void setVE(String VE) {
        this.VE = VE;
    }

    public String getIChild1() {
        return this.IChild1;
    }

    public void setIChild1(String IChild1) {
        this.IChild1 = IChild1;
    }

    public String getIChild2() {
        return this.IChild2;
    }

    public void setIChild2(String IChild2) {
        this.IChild2 = IChild2;
    }

    public String getIChild3() {
        return this.IChild3;
    }

    public void setIChild3(String IChild3) {
        this.IChild3 = IChild3;
    }

    public String getIChild4() {
        return this.IChild4;
    }

    public void setIChild4(String IChild4) {
        this.IChild4 = IChild4;
    }

    public String getIChild5() {
        return this.IChild5;
    }

    public void setIChild5(String IChild5) {
        this.IChild5 = IChild5;
    }

    public String getIChild6() {
        return this.IChild6;
    }

    public void setIChild6(String IChild6) {
        this.IChild6 = IChild6;
    }

    public String getDeviceID() {
        return this.DEVICEID;
    }

    public void setDeviceID(String deviceID) {
        this.DEVICEID = deviceID;
    }

    public String getGPSLat() {
        return this.GPSLat;
    }

    public void setGPSLat(String GPSLat) {
        this.GPSLat = GPSLat;
    }

    public String getGPSLng() {
        return this.GPSLng;
    }

    public void setGPSLng(String GPSLng) {
        this.GPSLng = GPSLng;
    }

    public String getGPSAcc() {
        return this.GPSAcc;
    }

    public void setGPSAcc(String GPSAcc) {
        this.GPSAcc = GPSAcc;
    }

    public String getGPSTime() {
        return this.GPSTime;
    }

    public void setGPSTime(String GPSTime) {
        this.GPSTime = GPSTime;
    }

    public Boolean getSynced() {
        return this.Synced;
    }

    public void setSynced(Boolean Synced) {
        this.Synced = Synced;
    }

    public String getSyncedDateTime() {
        return this.SyncedDateTime;
    }

    public void setSyncedDateTime(String SyncedDateTime) {
        this.SyncedDateTime = SyncedDateTime;
    }

    public String getVA101() {
        return this.VA_101;
    }
    public void setVA101(String va101) {
        this.VA_101 = va101;
    }


    public String getVA101time() {
        return this.VA_101TIME;
    }
    public void setVA101Time(String va101time) {
        this.VA_101TIME = va101time;
    }
    public String getVA102() {
        return this.VA_102;
    }

    public void setVA102(String va102) {
        this.VA_102 = va102;
    }

    public String getVA109() {
        return this.VA_109;
    }

    public void setVA109(String va109) {
        this.VA_109 = va109;
    }

    public static abstract class VIRForm implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String _ID = "_id";
        public static final String COLUMN_NAME_FORMNO = "va_frmno";
        public static final String COLUMN_NAME_VA_101 = "va_101";
        public static final String COLUMN_NAME_VA_101TIME = "va_101time";
        public static final String COLUMN_NAME_VA_102 = "va_102";
        public static final String COLUMN_NAME_VA_01 = "va_01";
        public static final String COLUMN_NAME_VA_02 = "va_02";
        public static final String COLUMN_NAME_VA_03 = "va_03";
        public static final String COLUMN_NAME_VA_04 = "va_04";
        public static final String COLUMN_NAME_VA_109 = "va_109";
        public static final String COLUMN_NAME_VB = "vb";
        public static final String COLUMN_NAME_VC = "vc";
        public static final String COLUMN_NAME_VD = "vd";
        public static final String COLUMN_NAME_VE = "ve";
        public static final String COLUMN_NAME_ICHILD_1 = "ichild1";
        public static final String COLUMN_NAME_ICHILD_2 = "ichild2";
        public static final String COLUMN_NAME_ICHILD_3 = "ichild3";
        public static final String COLUMN_NAME_ICHILD_4 = "ichild4";
        public static final String COLUMN_NAME_ICHILD_5 = "ichild5";
        public static final String COLUMN_NAME_ICHILD_6 = "ichild6";
        public static final String COLUMN_NAME_DEVICE_ID = "device_id";
        public static final String COLUMN_NAME_GPS_LAT = "gps_lat";
        public static final String COLUMN_NAME_GPS_LNG = "gps_lng";
        public static final String COLUMN_NAME_GPS_ACCURACY = "gps_accuracy";
        public static final String COLUMN_NAME_GPS_TIME = "gps_time";
        public static final String COLUMN_NAME_SYNCED = "synced";
        public static final String COLUMN_NAME_SYNCED_DATE_TIME = "synced_date_time";

    }
}
