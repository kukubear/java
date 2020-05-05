package hw_0723;

import java.util.ArrayList;

public class Customer<T extends Order> implements Comparable<Customer> {
	private String name;
	private int age;
	private int point;

	private ArrayList orders;

	Customer(String name, int age, int point) {
		this.name = name;
		this.age = age;
		this.point = point;
	}

	Customer(String name, int age, int point, ArrayList orders) {
		this(name, age, point);
		this.orders = orders;
	}

	// 주문추가하는 메소드
	public void addOrders(Order o) {
		orders.add(o);

	}

	// 속성에 대한 get/set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public ArrayList getOrders() {
		return orders;
	}

	public void setOrders(ArrayList orders) {
		this.orders = orders;
	}

	@Override
	public int compareTo(Customer o) {
		System.out.println("비교 Customer : "+this.name);
		
		int totalPoint = 0;
		int thisPoint =	point;

		
			
	 if (o instanceof SpecialCustomer) {
		totalPoint = o.getPoint()+((SpecialCustomer)o).getBonus();

		}else {
			totalPoint = o.getPoint();
		}
		
		
		if(thisPoint < totalPoint) {
			return -1;
			
		}else if (thisPoint > totalPoint) {
			return 1;
			
		}
		return 0;

	}

	@Override // Q
	public String toString() {

		return super.toString();
	}

	/*
	 * //Customer 정보 중복 제거 public boolean equals(Object obj) { String tmp =
	 * name+Integer.toString(age)+Integer.toString(point);
	 * 
	 * 
	 * }
	 */

}

class SpecialCustomer<T extends SpecialOrder> extends Customer<T> {
	private int bonus;

	SpecialCustomer(String name, int age, int point, int bonus) {
		super(name, age, point);
		this.bonus = bonus;
	}

	// 주문 추가 -> customer에서 처리
	public void addOrder(SpecialOrder so) {
		super.addOrders(so);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int compareTo(Customer o) {
		int paraPoint 
		int totalPoint = 0;

		if (o instanceof Customer) { 
			totalPoint = ((Customer)o).getPoint();
			
		} else if (o instanceof SpecialCustomer) {
			totalPoint = (((SpecialCustomer) o).getPoint() + ((SpecialCustomer) o).getBonus());

		}
		return totalPoint;

	}

}
