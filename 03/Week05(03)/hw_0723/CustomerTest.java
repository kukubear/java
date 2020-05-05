package hw_0723;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerTest {
	public static void main(String[] args) {
		// Order�ڽĸ� ��� ����
		Customer<Order> c1 = new Customer<>("ȫ�浿", 30, 100);
		Order o = new Order(1234, "������ȣ��", "2019-07-01");
		c1.addOrders(o);

		// specialOrder�� ���ð���
		SpecialCustomer<SpecialOrder> c2 = new SpecialCustomer<>("��浿", 31, 150, 50);

		SpecialOrder so = new SpecialOrder(1234, "������ȣ��", "2019-07-01", "��Ƽ��");
		c2.addOrder(so);
		ArrayList al = new ArrayList();
		al.add(c1);
		al.add(c2);

		// Point�� Customer ����
		Collections.sort(al);
	}
}
