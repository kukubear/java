package day06;

import java.util.Scanner;
 
//문제] AddSum(100); 이것을 이용하여 클래스 내부에서 구현하고, 또 클래스 외부에서 구현하여 출력하도록 하기
//MS7 class 내부 구현 객체:ms7
//CalAddSum Class (외부 구현) 객체 : cas


public class Ex07 {
	//Field Area
	
	private static int AddSum(int i) {
		if(i==1) {
			return 1;
		}else {
			return i +AddSum(i-1);//100+99=199+98
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//생성자를 사용하고 싶다면
		//Ex07 ms7 = new Ex07();
		//ms7.AddSum(100); 
		//-> 객체를 이용하여 호출하는 방법
		//SYstem
		
	System.out.println("1.내부 1~100의 합계 = "+ AddSum(100));
	
	
	
	CalAddSum cas = new CalAddSum();
	System.out.println("2.외부 1~100의 합계 = "+cas.AddSum(100));
	
}
}
