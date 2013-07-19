package com.virussun.mobilereg;

import android.view.ViewDebug;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WorkDay {

private int year;
private int month;
private int day;
private int dayOfWeek;
private String periodWork;
private static String months[]={"ßÍÂÀĞß","ÔÅÂĞÀËß", "ÌÀĞÒÀ", "ÀÏĞÅËß", "ÌÀß", "ÈŞÍß", "ÈŞËß", "ÀÂÃÓÑÒÀ", "ÑÅÍÒßÁĞß", "ÎÊÒßÁĞß", "ÄÅÊÀÁĞß"};
private static String weeks[] = {"ÂÑ","ÏÍ","ÂÒ","ÑĞ","×Ò","ÏÒ","ÑÁ"};

public void setYear(int a){
    year=a;
}

public void setMonth(int a){
    month=a;
}

public void setDay(int a){
    day=a;
}

public void setPeriodWork(String a){
	periodWork=a;
}


public String getPeriodWork(){
	return periodWork;
}


public int getYear(){
	return year;
}

public int getMonth(){
    return month;
}

public int getDayOfMonth(){
    return day;
}

public String getNameDay(int y, int m, int d){
    int i =(((m+1)*26/10)+d+y+(y/4)+5-40)%7;
	return weeks[i];
}

public String getNameMonth(int i){
    return months[i-1];
}

}
