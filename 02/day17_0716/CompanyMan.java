package day17_0716;

import java.util.LinkedList;

//���� �ٽ� ȥ�� �غ��� 
// hobby�߰� ����
//exceptionó��
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

	// �� ȸ�� �ٹ��̷±Ⱓ ����
	public int getTotalPeriod() {

		int sum = 0;
		for (int i = 0; i < historyCompany.length; i++) {
			sum += historyCompany[i].getPeriod();
		}

		return TotalPeriod;
	}

	// ��̸� �߰�
	
	public void setHobby(String[] hobby) {
		LinkedList<String>hobby = new LinkedList<String>();
		

	}

	// ��̸� ����
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
		com[0] = new Company("�Ｚ", 36);
		com[1] = new Company("ITȸ��", 10);
		com[2] = new Company("���̴�������Ƽ", 24);
		Company cp = new Company("LG����");

		CompanyMan cpm = new CompanyMan("ȫ�浿", 27, com[com.length - 1].name);

	}

}
