package day12_0709;

class Value {
	int value;

	Value(int value) {
		this.value = value;
		System.out.println(value);
	}
}

public class EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		System.out.println(v1);//�ּҰ�
		System.out.println(v2);//�ּҰ�
		System.out.println();
		System.out.println(v1.equals(v2)); //false?!
		System.out.println(v1==v2);//�ּҴٸ��ϱ� false
		System.out.println();
		
		if (v1.equals(v2)) {
			System.out.println();
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
			
		} else {
			System.out.println("v1�� v2�� �����ϴ�.");
		}
		
		v2 = v1;

		System.out.println(v1);//�ּҰ�
		System.out.println(v2);
		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println
			("v1�� v2�� �ٸ��ϴ�.");
		}

	}
}
