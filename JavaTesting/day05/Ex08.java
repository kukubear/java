package day05;

import java.util.Scanner;

//두수를 입력받아서, 큰 값과 작은 값을 구분하여 출력하세요.
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * int x,y;
		 * 
		 * do {
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("첫 번째 숫자를 입력하세요: "); x=sc.nextInt();
		 * System.out.println("두 번째 숫자를 입력하세요: "); y=sc.nextInt();
		 * 
		 * if(x>y) { System.out.println("max= "+x+" min= "+y); }else {
		 * System.out.println("max= "+y+" min= "+x); }
		 * 
		 * }while(x==y);
		 */
		
		
		  int su1, su2, xValue, yValue;
		  String xsu,ysu;
		  
		  do {
		
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("임의의 두 수를 입력하세요: "); 
		  xsu=sc.next();
		  ysu=sc.next();
		  su1=Integer.parseInt(xsu); 
		  su2=Integer.parseInt(ysu);
		  
		  
		  xValue = (su1>su2)? su1:su2; 
		  yValue = (su1<su2)? su1:su2;
		  System.out.println("큰값은 = "+xValue+"이고, 작은 값은 = "+yValue+"입니다.");
		  
		  }while(true);
		 
	}

}
