package day14_0711;

public class BreakTest {
	public static void main(String[] args) {
		int sum=0;
		int i =0;
		
		while(true) {
			if(sum>100) {//if는 무조건 블럭 넣어줘야함
				break;}
			++i;
			sum+=i;
		}
		
		System.out.println("i = "+i);
		System.out.println("sum = "+sum);
	}
}
