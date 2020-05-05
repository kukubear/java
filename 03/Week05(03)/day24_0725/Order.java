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
	private HashMap<Integer, ArrayList<Product>> products = new HashMap(); // �ֹ� ��ǰ

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

	// �ֹ���ǰ �߰�
	public void addProduct(int orderNo, ArrayList<Product> prodInfo) {
		pd = new Product(pd.getProductNo(), pd.getProductNm());
		prodInfo.add(pd); // ArrayList�� ��ǰ�߰�
		products.put(orderNo, prodInfo); // HashMap�� value�� ��ǰ������ ArrayList��
		
		System.out.println("��ǰ�߰� �׽�Ʈ"+orderNo);
		System.out.println();
	}

	// �ֹ���ǰ ����
	public void delProduct(int orderNo) {
		products.remove(orderNo); //

	}

	// �ֹ���ǰ�� ����
	public void chgProduct(int orderNo, ArrayList<Product> p) throws Exception {
		products.put(orderNo, p);

		if (orderNo != this.orderNo) {
			throw new Exception("������ ���� �ֹ���ȣ�Դϴ�. �ֹ��� �����Ͻðų� �ֹ���ȣ�� Ȯ�����ּ���.");
		}

	}

	// �ֹ���ǰ�� Ű�� �������� �����Ͽ� ���
	public void printKeyBySort() {
		TreeMap tm = new TreeMap(products); // treemap���� hashmap����
		Iterator<Integer> it = tm.keySet().iterator();
		while (it.hasNext()) {
			int orderNum = it.next();

			System.out.println("�ֹ���ȣ ���� ��� -> �ֹ� ��ȣ : " + it + "��ǰ���� : " + tm.get(it));
		}

	}

	// �ֹ���ǰ�� Value�� �������� �����Ͽ� ����Ѵ�
	// Value�� ��ǰ��ȣ�� �������� �����Ѵ�
	public void printValueBySort(Comparator c) {

		//ArrayList�� ����ִ� pd�� c�������� Sort
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

