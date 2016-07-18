package com.example.hassannaqvi.virband;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hassannaqvi.virband.FormsContract.VIRForm;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by hassan.naqvi on 6/24/2016.
 */
public class FormsDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
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
                    VIRForm.COLUMN_NAME_VA_02 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_03 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_04 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_109 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VB + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VC + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VD + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VE + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_DEVICE_ID + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_LAT + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_LNG + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_ACCURACY + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_GPS_TIME + TEXT_TYPE +

                    " )";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + VIRForm.TABLE_NAME;
    public static String DB_FORM_ID;


    public FormsDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_FORMS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
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
        values.put(VIRForm.COLUMN_NAME_VA_02, fc.getVA02());
        values.put(VIRForm.COLUMN_NAME_VA_03, fc.getVA03());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_109, fc.getVA109());
        values.put(VIRForm.COLUMN_NAME_VB, fc.getVB());
        values.put(VIRForm.COLUMN_NAME_VC, fc.getVC());
        values.put(VIRForm.COLUMN_NAME_VD, fc.getVD());
        values.put(VIRForm.COLUMN_NAME_VE, fc.getVE());
        values.put(VIRForm.COLUMN_NAME_DEVICE_ID, fc.getDeviceID());
        values.put(VIRForm.COLUMN_NAME_GPS_LAT, fc.getGPSLat());
        values.put(VIRForm.COLUMN_NAME_GPS_LNG, fc.getGPSLng());
        values.put(VIRForm.COLUMN_NAME_GPS_ACCURACY, fc.getGPSAcc());
        values.put(VIRForm.COLUMN_NAME_GPS_TIME, fc.getGPSTime());
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
                VIRForm.COLUMN_NAME_VA_01,
                VIRForm.COLUMN_NAME_VA_02,
                VIRForm.COLUMN_NAME_VA_03,
                VIRForm.COLUMN_NAME_VA_04,
                VIRForm.COLUMN_NAME_VB,
                VIRForm.COLUMN_NAME_VC,
                VIRForm.COLUMN_NAME_VD,
                VIRForm.COLUMN_NAME_VE

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

    public int updateSB() {
        SQLiteDatabase db = this.getReadableDatabase();

// New value for one column
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_VB, sA.fc.getVB());

// Which row to update, based on the ID
        String selection = VIRForm._ID + " LIKE ?";
        String[] selectionArgs = {String.valueOf(sA.fc.getID())};

        int count = db.update(VIRForm.TABLE_NAME,
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
        values.put(VIRForm.COLUMN_NAME_VA_02, fc.getVA02());
        values.put(VIRForm.COLUMN_NAME_VA_03, fc.getVA03());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_109, fc.getVA109());
        values.put(VIRForm.COLUMN_NAME_VB, fc.getVB());
        values.put(VIRForm.COLUMN_NAME_VC, fc.getVC());
        values.put(VIRForm.COLUMN_NAME_VD, fc.getVD());
        values.put(VIRForm.COLUMN_NAME_VE, fc.getVE());
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
        fc.setVA01(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_01)));
        fc.setVA02(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_02)));
        fc.setVA03(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_03)));
        fc.setVA04(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_04)));
        fc.setVA109(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VA_109)));
        fc.setVB(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VB)));
        fc.setVC(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VC)));
        fc.setVD(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VD)));
        fc.setVE(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_VE)));
        fc.setDeviceID(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_DEVICE_ID)));
        fc.setGPSLat(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_LAT)));
        fc.setGPSLng(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_LNG)));
        fc.setGPSAcc(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_ACCURACY)));
        fc.setGPSTime(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_GPS_TIME)));
        fc.setSynced(Boolean.valueOf(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_SYNCED))));
        fc.setSyncedDateTime(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_SYNCED_DATE_TIME)));


        return fc;
    }


}
