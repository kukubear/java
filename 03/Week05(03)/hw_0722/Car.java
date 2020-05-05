package hw_0722;

public class Car {
	private String carNo;
	private String type;
	private int volume;
	
	Car(String carNo, String type, int volume){
		this.carNo=carNo;
		this.type=type;
		this.volume = volume;
	}

	public String carInfo() {
		String info = type+Integer.toString(volume);
		
		return info;
	}
	
	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
