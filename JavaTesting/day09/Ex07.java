package day09;

public class Ex07 {

	public static void main(String[] args) {
		// 3���� �迭: �� �߽�, ��, ��, ��: �ֻ���(6�� �� ��� ���� ����)
		int [][][] dice = new int[3][2][4];
		//2���� �迭�� 3�� ����
		int [][][] dice1 = new int[][][] {{{1,2,3,4} ,{3,4,5,6},{10,20,30,40},{5,7,9,11}},//�� 1
										//1�� 4��           2�� 4�� 	 	3�� 4��			4�� 4��
										{{1,2,3,4} ,{3,4,5,6},{10,20,30,40},{5,7,9,11}},//�� 2
										{{1,2,3,4} ,{3,4,5,6},{10,20,30,40},{5,7,9,11}}};//��3
										
		for(int i=0;i<dice1.length;i++) {
			for(int j = 0; j<dice1[i].length;j++) {
				for(int k=0; k<dice1[i][j].length; k++) {
					System.out.print("dice1 [ "+i+" ][ "+j+" ][ "+k+" ] = "+dice1[i][j][k]+"  ");
				}
			}System.out.println();
		}System.out.println();
		}
	}


