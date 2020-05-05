package day_0801;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Reservation {
	private String name;// ������ ����� �̸�
	
	private HashMap<String, Seats> reserveInfo = new HashMap(); // s,a,b�¼� ���� 10���� ����
		
	Reservation(String name, HashMap reserveInfo)
	{	
		this.name=name;
		this.reserveInfo=reserveInfo;
	}
	Reservation(){
		
	}
	
	// ���� �̸�, ���� ��ȣ, ���� �޴�, �߸��� ��� � ���ؼ� ���� �޽����� ����ϰ� ����ڰ� �ٽýõ��ϵ��� �Ѵ�.
	// �����ϴ� ->�� �ڸ��� ����

	public void reserveSeats() {

		Scanner scan = new Scanner(System.in);
		System.out.println("�����Ͻô� ���� ������ �Է����ּ���. >>");
		String name = scan.next();
		System.out.println("���Ͻô� �¼�Ÿ���� �Է����ּ���.");
		System.out.println("�¼��� Ÿ���� S��, A��, B���� �ֽ��ϴ�.>>");
		String type = scan.next();

		if (type.equals("S") | type.equals("s")) {
			System.out.println(">>S��");
			System.out.println("==[ S1 ] [ S2 ] [ S3 ] [ S4 ] [ S5 ] ==");
			System.out.println();
			System.out.println("==[ S6 ] [ S7 ] [ S8 ] [ S9 ] [ S10 ]==");
			System.out.println();
			System.out.println("���Ͻô� �¼���ȣ�� �Է����ּ���.");
			System.out.println("�¼� ��ȣ�� �� Ÿ�Ը��� 1~10������ �ֽ��ϴ�>>");
			int num = scan.nextInt();
			
			
			while (num > 11) {
				System.out.println("�߸��� �¼���ȣ�Դϴ�. �ٽ� �Է����ּ���>>");
				num = scan.nextInt();
			}
			saveReserveInfo(name, new Seats(type, num));
			System.out.println("������ �Ϸ�Ǿ����ϴ�. " + name + "���� ����� �¼��� S"+ num + "�Դϴ�.");
			System.out.println();

		} else if (type.equals("A") | type.equals("a")) {
			System.out.println(">>A��");
			System.out.println("==[ A1 ] [ A2 ] [ A3 ] [ A4 ] [ A5 ] ==");
			System.out.println();
			System.out.println("==[ A6 ] [ A7 ] [ A8 ] [ A9 ] [ A10 ]==");
			System.out.println();
			System.out.println("���Ͻô� �¼���ȣ�� �Է����ּ���.");
			System.out.println("�¼� ��ȣ�� �� Ÿ�Ը��� 1~10������ �ֽ��ϴ�.");
			int num = scan.nextInt();

			while (num > 11) {
				System.out.println("�߸��� �¼���ȣ�Դϴ�. �ٽ� �Է����ּ���");
				num = scan.nextInt();
			}
			saveReserveInfo(name, new Seats(type, num));
			System.out.println("������ �Ϸ�Ǿ����ϴ�. " + name + "���� ����� �¼��� A" + num + "�Դϴ�.");
			System.out.println();

		} else if (type.equals("B") | type.equals("b")) {
			System.out.println(">>B��");
			System.out.println("==[ B1 ] [ B2 ] [ B3 ] [ B4 ] [ B5 ] ==");
			System.out.println();
			System.out.println("==[ B6 ] [ B7 ] [ B8 ] [ B9 ] [ B10 ]==");
			System.out.println();
			System.out.println("���Ͻô� �¼���ȣ�� �Է����ּ���.");
			System.out.println("�¼� ��ȣ�� �� Ÿ�Ը��� 1~10������ �ֽ��ϴ�.");
			int num = scan.nextInt();
			while (num > 11) {
				System.out.println("�߸��� �¼���ȣ�Դϴ�. �ٽ� �Է����ּ���");
				num = scan.nextInt();
			}
			saveReserveInfo(name, new Seats(type, num));
			System.out.println("������ �Ϸ�Ǿ����ϴ�. " + name + "���� ����� �¼��� B" + num + "�Դϴ�.");
			System.out.println();
		} else {
			System.out.println("�߸��� �¼�Ÿ���Դϴ�.");
			System.out.println("���Ͻô� �¼�Ÿ���� �Է����ּ���.");
			System.out.println("�¼��� Ÿ���� S��, A��, B���� �ֽ��ϴ�.");

			type = scan.next();
		}
		

	}

	// ���������� ����
	public void saveReserveInfo(String name, Seats seat) {
	
		reserveInfo.put(name, seat);
		
	}

	// ����ϴ� -> �������� �̸��� �Է¹޾� ����ϱ�
	public void cancelSeats(String name) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Ͻ� ���� ������ �Է����ּ���.>>");
		name = scan.next();
		
		Iterator it = reserveInfo.keySet().iterator();
		
		if(reserveInfo.containsKey(name)){
			//�������� ���� 
			reserveInfo.remove(name);
			System.out.println("��Ұ� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("���������� ���� �̸��Դϴ�.");
		}
		
		

	}

	// ��� �¼��� ��ȸ
	public void checkAllSeats() {
		System.out.println();
		System.out.println("=================�¼� ��Ȳ================");
		System.out.println("================[ ����  ]================");
		System.out.println(">>S��");
		System.out.println("==[ S1 ] [ S2 ] [ S3 ] [ S4 ] [ S5 ] ==");
		System.out.println();
		System.out.println("==[ S6 ] [ S7 ] [ S8 ] [ S9 ] [ S10 ]==");
		System.out.println(">>A��");
		System.out.println("==[ A1 ] [ A2 ] [ A3 ] [ A4 ] [ A5 ] ==");
		System.out.println();
		System.out.println("==[ A6 ] [ A7 ] [ A8 ] [ A9 ] [ A10 ]==");
		System.out.println(">>B��");
		System.out.println("==[ B1 ] [ B2 ] [ B3 ] [ B4 ] [ B5 ] ==");
		System.out.println();
		System.out.println("==[ B6 ] [ B7 ] [ B8 ] [ B9 ] [ B10 ]==");
		System.out.println();
		System.out.println("================[ �ⱸ  ]================");
		System.out.println("=======================================");
		System.out.println();
	}

	//������ȸ
	public void checkReserSeats() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Ͻ� ���� ������ �Է����ּ���.>>");
		name = scan.next();
		
		Iterator it = reserveInfo.keySet().iterator();
		
		if(reserveInfo.containsKey(name)) {
		System.out.println(name+"���� ����� �ڼ��� "+reserveInfo.get(name)+"�Դϴ�.");
		}else {
			System.out.println("���������� ���� �̸��Դϴ�.");
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
