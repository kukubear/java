package day05;
/*����] �� ���� �Է¹޾Ƽ� ����, ����, ����, ������(��), ������
 �����ϴ� ���α׷� 
 *1. �䱸���� �ľ� : ����, ����, ����, ������(��), ������
 *2. �䱸���� �м� : ����
 *3. �䱸���� ���� : ������Ÿ��(��������), ������(first, second)
 * �޼ҵ�� : ����(Adder), ����(Subtract), ����(Multiple), ������(Divide), ������(Remain)
 * Ŭ������ : CalAdder, CalSubstract, CalMultiple, CalDivide, CalRemain, main: CalTotal
 * ��ü(object) : add, sub, mul, dvd, rm,total
 */
public class Cal {

	private static void main(String[] args) {
		CalAdder add = new CalAdder();
		add.Adder();//��ü��.�޼ҵ��
		
		CalSubtract sub = new CalSubtract();
		sub.Subtract();
		
		CalMultiple mul = new CalMultiple();
		mul.Multiple();
		
		CalDivide dvd = new CalDivide();
		dvd.Divide();
		
		CalRemain rm = new CalRemain();
		rm.Remain();
	}

}
