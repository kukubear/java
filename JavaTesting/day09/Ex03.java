package day09;

public class Ex03 {

	public static void main(String[] args) {
		// 배열이름을 이용한 주소복사
		int[] num1 = {10,20,30,40,50};
		int []num2;
		num2=num1;
		
		for(int i=0; i<num2.length;i++) {
			num2[i]++;
			
		}
		for(int i =0; i<num2.length; i++) {
			num2[i]++;
		}
		
		
		//부작용(side effect): 하나의 메모리르 공유할 때 예상하지 못한 일이 발생하는 현상.
		
		//다음과 같은 출력을 하는 프로그램을 작성합니다.
		
		//1 -1 1 -1 1
		//0 -1 1 -1 1
		//0 0 -1 1 -1
		//0 0 0 1 -1 
		//0 0 0 0  1     
		
		int [][] change = new int [5][5];
		int num=1;
		
		for(int i=0; i<change.length; i++) {
			for(int j=i; j<=4; j++) {
				change[i][j]= num;
				num=num*(-1);
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j
					++) {
				//System.out.print(change[i][j]+"\t");
				
			}
			//System.out.println();
		}
	}

}
