package day03;

public class Ex01 {
	public static void main(String[] args) {
	//����� �ǽ�
		System.out.println("�� ��(new line)\t\\n\t"+(int)'\n');
		System.out.println("��(tab)\t\\t\t"+(int)'\t');
		System.out.println("�齺���̽�(backspace)\t\\b\t"+(int)'\b');
		System.out.println("�������ߺ�ȣ(Single Quote)\t\\'\t"+(int)'\'');
		System.out.println("���� �ο��ȣ(Double Quote)\t\\\"\t"+(int)'\"');
		System.out.println("�齽����(Backslash)\t\\\\t"+(int)'\\');
		System.out.println("�� ����(null)\t\\0\t"+(int)'\0');
		
	//������ ��Ϲ��� �ǽ� -> ���������� ��������
		{//���� block D
			int d = 10;
			{//���� block C
				int c = 20;
				{//���� block B
					int b = 30;
					{//���� block A
						int a = 40;
						a=200;
						b=1000;
						c=2000;
						d=50;
						System.out.println("1: "+a+" "+b+" "+c+" "+d);
					}//end A
					b=200;
					c=300;
					d=60;
					System.out.println("2: "+b+" "+c+" "+d);
				}//end B
				c=300;
				d=70;
				System.out.println("3: "+c+" "+d);
			}//end C
			d=80;
			System.out.println("4: "+d);
		}//end D
}//main
}//class
