package day08;

/*/°úÁ¦4>

21 22 23 24 25

16 17 18 19 20

11 12 13 14 15

6  7  8  9  10

1  2  3  4  5*/
public class D8hw4 {
public static void main(String[] args) {
	
		int[][] arr3 = new int[5][5];
		int value = 0, value2 = 0;

		for (int i = 4; i <= 0; i--) {
			
			for (int j = 0; j <5; j++) {

				value += 1;
				
				
				if (i == 1) {
					arr3[i][0] = 0;
					arr3[i][4] = 0;

				}
				System.out.print(value+"\t");
			}
			System.out.println();

		}

	}

}

