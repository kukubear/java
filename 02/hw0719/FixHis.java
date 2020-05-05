package hw0719;

import java.util.Objects;

import hw0718.Handler;

public class FixHis {
	private String airport;
	private String date;
	private String cmt;//수리내용
	
	FixHis(String airport, String date, String cmt){
		this.airport=airport;
		this.date=date;
		this.cmt=cmt;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public String getDate() {
		
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}
	
	
}
