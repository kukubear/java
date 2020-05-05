package day12_0709;
//자주 까먹는 연산자의 결과
//Stringdms 
public class Operator {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.println("abc"=="abc");
		System.out.println(str1=="abc");
		System.out.println(str2=="abc");
		System.out.println(str1.equals("abc"));
		System.out.println(str2.equals("abc"));
		System.out.println(str2.equals("ABC"));
		System.out.println(str2.equalsIgnoreCase("ABC"));
		
		
	int x =15;
	System.out.println(10>x && x++<20);
	System.out.println("x = "+x);
	System.out.println(10<x||x++<20);
	System.out.println("x = "+x);
	
	System.out.println(10>x &x++<20);
	System.out.println("x = "+x);
	System.out.println(10<x|x++<20);
	System.out.println("x = "+x);
	
	}
}
