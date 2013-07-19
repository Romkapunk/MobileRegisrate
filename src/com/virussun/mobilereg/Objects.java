package com.virussun.mobilereg;

import java.util.Calendar;
import java.util.Date;

public class Objects {
	public static Hospital[] hospitals;
	public static void init(){
		hospitals = new Hospital[10];
		for (int i = 0; i < 10; i++)
			hospitals[i] = new Hospital();
		hospitals[0].setName("Городская больница номер 1");
		hospitals[0].setAdress("Красных комиссаров 28");
		hospitals[0].setPhone("77-12-41");
		hospitals[1].setName("Детская поликлинника 2");
		hospitals[1].setAdress("Конева 14/2");
		hospitals[1].setPhone("77-12-41");
		hospitals[2].setName("Областная больница");
		hospitals[2].setAdress("Березовая 3");
		hospitals[2].setPhone("77-12-41");
		hospitals[3].setName("Медсанчасть 4");
		hospitals[3].setAdress("Магистральная 38");
		hospitals[3].setPhone("77-12-41");
		hospitals[4].setName("Больница");
		hospitals[4].setAdress("Улица 3");
		hospitals[4].setPhone("77-12-41");
		hospitals[5].setName("Больница номер шесть");
		hospitals[5].setAdress("В шестом");
		hospitals[5].setPhone("77-12-41");
		hospitals[6].setName("ВИП КЛИНИКА");
		hospitals[6].setAdress("Мира 28");
		hospitals[6].setPhone("77-12-41");
		hospitals[7].setName("Пансионат Красные зори");
		hospitals[7].setAdress("Значит адрес");
		hospitals[7].setPhone("77-12-41");
		hospitals[8].setName("Детская поликлинника 23");
		hospitals[8].setAdress("Адрес");
		hospitals[8].setPhone("77-12-41");
		hospitals[9].setName("Городская поликлиника");
		hospitals[9].setAdress("Бульвар Архитекторов 3");
		hospitals[9].setPhone("77-12-41");
		for (int i = 0; i < 10; i++){	
			hospitals[i].init(10);
			hospitals[i].divisions[0].setName("Хирургия" + Integer.toString(i+1));
			hospitals[i].divisions[0].setCountTicketFree("Свободно талонов: "+ Integer.toString(10+i));
			hospitals[i].divisions[1].setName("Педиатрия" + Integer.toString(i+1));
			hospitals[i].divisions[1].setCountTicketFree("Свободно талонов: "+ Integer.toString(30-i));
			hospitals[i].divisions[2].setName("ЛОР" + Integer.toString(i+1));
			hospitals[i].divisions[2].setCountTicketFree("Свободно талонов: "+ Integer.toString(40*i));
			hospitals[i].divisions[3].setName("Терапевтия" + Integer.toString(i+1));
			hospitals[i].divisions[3].setCountTicketFree("Свободно талонов: "+ Integer.toString(0));
			hospitals[i].divisions[4].setName("Окулисты там всякие" + Integer.toString(i+1));
			hospitals[i].divisions[4].setCountTicketFree("Свободно талонов: "+ Integer.toString(100+i));
			hospitals[i].divisions[5].setName("Стоматология" + Integer.toString(i+1));
			hospitals[i].divisions[5].setCountTicketFree("Свободно талонов: "+ Integer.toString(50-i));
			hospitals[i].divisions[6].setName("Урология" + Integer.toString(i+1));
			hospitals[i].divisions[6].setCountTicketFree("Свободно талонов: "+ Integer.toString(5*i));
			hospitals[i].divisions[7].setName("Акушерство" + Integer.toString(i+1));
			hospitals[i].divisions[7].setCountTicketFree("Свободно талонов: "+ Integer.toString(10*i));
			hospitals[i].divisions[8].setName("Геникология" + Integer.toString(i+1));
			hospitals[i].divisions[8].setCountTicketFree("Свободно талонов: "+ Integer.toString(47-i));
			hospitals[i].divisions[9].setName("Другие врачи" + Integer.toString(i+1));
			hospitals[i].divisions[9].setCountTicketFree("Свободно талонов: "+ Integer.toString(40+i));
			for (int j = 0; j < 10; j++)
			{
				hospitals[i].divisions[j].init(10);
				hospitals[i].divisions[j].doctors[0].setName("Румянцева");
				hospitals[i].divisions[j].doctors[0].setCabinet("Кабинет № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[0].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[1].setName("Воронина");
				hospitals[i].divisions[j].doctors[1].setCabinet("Кабинет № "+ Integer.toString(10+i));
				hospitals[i].divisions[j].doctors[1].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[2].setName("Кусаев");
				hospitals[i].divisions[j].doctors[2].setCabinet("Кабинет № "+ Integer.toString(10+j));
				hospitals[i].divisions[j].doctors[2].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[3].setName("Заммершмидт");
				hospitals[i].divisions[j].doctors[3].setCabinet("Кабинет № "+ Integer.toString(50-i));
				hospitals[i].divisions[j].doctors[3].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[4].setName("Хаус");
				hospitals[i].divisions[j].doctors[4].setCabinet("Кабинет № "+ Integer.toString(50-j));
				hospitals[i].divisions[j].doctors[4].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[5].setName("Валерий Юрьевич");
				hospitals[i].divisions[j].doctors[5].setCabinet("Кабинет № "+ Integer.toString(j+i));
				hospitals[i].divisions[j].doctors[5].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[6].setName("Габардин");
				hospitals[i].divisions[j].doctors[6].setCabinet("Кабинет № "+ Integer.toString(25));
				hospitals[i].divisions[j].doctors[6].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[7].setName("Айболит");
				hospitals[i].divisions[j].doctors[7].setCabinet("Кабинет № "+ Integer.toString(179));
				hospitals[i].divisions[j].doctors[7].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[8].setName("Скалин");
				hospitals[i].divisions[j].doctors[8].setCabinet("Кабинет № "+ Integer.toString(188));
				hospitals[i].divisions[j].doctors[8].setUchastok("Участок № "+ Integer.toString(10));
				hospitals[i].divisions[j].doctors[9].setName("Жемановина");
				hospitals[i].divisions[j].doctors[9].setCabinet("Кабинет № "+ Integer.toString(424));
				hospitals[i].divisions[j].doctors[9].setUchastok("Участок № "+ Integer.toString(10));
				
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
