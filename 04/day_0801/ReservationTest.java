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
			System.out.println("===========  예약 메뉴  ===========");
			System.out.println("=== 1.예약                                  ===");
			System.out.println("=== 2.조회(1.전체좌석/2.예약죄석) ===");
			System.out.println("=== 3.취소                                  ===");
			System.out.println("=== 4.끝내기                                ===");
			System.out.println("================================");
			System.out.println("================================");
			System.out.println();
			System.out.println("번호를 입력해주세요.");

			Scanner scan = new Scanner(System.in);
			selecNum = scan.nextInt();

			switch (selecNum) {
			case 1:
				rv.reserveSeats(); 
				
				break;
			case 2:
				System.out.println("전체좌석 조회(1) / 예약좌석조회(2)");
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
				System.out.println("잘못된 입력입니다. 다시 번호를 입력해주세요.");
				selecNum = scan.nextInt();
				break;
			}

		}
	}
}
