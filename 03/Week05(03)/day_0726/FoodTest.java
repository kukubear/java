package day_0726;

import java.sql.Date;
import java.util.Comparator;

public class FoodTest implements Comparator<Food>{
	public static void main(String[] args) {
		AutoFood af = new AutoFood(1, Date.valueOf("2019-07-26"));
		AutoFood af1 = new AutoFood(2, Date.valueOf("2019-07-26"));
		AutoFood af2 = new AutoFood(3, Date.valueOf("2019-07-26"));
		
		Noodle ramen = new Noodle(1345, "ÀÏº»½Ä ¶ó¸à",15);
		Noodle riceNoodle = new Noodle(1345, "½Ò±¹¼ö",30);
		
		FriedRice fr = new
		
		
	}

	@Override
	public int compare(Food o1, Food o2) {
		 
		return 0;
	}
}
