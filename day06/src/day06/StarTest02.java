package day06;

public class StarTest02 {
	public static void main(String[] args) {
		// 공백 찍기
		for( int i=0; i<7; i++) {
			for(int j =(6-i); j>0; j--) {
				System.out.print(" ");
			}
			// 별찍기
				for(int j=0; j<(i+1); j++) {
					System.out.print("*");
					}
     		System.out.println();
		}
			}

}
