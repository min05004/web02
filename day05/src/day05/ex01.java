package day05;

public class ex01 { // for문 예제

	public static void main(String[] args) {
		/*
		 * for(int i =1; i<=100; i= i+2){
		 * sum += i;
		 * }
		 * System.out.println("홀수만 더한 값 : "+ sum);
		 * }
		 */
		int sum = 0; 
		
		for(int i =1; i<=100; i++) {
		 if(i%2!=0) {
			 sum += i;
		 }
		}
		System.out.println("홀수만 더한 값 : "+ sum);

		
	}

}
