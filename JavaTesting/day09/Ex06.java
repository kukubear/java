package day09;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 1������ 2������ ȥ�չ��
		//������ ���� ������ �ֽ��ϴ�. �̸��� 1���� �迭�� �ϰ�, �����ʹ� 2���� �迭�� 
		//������ ����� ���Ϸ� ����ϼ���.
		//datan
		//�⼷ ���� ���
		//���� 90  90  90
		//���� 80  85  75
		//���� 70  60  90
		String name[]= new String[]{"�⼷","���","����"};
		int score[][] = new int[3][3];
		int sum = 0,avr=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("�Ʒ� ������ ������ �Է��ϴµ� ������ ��������, ��������, �������� ������� �Է��ϼ���.");
		System.out.print(name[0]+"\t"+name[1]+"\t"+name[2]+"\t");
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score.length; j++) {
				score[i][j] = sc.nextInt();
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i =0; i<score.length; i++) {
			sum=0;
			
			for(int j = 0; j<score[i].length; j++) {
				sum+=score[j][i];
				
			}System.out.print(sum+"\t");
			
			
		}
	}

}
