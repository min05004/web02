package day07;

public class Homework01 {
	public static void main(String[] args) {
		System.out.println("---------1번 정답------------");
		for(int i=0; i<7; i++) {
			for(int j=0; j<(i+1);j++) {
				System.out.print(" ");
			}
			for(int j =(6-i); j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("--------- 2번 정답 ---------");
		
		//공백 찍기
		for( int i=0; i<7; i++) {
			for(int j =(6-i); j>0; j--) {
				System.out.print(" ");
			}
			// 별찍기
				for(int j=0; j<((2*i)+1); j++) {
					System.out.print("*");
					}
     		System.out.println();
	}

	}
}
