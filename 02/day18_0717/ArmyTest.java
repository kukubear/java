package day18_0717;

public class ArmyTest {
	
	public static void main(String[] args) {
		

		Army[] sub = new Army[2];

		sub[0] = new Army("È«±æµ¿", 24, "º´Àå", "20190101", "20201231");
		sub[1] = new SpecialArmy("±è±æµ¿", 24, "»óº´", "20190101", "20201231", 300000);
		
		Army sa = new Army("±è¼Ò·É", 30, "¼Ò·É", "20000101", "20250101", sub);
		
		

		sa.returnSub();
		System.out.println(sa.getThisMMPeriod());
		sa.printSubOverTimePay();
		
		try {
		sa.printSub();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

	/*
	 * sa.printSubOverTimePay(); sa.returnSub(); sa.printSub();
	 * sa.printSubOverTimePay();
	 */

}
