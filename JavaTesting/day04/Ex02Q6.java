package day04;
//�������߿��� Ȧ������ ����ϵ�, ���� ����ŭ ��µǵ��� �Ѵ�.
public class Ex02Q6 {
	public static void main(String[] args) {
		
		
	for(int a=1; a<=19; a+=2) {
		if(a%1==1) continue;
		for(int b=1; b<=19;b++) {
			System.out.println(a+" * "+b+" = "+(a*b));
		}
		
	}
}
}
