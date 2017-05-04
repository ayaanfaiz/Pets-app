package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.pets.data.PetContract.PetEntry;

import static android.R.attr.version;

/**
 * Created by AYAAN on 4/20/2017.
 */

public class  PetDBHelper extends SQLiteOpenHelper {
    public static final String INTEGER_TYPE = " INTEGER";
    public static final String COMMA = ",";
    public static final String TEXT_TYPE = " TEXT";
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "shelter .db";
    public PetDBHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE "+PetEntry.TABLE_NAME + " ("
                + PetContract.PetEntry._ID + INTEGER_TYPE+" PRIMARY KEY AUTOINCREMENT"+COMMA
                + PetContract.PetEntry.COLUMN_PET_NAME +TEXT_TYPE+" NOT NULL"+COMMA
                + PetEntry.COLUMN_PET_BREED + TEXT_TYPE+COMMA
                + PetEntry.COLUMN_PET_GENDER + INTEGER_TYPE+" NOT NULL"+COMMA
                + PetEntry.COLUMN_PET_WEIGHT + INTEGER_TYPE+" NOT NULL DEFAULT 0);";
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
