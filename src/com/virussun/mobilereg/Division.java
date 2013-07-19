package com.virussun.mobilereg;

public class Division {
	private String name;
	public Doctor[] doctors;
	private int Doccount;
	private String ticketFree;

	public void setName(String a) {
		name = a;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return getName();
	}
	public void init(int a){
		//объ€вление массива докторов
		Doccount = a;
		doctors = new Doctor[a];
		for (int i = 0; i < 10; i++)
			doctors[i] = new Doctor();
	}

	public void setCountTicketFree(String a){
		ticketFree=a;
	}
	
	public String getCountTicketFree(){
		return ticketFree;
	}
	
	
}