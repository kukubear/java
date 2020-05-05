package day03;

public class Ex01 {
	public static void main(String[] args) {
	//제어문자 실습
		System.out.println("새 줄(new line)\t\\n\t"+(int)'\n');
		System.out.println("탭(tab)\t\\t\t"+(int)'\t');
		System.out.println("백스페이스(backspace)\t\\b\t"+(int)'\b');
		System.out.println("단일이중부호(Single Quote)\t\\'\t"+(int)'\'');
		System.out.println("이중 인용부호(Double Quote)\t\\\"\t"+(int)'\"');
		System.out.println("백슬래시(Backslash)\t\\\\t"+(int)'\\');
		System.out.println("널 문자(null)\t\\0\t"+(int)'\0');
		
	//변수와 블록범위 실습 -> 지역변수의 개념이해
		{//시작 block D
			int d = 10;
			{//시작 block C
				int c = 20;
				{//시작 block B
					int b = 30;
					{//시작 block A
						int a = 40;
						a=200;
						b=1000;
						c=2000;
						d=50;
						System.out.println("1: "+a+" "+b+" "+c+" "+d);
					}//end A
					b=200;
					c=300;
					d=60;
					System.out.println("2: "+b+" "+c+" "+d);
				}//end B
				c=300;
				d=70;
				System.out.println("3: "+c+" "+d);
			}//end C
			d=80;
			System.out.println("4: "+d);
		}//end D
}//main
}//class
