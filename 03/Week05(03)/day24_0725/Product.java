package day24_0725;

public class Product {
	private int productNo;
	private String productNm;// 力前捞抚
	
	//积己磊
	public Product(int productNo, String productNm) {
		super();
		this.productNo = productNo;
		this.productNm = productNm;
	}
	
	//get/set
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	
	
}
