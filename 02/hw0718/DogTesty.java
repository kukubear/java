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
		Dog d = new Dog("ÄÉºó", 10, "¼ÎÆÛµå");

		try {
			d.shotInoculate("ÀåÆ¼Çª½º", Date.valueOf("2019-07-01"));
			d.shotInoculate("ÀåÆ¼Çª½º", Date.valueOf("2019-07-01"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		d.printInoculateHistory();
		
		d.addHandler("È«±æµ¿", "2019-01-05", "2019-02-01");
		d.addHandler("È«±æµ¿", "2019-01-05", "2019-02-01");
		d.addHandler("±è±æµ¿", "2019-05-09", "2019-05-30");
		
		try {
			System.out.println("Period : "+ d.getTotalHandlerPeriod());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}