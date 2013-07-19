package com.virussun.mobilereg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegistrateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registrate);
	     final Button regButton = (Button) findViewById(R.id.Continuebutt);
				regButton.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View arg0) {
					 final EditText text1 = (EditText) findViewById(R.id.captcha);
					 if (text1.getText().toString().compareToIgnoreCase("smwm")==0)
					 {
						 //переход на новый улпшуетыяеь
						 Intent fd = new Intent(RegistrateActivity.this, DivisionActivity.class);
							fd.putExtra("hospital",getIntent().getIntExtra("hospital", 0));
							fd.putExtra("option",getIntent().getIntExtra("option", 0));
							startActivity(fd);
					 }else
					 {
						 text1.setText("Неверный Captcha код!");
					 }
					}
				});
		    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_registrate, menu);
		return true;
	}

}
