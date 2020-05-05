package day13_0710;

class Car {
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
	/*
	 * public boolean equals(Object obj) { if ((obj.equals(color)) &&
	 * (obj.equals(gearType) && (obj == (Car).obj).door)) { // obj = color or
	 * gearType or door return true; } else { return false; }
	 * 
	 * 
	 * this.color = ((Car).obj).color; this.gearType = ((Car).obj).gearType;
	 * this.door = ((Car).obj).door;
	 * 
	 * return true;
	 * 
	 * 
	 * return this.door==((Car)obj).door; //equals method ¿Á¡§¿« }
	 */

}

public class CarTest3 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);
		System.out.println(c1.door);
		System.out.println(c2.door);
		System.out.println(c1.equals(c2));
	}
}
