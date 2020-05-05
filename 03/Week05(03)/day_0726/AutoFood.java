package day_0726;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class AutoFood {
	private int orderFoodNo;
	private Date orderDt;
	private ArrayList<Food> serviceFoods = new ArrayList<>();// ������ ����
	private HashMap<Integer, ArrayList<Food>> newOrders = new HashMap<>();
	private int Totalcount1;
	private int Totalcount2;
	private ArrayList<Food> food = new ArrayList<>();

	// ������
	public AutoFood(int orderFoodNo, Date orderDt) {

		this.orderFoodNo = orderFoodNo;
		this.orderDt = orderDt;
	}

	// �Ӽ��� ���� get/set
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

	// ������ �ֹ��Ѵ�
	// �ֹ� �� �����ð��� �������� �����Ѵ�(�����ð��� ª�������� ������)
	// �ֹ��� ��������(Ŭ����)���� �� �ֹ� ������ Count�Ѵ�
	public void orderFood(Food f) throws Exception {

		//�ߺ�ó��
		if (newOrders.containsKey(this.orderFoodNo)) {
			throw new Exception("�̹� �ֹ��� ������ ��ȣ�Դϴ�.");
		}

		if (f instanceof Noodle) {
			f = new Noodle(f.getFoodNo(), f.getFoodNm(),f.getTime());

			// noodle�� ��ü�� ArrayList�� �ְ� orderNo�� key food�� value��
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

	// �ֹ��� ������ ����Ѵ�.
	public void printOrderFood() {
		Iterator it = newOrders.keySet().iterator();

		while (it.hasNext()) {
			System.out.println("�ֹ���ȣ : " + it + ", ���ĸ� : " + newOrders.get(this.orderFoodNo));
		}
	}

	// �ֹ����Ŀ��� �����ϰ� ������ �������� �̵���Ų��
	
	@SuppressWarnings("unlikely-arg-type")
	public void serviceFood(Food f) {
		
		while(f.equals(newOrders.containsValue(this.orderFoodNo))) {
		serviceFoods.add(f);
		newOrders.remove(this.orderFoodNo, food);
		}
		
	}

	// ��������(Ŭ����)���� �� �ֹ� ������ ����Ѵ� -> ���� Ŭ������ static ��������
	public void printTotalCount() {
		System.out.println("Noodle�� �� �ֹ� ����" + Noodle.count);
		System.out.println("FriedRice�� �� �ֹ� ����" + FriedRice.count);
	}

}
