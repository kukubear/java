package day06;
//�޼ҵ带 �̿��Ͽ� ���̾Ƹ�� ���̺��� ����� ����ϱ�
// �����
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

public class D6hw5 {
	public static void upper() {
		for (int x=1; x<=4;x++) {
			for(int y=6; y>=x; y--) {
				System.out.print(" ");
			}
				for(int z=1; z<=2*x-1;z++) {
					System.out.print("*");
				}
			
			System.out.println();
	}
	
	}
	public static void lower() {
for(int a=1; a<=5; a++) {
			
			for(int b=5; b>=5-a; b--) {
				System.out.print(" ");
			}
			for(int c=1; c<=10-(2*a-1); c++){
				System.out.print("*");
			}	
			
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		upper();
		lower();
		
		
			
	
			
			
			
			
			
			
			
			
			
}
}
