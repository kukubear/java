package hw0718_02;

import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Dog {
	private String name;
	private int age;
	private String kind;//ǰ��
	private HashSet Handler;
	private HashMap family;
	
	//Dog ������
	Dog(String name, int age, String kind){
		this.name=name;
		this.age=age;
		this.kind=kind;
	}
	
	//���������� �ϴ�
	//inoculate �ӼĿ� �̸��� ��¥�� �ش��ϴ� �������� ���� ����
	//������ �������� �ϸ� �ȵ�
	//ǰ���� �������� ���� �Ⱓ�� �ƴϸ� ���� �߻� ->���� ���� ���ɱⰣ�� �ƴ� 
	public void shotInoculate(String name, Date date) {
		
	}
	
	//�������� �̷��� ��¥�� �����Ͽ� ���
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//Dog �Ӽ��� ���� getter&setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public HashSet getHandler() {
		return Handler;
	}

	public void setHandler(HashSet handler) {
		Handler = handler;
	}

	public HashMap getFamily() {
		return family;
	}

	public void setFamily(HashMap family) {
		this.family = family;
	}
	
	
	
}
