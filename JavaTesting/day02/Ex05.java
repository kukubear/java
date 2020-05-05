package day02;
//연산자 Operator
//산술, 관계, 증감, 복합대입
//bit연산자 : and, or, not, exor, nand, nor, <<, >>, >>>

public class Ex05 {
	public static void main(String[] args) {
		//1. 산술연산자(+,-,*,/(나누기),%(나머지))
		
		int x = 50, y=30, z = x+y, z1 = x-y, z2 = x*y, z3 = x/y, z4 = x%y;
		System.out.println("---산술연산 답---");
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		
		
		//2. 관계연산자 : 이항연산, x<=y, x>=y, x==y, x!=y :true/false
		int a = 100, b = 200;
		boolean result = false;
		
		System.out.println("----관계 and연산 답----");
		
		result = a < b && a >=b;
		System.out.println(result);
		
		result = a < b && b < 300;
		System.out.println(result);
		
		result = a > b && b++ > 300;
		System.out.println(result);
		
		result = a < b && ++b > 200;
		System.out.println(result);
		
		result = a == b && b!=a;
		System.out.println(result);
		
		System.out.println("----or연산 답----");
		
		result = a < b || a >=b;
		System.out.println(result);
		
		result = a < b || b < 300;
		System.out.println(result);
		
		result = a > b || b++ > 300;
		System.out.println(result);
		
		result = a < b || ++b > 200;
		System.out.println(result);
		
		result = a == b || b!=a;
		System.out.println(result);
		
		//복합대입연산자
		//산술 연산 + 대입연산 = 복합 대입
		//+-, -=, *=, /=, %=
		int x1 = 350;
		
		System.out.println("---복합대입연산 답---");
		x1+=1000;
		System.out.println(x1);
		x1-=350;
		System.out.println(x1);
		x1*=5;
		System.out.println(x1);
		x1%=2;
		System.out.println(x1);
		x1/=3;
		System.out.println(x1);
		
		//증감연산자
		//유형 :
		int x2=0, y2=10, z10= 50, sum1, sum2;
		System.out.println("---증감연산 답---");
		x2++;
		System.out.println(x2);
		x2--;
		System.out.println(x2);
		++x2;
		System.out.println(x2);
		
		sum1= x2+ ++y2 - z10--;
		System.out.println(sum1);
		
		sum2 = sum1++ - y;
		System.out.println(sum2);
		
		z10--;
		System.out.println(z10);
		
		
	
		
		
}
}
