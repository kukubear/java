package day05;

import java.util.Scanner;

//�μ��� �Է¹޾Ƽ�, ū ���� ���� ���� �����Ͽ� ����ϼ���.
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * int x,y;
		 * 
		 * do {
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("ù ��° ���ڸ� �Է��ϼ���: "); x=sc.nextInt();
		 * System.out.println("�� ��° ���ڸ� �Է��ϼ���: "); y=sc.nextInt();
		 * 
		 * if(x>y) { System.out.println("max= "+x+" min= "+y); }else {
		 * System.out.println("max= "+y+" min= "+x); }
		 * 
		 * }while(x==y);
		 */
		
		
		  int su1, su2, xValue, yValue;
		  String xsu,ysu;
		  
		  do {
		
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("������ �� ���� �Է��ϼ���: "); 
		  xsu=sc.next();
		  ysu=sc.next();
		  su1=Integer.parseInt(xsu); 
		  su2=Integer.parseInt(ysu);
		  
		  
		  xValue = (su1>su2)? su1:su2; 
		  yValue = (su1<su2)? su1:su2;
		  System.out.println("ū���� = "+xValue+"�̰�, ���� ���� = "+yValue+"�Դϴ�.");
		  
		  }while(true);
		 
	}

}
