package day15_0712;

public class ExceptionEx03 {
	public static void main(String[] args) {
		try {

			Exception e = new Exception("���Ƿ� �߻�������");
			throw e;// ���� �߻���Ŵ

			// throw new Exception("���Ƿ� �߻�������");
		} catch (Exception e) {
			System.out.println("���� �޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���������� ����Ǿ���");
	}
}
