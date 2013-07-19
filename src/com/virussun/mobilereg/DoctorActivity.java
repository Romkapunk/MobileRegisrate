package com.virussun.mobilereg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class DoctorActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final int divNum= getIntent().getIntExtra("division", 0);
		final int hosNum= getIntent().getIntExtra("hospital", 0);
		setContentView(R.layout.activity_doctor);
		ListView lv = (ListView) findViewById(R.id.listDoctor);
		TextView nameDivision = (TextView)findViewById(R.id.namediv);
		nameDivision.setText(Objects.hospitals[hosNum].divisions[divNum].getName());
		
		
//		final ArrayAdapter<Doctor> adapter = new ArrayAdapter<Doctor>(this,
//				android.R.layout.simple_list_item_1, Objects.hospitals[hosNum].divisions[divNum].doctors);
		SimpleAdapter adapter = new SimpleAdapter(this, createDoctorList(),
				android.R.layout.simple_list_item_2, new String[] {"name",
			"cabinet" }, new int[] { android.R.id.text1,
						android.R.id.text2 });

	
	
	
	lv.setOnItemClickListener(new OnItemClickListener(){
	@Override
	public void onItemClick(AdapterView<?> view, View v, int position,
			long id) {
		Intent hc = new Intent(DoctorActivity.this,	DoctorWeekActivity.class);
		hc.putExtra("doctor", position);
		hc.putExtra("division", getIntent().getIntExtra("division", 0));
		hc.putExtra("hospital",getIntent().getIntExtra("hospital", 0));
		hc.putExtra("option",getIntent().getIntExtra("option", 0));
		startActivity (hc);
	}
	});
	
	lv.setAdapter(adapter);
	
	}
	
	private List<Map<String, ?>> createDoctorList() {
		final int hosNum = getIntent().getIntExtra("hospital", 0);
		final int divNum= getIntent().getIntExtra("division", 0);
		List<Map<String, ?>> items = new ArrayList<Map<String, ?>>();

		for (Doctor s : Objects.hospitals[hosNum].divisions[divNum].doctors) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", s.getName());
			map.put("cabinet", s.getCabinet());
			items.add(map);
		}

		return items;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_doctor, menu);
		return true;
	}
}
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        final Button regButton = (Button) findViewById(R.id.continuebutt);
		regButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
			 final EditText text1 = (EditText) fintViewById(R.id.captcha);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_reg, menu);
        return true;
    }
}
*/
