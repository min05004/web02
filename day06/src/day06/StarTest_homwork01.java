package day06;

public class StarTest_homwork01 {
	public static void main(String[] args) {
		/*
		 * 1번 문제
		 * *******
		 *  ******
		 *   *****
		 *    ****
		 *     ***
		 *      **
		 *       *
		 *1.공백 늘어남
		 *2.별 줄어듬
		 */
		
		for(int i=0; i<7; i++) {
			for(int j=1; j<(i+1); j++) { 
				System.out.print(" "); // 공백 찍기
			
			}
			for(int j=7; j>i; j--) {
				System.out.print("*"); //별 찍기
			}
			System.out.println();
		}
	}

}
