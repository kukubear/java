package hw0719;

import java.util.Objects;

public class FixInfo extends DateCheck{
	private String date;
	private String item;
	private String fixcmt;

	//Constructor
	FixInfo(String date, String item, String fixcmt){
		this.date=date;
		this.item=item;
		this.fixcmt=fixcmt;
	}

	//FixInfo hashCode ¿Á¡§¿«
	public int hashCode() {
		return Objects.hash(date, item, fixcmt);
		
	}
	
	
	public boolean equals(Object obj) {
		String thisTmp = date+item+fixcmt;
		String tmp = ((FixInfo)obj).getItem()+((FixInfo)obj).getDate()+((FixInfo)obj).getFixcmt();

		if(obj!= null && obj instanceof FixInfo) {
			boolean b = thisTmp.equals(tmp);
			return b;
		}else {
			return false;
		}
	}

	//get set method
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getFixcmt() {
		return fixcmt;
	}

	public void setFixcmt(String fixcmt) {
		this.fixcmt = fixcmt;
	}
	
	
	
	
	
}

