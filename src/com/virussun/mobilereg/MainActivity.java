package com.virussun.mobilereg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button regButton = (Button) findViewById(R.id.buttonReg);
		regButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent rasp=new Intent(MainActivity.this,	RegionActivity.class);
				rasp.putExtra("option", 1);
				startActivity(rasp);
			}
		});
		
		final Button mapButton = (Button) findViewById(R.id.buttonMap);
		mapButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent rasp=new Intent(MainActivity.this,	RegionActivity.class);
				rasp.putExtra("option", 3);
				startActivity(rasp);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
