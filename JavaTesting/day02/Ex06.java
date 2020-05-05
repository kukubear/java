package day02;
//bit 연산자
public class Ex06 {
	public static void main(String[] args) {
		//통신공학, 전자공학, 전기공학, 반도체 공학 등에서 임베디드 시스템에서 사용
		
		int x = 20, y=30, z= x & y;
		System.out.println("&연산: "+z);
		
		int z1 = x|y;
		System.out.println("|연산: "+z1);
		
		int z2 = x ^ y;
		System.out.println("exor연산:  "+z2);
		
		int z3 = x << 3;
		System.out.println("shift<<연산:  "+z3);
		
		int z4 = x >> 3;
		System.out.println("shift>>연산: "+z4);
		
		
	}
}
