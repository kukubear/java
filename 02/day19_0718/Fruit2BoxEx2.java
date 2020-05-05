package day19_0718;

import java.util.ArrayList;

class Fruit2 implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape";
	}
}

class Toy2 {
	public String toString() {
		return "Toy";
	}
}

interface Eatable {
}

public class Fruit2BoxEx2 {
	public static void main(String[] args) {
		// Eatable의 자식
		Fruit2Box<Fruit2> fruitBox = new Fruit2Box<Fruit2>();
		// Fruit의 자식
		Fruit2Box<Apple2> appleBox = new Fruit2Box<Apple2>();
		Fruit2Box<Grape2> grapeBox = new Fruit2Box<Grape2>();

		fruitBox.add(new Fruit2());
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());

		appleBox.add(new Apple2());
		grapeBox.add(new Grape2());

		System.out.println("fruit2Box - " + fruitBox);
		System.out.println("apple2Box - " + appleBox);
		System.out.println("grape2Box - " + grapeBox);

	}
}

class Fruit2Box<T extends Fruit2 & Eatable> extends Box2<T> {
}

class Box2<T> {
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
