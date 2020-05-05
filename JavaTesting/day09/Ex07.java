package day09;

public class Ex07 {

	public static void main(String[] args) {
		// 3차원 배열: 면 중심, 면, 행, 열: 주사위(6면 각 행과 열이 존재)
		int [][][] dice = new int[3][2][4];
		//2차원 배열이 3개 존재
		int [][][] dice1 = new int[][][] {{{1,2,3,4} ,{3,4,5,6},{10,20,30,40},{5,7,9,11}},//면 1
										//1행 4열           2행 4열 	 	3행 4열			4행 4열
										{{1,2,3,4} ,{3,4,5,6},{10,20,30,40},{5,7,9,11}},//면 2
										{{1,2,3,4} ,{3,4,5,6},{10,20,30,40},{5,7,9,11}}};//면3
										
		for(int i=0;i<dice1.length;i++) {
			for(int j = 0; j<dice1[i].length;j++) {
				for(int k=0; k<dice1[i][j].length; k++) {
					System.out.print("dice1 [ "+i+" ][ "+j+" ][ "+k+" ] = "+dice1[i][j][k]+"  ");
				}
			}System.out.println();
		}System.out.println();
		}
	}


