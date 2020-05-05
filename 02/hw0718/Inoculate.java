package hw0718;

import java.sql.Date;

public class Inoculate implements Comparable {
	private String name;
	private Date date;

	Inoculate(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {

		return name;
	}

	public Date getDate() {

		return date;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Inoculate) {
			return name.equals((Inoculate) obj.name);
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Object o) {
		Inoculate param = (Inoculate) o;
		return date.toString().compareTo(param.getDate().toString());
	}
}
