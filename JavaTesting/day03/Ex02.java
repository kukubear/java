package day03;
//������ 
public class Ex02 {
private static String userInput;

// operand
	public static void main(String[] args) {
		int x = 300, y = 500, sum = x+y;
		/*int : ������ ������
		 *sum = 
		 *x : ������ ���(operand) 
		 *+ ->������(operator)
		 *y : ������ ���(operand)
		 * =�����ڴ� ���������� �����ʿ��� �������� �����
		 * ^= exclusive or�� �ν���*/
		System.out.println(sum);
		
		//char : -128~127
		
		double currentBalance = 10000.0;
		double val = Double.valueOf(userInput);
		if(Double.isNaN(val)) {
			System.out.println("Nan�� �ԷµǾ� ó���� �� ����");
			val = 10.0;
		}
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
