package com.virussun.mobilereg;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Doctor {
	private String cabinet;
	private String name;
	private String uchastok;
	private String week[];
	public List<WorkDay> workDays = new ArrayList<WorkDay>();

	public void setCabinet(String a) {
		cabinet = a;
	}

	public void setUchastok(String a) {
		uchastok = a;
	}
	
	public void setName(String a) {
		name = a;
	}

//	public void setWeek() {
//		workDays[1] = new WorkDay();
//		
//
//	}
	
	public void addDay(int y, int m, int d, String a) {

		WorkDay wd =  new WorkDay();
        wd.setYear(y);
        wd.setMonth(m);
        wd.setDay(d);
		wd.setPeriodWork(a);
		workDays.add(wd);
	}
	
	public String getCabinet(){return cabinet;}
	public String getUchastok(){return uchastok;}
	public String getName(){return name;}


	public WorkDay getTodayWorkDay(int y,int m,int d){            //разобраться с этим методом!!!
		for(WorkDay i: workDays )
		{
			if(y==i.getYear() && m==i.getMonth() && d==i.getDayOfMonth())
				return i;
		}
		return null; // ТУТА ОШИБКА!!!
	}

    public WorkDay getWorkDay(int i)
    {
      return  workDays.get(i);
    }
}
//	public String getWeek(int day)
//	{
//		day=day-1;
//		return week[day];
//	}
//	public String toString(){return name;}
//}
