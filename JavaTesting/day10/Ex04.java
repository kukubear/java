package day10;

import java.util.Scanner;

class Bank {
	private int input, withdrawl, remain, total;
	private static String account, name;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		
		this.input = input;
	}

	public int getWithdrawl() {
		return withdrawl;
	}

	public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		remain = total - withdrawl;
		this.remain = remain;
	}

	public static String getAccount() {
		return account;
	}

	public static void setAccount(String name) {
		Bank.name = account;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		total += input;
		this.total = total;
	}


}

public class Ex04 extends Bank {
//����] ���������� �ֽ��ϴ�.
//1. ���� ����
//2. ���� : 1000+2000+3000
//3. ���: 500
//4. �ܾ� 5500
//5. �Աݾ׿� ���� üũ ��ݾ׿� ����üũ
	// ����̿��Ͽ� �ڵ�

	public static void main(String[] args) {
		int input, withdrawl, remain, total = 0;
		String name;
		boolean conti = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.(�̸� = ����)");
		name = sc.next();
		while (conti) {
			System.out.println("������ �ݾ��� �Է��ϼ���.");
			System.out.println(">>�Ա��� �����÷��� 0�� �����ּ���.<<");
			input = sc.nextInt();
			if (input == 0) {
				System.out.println("�Ա��� �ߴ��մϴ�.");
				conti = true;
			}
			total += input;
		}
		System.out.println("����� �ݾ��� �Է����ּ���: ");
		withdrawl = sc.nextInt();
		remain = total - withdrawl;
		System.out.println("���� �ܾ��� " + remain + "�� �Դϴ�.");

	}

}
