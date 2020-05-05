package day_0726;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class AutoFood {
	private int orderFoodNo;
	private Date orderDt;
	private ArrayList<Food> serviceFoods = new ArrayList<>();// 제공된 음식
	private HashMap<Integer, ArrayList<Food>> newOrders = new HashMap<>();
	private int Totalcount1;
	private int Totalcount2;
	private ArrayList<Food> food = new ArrayList<>();

	// 생성자
	public AutoFood(int orderFoodNo, Date orderDt) {

		this.orderFoodNo = orderFoodNo;
		this.orderDt = orderDt;
	}

	// 속성에 대한 get/set
	public int getOrderFoodNo() {
		return orderFoodNo;
	}

	public void setOrderFoodNo(int orderFoodNo) {
		this.orderFoodNo = orderFoodNo;
	}

	public Date getOrderDt() {
		return orderDt;
	}

	public void setOrderDt(Date orderDt) {
		this.orderDt = orderDt;
	}

	public ArrayList getServiceFoods() {
		return serviceFoods;
	}

	public void setServiceFoods(ArrayList serviceFoods) {
		this.serviceFoods = serviceFoods;
	}

	// 음식을 주문한다
	// 주문 시 조리시간을 기준으로 정렬한다(조리시간이 짧은음식을 상위로)
	// 주문된 음식유형(클래스)별로 총 주문 수량을 Count한다
	public void orderFood(Food f) throws Exception {

		//중복처리
		if (newOrders.containsKey(this.orderFoodNo)) {
			throw new Exception("이미 주문이 접수된 번호입니다.");
		}

		if (f instanceof Noodle) {
			f = new Noodle(f.getFoodNo(), f.getFoodNm(),f.getTime());

			// noodle의 객체를 ArrayList로 넣고 orderNo를 key food를 value로
			food.add(f);
			newOrders.put(this.orderFoodNo, food);
			Noodle.count++;
		} else if (f instanceof FriedRice) {
			f = new FriedRice(f.getFoodNo(), f.getFoodNm(),f.getTime());
			food.add(f);
			newOrders.put(this.orderFoodNo, food);
			FriedRice.count++;
		}
	}

	// 주문된 음식을 출력한다.
	public void printOrderFood() {
		Iterator it = newOrders.keySet().iterator();

		while (it.hasNext()) {
			System.out.println("주문번호 : " + it + ", 음식명 : " + newOrders.get(this.orderFoodNo));
		}
	}

	// 주문음식에서 삭제하고 제공된 음식으로 이동시킨다
	
	@SuppressWarnings("unlikely-arg-type")
	public void serviceFood(Food f) {
		
		while(f.equals(newOrders.containsValue(this.orderFoodNo))) {
		serviceFoods.add(f);
		newOrders.remove(this.orderFoodNo, food);
		}
		
	}

	// 음식유형(클래스)별로 총 주문 수량을 출력한다 -> 하위 클래스에 static 변수선언
	public void printTotalCount() {
		System.out.println("Noodle의 총 주문 수량" + Noodle.count);
		System.out.println("FriedRice의 총 주문 수량" + FriedRice.count);
	}

}
