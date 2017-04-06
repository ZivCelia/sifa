package com.example.judicialexpertise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Termination extends Activity{
	
	private Button yes;
	
	private Button no;
	protected void onCreate(Bundle savedInstancestate){
		super.onCreate(savedInstancestate);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.termination);
		yes = (Button)findViewById(R.id.yes);
		no = (Button)findViewById(R.id.no);
		yes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(Termination.this, "终止案件成功", Toast.LENGTH_SHORT).show();
			}
		});
		
		no.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Termination.this,Main.class);
				startActivity(intent);
				finish();
			}
		});
		
	}
	}
		


