package day09;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//����] 30���� �л����� �ֺ��������� ���� ������ ������
		//������ ��������
		//���� : 5(�ſ� ����), 4(����), 3(����),2(�Ҹ���),1(�ſ� �Ҹ���)
		//��� -> 5: 10�� 4:5�� 3:10�� 2:2�� 1:3��
		
		int rest[] = new int[5];
		int sum=0; float total=0.0f;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("5���� �� �л��� ���� �Է��ϼ���: ");
	   rest[0] = sc.nextInt();
	   System.out.println("4���� �� �л��� ���� �Է��ϼ���: ");
	   rest[1]= sc.nextInt();
	   System.out.println("3���� �� �л��� ���� �Է��ϼ���: ");
	   rest[2] = sc.nextInt();
	   System.out.println("2���� �� �л��� ���� �Է��ϼ���: ");
	   rest[3] = sc.nextInt();
	   System.out.println("1���� �� �л��� ���� �Է��ϼ���: ");
	   rest[4] = sc.nextInt();
	   System.out.println("==�ֺ������� ������ ������(30�� ����)==");
	   System.out.println(" �ſ� ����  : "+rest[0]+"��");
	   System.out.println("   ����    : "+rest[1]+"��");
	   System.out.println("   ����    : "+rest[2]+"��");
	   System.out.println("  �Ҹ���   : "+rest[3]+"��");
	   System.out.println("�ſ� �Ҹ��� : "+rest[4]+"��");
	   
	   for(int i =0; i<rest.length;i++) {
		   if(i==0)
			   sum=rest[i]*5;
		   if(i==1)
			   sum=rest[i]*4;
		   if(i==2)
			   sum=rest[i]*3;
		   if(i==3)
			   sum=rest[i]*2;
		   if(i==4)
			   sum=rest[i]*1;
		  total+=sum;
		   
	   }
	   System.out.println("�������� ������ "+total/30);
		
	   int response[] = {5,2,3,1,1,1,5,5,2,3,3,3,4,4,4,5,5,5,3,4,4,3,3,3,3,3,5,5,5};
	   int frequency[]=new int[5];
	   
	   for(int i=0;i<response.length;i++) {
		   if(response[i]==1)
			   ++frequency[0];
		   else if(response[i]==2)
			   ++frequency[1];
		   else if(response[i]==3)
			   ++frequency[2];
		   else if(response[i]==4)
			   ++frequency[3];
		   else if(response[i]==5)
			   ++frequency[4];
	   }
	   for(int j=0; j<frequency.length;j++) {
		   System.out.println(j+" : "+frequency[j]);
	   }
	}

}
