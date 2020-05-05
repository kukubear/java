package day15_0712;

public class MathClassTest {
	//Mathclass의 Method는 모두 static
public static void main(String[] args) {
	//1. double abs (double a) /float,int,long -> 절대값 반환
	int l = Math.abs(-10);
	double d = Math.abs(-10.0);
	System.out.println("l의 절대 값은 = "+l);
	System.out.println("d의 절대 값은 = "+d);
	System.out.println();
	
	//2. double ceil(double a) -> 주어진 값을 올림하여 반환
	double d1 = Math.ceil(10.1);
	double d2 = Math.ceil(-10.1);
	double d3 = Math.ceil(10.000015);
	
	System.out.println("d1의  올림 값은 = "+d1);
	System.out.println("d2의 올림 값은 = "+d2);
	System.out.println("d3의 올림 값은 = "+d3);
	System.out.println();
	
	//3. double floor(double a) ->주어진 값을 버림하여 반환
	double d4 = Math.floor(10.8);
	double d5 = Math.floor(-10.8);
	
	System.out.println("d4의  값은 = "+d4);
	System.out.println("d5의  값은 = "+d5);
	System.out.println();
	
	//4.  double max(double a, double b)->주어진 두값을 비교하여 큰 쪽을 반환/float,int,long
	double d6 = Math.max(9.5, 9.50001);
	int i = Math.max(0, -1);
	
	System.out.println("d6의  값은 = "+d6);
	System.out.println("i의  값은 = "+i);
	System.out.println();
	
	//5. double min(double a, double b) ->주어진 두값을 비교하여 작은 쪽을 반환/float,int,long
	double d7 = Math.min(9.5, 9.500001);
	int i1 = Math.min(0, -1);
	
	System.out.println("d7의  값은 = "+d7);
	System.out.println("i1의  값은 = "+i1);
	System.out.println();
	
	//6. double random() -> 0.0~0.1범위의 임의의 double을 반환
	double d8 = Math.random();
	int i2 = (int)(Math.random()*10)+1;
	
	System.out.println("d8의  값은 = "+d8);
	System.out.println("i2의  값은 = "+i2);
	System.out.println();
	
	//7. double rint(double a) -> 주어진 double값과 가까운 정수값을 double형의 반환->잘안씀
	double d9 = Math.rint(5.5);
	double d10 = Math.rint(5.1);
	double d11 = Math.rint(-5.5);
	double d12 = Math.rint(-5.1);
	
	System.out.println("d8의  값은 = "+d8);
	System.out.println("i2의  값은 = "+i2);
	
	
}
}
