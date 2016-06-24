package com.example.hassannaqvi.virband;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hassannaqvi.virband.FormsContract.VIRForm;

/**
 * Created by hassan.naqvi on 6/24/2016.
 */
public class SQLiteDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "vir_band.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_FORMS =
            "CREATE TABLE " + VIRForm.TABLE_NAME + " (" +
                    VIRForm._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    VIRForm.COLUMN_NAME_FORM_ID + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_FORMNO + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_01 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_02 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_03 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VA_04 + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VC + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VD + TEXT_TYPE + COMMA_SEP +
                    VIRForm.COLUMN_NAME_VE + TEXT_TYPE + COMMA_SEP +


                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + VIRForm.TABLE_NAME;


    public SQLiteDBHelper(Context context) {
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

    private ContentValues getContentValues(FormsContract fc) {
        ContentValues values = new ContentValues();
        values.put(VIRForm.COLUMN_NAME_FORM_ID, fc.getID());
        values.put(VIRForm.COLUMN_NAME_VA_01, fc.getVA01());
        values.put(VIRForm.COLUMN_NAME_VA_02, fc.getVA02());
        values.put(VIRForm.COLUMN_NAME_VA_03, fc.getVA03());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());
        values.put(VIRForm.COLUMN_NAME_VA_04, fc.getVA04());

        return values;
    }

    private FormsContract hydrate(Cursor c) {
        FormsContract fc = new FormsContract(c.getString(c.getColumnIndex(VIRForm.COLUMN_NAME_FORM_ID)));
        fc.setID(c.getLong(c.getColumnIndex(VIRForm._ID)));


        return fc;
    }


}
