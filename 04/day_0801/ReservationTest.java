package day_0801;

import java.util.Scanner;

public class ReservationTest {
	public static void main(String[] args) {
		

		Reservation rv = new Reservation();
		String name;

		int selecNum;
		boolean onGoing = true;

		while (onGoing) {
			System.out.println("================================");
			System.out.println("===========  ���� �޴�  ===========");
			System.out.println("=== 1.����                                  ===");
			System.out.println("=== 2.��ȸ(1.��ü�¼�/2.�����˼�) ===");
			System.out.println("=== 3.���                                  ===");
			System.out.println("=== 4.������                                ===");
			System.out.println("================================");
			System.out.println("================================");
			System.out.println();
			System.out.println("��ȣ�� �Է����ּ���.");

			Scanner scan = new Scanner(System.in);
			selecNum = scan.nextInt();

			switch (selecNum) {
			case 1:
				rv.reserveSeats(); 
				
				break;
			case 2:
				System.out.println("��ü�¼� ��ȸ(1) / �����¼���ȸ(2)");
				int num = scan.nextInt();
				switch (num) {
				case 1:
					rv.checkAllSeats();
					break;
				case 2:
		
					rv.checkReserSeats();
					break;
				}
				break;
			case 3:
				rv.cancelSeats(rv.getName());
				break;
			case 4:
				onGoing = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� ��ȣ�� �Է����ּ���.");
				selecNum = scan.nextInt();
				break;
			}

		}
	}
}
