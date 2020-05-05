package hw_0722;

public class Accident {
	private String location;
	private String date;
	private Car car;
	
	Accident(String location, String date, Car car){
		this.location=location;
		this.date=date;
		this.car=car;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
