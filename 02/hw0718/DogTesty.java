package hw0718;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DogTesty {
	public static void main(String[] args) {
		Dog d = new Dog("�ɺ�", 10, "���۵�");

		try {
			d.shotInoculate("��ƼǪ��", Date.valueOf("2019-07-01"));
			d.shotInoculate("��ƼǪ��", Date.valueOf("2019-07-01"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		d.printInoculateHistory();
		
		d.addHandler("ȫ�浿", "2019-01-05", "2019-02-01");
		d.addHandler("ȫ�浿", "2019-01-05", "2019-02-01");
		d.addHandler("��浿", "2019-05-09", "2019-05-30");
		
		try {
			System.out.println("Period : "+ d.getTotalHandlerPeriod());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}