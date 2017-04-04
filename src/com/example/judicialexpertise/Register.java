package com.example.judicialexpertise;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Register extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.register);
		Button register = (Button)findViewById(R.id.register);
		register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 点击立即注册后产生的事件
				
			}
		});
		}
	@Override
	public void onBackPressed(){
		Intent intent = new Intent(Register.this,Login.class);
		startActivity(intent);
	}
	

}
