package com.example.judicialexpertise;



import com.example.db.MyDatabaseHelper;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity{
	
	private MyDatabaseHelper dbHelper;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.register);
		dbHelper = new MyDatabaseHelper(this,"JudicialExpertise.db",null,1);
		EditText tel = (EditText)findViewById(R.id.tel);
		EditText nikename = (EditText)findViewById(R.id.nikename);
		EditText password = (EditText)findViewById(R.id.password);
		EditText confirmPassword = (EditText)findViewById(R.id.confirmPassword);
		final String nikename1 = nikename.getText().toString();
		final String tel1 = tel.getText().toString();
		final String password1 = password.getText().toString();
		String confirmPassword1 = confirmPassword.getText().toString();
	    Button register = (Button)findViewById(R.id.register);
		
		
		register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 点击立即注册后产生的事件
				
				if (CheckIsDataAlreadyInDBorNot(tel1)) {
		           Toast.makeText(Register.this, "该用户名已被注册，请重新输入", Toast.LENGTH_SHORT).show();
		          }
		        else {
		            if (register(tel1,nikename1, password1)) {
		                Toast.makeText(Register.this, "注册成功", Toast.LENGTH_SHORT).show();
		            }
					
		        }
			}});
		}
		
		
		//向数据库插入数据
	    public boolean register(String telnum, String name,String password){
	        SQLiteDatabase db= dbHelper.getWritableDatabase();
	        /*String sql = "insert into userData(name,password) value(?,?)";
	        Object obj[]={username,password};
	        db.execSQL(sql,obj);*/
	        ContentValues values=new ContentValues();
	        values.put("telnum", telnum);
	        values.put("name",name);
	        values.put("password",password);
	        db.insert("Admin",null,values);
	        db.close();
	        //db.execSQL("insert into userData (name,password) values (?,?)",new String[]{username,password});
	        return true;
	    }
		
		
	  //检验用户名是否已存在
	    public boolean CheckIsDataAlreadyInDBorNot(String value){
	        SQLiteDatabase db=dbHelper.getWritableDatabase();
	        String Query = "Select * from Admin where telnum =?";
	        Cursor cursor = db.rawQuery(Query,new String[] { value });
	        if (cursor.getCount()>0){
	            cursor.close();
	            return  true;
	        }
	        cursor.close();
	        return false;
	    }
		
		
		
		
		
		
		
	@Override
	public void onBackPressed(){
		Intent intent = new Intent(Register.this,Login.class);
		startActivity(intent);
	}
	

}
