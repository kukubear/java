package day11_0708;

import java.util.Arrays;

//내림차순
public class ArrayEx10 {
	public static void main(String[] args) {
		int [] score = {79,88,91,33,100,55,95};
		
		Arrays.sort(score);		
		for(int i = 6; i>=0;i--) {
			System.out.println(score[i]);
		}
		
		
		
	}
}
