package com.example.judicialexpertise;




import com.example.db.MyDatabaseHelper;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity{
	
    private SharedPreferences pref;
	
	private SharedPreferences.Editor editor;
	
	private EditText telEdit;
	
	private EditText passwordEdit;
	
	private Button login;
	
	private CheckBox rememberPass;
	
	private TextView goToRegister;
	
	private MyDatabaseHelper dbHelper;
	
    
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login);
		dbHelper = new MyDatabaseHelper(this,"JudicialExpertise.db",null,1);
		pref = PreferenceManager.getDefaultSharedPreferences(this);
		telEdit = (EditText)findViewById(R.id.telEdit);
		passwordEdit = (EditText)findViewById(R.id.passwordEdit);
		login = (Button)findViewById(R.id.login);
		rememberPass = (CheckBox)findViewById(R.id.rememberPass);
		goToRegister = (TextView)findViewById(R.id.goToRegister);
		boolean isRemember = pref.getBoolean("remember_password", false);
		if (isRemember) {
			String tel = pref.getString("tel", "");
			String password = pref.getString("password", "");
			telEdit.setText(tel);
			passwordEdit.setText(password);
			rememberPass.setChecked(true);
		}
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String tel = telEdit.getText().toString();
				String password = passwordEdit.getText().toString();
				if(tel.equals("admin")&&password.equals("123456")){
					editor = pref.edit();
					if (rememberPass.isChecked()) {
						editor.putBoolean("remember_password", true);
						editor.putString("tel", tel);
						editor.putString("password", password);
						
						
						
					} else {
						editor.clear();
						

					}
					editor.commit();
					Intent intent = new Intent(Login.this,Main.class);
					Toast.makeText(Login.this, "登陆成功", Toast.LENGTH_SHORT).show();
					startActivity(intent);
					finish();
				}else{
					Toast.makeText(Login.this, "账号或密码不对", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		
		goToRegister.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Login.this,Register.class);
				startActivity(intent);
				
			}
		});
		
		
		
	}
	
	//验证登录
    public boolean login(String telnum,String password) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String sql = "select * from Admin where name=? and password=?";
        Cursor cursor = db.rawQuery(sql, new String[] {telnum, password});
        if (cursor.moveToFirst()) {
            cursor.close();
            return true;
        }
        return false;
    }

}
