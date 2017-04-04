package com.example.judicialexpertise;




import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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
	
	private EditText accountEdit;
	
	private EditText passwordEdit;
	
	private Button login;
	
	private CheckBox rememberPass;
	
	private TextView goToRegister;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login);
		pref = PreferenceManager.getDefaultSharedPreferences(this);
		accountEdit = (EditText)findViewById(R.id.accountEdit);
		passwordEdit = (EditText)findViewById(R.id.passwordEdit);
		login = (Button)findViewById(R.id.login);
		rememberPass = (CheckBox)findViewById(R.id.rememberPass);
		goToRegister = (TextView)findViewById(R.id.goToRegister);
		boolean isRemember = pref.getBoolean("remember_password", false);
		if (isRemember) {
			String account = pref.getString("account", "");
			String password = pref.getString("password", "");
			accountEdit.setText(account);
			passwordEdit.setText(password);
			rememberPass.setChecked(true);
		}
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String account = accountEdit.getText().toString();
				String password = passwordEdit.getText().toString();
				if(account.equals("admin")&&password.equals("123456")){
					editor = pref.edit();
					
					if (rememberPass.isChecked()) {
						editor.putBoolean("remember_password", true);
						editor.putString("account", account);
						editor.putString("password", password);
						
						
						
					} else {
						editor.clear();
						

					}
					
					editor.commit();
					Toast.makeText(Login.this, "登录成功", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(Login.this,Main.class);
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

}
