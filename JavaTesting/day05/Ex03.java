package day05;
//--while(~하는 동안에, 참인 경우에 반복실행, 조건식 이용 이나 true)
public class Ex03 {

	public static void main(String[] args) {
		//Q Hello Java라는 문자열을 5번 반복 출력하세요.
		int i=1;
		
	 while(i<=5) {
		 System.out.println("Hello Java!");
		 i++;
	 }
	 
	 //I like java programming~~!! 5번 출력하기
	 
	 int a=1;
	 String java ="I like java programming!!";
	 
		/*
		 * while(a<=5) { System.out.println(java); a++; }
		 */
	 
	 //-1+2-3+4.........-99+100 의 합계를 구하세요.
	 
	 //-1+315+7....+99=
	int i1=1, sum=0, sw=1;
	while(i1<=99) {
		sw=sw*(-1);
		sum=sum+(i1*sw);
		
		i1+=2;
	}
	System.out.println(sum);
	}

}
