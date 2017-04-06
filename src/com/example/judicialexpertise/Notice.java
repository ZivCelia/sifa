package com.example.judicialexpertise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Notice extends Activity{
	

	
	private EditText circular;
	

	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.notice);
	
		circular = (EditText)findViewById(R.id.circular);
	
	
			
	

		
		
		
		
	}

}