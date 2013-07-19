package com.virussun.mobilereg;

public class Hospital {
	private String name;
	private String adress;
	private String phone;
	public Division[] divisions;
	public static int Divcount;
	
	public String getName(){
		return name;
	}
	
	public String getAdress(){
		return adress;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setName(String a){
		name=a;
	}
	
	public void setAdress(String a){
		adress=a;
	}
	
	public void setPhone(String a){
		phone=a;
	}
	public String toString(){
		return name;
	}
	public void init(int a){
		Divcount=a;
		divisions = new Division[a];
		for (int i = 0; i < a; i++)
			divisions[i] = new Division();
	}
}
