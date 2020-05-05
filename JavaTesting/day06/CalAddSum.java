package day06;

public class CalAddSum {
	static int AddSum(int i) {
		if(i==1) {
			return 1;
		}else {
			return i +AddSum(i-1);
		}
		
}
}