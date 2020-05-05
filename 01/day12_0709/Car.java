package day12_0709;

public class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);
	}

	Car(Car c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;

	}
}
class CarTest3{
	public static void main(String[] args) {
		Car c1= new Car();
		Car c2 = new Car(c1);
		System.out.println(c1.door);
		System.out.println(c2.door);
	}
}