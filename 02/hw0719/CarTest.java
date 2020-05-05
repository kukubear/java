package hw0719;

import java.sql.Date;

public class CarTest {

	public static void main(String[] args) throws Exception {
		Car car = new Car("ÇªÁ¶", 21,10000,"È«±æµ¿");
		Car car1 = new Car("BMW",19,5000,"±è±æµ¿");
		Car car2 = new Car ("Æø½º¹Ù°Õ",18,2000,"±èÀÚ¹Ù");
		
		
		AccidentInfo infor1 = new AccidentInfo("¼­¿ï",Date.valueOf("2017-07-08"));
		AccidentInfo infor2 = new AccidentInfo("ÀÎÃµ",Date.valueOf("2017-09-31"));

		try {
		car.addAccidentHis(infor1);
		car1.addAccidentHis(infor2);
		}catch(Exception e) {
			e.getMessage();
		}
		
		
		
	}

}
