package hw_0722;

public class DriverTest {
	public static void main(String[] args) {
		Driver ppl = new Driver("ȫ�浿", 165842393);
		
		Car car = new Car("05��9854", "����", 2000);
		Car car1 = new Car("03��2441", "�ƿ��", 3500);
		Car car2 = new Car("12��6543","BMW",1800);

		Accident[] acci = new Accident[5];
		acci[0] = new Accident("����", "20180725", car);
		acci[1] = new Accident("���", "20170113", car1);
		acci[2] = new Accident("����","20140303",car2);

		ppl.addCar(car);
		ppl.addCar(car1);
		ppl.addCar(car2);
		
		ppl.printCars();
		
		ppl.addAccident(acci);
		ppl.printAccident();
		

	}
}
