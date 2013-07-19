package com.virussun.mobilereg;

import java.util.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class DoctorWeekActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_week);
        final int divNum= getIntent().getIntExtra("division", 0);
		final int hosNum= getIntent().getIntExtra("hospital", 0);
        final int docNum= getIntent().getIntExtra("doctor", 0);
        
        Doctor doctor = Objects.hospitals[hosNum].divisions[divNum].doctors[docNum];
        
        TextView nameDoctor = (TextView)findViewById(R.id.namedoc);
        nameDoctor.setText(Objects.hospitals[hosNum].divisions[divNum].doctors[docNum].getName());
        TextView cabinet = (TextView)findViewById(R.id.numCabinet);
        cabinet.setText(Objects.hospitals[hosNum].divisions[divNum].doctors[docNum].getCabinet());
        TextView uchastok = (TextView)findViewById(R.id.numUchastok);
        uchastok.setText(doctor.getUchastok());

        ListView lv = (ListView) findViewById(R.id.listWeek);
        SimpleAdapter adapter = new SimpleAdapter(this, createWeekList(),
                android.R.layout.simple_list_item_2, new String[] {"name",
                "b" }, new int[] { android.R.id.text1,
                android.R.id.text2 });
    }

    private List<Map<String, ?>> createWeekList() {
        final int divNum= getIntent().getIntExtra("division", 0);
        final int hosNum= getIntent().getIntExtra("hospital", 0);
        final int docNum= getIntent().getIntExtra("doctor", 0);
        List<Map<String, ?>> items = new ArrayList<Map<String, ?>>();

        for (WorkDay s : Objects.hospitals[hosNum].divisions[divNum].doctors[docNum].workDays) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("name", s.getDayOfMonth());
            map.put("b", s.getMonth());
            items.add(map);
        }
        return items;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_doctor_week, menu);
        return true;
    }
    }

