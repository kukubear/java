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
//문제] 저축은행이 있습니다.
//1. 계좌 생성
//2. 저축 : 1000+2000+3000
//3. 출금: 500
//4. 잔액 5500
//5. 입금액에 대한 체크 출금액에 대한체크
	// 상속이용하여 코딩

	public static void main(String[] args) {
		int input, withdrawl, remain, total = 0;
		String name;
		boolean conti = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.(이름 = 계좌)");
		name = sc.next();
		while (conti) {
			System.out.println("저축할 금액을 입력하세요.");
			System.out.println(">>입금을 끝내시려면 0을 눌러주세요.<<");
			input = sc.nextInt();
			if (input == 0) {
				System.out.println("입금을 중단합니다.");
				conti = true;
			}
			total += input;
		}
		System.out.println("출금할 금액을 입력해주세요: ");
		withdrawl = sc.nextInt();
		remain = total - withdrawl;
		System.out.println("현재 잔액은 " + remain + "원 입니다.");

	}

}
