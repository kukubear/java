package day17_0716;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {
	public static void main(String[] args) {
		
		  // ���� ����ȭ
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		  System.out.println(df2.format(1234456789.98));
		  
		  DecimalFormat df3 = new DecimalFormat("#,###");
		  
		  // ��¥ ����ȭ 
		  Date today = new Date(); SimpleDateFormat sdf4 = new
		  SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		  System.out.println(sdf4.format(today));
		  
		  // Ư�������� ���ڿ��� ��ȯ // #�� ��谪 ����(�۰ų� ����) < �� ��谪 ������
		 		String pattern = "60#D|70#C|80<B|90#A";
		int[] scores = { 91, 90, 80, 88, 70, 52, 60 };
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		/*
		 * int pattern1 = Integer.parseInt(pattern); System.out.println(pattern1);
		 * System.out.println(pattern);
		 */
		
		for(int i=0; i<scores.length;i++) {
			System.out.println(scores[i]+":"+form.format(scores[i]));
		}

		// message Format ���� ��

		// java.sql.date ��ȯ
	}
}
