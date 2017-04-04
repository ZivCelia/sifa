package com.example.judicialexpertise;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class Main extends Activity{
	
	private Button preAcceptance;
	
	private Button examine;
	
	private Button closed;
	
	private Button caseInquiry;
	
	private Button delay;
	
	private Button termination;
	
	private Button selfServicePayment;
	
	private Button personalCenter;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		preAcceptance = (Button)findViewById(R.id.button1);
		examine = (Button)findViewById(R.id.button2);
		closed = (Button)findViewById(R.id.button3);
		caseInquiry = (Button)findViewById(R.id.button4);
		delay = (Button)findViewById(R.id.button5);
		termination = (Button)findViewById(R.id.button6);
		selfServicePayment = (Button)findViewById(R.id.button7);
		personalCenter = (Button)findViewById(R.id.button8);
		
		/*
		 * 预受理
		 */
		preAcceptance.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this,PreAcceptance.class);
				startActivity(intent);
			}
		});
		/*
		 * 审核
		 */
		examine.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this,Examine.class);
				startActivity(intent);
				
			}
		});
		
		/*
		 * 延期
		 */
		delay.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this,Delay.class);
				startActivity(intent);
				
			}
		});
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 按返回键之后的弹窗
	 */
	//引用的代码
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (((keyCode == KeyEvent.KEYCODE_BACK) ||
(keyCode == KeyEvent.KEYCODE_HOME))
&& event.getRepeatCount() == 0) {
               dialog_Exit(Main.this);
        }
        return false;
       
        //end onKeyDown
 }

 public static void dialog_Exit(Context context) {
  AlertDialog.Builder builder = new Builder(context);
  builder.setMessage("确定要退出吗?");
  builder.setTitle("提示");
  builder.setIcon(android.R.drawable.ic_dialog_alert);
  builder.setPositiveButton("确认",
          new DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int which) {
                  dialog.dismiss();
                  android.os.Process.killProcess(android.os.Process
                          .myPid());
              }
          });
 
  builder.setNegativeButton("取消",
          new android.content.DialogInterface.OnClickListener() {
              public void onClick(DialogInterface dialog, int which) {
                  dialog.dismiss();
              }
          });
 
  builder.create().show();
}
	
	
	

}
