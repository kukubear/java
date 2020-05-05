package hw0719;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateCheck {
	public static boolean dateCheck(String date, String format) {
		SimpleDateFormat dateFormatParser = new SimpleDateFormat(format, Locale.KOREA);
		
		dateFormatParser.setLenient(false);
		try{
		dateFormatParser.parse(date);
		return true;
		}catch (Exception Ex) {
			return false;
		}
		
		
		
	}
}
