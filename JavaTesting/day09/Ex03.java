package day09;

public class Ex03 {

	public static void main(String[] args) {
		// �迭�̸��� �̿��� �ּҺ���
		int[] num1 = {10,20,30,40,50};
		int []num2;
		num2=num1;
		
		for(int i=0; i<num2.length;i++) {
			num2[i]++;
			
		}
		for(int i =0; i<num2.length; i++) {
			num2[i]++;
		}
		
		
		//���ۿ�(side effect): �ϳ��� �޸𸮸� ������ �� �������� ���� ���� �߻��ϴ� ����.
		
		//������ ���� ����� �ϴ� ���α׷��� �ۼ��մϴ�.
		
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
