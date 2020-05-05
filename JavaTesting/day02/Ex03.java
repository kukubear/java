package day02;
//지수승 : 가장 큰 값이나 가장 작은 값을 표현할 때, 오차 발생할 때 사용
//10진수 2진수 8진수 16진수 상관관계
public class Ex03 {
	public static void main(String[] args) {
		double e1 = 333.1415e-3;
		double e2 = 15.123e+3;
		double e3 = 1234567.123e-7;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		int x = 100;//10진수
		int y = 0100;//8진수
		int z = 0x100;//16진수 = 2의 4승(4bit로 데이터 처리)
		int a = 0b0010;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		
		//근대컴퓨터의 효시 : 중국역학 ->라이프니쯔->폰노이만
		//10진수 : 사람 주로 사용
		//2진수 : 0과 1로 표현
		//8진수 : 0~7로 표현
		//16진수 :0~9, A,B,C,D,E,F(15)로 표현
		
		//API 문서보기 - oracle -> java SE -> java APIs
		System.gc();//
		//java.lang. -> 생략가능
		
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		
	}
}
