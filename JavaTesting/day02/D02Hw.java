package day02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//과제 1
public class D02Hw {
	public static void main(String[] args) {
		//과제 1
		int aa=100, bb=200, cc=10, dd=20, xx, yy, sumsum, hap;
		aa++;//101(102)
		System.out.println(aa++);
		
		--cc;//8
		System.out.println(--cc);

		xx = (aa++) + cc;//111
		System.out.println(xx);

		dd++;//21(22)
		System.out.println(dd++);


		sumsum = cc + aa++;//
		System.out.println(sumsum);

		hap = bb++ - aa + cc;
		System.out.println(hap);


		yy = sumsum + hap; 
		System.out.println(yy);
		
	
		
	}
}
