package com.example.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper{
	
	public static final String CREATE_ADMIN = "create table Admin("
			+"telnum integer primary key, "
			+"password char(10), "
			+"name text)";
	
	private Context mContext;
		
	public MyDatabaseHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
		mContext = context;
	}
	
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL(CREATE_ADMIN);
		Toast.makeText(mContext, "Create succeeded", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
		
	}
	
	

}
