package day04;
//switch~case
//[����3] 1~100������ ������ �հ踦 ���ϼ���. 
//1-2+3-4+5-6+7-8+.......100 = ?
public class D4hw32 {
	public static void main(String[] args) {
		int a=0,b=0, sum=0, sum1=0;
		if(a%2==0) {
			for(a=2;a<=100;a++) {
				sum+=a;
				a++;
				
			}
			System.out.println(sum);
		}
		else if(a%2==1) {
			for(b=1;b<=100;b++) {
				sum1+=b;
				b++;
				System.out.println(-sum1);
			}
			System.out.println(-sum1);
		}
			

	
}
}
