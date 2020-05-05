package day08;

//°úÁ¦ 1
//
//1  2  3  4  5
//   6  7  8   
//      9
//   10 11 12
//13 14 15 16 17
public class D8hw1 {

	public static void main(String[] args) {

//		upper();
//		middle();
//		lower();

		int[][] arr3 = new int[5][5];
		int value = 0, value2 = 0;

		for (int i = 0; i < arr3.length; i++) {
			if(i<=2) {
			for (int j = 0; j <arr3.length; j++) {

				value += 1;

				if (i == 1) {
					arr3[i][0] = 0;
					arr3[i][4] = 0;

				}
				}
				
			}
			

		}

	}

}
