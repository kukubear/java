package day17_0716;

import java.sql.Date;
import java.text.ParseException;

public class SqlDateTest {
	public static void main(String[] args) throws ParseException {
		
	
	System.out.println("String -> java.sql.Date 변환");
	String day = "2016-11-22"; //형식을 지켜야함
	java.sql.Date d = java.sql.Date.valueOf(day);
	System.out.println("sql.Date d의 값은 >> "+d);
	System.out.println();
	
	System.out.println("String -> java.sql.Timestamp 변환");
	//import선언 안하면 아래처럼 다 적어줘야함
	String day2 = "2016-11-22 11:22:30.0";
	java.sql.Timestamp t = java.sql.Timestamp.valueOf(day2);
	System.out.println("Timestamp t의 값은 >> "+t);
	System.out.println();
	
	System.out.println("String -> java.util.Date 변환");
	String day1="20161122";
	java.util.Date d1 = new java.text.SimpleDateFormat("20161122").parse(day1);
	System.out.println("util.Date d1의 값은 >> "+d1);
	System.out.println();
	
	System.out.println("java.util.Date -> java.sql.Date 변환");
	java.util.Date u = new java.util.Date();
	java.sql.Date s = new java.sql.Date(u.getTime());
	System.out.println("sql.Date s의 값은 >> "+s);
	System.out.println();
	}
}
