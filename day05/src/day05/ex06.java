package day05;

public class ex06 {
	public static void main(String[] args) {
		// 배열 연습
		int [] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			//10개의 배열안에 랜덤값 1~100까지 넣기
		}
		int sum = 0;
		for(int i= 0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t"); // \t 줄바꿈
			sum += arr[i];
		}
		
		System.out.println("\n합 : " + sum);
	
	}

}
