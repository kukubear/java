package day04;
//���� 1���� 1�� �����Ͽ� ���ʷ� ���� 3000�� �Ѵ� ������ ���� ��?
public class Ex02Q3 {
public static void main(String[] args) {
	int i = 1; int sum=0;
	for(i=1;true;i++) {
		
		sum +=i;
		if(sum>=3000) {
			System.out.println(i);
			System.out.println(sum);
			break;
		}
		
		
	}
}
}
