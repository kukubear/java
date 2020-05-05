package day11_0708;

public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = { "", "100", "200", "300" };
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[] { "1", "2", "3" }));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}

	//�������� : Ÿ��... ������
	//�������ڴ� �׻� ������ �Ű�����
	static String concatenate(String delim, String... args) {
		// TODO Auto-generated method stub
		String result = "";

		for (String str : args) {//�迭�� ���ʰ� ���� ���� ���� �迭�� ��������
			result += str + delim;
		}

		return result;
	}
}
