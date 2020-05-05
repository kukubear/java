package day17_0716;

import java.util.LinkedList;

//로직 다시 혼자 해보기 
// hobby추가 삭제
//exception처리
public class CompanyMan {
	private String name;
	private int age;
	private String[] hobby;
	private Company nowCompany;
	private Company[] historyCompany;
	private int TotalPeriod;

	CompanyMan(String name, int age, Company nowCompany) {
		this.name = name;
		this.age = age;
		this.nowCompany = nowCompany;

	}

	// 총 회사 근무이력기간 리턴
	public int getTotalPeriod() {

		int sum = 0;
		for (int i = 0; i < historyCompany.length; i++) {
			sum += historyCompany[i].getPeriod();
		}

		return TotalPeriod;
	}

	// 취미를 추가
	
	public void setHobby(String[] hobby) {
		LinkedList<String>hobby = new LinkedList<String>();
		

	}

	// 취미를 삭제
	public void delHobby(String hobby) {

	}

	public void setNowCompany(Company nowCompany) {
		this.nowCompany = nowCompany;
	}

	public void historyCompany() {

	}

	public void printHistoryCompany() {

	}

	public static void main(String[] args) {
		Company[] com = new Company[5];
		com[0] = new Company("삼성", 36);
		com[1] = new Company("IT회사", 10);
		com[2] = new Company("마이더스아이티", 24);
		Company cp = new Company("LG전자");

		CompanyMan cpm = new CompanyMan("홍길동", 27, com[com.length - 1].name);

	}

}
