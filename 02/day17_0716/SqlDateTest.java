package day17_0716;

import java.sql.Date;
import java.text.ParseException;

public class SqlDateTest {
	public static void main(String[] args) throws ParseException {
		
	
	System.out.println("String -> java.sql.Date ��ȯ");
	String day = "2016-11-22"; //������ ���Ѿ���
	java.sql.Date d = java.sql.Date.valueOf(day);
	System.out.println("sql.Date d�� ���� >> "+d);
	System.out.println();
	
	System.out.println("String -> java.sql.Timestamp ��ȯ");
	//import���� ���ϸ� �Ʒ�ó�� �� ���������
	String day2 = "2016-11-22 11:22:30.0";
	java.sql.Timestamp t = java.sql.Timestamp.valueOf(day2);
	System.out.println("Timestamp t�� ���� >> "+t);
	System.out.println();
	
	System.out.println("String -> java.util.Date ��ȯ");
	String day1="20161122";
	java.util.Date d1 = new java.text.SimpleDateFormat("20161122").parse(day1);
	System.out.println("util.Date d1�� ���� >> "+d1);
	System.out.println();
	
	System.out.println("java.util.Date -> java.sql.Date ��ȯ");
	java.util.Date u = new java.util.Date();
	java.sql.Date s = new java.sql.Date(u.getTime());
	System.out.println("sql.Date s�� ���� >> "+s);
	System.out.println();
	}
}
