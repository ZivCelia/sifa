package com.example.judicialexpertise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class Caseinquiry extends Activity{
	
	private EditText number;
	
	private EditText date;
	

	
	private Button search;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.caseinquiry );
		number = (EditText)findViewById(R.id.number);
		date = (EditText)findViewById(R.id.date);
	
		search = (Button)findViewById(R.id.search);
	}

}