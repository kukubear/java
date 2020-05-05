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

	//가변인자 : 타입... 변수명
	//가변인자는 항상 마지막 매개변수
	static String concatenate(String delim, String... args) {
		// TODO Auto-generated method stub
		String result = "";

		for (String str : args) {//배열은 왼쪽과 같이 쓰면 값을 배열에 저장해줌
			result += str + delim;
		}

		return result;
	}
}
