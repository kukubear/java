package hw_0723;

public class Order {
	private int orderNo;
	private String product;
	private String orderDt;

	Order(int orderNo, String product, String orderDt) {
		this.orderNo = orderNo;
		this.product = product;
		this.orderDt = orderDt;
	}

	// 속성에 대한 get/set
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getOrderDt() {
		return orderDt;
	}

	public void setOrderDt(String orderDt) {
		this.orderDt = orderDt;
	}

}

class SpecialOrder extends Order {
	private String gift; // 사은품

	SpecialOrder(int orderNo, String product, String orderDt, String gift) {
		super(orderNo, product, orderDt);
		this.gift = gift;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	// 속성에 대한 get/set

}