package study.code.generic;

import java.util.Arrays;

public class StorageMain2 {
	public static void main(String[] args) {
		
		DataList2<Integer> intList = new DataList2<>(); //동일 , 뒤에 제너릭 기호 생략
	//	DataList2<Integer> intList = new DataList2<Integer>();
		//제너릭 선언방법 ( 정수만 저장하게 만듬)-- 클래스 타입으로 선언해야함!!
		DataList2<Double> dList = new DataList2<>();
		//실수 저장
		
		intList.add(10);
		dList.add(10.22);
		
		
		//출력
				for(int i =0; i<intList.size(); i++) {
					Object obj = intList.get(i);
				
					System.out.println(obj);
				}
				
				}
		
	}
	


