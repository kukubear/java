package day05;
//1+2+3+4+5+6+7+8+9+10=55출력되도록 코딩
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a=0; a<=10; a++) {
			
			sum+=a;
		
		}
		System.out.println("1+2+3+4+5+6+7+8+9+10 = "+sum);
		
		//
		for(int i =1, sum1=0; i<=10; i++) {
			sum1+=i;
			System.out.print(i);
			
			if(i==10) {
				System.out.print(" = ");
				System.out.print(sum1);
			}else {
				System.out.print("+");
			}
		}
	}

}
