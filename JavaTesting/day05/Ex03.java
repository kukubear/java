package day05;
//--while(~�ϴ� ���ȿ�, ���� ��쿡 �ݺ�����, ���ǽ� �̿� �̳� true)
public class Ex03 {

	public static void main(String[] args) {
		//Q Hello Java��� ���ڿ��� 5�� �ݺ� ����ϼ���.
		int i=1;
		
	 while(i<=5) {
		 System.out.println("Hello Java!");
		 i++;
	 }
	 
	 //I like java programming~~!! 5�� ����ϱ�
	 
	 int a=1;
	 String java ="I like java programming!!";
	 
		/*
		 * while(a<=5) { System.out.println(java); a++; }
		 */
	 
	 //-1+2-3+4.........-99+100 �� �հ踦 ���ϼ���.
	 
	 //-1+315+7....+99=
	int i1=1, sum=0, sw=1;
	while(i1<=99) {
		sw=sw*(-1);
		sum=sum+(i1*sw);
		
		i1+=2;
	}
	System.out.println(sum);
	}

}
