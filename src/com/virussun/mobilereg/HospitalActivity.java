package com.virussun.mobilereg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
public class HospitalActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hospital);
		
		ListView lv = (ListView) findViewById(R.id.listHospital);
		EditText search = (EditText) findViewById(R.id.search);
		
		final int a=getIntent().getIntExtra("option", 0);
		SimpleAdapter adapter = new SimpleAdapter(this, createHospitalList(),
				android.R.layout.simple_list_item_2, new String[] { "name",
						"adress" }, new int[] { android.R.id.text1,
						android.R.id.text2 });

		lv.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> view, View v, int position,long id){
				
				final int a = getIntent().getIntExtra("option", 0);
				
				if (a == 1){ // расписание
					Intent fd = new Intent(HospitalActivity.this,DivisionActivity.class);
					fd.putExtra("hospital",position);
					fd.putExtra("option",getIntent().getIntExtra("option", 0));
					startActivity(fd);
				}
				if (a == 3) {startActivity    (new Intent(HospitalActivity.this,	MyMapActivity.class));}
			}
			
			});
		
		lv.setAdapter(adapter);
		lv.setTextFilterEnabled(true);
//	     search.addTextChangedListener(new TextWatcher()
//	    {
//
//
//	        @Override
//	        public void onTextChanged( CharSequence arg0, int arg1, int arg2, int arg3)
//	        {
//	            // TODO Auto-generated method stub
//
//	        }
//
//
//
//	        @Override
//	        public void beforeTextChanged( CharSequence arg0, int arg1, int arg2, int arg3)
//	        {
//	            // TODO Auto-generated method stub
//
//	        }
//
//
//
//	        @Override
//	        public void afterTextChanged( Editable arg0)
//	        {
//	            // TODO Auto-generated method stub
//	        	HospitalActivity.this.adapter.getFilter().filter(arg0);
//
//	        }
//	    });
//
//	
		}
	

	private List<Map<String, ?>> createHospitalList() {
		final int b = getIntent().getIntExtra("region", 0);
		List<Map<String, ?>> items = new ArrayList<Map<String, ?>>();

		for (Hospital s : Objects.hospitals) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("name", s.getName());
			map.put("adress", s.getAdress());
			items.add(map);
		}

		return items;
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_hospital, menu);
		return true;
	}
}
