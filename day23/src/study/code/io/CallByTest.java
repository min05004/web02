package study.code.io;

import java.util.ArrayList;
import java.util.List;

public class CallByTest {
	
	public static void add(int x) { //static 함수
		x = x+10;
		System.out.println("값 : " + x);
	}
	public static void addArray(List<Integer> list) { //
		list.add(10);
		System.out.println("리스트 : " + list);
	}
	public static void main(String[] args) {
		int num = 10;
		List<Integer>numbers = new ArrayList<>();	
		numbers.add(9);
		numbers.add(8);
		
		CallByTest.add(num);
		System.out.println("함수 호출 후 값 : " + num); //원본이 바뀌지 않음.
		
		CallByTest.addArray(numbers); 
		System.out.println("함수 호출 후 값 : " + numbers); //원본이 바뀜
		
	}

}
