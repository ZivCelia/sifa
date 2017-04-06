package com.example.judicialexpertise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class Account extends Activity{
	
	private EditText accountEdit;
	
	private EditText name;
	
	private EditText telephoneNumber;
	
	private EditText id_number;
	
	private EditText mail;
	
	private EditText address;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.account);
		accountEdit = (EditText)findViewById(R.id.accountEdit);
		name = (EditText)findViewById(R.id.name);
		telephoneNumber = (EditText)findViewById(R.id.telephoneNumber);
		id_number = (EditText)findViewById(R.id.id_number);
		mail = (EditText)findViewById(R.id.mail);
		address = (EditText)findViewById(R.id.address);
		
	}
}
