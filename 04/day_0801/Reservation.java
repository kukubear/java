package day_0801;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Reservation {
	private String name;// 예약할 사람의 이름
	
	private HashMap<String, Seats> reserveInfo = new HashMap(); // s,a,b좌석 각각 10개씩 있음
		
	Reservation(String name, HashMap reserveInfo)
	{	
		this.name=name;
		this.reserveInfo=reserveInfo;
	}
	Reservation(){
		
	}
	
	// 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고 사용자가 다시시도하도록 한다.
	// 예약하다 ->한 자리만 가능

	public void reserveSeats() {

		Scanner scan = new Scanner(System.in);
		System.out.println("예약하시는 분의 성함을 입력해주세요. >>");
		String name = scan.next();
		System.out.println("원하시는 좌석타입을 입력해주세요.");
		System.out.println("좌석의 타입은 S석, A석, B석이 있습니다.>>");
		String type = scan.next();

		if (type.equals("S") | type.equals("s")) {
			System.out.println(">>S석");
			System.out.println("==[ S1 ] [ S2 ] [ S3 ] [ S4 ] [ S5 ] ==");
			System.out.println();
			System.out.println("==[ S6 ] [ S7 ] [ S8 ] [ S9 ] [ S10 ]==");
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력해주세요.");
			System.out.println("좌석 번호는 각 타입마다 1~10번까지 있습니다>>");
			int num = scan.nextInt();
			
			
			while (num > 11) {
				System.out.println("잘못된 좌석번호입니다. 다시 입력해주세요>>");
				num = scan.nextInt();
			}
			saveReserveInfo(name, new Seats(type, num));
			System.out.println("예약이 완료되었습니다. " + name + "님의 예약된 좌석은 S"+ num + "입니다.");
			System.out.println();

		} else if (type.equals("A") | type.equals("a")) {
			System.out.println(">>A석");
			System.out.println("==[ A1 ] [ A2 ] [ A3 ] [ A4 ] [ A5 ] ==");
			System.out.println();
			System.out.println("==[ A6 ] [ A7 ] [ A8 ] [ A9 ] [ A10 ]==");
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력해주세요.");
			System.out.println("좌석 번호는 각 타입마다 1~10번까지 있습니다.");
			int num = scan.nextInt();

			while (num > 11) {
				System.out.println("잘못된 좌석번호입니다. 다시 입력해주세요");
				num = scan.nextInt();
			}
			saveReserveInfo(name, new Seats(type, num));
			System.out.println("예약이 완료되었습니다. " + name + "님의 예약된 좌석은 A" + num + "입니다.");
			System.out.println();

		} else if (type.equals("B") | type.equals("b")) {
			System.out.println(">>B석");
			System.out.println("==[ B1 ] [ B2 ] [ B3 ] [ B4 ] [ B5 ] ==");
			System.out.println();
			System.out.println("==[ B6 ] [ B7 ] [ B8 ] [ B9 ] [ B10 ]==");
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력해주세요.");
			System.out.println("좌석 번호는 각 타입마다 1~10번까지 있습니다.");
			int num = scan.nextInt();
			while (num > 11) {
				System.out.println("잘못된 좌석번호입니다. 다시 입력해주세요");
				num = scan.nextInt();
			}
			saveReserveInfo(name, new Seats(type, num));
			System.out.println("예약이 완료되었습니다. " + name + "님의 예약된 좌석은 B" + num + "입니다.");
			System.out.println();
		} else {
			System.out.println("잘못된 좌석타입입니다.");
			System.out.println("원하시는 좌석타입을 입력해주세요.");
			System.out.println("좌석의 타입은 S석, A석, B석이 있습니다.");

			type = scan.next();
		}
		

	}

	// 예약자정보 저장
	public void saveReserveInfo(String name, Seats seat) {
	
		reserveInfo.put(name, seat);
		
	}

	// 취소하다 -> 예약자의 이름을 입력받아 취소하기
	public void cancelSeats(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("예약하신 분의 성함을 입력해주세요.>>");
		name = scan.next();
		
		Iterator it = reserveInfo.keySet().iterator();
		
		if(reserveInfo.containsKey(name)){
			//예약정보 삭제 
			reserveInfo.remove(name);
			System.out.println("취소가 완료되었습니다.");
		}else {
			System.out.println("예약정보에 없는 이름입니다.");
		}
		
		

	}

	// 모든 좌석을 조회
	public void checkAllSeats() {
		System.out.println();
		System.out.println("=================좌석 현황================");
		System.out.println("================[ 무대  ]================");
		System.out.println(">>S석");
		System.out.println("==[ S1 ] [ S2 ] [ S3 ] [ S4 ] [ S5 ] ==");
		System.out.println();
		System.out.println("==[ S6 ] [ S7 ] [ S8 ] [ S9 ] [ S10 ]==");
		System.out.println(">>A석");
		System.out.println("==[ A1 ] [ A2 ] [ A3 ] [ A4 ] [ A5 ] ==");
		System.out.println();
		System.out.println("==[ A6 ] [ A7 ] [ A8 ] [ A9 ] [ A10 ]==");
		System.out.println(">>B석");
		System.out.println("==[ B1 ] [ B2 ] [ B3 ] [ B4 ] [ B5 ] ==");
		System.out.println();
		System.out.println("==[ B6 ] [ B7 ] [ B8 ] [ B9 ] [ B10 ]==");
		System.out.println();
		System.out.println("================[ 출구  ]================");
		System.out.println("=======================================");
		System.out.println();
	}

	//예약조회
	public void checkReserSeats() {
		Scanner scan = new Scanner(System.in);
		System.out.println("예약하신 분의 성함을 입력해주세요.>>");
		name = scan.next();
		
		Iterator it = reserveInfo.keySet().iterator();
		
		if(reserveInfo.containsKey(name)) {
		System.out.println(name+"님의 예약된 자석은 "+reserveInfo.get(name)+"입니다.");
		}else {
			System.out.println("예약정보에 없는 이름입니다.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public HashMap<String, Seats> getReserveInfo() {
		return reserveInfo;
	}

	public void setReserveInfo(HashMap<String, Seats> reserveInfo) {
		this.reserveInfo = reserveInfo;
	}


}
