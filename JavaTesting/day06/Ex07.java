package day06;

import java.util.Scanner;
 
//����] AddSum(100); �̰��� �̿��Ͽ� Ŭ���� ���ο��� �����ϰ�, �� Ŭ���� �ܺο��� �����Ͽ� ����ϵ��� �ϱ�
//MS7 class ���� ���� ��ü:ms7
//CalAddSum Class (�ܺ� ����) ��ü : cas


public class Ex07 {
	//Field Area
	
	private static int AddSum(int i) {
		if(i==1) {
			return 1;
		}else {
			return i +AddSum(i-1);//100+99=199+98
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//�����ڸ� ����ϰ� �ʹٸ�
		//Ex07 ms7 = new Ex07();
		//ms7.AddSum(100); 
		//-> ��ü�� �̿��Ͽ� ȣ���ϴ� ���
		//SYstem
		
	System.out.println("1.���� 1~100�� �հ� = "+ AddSum(100));
	
	
	
	CalAddSum cas = new CalAddSum();
	System.out.println("2.�ܺ� 1~100�� �հ� = "+cas.AddSum(100));
	
}
}
