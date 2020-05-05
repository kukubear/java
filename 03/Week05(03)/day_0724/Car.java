package day_0724;

import java.util.Date;

public class Car {
	private String carNo;
	private Date inDt; // 입차시간
	private Date outDt;
	private int fee;
	private Date waitStrDt;// (대기시작시간)
	
	//outCar Constuctor
	public Car(String carNo, Date inDt, Date outDt, int fee) {
	
		this.carNo = carNo;
		this.inDt = inDt;
		this.outDt = outDt;
	}
	
	//waiting Car Constructor + InCar
	public Car(String carNo, Date waitStrDt) {
		
		this.carNo = carNo;
		this.waitStrDt = waitStrDt;
	}

	//get/set
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public Date getInDt() {
		return inDt;
	}
	public void setInDt(Date inDt) {
		this.inDt = inDt;
	}
	public Date getOutDt() {
		return outDt;
	}
	public void setOutDt(Date outDt) {
		this.outDt = outDt;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Date getWaitStrDt() {
		return waitStrDt;
	}
	public void setWaitStrDt(Date waitStrDt) {
		this.waitStrDt = waitStrDt;
	}

	
	

}
