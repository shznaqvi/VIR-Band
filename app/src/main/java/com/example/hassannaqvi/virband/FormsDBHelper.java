package com.example.hassannaqvi.virband;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.hassannaqvi.virband.FormsContract.VIRForm;
import com.example.hassannaqvi.virband.OtherChildContract.OCs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by hassan.naqvi on 6/24/2016.
 */
public class FormsDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 7;
    public static final String DATABASE_NAME = "vir_band.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_FORMS =
            "CREATE TABLE " + VIRForm.TABLE_NAME + " (" +
                    VIRForm._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    VIRForm.COLUMN_NAME_FORMNO + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_01 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_101 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_101TIME + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_102 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_105 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_02 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_03 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_04 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_109 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VB + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VC + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VD + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VE + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_ICHILD_1 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_ICHILD_2 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_ICHILD_3 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_ICHILD_4 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_ICHILD_5 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_ICHILD_6 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_DEVICE_ID + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_LAT + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_LNG + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_ACCURACY + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_TIME + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_SYNCED + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_SYNCED_DATE_TIME +
                    " )";

    private static final String SQL_CREATE_OCS =
            "CREATE TABLE " + OCs.TABLE_NAME + " (" +
                    OCs._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    OCs.COLUMN_NAME_FORMNO + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OC_ID + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OC_01 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OC_02 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OC_03 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OC + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OCV1 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OCV2 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OCV3 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OCV4 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OCV5 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_OCV6 + TEXT_TYPE + COMMA_SEP +
                    OCs.COLUMN_NAME_DEVICE_ID + TEXT_TYPE +
                    " )";

    private static final String SQL_DELETE_FORMS =
            "DROP TABLE IF EXISTS " + VIRForm.TABLE_NAME;

    private static final String SQL_DELETE_OCS =
            "DROP TABLE IF EXISTS " + OCs.TABLE_NAME;

    public static String DB_FORM_ID;
    public static String DB_OCS_ID;

    public FormsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);
        db.execSQL(SQL_CREATE_OCS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_FORMS);
        db.execSQL(SQL_DELETE_OCS);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public Long lastInsertId() {
        Long id = null;
        SQLiteDatabase db = this.getWritableDatabase();
        String qry = "SELECT last_insert_rowid()";
        Cursor c = db.rawQuery(qry, null);
        if (c != null && c.moveToFirst()) {
            id = Long.valueOf(c.getString(0));
            c.close();
        } else {
            id = Long.valueOf(-1);
        }


        return id;
    }

    public Long addForm(FormsContract fc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_FORMNO, fc.getFormNo());
        //values.put(VIRForm._ID, fc.getID().toString());
        values.put(VIRForm.COLUMN_NAME_VA_01, fc.getVA01());
        values.put(VIRForm.COLUMN_NAME_VA_101, fc.getVA101());
        values.put(VIRForm.COLUMN_NAME_VA_101TIME, fc.getVA101time());
        values.put(VIRForm.COLUMN_NAME_VA_102, fc.getVA102());
        values.put(VIRForm.COLUMN_NAME_VA_105, fc.getVA105());
        values.put(VIRForm.COLUMN_NAME_VA_02, fc.getVA02());
        values.put(VIRForm.COLUMN_NAME_VA_03, fc.getVA03());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_109, fc.getVA109());
        values.put(VIRForm.COLUMN_NAME_VB, fc.getVB());
        values.put(VIRForm.COLUMN_NAME_VC, fc.getVC());
        values.put(VIRForm.COLUMN_NAME_VD, fc.getVD());
        values.put(VIRForm.COLUMN_NAME_VE, fc.getVE());
        values.put(VIRForm.COLUMN_NAME_ICHILD_1, fc.getIChild1());
        values.put(VIRForm.COLUMN_NAME_ICHILD_2, fc.getIChild2());
        values.put(VIRForm.COLUMN_NAME_ICHILD_3, fc.getIChild3());
        values.put(VIRForm.COLUMN_NAME_ICHILD_4, fc.getIChild4());
        values.put(VIRForm.COLUMN_NAME_ICHILD_5, fc.getIChild5());
        values.put(VIRForm.COLUMN_NAME_ICHILD_6, fc.getIChild6());
        values.put(VIRForm.COLUMN_NAME_DEVICE_ID, fc.getDeviceID());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, fc.getGPSTime());


// Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                VIRForm.TABLE_NAME,
                VIRForm.COLUMN_NAME_NULLABLE,
                values);
        DB_FORM_ID = String.valueOf(newRowId);
        return newRowId;
    }

    public Long addOCS(OtherChildContract oc) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_FORMNO, oc.getFormID());
        values.put(OCs.COLUMN_NAME_OC_ID, oc.getOC_ID());
        values.put(OCs.COLUMN_NAME_OC_01, oc.getOC_01());
        values.put(OCs.COLUMN_NAME_OC_02, oc.getOC_02());
        values.put(OCs.COLUMN_NAME_OC_03, oc.getOC_03());
        values.put(OCs.COLUMN_NAME_OC, oc.getOC());
        values.put(OCs.COLUMN_NAME_OCV1, oc.getOCV1());
        values.put(OCs.COLUMN_NAME_OCV2, oc.getOCV2());
        values.put(OCs.COLUMN_NAME_OCV3, oc.getOCV3());
        values.put(OCs.COLUMN_NAME_OCV4, oc.getOCV4());
        values.put(OCs.COLUMN_NAME_OCV5, oc.getOCV5());
        values.put(OCs.COLUMN_NAME_OCV6, oc.getOCV6());

// Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                OCs.TABLE_NAME,
                OCs.COLUMN_NAME_NULLABLE,
                values);
        DB_OCS_ID = String.valueOf(newRowId);
        return newRowId;
    }

    public void deleteForm(Long formID) {
        String whereClause = VIRForm._ID + " = ?";
        String[] whereArgs = {String.valueOf(formID)};
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        db.delete(VIRForm.TABLE_NAME, whereClause, whereArgs);
        db.setTransactionSuccessful();
        db.endTransaction();
        db.close();
    }

    public void deleteAllForms() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.beginTransaction();
        db.delete(VIRForm.TABLE_NAME, null, null);
        db.setTransactionSuccessful();
        db.endTransaction();
        db.close();
    }

    public Collection<FormsContract> getAllForms() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VIRForm._ID,
                VIRForm.COLUMN_NAME_FORMNO,
                VIRForm.COLUMN_NAME_VA_101,
                VIRForm.COLUMN_NAME_VA_101TIME,
                VIRForm.COLUMN_NAME_VA_102,
                VIRForm.COLUMN_NAME_VA_105,
                VIRForm.COLUMN_NAME_VA_01,
                VIRForm.COLUMN_NAME_VA_02,
                VIRForm.COLUMN_NAME_VA_03,
                VIRForm.COLUMN_NAME_VA_04,
                VIRForm.COLUMN_NAME_VA_109,
                VIRForm.COLUMN_NAME_VB,
                VIRForm.COLUMN_NAME_VC,
                VIRForm.COLUMN_NAME_VD,
                VIRForm.COLUMN_NAME_VE,
                VIRForm.COLUMN_NAME_ICHILD_1,
                VIRForm.COLUMN_NAME_ICHILD_2,
                VIRForm.COLUMN_NAME_ICHILD_3,
                VIRForm.COLUMN_NAME_ICHILD_4,
                VIRForm.COLUMN_NAME_ICHILD_5,
                VIRForm.COLUMN_NAME_ICHILD_6,
                VIRForm.COLUMN_NAME_DEVICE_ID,
                VIRForm.COLUMN_NAME_GPS_LAT,
                VIRForm.COLUMN_NAME_GPS_LNG,
                VIRForm.COLUMN_NAME_GPS_ACCURACY,
                VIRForm.COLUMN_NAME_GPS_TIME,
                VIRForm.COLUMN_NAME_SYNCED,
                VIRForm.COLUMN_NAME_SYNCED_DATE_TIME


        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                VIRForm._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    VIRForm.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC.add(hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public Collection<OtherChildContract> getAllOCs() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                OCs._ID,
                OCs.COLUMN_NAME_FORMNO,
                OCs.COLUMN_NAME_OC_ID,
                OCs.COLUMN_NAME_OC_01,
                OCs.COLUMN_NAME_OC_02,
                OCs.COLUMN_NAME_OC_03,
                OCs.COLUMN_NAME_OC,
                OCs.COLUMN_NAME_OCV1,
                OCs.COLUMN_NAME_OCV2,
                OCs.COLUMN_NAME_OCV3,
                OCs.COLUMN_NAME_OCV4,
                OCs.COLUMN_NAME_OCV5,
                OCs.COLUMN_NAME_OCV6,
                OCs.COLUMN_NAME_DEVICE_ID
        };
        String whereClause = null;
        String[] whereArgs = null;
        String groupBy = null;
        String having = null;

        String orderBy =
                OCs._ID + " ASC";

        Collection<OtherChildContract> allOC = new ArrayList<OtherChildContract>();
        try {
            c = db.query(
                    OCs.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allOC.add(hydrateOC(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allOC;
    }

    public Collection<FormsContract> getAllFormsToSync() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = null;
        String[] columns = {
                VIRForm._ID,
                VIRForm.COLUMN_NAME_FORMNO,
                VIRForm.COLUMN_NAME_VA_101,
                VIRForm.COLUMN_NAME_VA_101TIME,
                VIRForm.COLUMN_NAME_VA_102,
                VIRForm.COLUMN_NAME_VA_105,
                VIRForm.COLUMN_NAME_VA_01,
                VIRForm.COLUMN_NAME_VA_02,
                VIRForm.COLUMN_NAME_VA_03,
                VIRForm.COLUMN_NAME_VA_04,
                VIRForm.COLUMN_NAME_VA_109,
                VIRForm.COLUMN_NAME_VB,
                VIRForm.COLUMN_NAME_VC,
                VIRForm.COLUMN_NAME_VD,
                VIRForm.COLUMN_NAME_VE,
                VIRForm.COLUMN_NAME_ICHILD_1,
                VIRForm.COLUMN_NAME_ICHILD_2,
                VIRForm.COLUMN_NAME_ICHILD_3,
                VIRForm.COLUMN_NAME_ICHILD_4,
                VIRForm.COLUMN_NAME_ICHILD_5,
                VIRForm.COLUMN_NAME_ICHILD_6,
                VIRForm.COLUMN_NAME_DEVICE_ID,
                VIRForm.COLUMN_NAME_GPS_LAT,
                VIRForm.COLUMN_NAME_GPS_LNG,
                VIRForm.COLUMN_NAME_GPS_ACCURACY,
                VIRForm.COLUMN_NAME_GPS_TIME,
                VIRForm.COLUMN_NAME_SYNCED,
                VIRForm.COLUMN_NAME_SYNCED_DATE_TIME


        };
        String whereClause = VIRForm.COLUMN_NAME_SYNCED + "=?";
        String[] whereArgs = {"false"};
        String groupBy = null;
        String having = null;

        String orderBy =
                VIRForm._ID + " ASC";

        Collection<FormsContract> allFC = new ArrayList<FormsContract>();
        try {
            c = db.query(
                    VIRForm.TABLE_NAME,  // The table to query
                    columns,                   // The columns to return
                    whereClause,               // The columns for the WHERE clause
                    whereArgs,                 // The values for the WHERE clause
                    groupBy,                   // don't group the rows
                    having,                    // don't filter by row groups
                    orderBy                    // The sort order
            );
            while (c.moveToNext()) {
                allFC.add(hydrate(c));
            }
        } finally {
            if (c != null) {
                c.close();
            }
            if (db != null) {
                db.close();
            }
        }
        return allFC;
    }

    public int updateSB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_VB, sA.fc.getVB());
        values.put(VIRForm.COLUMN_NAME_FORMNO, sA.fc.getFormNo());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, sA.fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, sA.fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, sA.fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, sA.fc.getGPSTime());

// Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    public int updateSC() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_VC, sA.fc.getVC());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, sA.fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, sA.fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, sA.fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, sA.fc.getGPSTime());

// Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSD() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_VD, sA.fc.getVD());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, sA.fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, sA.fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, sA.fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, sA.fc.getGPSTime());

// Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateSE() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for Section E
        ContentValues values = new ContentValues();

        values.put(VIRForm.COLUMN_NAME_VA_109, sA.fc.getVA109());
        values.put(VIRForm.COLUMN_NAME_VE, sA.fc.getVE());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, sA.fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, sA.fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, sA.fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, sA.fc.getGPSTime());

        // Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateIChild1() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_ICHILD_1, sA.fc.getIChild1());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, sA.fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, sA.fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, sA.fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, sA.fc.getGPSTime());

// Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateIChild2() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_ICHILD_2, sA.fc.getIChild2());

        // Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateIChild3() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_ICHILD_3, sA.fc.getIChild3());

        // Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateIChild4() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_ICHILD_4, sA.fc.getIChild4());

        // Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateIChild5() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_ICHILD_5, sA.fc.getIChild5());

        // Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateIChild6() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_ICHILD_6, sA.fc.getIChild6());

        // Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateOCV1() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_OCV1, sOCI.occ.getOCV1());

        // Which row to update, based on the ID
        String selection = OCs._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sOCI.occ.getID())};

        int count = db.update(OCs.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateOCV2() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_OCV2, sOCI.occ.getOCV2());

        // Which row to update, based on the ID
        String selection = OCs._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sOCI.occ.getID())};

        int count = db.update(OCs.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateOCV3() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_OCV3, sOCI.occ.getOCV3());

        // Which row to update, based on the ID
        String selection = OCs._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sOCI.occ.getID())};

        int count = db.update(OCs.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateOCV4() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_OCV4, sOCI.occ.getOCV4());

        // Which row to update, based on the ID
        String selection = OCs._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sOCI.occ.getID())};

        int count = db.update(OCs.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateOCV5() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_OCV5, sOCI.occ.getOCV5());

        // Which row to update, based on the ID
        String selection = OCs._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sOCI.occ.getID())};

        int count = db.update(OCs.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }

    public int updateOCV6() {
        SQLiteDatabase db = this.getReadableDatabase();

        // New value for one column
        ContentValues values = new ContentValues();
        values.put(OCs.COLUMN_NAME_OCV6, sOCI.occ.getOCV6());

        // Which row to update, based on the ID
        String selection = OCs._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sOCI.occ.getID())};

        int count = db.update(OCs.TABLE_NAME,
                values,
                selection,
                selectionArgs);
        return count;
    }


    private ContentValues getContentValues(FormsContract fc) {
        ContentValues values = new ContentValues();
        values.put(VIRForm._ID, fc.getID());
        values.put(VIRForm.COLUMN_NAME_VA_01, fc.getVA01());
        values.put(VIRForm.COLUMN_NAME_VA_101, fc.getVA101());
        values.put(VIRForm.COLUMN_NAME_VA_101TIME, fc.getVA101time());
        values.put(VIRForm.COLUMN_NAME_VA_102, fc.getVA102());
        values.put(VIRForm.COLUMN_NAME_VA_105, fc.getVA105());
        values.put(VIRForm.COLUMN_NAME_VA_02, fc.getVA02());
        values.put(VIRForm.COLUMN_NAME_VA_03, fc.getVA03());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_109, fc.getVA109());
        values.put(VIRForm.COLUMN_NAME_VB, fc.getVB());
        values.put(VIRForm.COLUMN_NAME_VC, fc.getVC());
        values.put(VIRForm.COLUMN_NAME_VD, fc.getVD());
        values.put(VIRForm.COLUMN_NAME_VE, fc.getVE());
        values.put(VIRForm.COLUMN_NAME_ICHILD_1, fc.getIChild1());
        values.put(VIRForm.COLUMN_NAME_ICHILD_2, fc.getIChild2());
        values.put(VIRForm.COLUMN_NAME_ICHILD_3, fc.getIChild3());
        values.put(VIRForm.COLUMN_NAME_ICHILD_4, fc.getIChild4());
        values.put(VIRForm.COLUMN_NAME_ICHILD_5, fc.getIChild5());
        values.put(VIRForm.COLUMN_NAME_ICHILD_6, fc.getIChild6());
        values.put(VIRForm.COLUMN_NAME_DEVICE_ID, fc.getDeviceID());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, fc.getGPSTime());
        values.put(VIRForm.COLUMN_NAME_SYNCED, String.valueOf(fc.getSynced()));
        values.put(VIRForm.COLUMN_NAME_SYNCED_DATE_TIME, fc.getSyncedDateTime());

        return values;
    }

    private FormsContract hydrate(Cursor c) {
        FormsContract fc = new FormsContract(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_FORMNO)));
        fc.setID(c.getLong(c.getColumnIndex(VIRForm._ID)));
        fc.setVA101(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_101)));
        fc.setVA101Time(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_101TIME)));
        fc.setVA102(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_102)));
        fc.setVA105(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_105)));
        fc.setVA01(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_01)));
        fc.setVA02(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_02)));
        fc.setVA03(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_03)));
        fc.setVA04(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_04)));
        fc.setVA109(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_109)));
        fc.setVB(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VB)));
        fc.setVC(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VC)));
        fc.setVD(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VD)));
        fc.setVE(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VE)));
        fc.setIChild1(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_ICHILD_1)));
        fc.setIChild2(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_ICHILD_2)));
        fc.setIChild3(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_ICHILD_3)));
        fc.setIChild4(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_ICHILD_4)));
        fc.setIChild5(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_ICHILD_5)));
        fc.setIChild6(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_ICHILD_6)));
        fc.setDeviceID(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_DEVICE_ID)));
        fc.setGPSLat(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_LAT)));
        fc.setGPSLng(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_LNG)));
        fc.setGPSAcc(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_ACCURACY)));
        fc.setGPSTime(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_TIME)));
        fc.setSynced(Boolean.valueOf(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_SYNCED))));
        fc.setSyncedDateTime(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_SYNCED_DATE_TIME)));

        return fc;
    }

    private OtherChildContract hydrateOC(Cursor c) {
        OtherChildContract oc = new OtherChildContract(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_FORMNO)));
        oc.setID(c.getLong(c.getColumnIndex(OCs._ID)));
        oc.setOC_01(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OC_01)));
        oc.setOC_02(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OC_02)));
        oc.setOC_03(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OC_03)));
        oc.setOC(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OC)));
        oc.setOCV1(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OCV1)));
        oc.setOCV2(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OCV2)));
        oc.setOCV3(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OCV3)));
        oc.setOCV4(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OCV4)));
        oc.setOCV5(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OCV5)));
        oc.setOCV6(c.getString(c.getColumnIndex(OCs.COLUMN_NAME_OCV6)));
        oc.setDeviceID(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_DEVICE_ID)));

        return oc;
    }

    public ArrayList<Cursor> getData(String Query) {
        //get writable database
        SQLiteDatabase sqlDB = this.getWritableDatabase();
        String[] columns = new String[]{"mesage"};
        //an array list of cursor to save two cursors one has results from the query
        //other cursor stores error message if any errors are triggered
        ArrayList<Cursor> alc = new ArrayList<Cursor>(2);
        MatrixCursor Cursor2 = new MatrixCursor(columns);
        alc.add(null);
        alc.add(null);


        try {
            String maxQuery = Query;
            //execute the query results will be save in Cursor c
            Cursor c = sqlDB.rawQuery(maxQuery, null);


            //add value to cursor2
            Cursor2.addRow(new Object[]{"Success"});

            alc.set(1, Cursor2);
            if (null != c && c.getCount() > 0) {


                alc.set(0, c);
                c.moveToFirst();

                return alc;
            }
            return alc;
        } catch (SQLException sqlEx) {
            Log.d("printing exception", sqlEx.getMessage());
            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + sqlEx.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        } catch (Exception ex) {

            Log.d("printing exception", ex.getMessage());

            //if any exceptions are triggered save the error message to cursor an return the arraylist
            Cursor2.addRow(new Object[]{"" + ex.getMessage()});
            alc.set(1, Cursor2);
            return alc;
        }


    }
}
