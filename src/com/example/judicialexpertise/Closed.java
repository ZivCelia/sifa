package com.example.judicialexpertise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;



public class Closed extends Activity{
	

	private Button tell;
	
	private Button download;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.closed);
	
		
		tell = (Button)findViewById(R.id.telLine);
		download = (Button)findViewById(R.id.download);
		
		
		
		/*
		tell.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Closed.this,Notice.class);
				startActivity(intent);
			
			}
		});
		
		*/
        download.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(Closed.this, "œ¬‘ÿ≥…π¶", Toast.LENGTH_SHORT).show();
			
			}

	});


	}

	}

