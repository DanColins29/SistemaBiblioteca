package br.multitask.sistemabiblioteca;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBase extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATA_LIBRARY = "db_library";

    private static final String TABLE_BOOK = "tb_book";
    private static final String COL_CODE = "code";
    private static final String COL_NAME = "name";
    private static final String COL_DESC = "description";


    public DataBase(@Nullable Context context) {
        super(context, DATA_LIBRARY, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_COL = "CREATE TABLE " +TABLE_BOOK+ " ("+COL_CODE+" INTEGER PRIMARY KEY, "+COL_NAME+" TEXT,"
                +COL_DESC+" TEXT,"+COL_DESC+" TEXT)";

        db.execSQL(QUERY_COL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //CRUD
    void addBook(Livro l){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_NAME, l.getName());
        values.put(COL_CODE, l.getCod());
        values.put(COL_DESC, l.getDesc());

        db.insert(TABLE_BOOK, null, values);
        db.close();
    }

    void delBook(Livro l){
        SQLiteDatabase db = this.getReadableDatabase();
        db.delete(TABLE_BOOK, COL_CODE + " = ?", new String[]{String .valueOf(l.getCod())});
    }
}
