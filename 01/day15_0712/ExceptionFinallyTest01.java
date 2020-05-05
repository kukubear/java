package day15_0712;

public class ExceptionFinallyTest01 {

	public static void main(String[] args) {
		// method1은 static method이므로 인스턴스 생성없이 직접호출
		ExceptionFinallyTest01.method1();
		System.out.println("method1의 수행을 마치고 main method로 리턴");

	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			return;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}
	}//method 1 method 끝    

}
