package day02;
//����ȯ
//������, ������ 2���� ����
//������ ����ȯ(�ڵ�����ȯ) -> ����+���� = ����, ������+�Ǽ��� = �Ǽ���, float+double = double
//������ ����ȯ ->���ϴ� ���·� ������ ���� 
public class Ex02 {
	public static void main(String[] args) {
	//������ ����ȯ
		float f = 3.14159267f;
		System.out.println(f);
		
		int i = 3000;
		System.out.println(i);
		
		float sum = f+i;
		System.out.println(sum);
		
	//����������ȯ ->��Ȳ�� �°�����ȯ �ʿ�
	//����� �� �ٷ� ����ȯ�ϰų� Ȥ�� ����ü�� ����ȯ�Ͽ� ��� �� ����ϴ� ��� 2����
		System.out.println((int)f);
		System.out.println((float)i);
		System.out.println((int)sum);
}
}
