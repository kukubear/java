package day18_0717;

public class ArmyTest {
	
	public static void main(String[] args) {
		

		Army[] sub = new Army[2];

		sub[0] = new Army("ȫ�浿", 24, "����", "20190101", "20201231");
		sub[1] = new SpecialArmy("��浿", 24, "��", "20190101", "20201231", 300000);
		
		Army sa = new Army("��ҷ�", 30, "�ҷ�", "20000101", "20250101", sub);
		
		

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
