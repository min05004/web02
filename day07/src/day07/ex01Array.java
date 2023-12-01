package day07;

import java.util.Arrays;
import java.util.Comparator;

public class ex01Array {
	public static void main(String[] args) {
		Integer[]arr = {5,7,1,4,11,9,10,2,4,3};
		System.out.println("정렬 전 : " + Arrays.toString(arr));
	
	//내림차순 정렬
	Arrays.sort(arr,Comparator.reverseOrder()); //sort 를 역방향으로 정렬하게 만들어줌.
	System.out.println("정렬 후 : "+Arrays.toString(arr));
	}

}
