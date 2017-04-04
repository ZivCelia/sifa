package com.example.judicialexpertise;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;

public class Examine extends Activity{
	
	private EditText temporaryNumber;
	
	private EditText identifiedPerson;
	
	private EditText identificationDepartment;
	
	private EditText acceptanceDate;
	
	private EditText detectionState;
	
	private EditText caseStatus;
	
	private EditText caseReturn;
	
	private EditText paymentAmount;
	
	private EditText paymentStatus;
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.examine);
		temporaryNumber = (EditText)findViewById(R.id.temporaryNumber);
		identifiedPerson = (EditText)findViewById(R.id.identifiedPerson);
		identificationDepartment = (EditText)findViewById(R.id.identificationDepartment);
		acceptanceDate = (EditText)findViewById(R.id.acceptanceDate);
		detectionState = (EditText)findViewById(R.id.detectionState);
		caseStatus = (EditText)findViewById(R.id.caseStatus);
		caseReturn = (EditText)findViewById(R.id.caseReturn);
		paymentAmount = (EditText)findViewById(R.id.paymentAmount);
		paymentStatus = (EditText)findViewById(R.id.paymentStatus);
	}

}
