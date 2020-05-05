package day15_0712;

public class Animation extends Book {
	private int number;
	private String title;
	private String author;

	Animation(int number, String title, String author) {
		super(number, title, author);
	}

	int getLateFee(int days) {
		int totalLateFee = 0;
		totalLateFee = days * 300;
		
		return totalLateFee;

	}
	
	
	public static void main(String[] args) {
		
	}
}
