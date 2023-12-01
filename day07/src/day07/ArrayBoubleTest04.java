package day07;


import java.util.Arrays;
import java.util.Collections;

public class ArrayBoubleTest04 {
	public static void main(String[] args) {
		int[]arr = new int[10];
		
		for(int i =0; i<arr.length; i++) { // 배열의 길이보다 번호가 하나 적음!!: i<arr01.length
			arr[i] =(int)(Math.random()*30)+1;
	}
		System.out.println("오름 정렬전 : "+ Arrays.toString(arr));
		//버블 정렬
		int temp = 0; //임시변수
		for( int i=(arr.length-1); i>0; i--) { //
			for(int j=0; j<i ;j++) {
				if(arr[j] > arr[j+1]) {
					//앞      뒤 숫자
					
					temp= arr[j+1]; //임시변수에 뒤에 숫자를 저장
					arr[j+1]= arr[j]; // 현재 위치값을 뒤로 보냄
					arr[j]= temp; // 임시변수 저장했던 값을 현재 위치에 넣는다.
				}
			}
			
		}
				System.out.println("오름 정렬후 : "+ Arrays.toString(arr));
				
				//Arrays 를 사용한 내림 차순정렬
//				Arrays.sort(arr, Collections.reverseOrder()); // 오류가 나옴. 추후
				
				Arrays.sort(arr); // 오름차순 
				System.out.println("오름 정렬 후 : "+ Arrays.toString(arr));				

}
	}
