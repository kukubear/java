package day24_0725;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class Order {
	private int orderNo;
	private Date orderDt;
	private Product pd;
	private ArrayList<Product> prodInfo = new ArrayList<>();
	private HashMap<Integer, ArrayList<Product>> products = new HashMap(); // 주문 상품

	public Order(int orderNo, Date orderDt) {
		this.orderNo = orderNo;
		this.orderDt = orderDt;
	}

	public Order(ArrayList<Product> prodInfo, HashMap<Integer, ArrayList<Product>> products) {

		this.prodInfo = prodInfo;
		this.products = products;
	}

	public Order(int orderNo, ArrayList<Product> prodInfo, HashMap<Integer, ArrayList<Product>> products) {

		this.orderNo = orderNo;
		this.prodInfo = prodInfo;
		this.products = products;
	}

	// 주문상품 추가
	public void addProduct(int orderNo, ArrayList<Product> prodInfo) {
		pd = new Product(pd.getProductNo(), pd.getProductNm());
		prodInfo.add(pd); // ArrayList에 제품추가
		products.put(orderNo, prodInfo); // HashMap의 value로 제품정보를 ArrayList로
		
		System.out.println("상품추가 테스트"+orderNo);
		System.out.println();
	}

	// 주문상품 삭제
	public void delProduct(int orderNo) {
		products.remove(orderNo); //

	}

	// 주문상품을 변경
	public void chgProduct(int orderNo, ArrayList<Product> p) throws Exception {
		products.put(orderNo, p);

		if (orderNo != this.orderNo) {
			throw new Exception("이전에 없던 주문번호입니다. 주문을 새로하시거나 주문번호를 확인해주세요.");
		}

	}

	// 주문상품을 키를 기준으로 정렬하여 출력
	public void printKeyBySort() {
		TreeMap tm = new TreeMap(products); // treemap으로 hashmap정렬
		Iterator<Integer> it = tm.keySet().iterator();
		while (it.hasNext()) {
			int orderNum = it.next();

			System.out.println("주문번호 기준 출력 -> 주문 번호 : " + it + "제품정보 : " + tm.get(it));
		}

	}

	// 주문상품을 Value를 기준으로 정렬하여 출력한다
	// Value는 제품번호를 기준으로 정렬한다
	public void printValueBySort(Comparator c) {

		//ArrayList에 들어있는 pd를 c기준으로 Sort
		Collections.sort(prodInfo, c);
		System.out.println();

	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDt() {
		return orderDt;
	}

	public void setOrderDt(Date orderDt) {
		this.orderDt = orderDt;
	}

	public HashMap getProducts() {
		return products;
	}

	public void setProducts(HashMap products) {
		this.products = products;
	}

	

}
class ValueBySort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;
			
		}
		return -1;
	}
	
}

