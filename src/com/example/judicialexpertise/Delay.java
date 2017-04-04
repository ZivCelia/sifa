package com.example.judicialexpertise;

import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Delay extends Activity{
	
	private TextView delayStatus;
	
	private Button yes;
	
	private Button no;
	
	protected void onCreate(Bundle savedInstancestate){
		super.onCreate(savedInstancestate);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.delay);
		delayStatus = (TextView)findViewById(R.id.delayStatus);
		yes = (Button)findViewById(R.id.yes);
		no = (Button)findViewById(R.id.no);
		yes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Delay.this,DelayApply.class);
				startActivity(intent);
				finish();
			}
		});
		
		no.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Delay.this,Main.class);
				startActivity(intent);
				finish();
			}
		});
	}
	

}
