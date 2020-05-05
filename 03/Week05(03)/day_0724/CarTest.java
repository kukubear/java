package day_0724;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarTest {
	public static void main(String[] args) throws Exception {

		// String������ ��¥�� �Ķ���� �ȿ��� �ٷ� util date ������ ��ȯ
		// String 20170101 -> java util.date "20170101"
		PakringLotAdm pl = new PakringLotAdm(new SimpleDateFormat("yyyymmdd").parse("20170101"),
				new SimpleDateFormat("yyyymmdd").parse("20350101"), 3);

		Car car1 = new Car("05��9789", new SimpleDateFormat("yyyymmddHHMM").parse("201907241200"));
		Car car2 = new Car("12��6914", new SimpleDateFormat("yyyymmddHHMM").parse("201907241330"));
		Car car3 = new Car("65��7810", new SimpleDateFormat("yyyymmddHHMM").parse("201907240800"));
		Car car4 = new Car("24��1111", new SimpleDateFormat("yyyymmddHHMM").parse("201907241030"));
		Car car5 = new Car("11��0000", new SimpleDateFormat("yyyymmddHHMM").parse("201907240900"));
		
		
		pl.addCar(car1);
		pl.addCar(car2);
		pl.addCar(car3);
		pl.addCar(car4);
		pl.addCar(car5);
		
		
		
	}
}
