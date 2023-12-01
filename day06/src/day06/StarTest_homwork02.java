package day06;

public class StarTest_homwork02 {
	public static void main(String[] args) {
		/*
		 * 2번.
		 *    *   
		 *   ***
		 *  *****
		 * *******     
		 * 
		 * 1. 공백 줄어듬
		 * 2. 별 2개씩 늘어남 / 홀수만큼 찍힘
		 * 
		 */
		for(int i=1; i<14; i++) { 
			// 공백 줄어듬 찍기
			for(int j=14; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<(i*2)-1; j++) { // 별찍기 
				System.out.print("*");
				
				}
		
			System.out.println();
				
			}
			
		}
		
	}


