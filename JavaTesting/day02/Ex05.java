package day02;
//������ Operator
//���, ����, ����, ���մ���
//bit������ : and, or, not, exor, nand, nor, <<, >>, >>>

public class Ex05 {
	public static void main(String[] args) {
		//1. ���������(+,-,*,/(������),%(������))
		
		int x = 50, y=30, z = x+y, z1 = x-y, z2 = x*y, z3 = x/y, z4 = x%y;
		System.out.println("---������� ��---");
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		
		
		//2. ���迬���� : ���׿���, x<=y, x>=y, x==y, x!=y :true/false
		int a = 100, b = 200;
		boolean result = false;
		
		System.out.println("----���� and���� ��----");
		
		result = a < b && a >=b;
		System.out.println(result);
		
		result = a < b && b < 300;
		System.out.println(result);
		
		result = a > b && b++ > 300;
		System.out.println(result);
		
		result = a < b && ++b > 200;
		System.out.println(result);
		
		result = a == b && b!=a;
		System.out.println(result);
		
		System.out.println("----or���� ��----");
		
		result = a < b || a >=b;
		System.out.println(result);
		
		result = a < b || b < 300;
		System.out.println(result);
		
		result = a > b || b++ > 300;
		System.out.println(result);
		
		result = a < b || ++b > 200;
		System.out.println(result);
		
		result = a == b || b!=a;
		System.out.println(result);
		
		//���մ��Կ�����
		//��� ���� + ���Կ��� = ���� ����
		//+-, -=, *=, /=, %=
		int x1 = 350;
		
		System.out.println("---���մ��Կ��� ��---");
		x1+=1000;
		System.out.println(x1);
		x1-=350;
		System.out.println(x1);
		x1*=5;
		System.out.println(x1);
		x1%=2;
		System.out.println(x1);
		x1/=3;
		System.out.println(x1);
		
		//����������
		//���� :
		int x2=0, y2=10, z10= 50, sum1, sum2;
		System.out.println("---�������� ��---");
		x2++;
		System.out.println(x2);
		x2--;
		System.out.println(x2);
		++x2;
		System.out.println(x2);
		
		sum1= x2+ ++y2 - z10--;
		System.out.println(sum1);
		
		sum2 = sum1++ - y;
		System.out.println(sum2);
		
		z10--;
		System.out.println(z10);
		
		
	
		
		
}
}
