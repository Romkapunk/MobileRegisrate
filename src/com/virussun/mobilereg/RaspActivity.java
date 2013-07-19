package com.virussun.mobilereg;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class RaspActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rasp);
		 final int dayNum= getIntent().getIntExtra("day", 0);
		 final int divNum= getIntent().getIntExtra("division", 0);
		final int hosNum= getIntent().getIntExtra("hospital", 0);
	     final int docNum= getIntent().getIntExtra("doctor", 0);
	     String s1 = "�������� - " + Objects.hospitals[hosNum].getName();
	     String s2 = "��������� - " + Objects.hospitals[hosNum].divisions[divNum].getName();
	     String s3 = "���� - " + Objects.hospitals[hosNum].divisions[divNum].doctors[docNum].getName();
	     String day="";
	     if (dayNum==1) day = "�����������";
	     if (dayNum==2) day = "�������";
	     if (dayNum==3) day = "�����";
	     if (dayNum==4) day = "�������";
	     if (dayNum==5) day = "�������";
	     String s4 = "���� ������ - " + day;
	     String s = s1+ "\n"+ s2 + "\n"+ s3 + "\n"+ s4 + "\n�� ����������!";
	     TextView thu = (TextView)findViewById(R.id.congrtext);
	     thu.setText(s);
	     Button mon = (Button)findViewById(R.id.gotomain);
	        mon.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					Intent rasp=new Intent(RaspActivity.this,	MainActivity.class);
					startActivity(rasp);
				}
			});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_rasp, menu);
		return true;
	}

}
