package com.virussun.mobilereg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RegionActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final int a=getIntent().getIntExtra("option", 0);
        setContentView(R.layout.activity_region);
        
        
		final Button rekButton = (Button) findViewById(R.id.buttonOmsk);
		rekButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent rasp= new Intent(RegionActivity.this,	HospitalActivity.class);
				rasp.putExtra("option", a);
				rasp.putExtra("region",2);
				startActivity(rasp);
			}
		});
		final Button refButton = (Button) findViewById(R.id.buttonObl);
		refButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent rasp= new Intent(RegionActivity.this,	HospitalActivity.class);
				rasp.putExtra("option", a);
				rasp.putExtra("region",3);
				startActivity(rasp);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_region, menu);
        return true;
    }
}
