package hw_0722;

public class DriverTest {
	public static void main(String[] args) {
		Driver ppl = new Driver("홍길동", 165842393);
		
		Car car = new Car("05가9854", "벤츠", 2000);
		Car car1 = new Car("03허2441", "아우디", 3500);
		Car car2 = new Car("12류6543","BMW",1800);

		Accident[] acci = new Accident[5];
		acci[0] = new Accident("서울", "20180725", car);
		acci[1] = new Accident("경기", "20170113", car1);
		acci[2] = new Accident("제주","20140303",car2);

		ppl.addCar(car);
		ppl.addCar(car1);
		ppl.addCar(car2);
		
		ppl.printCars();
		
		ppl.addAccident(acci);
		ppl.printAccident();
		

	}
}
