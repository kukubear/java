package day04;
//�ݺ��� : ���ǹ��� ó���ϰ��� �ϴ� ������ �ݺ�
//���� : for, while, do~while
//for���� ����
//for(�ʱⰪ; ���ǽ�; ������){
//}

//while(���ǽ�){
//}

//do~while�� ��� �ѹ��� �����մϴ� ��� ��
//do{
//......;
//while(���ǽ�);
public class Ex02 {
	public static void main(String[] args) {
		//1~100������ �հ踦 ���ϼ���.
		int sum=0;
		for(int x =1; x<=100; x++) {
			sum+=x;
				
		}
		System.out.println(sum);
		
	}
}
