package day15_0712;

public class Science extends Book{
	int number;
	String title; 
	String author;
	
	Science(int number, String title,String author){
		super(number, title, author);
	}

	@Override
	int getLateFee(int days) {
		int totalLateFee = 0;
		totalLateFee = days * 200;
		return totalLateFee;
	}
	
	public static void main(String[] args) {
		
	}
}
