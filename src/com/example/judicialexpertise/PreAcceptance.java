package com.example.judicialexpertise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class PreAcceptance extends Activity{
	
	private EditText name;
	
	private EditText tel;
	
	private EditText identificationContent;
	
	private Button upload;
	
	private Button submit;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.pre_acceptance);
		name = (EditText)findViewById(R.id.name);
		tel = (EditText)findViewById(R.id.tel);
		identificationContent = (EditText)findViewById(R.id.identificationContent);
		upload = (Button)findViewById(R.id.upload);
		submit = (Button)findViewById(R.id.submit);
	}

}
