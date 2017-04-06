package com.example.judicialexpertise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PersonalCenter extends Activity{
	
	private Button account;
	
	private Button password;
	
	private Button setting;
	
	private Button instruction;
	
	private Button connection;
	
	private Button exit;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.personalcenter);
		account = (Button)findViewById(R.id.button1);
		password = (Button)findViewById(R.id.button2);
		setting = (Button)findViewById(R.id.button3);
		instruction = (Button)findViewById(R.id.button4);
		connection = (Button)findViewById(R.id.button5);
		exit = (Button)findViewById(R.id.button6);


	account.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(PersonalCenter.this,Account.class);
			startActivity(intent);
			Toast.makeText(PersonalCenter.this, "请尽快完善个人账户信息", Toast.LENGTH_LONG).show();
		}
	});
	
	exit.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(PersonalCenter.this,Login.class);
			startActivity(intent);
			
		}
	});
	}
	}
