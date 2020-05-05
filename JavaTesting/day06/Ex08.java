package day06;

import java.util.Scanner;

/*문제] 100과 200의 약수들의 합계를 구하여 출력하세요.
 * 단, 내부처리와 외부처리(Measure class)로 구분하여 합니다.
 * 약수 : 어떤수로 정수를 나누어서 떨어지는 수 
 * 
 * */
public class Ex08 {
	
	public static int measure(int a){
		
		int sum=0;
		for(int i=1;i<=a;i++) {
			
				if(a%i==0) {
					sum +=i;
					System.out.println(sum);
					
				}
			
		}
		System.out.println();
		return sum;
		
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("약수를 구할 두 수를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		/*
		 * Measure ms = new Measure(); System.out.println(x+"약수들의 합 = "+ms.measure(x));
		 * System.out.println(y+"의 약수들의 합 = "+ms.measure(y));
		 */
		
		
		  int sum = measure(x);
		  System.out.println("1.내부 100과 200의 약수의 총합 = "+sum);	
		  System.out.println();
		  int sum2 = measure(y); 
		  System.out.println("2.외부 100과 200의 약수의 총합 = "+sum2);
//		 System.out.println();
	}
}
