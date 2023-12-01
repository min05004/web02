package day05;

import java.util.Arrays;

public class ex07 {
	public static void main(String[] args) {

		int [] arr = new int[10];
		
		//배열에 값을 부여
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		System.out.println("정렬 전 : "+ Arrays.toString(arr));
		
		
		//버블 정렬
		int temp =0; //  정렬 저장 변수 만들기
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<(arr.length-1)-i ;j++) { // j값은 j+1의 값과 비교하며 정렬한다. 
													//회차를 진행 할 수록 길이가 줄어야 하기 때문에 회차 진행 증가하는 i값을 빼줌.
													//제일 마지막 값과 비교하여 정렬을 하려면 ,길이보다 -1까지 움직여야함. 
				if(arr[j]> arr[j+1]) {// 현재 위치의 값이 뒤의 값보다 클 경우,
					temp = arr[j+1]; // 뒤의 위치 값을 temp 저장
					arr[j+1] = arr[j]; //현재 위치 값과 뒤에 값을 바꿔줌.
					arr[j] = temp;
					
				}
				
			}
			
		}
	
		System.out.println("정렬 후 : " +Arrays.toString(arr));
		
	}
	
}
