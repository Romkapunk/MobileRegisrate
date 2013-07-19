package com.virussun.mobilereg;

import java.util.Calendar;
import java.util.Date;

public class Objects {
	public static Hospital[] hospitals;
	public static void init(){
		hospitals = new Hospital[10];
		for (int i = 0; i < 10; i++)
			hospitals[i] = new Hospital();
		hospitals[0].setName("��������� �������� ����� 1");
		hospitals[0].setAdress("������� ���������� 28");
		hospitals[0].setPhone("77-12-41");
		hospitals[1].setName("������� ������������ 2");
		hospitals[1].setAdress("������ 14/2");
		hospitals[1].setPhone("77-12-41");
		hospitals[2].setName("��������� ��������");
		hospitals[2].setAdress("��������� 3");
		hospitals[2].setPhone("77-12-41");
		hospitals[3].setName("����������� 4");
		hospitals[3].setAdress("������������� 38");
		hospitals[3].setPhone("77-12-41");
		hospitals[4].setName("��������");
		hospitals[4].setAdress("����� 3");
		hospitals[4].setPhone("77-12-41");
		hospitals[5].setName("�������� ����� �����");
		hospitals[5].setAdress("� ������");
		hospitals[5].setPhone("77-12-41");
		hospitals[6].setName("��� �������");
		hospitals[6].setAdress("���� 28");
		hospitals[6].setPhone("77-12-41");
		hospitals[7].setName("��������� ������� ����");
		hospitals[7].setAdress("������ �����");
		hospitals[7].setPhone("77-12-41");
		hospitals[8].setName("������� ������������ 23");
		hospitals[8].setAdress("�����");
		hospitals[8].setPhone("77-12-41");
		hospitals[9].setName("��������� �����������");
		hospitals[9].setAdress("������� ������������ 3");
		hospitals[9].setPhone("77-12-41");
		for (int i = 0; i < 10; i++){	
			hospitals[i].init(10);
			hospitals[i].divisions[0].setName("��������" + Integer.toString(i+1));
			hospitals[i].divisions[0].setCountTicketFree("�������� �������: "+ Integer.toString(10+i));
			hospitals[i].divisions[1].setName("���������" + Integer.toString(i+1));
			hospitals[i].divisions[1].setCountTicketFree("�������� �������: "+ Integer.toString(30-i));
			hospitals[i].divisions[2].setName("���" + Integer.toString(i+1));
			hospitals[i].divisions[2].setCountTicketFree("�������� �������: "+ Integer.toString(40*i));
			hospitals[i].divisions[3].setName("����������" + Integer.toString(i+1));
			hospitals[i].divisions[3].setCountTicketFree("�������� �������: "+ Integer.toString(0));
			hospitals[i].divisions[4].setName("�������� ��� ������" + Integer.toString(i+1));
			hospitals[i].divisions[4].setCountTicketFree("�������� �������: "+ Integer.toString(100+i));
			hospitals[i].divisions[5].setName("������������" + Integer.toString(i+1));
			hospitals[i].divisions[5].setCountTicketFree("�������� �������: "+ Integer.toString(50-i));
			hospitals[i].divisions[6].setName("��������" + Integer.toString(i+1));
			hospitals[i].divisions[6].setCountTicketFree("�������� �������: "+ Integer.toString(5*i));
			hospitals[i].divisions[7].setName("����������" + Integer.toString(i+1));
			hospitals[i].divisions[7].setCountTicketFree("�������� �������: "+ Integer.toString(10*i));
			hospitals[i].divisions[8].setName("�����������" + Integer.toString(i+1));
			hospitals[i].divisions[8].setCountTicketFree("�������� �������: "+ Integer.toString(47-i));
			hospitals[i].divisions[9].setName("������ �����" + Integer.toString(i+1));
			hospitals[i].divisions[9].setCountTicketFree("�������� �������: "+ Integer.toString(40+i));
			for (int j = 0; j < 10; j++)
			{
				hospitals[i].divisions[j].init(10);
				hospitals[i].divisions[j].doctors[0].setName("���������");
				hospitals[i].divisions[j].doctors[0].setCabinet("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[0].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[1].setName("��������");
				hospitals[i].divisions[j].doctors[1].setCabinet("������� � "+ Integer.toString(10+i));
				hospitals[i].divisions[j].doctors[1].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[2].setName("������");
				hospitals[i].divisions[j].doctors[2].setCabinet("������� � "+ Integer.toString(10+j));
				hospitals[i].divisions[j].doctors[2].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[3].setName("�����������");
				hospitals[i].divisions[j].doctors[3].setCabinet("������� � "+ Integer.toString(50-i));
				hospitals[i].divisions[j].doctors[3].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[4].setName("����");
				hospitals[i].divisions[j].doctors[4].setCabinet("������� � "+ Integer.toString(50-j));
				hospitals[i].divisions[j].doctors[4].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[5].setName("������� �������");
				hospitals[i].divisions[j].doctors[5].setCabinet("������� � "+ Integer.toString(j+i));
				hospitals[i].divisions[j].doctors[5].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[6].setName("��������");
				hospitals[i].divisions[j].doctors[6].setCabinet("������� � "+ Integer.toString(25));
				hospitals[i].divisions[j].doctors[6].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[7].setName("�������");
				hospitals[i].divisions[j].doctors[7].setCabinet("������� � "+ Integer.toString(179));
				hospitals[i].divisions[j].doctors[7].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[8].setName("������");
				hospitals[i].divisions[j].doctors[8].setCabinet("������� � "+ Integer.toString(188));
				hospitals[i].divisions[j].doctors[8].setUchastok("������� � "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[9].setName("����������");
				hospitals[i].divisions[j].doctors[9].setCabinet("������� � "+ Integer.toString(424));
				hospitals[i].divisions[j].doctors[9].setUchastok("������� � "+ Integer.toString(10));
				
				hospitals[i].divisions[j].doctors[0].addDay(2013,07,12,"14:00 - 18:00");
				hospitals[i].divisions[j].doctors[0].addDay(2013,05,13,"14:00 - 18:00");
				hospitals[i].divisions[j].doctors[0].addDay(2013,05,14,"14:00 - 18:00");
				hospitals[i].divisions[j].doctors[0].addDay(2013,05,15,"14:00 - 18:00");
				hospitals[i].divisions[j].doctors[0].addDay(2013,05,16,"14:00 - 18:00");
				hospitals[i].divisions[j].doctors[0].addDay(2013,05,17,"14:00 - 18:00");
				hospitals[i].divisions[j].doctors[0].addDay(2013,05,18,"14:00 - 18:00");
			}
		}
	}
		
}
