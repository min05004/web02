package day07;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[]arr= new int[5];
		
		for(int i =0; i<arr.length; i++) {
			//랜덤값
			int val =(int)(Math.random()*50)+1;
			arr[i]= val; // 배열에 값 넣기
			
			//중복찾기  - 현재 내위치 값 제외해야함 i 보다 작을때
			for(int j =0; j < i; j++) {
				if(val == arr[j]) { // 중복일 때
					i--; // 증감식에 의해서 증가할 것이니 하나빼면 제자리.
					break; // 중복이 있으면 루프 나옴
					
				}
			}
		}
			System.out.println(Arrays.toString(arr));
		
	}

}
