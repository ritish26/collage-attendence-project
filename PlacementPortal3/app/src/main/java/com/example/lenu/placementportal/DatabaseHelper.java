package com.example.lenu.placementportal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by len u on 12/24/2018.
 */


public class DatabaseHelper extends SQLiteOpenHelper {
    // Database Name
    private static final String DATABASE_NAME = "student.db";

    // Contacts table name
    private static final String TABLE_NAME = "student_table";
    private static final String TABLE_NAME1 = "branch_table";
    private static final String TABLE_NAME2 = "ece_table";
    private static final String TABLE_NAME3 = "mech_table";
    private static final String TABLE_NAME4 = "civil_table";

    // Contacts Table Columns names
    private static final String COL_1 = "id";
    private static final String COL_2 = "name";
    private static final String COL_3 = "Rollno";
    private static final String COL_4=  "Branch";
    private static final String COL_5 = "companyname";
    private static final String COL_6 = "pacakge";
    private static final String COL_7 = "year";
    //branchtable
    private static final String COL_8 = "Company";
    private static final String COL_9 = "About";
    private static final String COL_10 = "Criteria";
    //ece
    private static final String COL_a = "Company1";
    private static final String COL_b = "About1";
    private static final String COL_c = "Criteria1";
    //mech
    private static final String COL_11 = "Company2";
    private static final String COL_12 = "About2";
    private static final String COL_13 = "Criteria2";
    //civil
    private static final String COL_14 = "Company3";
    private static final String COL_15 = "About3";
    private static final String COL_16 = "Criteria3";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,Rollno INTEGER,Branch TEXT,companyname TEXT,pacakge INTEGER,year INTEGER)");
        db.execSQL("create table " + TABLE_NAME1 + "(Company TEXT,About TEXT,Criteria TEXT)");
        db.execSQL("create table " + TABLE_NAME2 + "(Company1 TEXT,About1 TEXT,Criteria1 TEXT)");
        db.execSQL("create table " + TABLE_NAME3 + "(Company2 TEXT,About2 TEXT,Criteria2 TEXT)");
        db.execSQL("create table " + TABLE_NAME4 + "(Company3 TEXT,About3 TEXT,Criteria3 TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME4);
        onCreate(db);
    }

    public boolean insertData(String name,String Rollno,String Branch,String companyname,String pacakge,String year) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_2,name);
        values.put(COL_3,Rollno);
        values.put(COL_4,Branch);
        values.put(COL_5,companyname);
        values.put(COL_6,pacakge);
        values.put(COL_7,year);
        long result = db.insert(TABLE_NAME, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAlldata(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("Select *from student_table",null);
        return res;
    }

   public Cursor getRollno(String branch){
        SQLiteDatabase db=this.getWritableDatabase();
        String query= "Select *from student_table WHERE Rollno=' "+ branch+" ' ";
        Cursor res= db.rawQuery(query,null);
        return res;

    }
    public Cursor getYear(String y){
        SQLiteDatabase db=this.getWritableDatabase();
        String query= "Select *from student_table WHERE Year=' "+ y+" ' ";
        Cursor res= db.rawQuery(query,null);
        return res;

    }
    public boolean insertdata(String Company,String About,String Criteria) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_8,Company);
        values.put(COL_9,About);
        values.put(COL_10,Criteria);
        long result = db.insert(TABLE_NAME1, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAlldata1(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("Select *from branch_table",null);
        return res;
    }
    public boolean insertdata1(String Company,String About,String Criteria) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_a,Company);
        values.put(COL_b,About);
        values.put(COL_c,Criteria);
        long result = db.insert(TABLE_NAME2, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAlldata2(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("Select *from ece_table",null);
        return res;
    }
    public boolean insertdata2(String Company,String About,String Criteria) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_11,Company);
        values.put(COL_12,About);
        values.put(COL_13,Criteria);
        long result = db.insert(TABLE_NAME3, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAlldata3(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("Select *from mech_table",null);
        return res;
    }
    public boolean insertdata3(String Company,String About,String Criteria) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_14,Company);
        values.put(COL_15,About);
        values.put(COL_16,Criteria);
        long result = db.insert(TABLE_NAME4, null, values);
        if (result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAlldata4(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("Select *from mech_table",null);
        return res;
    }


}
