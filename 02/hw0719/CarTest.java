package hw0719;

import java.sql.Date;

public class CarTest {

	public static void main(String[] args) throws Exception {
		Car car = new Car("Ǫ��", 21,10000,"ȫ�浿");
		Car car1 = new Car("BMW",19,5000,"��浿");
		Car car2 = new Car ("�����ٰ�",18,2000,"���ڹ�");
		
		
		AccidentInfo infor1 = new AccidentInfo("����",Date.valueOf("2017-07-08"));
		AccidentInfo infor2 = new AccidentInfo("��õ",Date.valueOf("2017-09-31"));

		try {
		car.addAccidentHis(infor1);
		car1.addAccidentHis(infor2);
		}catch(Exception e) {
			e.getMessage();
		}
		
		
		
	}

}
