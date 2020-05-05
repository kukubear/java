package day04;
// *******
//  *****
//   ***
//    *    
public class D4hw2 {
	public static void main(String[] args) {
		for(int a=1; a<=4; a++) {
			
			for(int b=4; b>=5-a; b--) {
				System.out.print(" ");
			}
			for(int c=1; c<=8-(2*a-1); c++){
				System.out.print("*");
			}	
			
			System.out.println();
			
		}
		//System.out.println();
	}
}
