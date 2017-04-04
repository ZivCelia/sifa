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

public class DelayApply extends Activity{
	
	private Button date;
	
	private EditText delayReason;
	
	private Button submit;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.delay_apply);
		date = (Button)findViewById(R.id.date);
		delayReason = (EditText)findViewById(R.id.delayReason);
		submit = (Button)findViewById(R.id.submit);
		
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(DelayApply.this,Delay.class);
				Toast.makeText(DelayApply.this, "…Í«Î≥…π¶", Toast.LENGTH_SHORT).show();
				startActivity(intent);
				finish();
			}
		});
		
	}

}
