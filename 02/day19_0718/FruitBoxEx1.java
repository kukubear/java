package day19_0718;

import java.util.ArrayList;



public class FruitBoxEx1 {
	//실제로 컴파일될때는 제네릭스가 다빠져서 올라감
	//임시 tag같은 존재
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Toy> toyBox2 = new Box<>(); //jdk 1.7부터
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

class Fruit {
	public String toString() {
		return "fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toStrnig() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}