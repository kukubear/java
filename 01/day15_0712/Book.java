package day15_0712;

public abstract class Book {
	private int number;
	private String title;
	private String author;

	Book(int number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Book) {
			return number == ((Book) obj).number;
		} else {
			return false;
		}
	}

	abstract int getLateFee(int a);
}
