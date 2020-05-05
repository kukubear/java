package hw_0723;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerTest {
	public static void main(String[] args) {
		// Order자식만 사용 가능
		Customer<Order> c1 = new Customer<>("홍길동", 30, 100);
		Order o = new Order(1234, "정보보호론", "2019-07-01");
		c1.addOrders(o);

		// specialOrder만 선택가능
		SpecialCustomer<SpecialOrder> c2 = new SpecialCustomer<>("김길동", 31, 150, 50);

		SpecialOrder so = new SpecialOrder(1234, "정보보호론", "2019-07-01", "각티슈");
		c2.addOrder(so);
		ArrayList al = new ArrayList();
		al.add(c1);
		al.add(c2);

		// Point로 Customer 정렬
		Collections.sort(al);
	}
}
