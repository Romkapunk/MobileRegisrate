package com.virussun.mobilereg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class DivisionActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final int hosNum= getIntent().getIntExtra("hospital", 0);
		
		setContentView(R.layout.activity_division);
		
		ListView lv = (ListView) findViewById(R.id.listDivision);
		TextView nameHosp = (TextView)findViewById(R.id.namehosp);
		nameHosp.setText(Objects.hospitals[hosNum].getName());
		TextView addresHosp = (TextView)findViewById(R.id.addreshosp);
		addresHosp.setText(Objects.hospitals[hosNum].getAdress());
		Button callnum=(Button) findViewById(R.id.callnumber);
		callnum.setText("Тел. "+Objects.hospitals[hosNum].getPhone());
		callnum.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {			//звонилка
				Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+Objects.hospitals[hosNum].getPhone())); // грузим номер телефона
				startActivity(intent);
			}
		});
		
		
		SimpleAdapter adapter = new SimpleAdapter(this, createDivisionList(),
				android.R.layout.simple_list_item_2, new String[] {"name",
			"tickets" }, new int[] { android.R.id.text1,
						android.R.id.text2 });

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> view, View v, int position,
					long id) {
				Intent hc = new Intent(DivisionActivity.this,DoctorActivity.class);
				hc.putExtra("division", position);
				hc.putExtra("hospital",getIntent().getIntExtra("hospital", 0));
				hc.putExtra("option",getIntent().getIntExtra("option", 0));
				startActivity (hc);
				
			}
		});

		lv.setAdapter(adapter);
	}

	private List<Map<String, ?>> createDivisionList() {
	final int hosNum = getIntent().getIntExtra("hospital", 0);
	List<Map<String, ?>> items = new ArrayList<Map<String, ?>>();

	for (Division s : Objects.hospitals[hosNum].divisions) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", s.getName());
		map.put("tickets", s.getCountTicketFree());
		items.add(map);
	}

	return items;
}

//	@Override
//	protected void onListItemClick(ListView l, View v, int position, long id)
//	{
//		Intent hc = new Intent(DivisionActivity.this,DoctorActivity.class);
//		hc.putExtra("division", position);
//		hc.putExtra("hospital",getIntent().getIntExtra("hospital", 0));
//		hc.putExtra("option",getIntent().getIntExtra("option", 0));
//		startActivity (hc);
//	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_division, menu);
		return true;
	}
}
