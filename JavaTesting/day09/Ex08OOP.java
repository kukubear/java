package day09;

import java.util.Scanner;

/*
 * Ŭ���� : ��ü�� ����ϱ� ���� Ʋ
 * ��ü : �����͸� ó���ϱ� ���� Ʋ -> ���� �����ϱ� ���� ����
 * �޼ҵ� : ��ü�� ������ �ִ� �����͸� � ���·� ����ó���ϱ� ���� Ʋ or����
 * �޼ҵ� �����ε� : ���� �ٸ� ������ ������, �̸��� �ݵ�� �޼ҵ��� ���� 
 * ������ : Ŭ�������� ó���ϴ� �����͸�  �����Ͽ� �ʱ�ȭ�ϴ� ���� (Ŭ���� ����)
 * ������ �����ε� : ���� �ٸ� ������ ������, �̸��� �ݵ�� Ŭ������� ���� 
 * ��� : �θ�Ŭ������ �ڽ�Ŭ���� ���� ���輺 extends(��ӽ�) implements(���ǵ� ������� Ŭ�������� ��� �����ϰڴ�)
 * A extends B implements C,D,E{
 * interface A extends B
 * 
 * �޼ҵ� �������̵� : �� Ŭ������ ��Ӱ����� �� �޼ҵ带 �������̵� �� �� ��
 * �������̽� : 
 * �߻� Ŭ���� : 
 * ����Ŭ���� :
 * ������ : 
 * */

public class Ex08OOP extends Parents {

	Ex08OOP(int dad, int mom) {
		super(dad, mom);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Parents c = new Parents(20000, 50000);
		c.add(20000, 50000);
		
	}

}
