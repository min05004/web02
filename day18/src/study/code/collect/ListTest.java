package study.code.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//arrayList 선언
		List<Integer>list01 = new ArrayList<>();
		//삽입
		list01.add(1);
		list01.add(2);
		list01.add(3);
		list01.add(10);
		list01.add(11);
		list01.add(5);
		
		//중간 삽입 add(index, 값)
		list01.add(2,15);
		//치환 set(index, 값)
		list01.set(5, 25);
		
		//삭제
		list01.remove(3);
		
		//출력 - get(index)
		for(int i=0;i<list01.size();i++) {
			System.out.print(list01.get(i)+"\t");
		}
		System.out.println();
		
		//향상된 for문
		// index를 이용하지 않고 배열 또는 List를 출력하는 방법
		//배열, List,Set 가능!
		for(int value : list01) { //리스트의 데이터 타입과 변수의 데이터 타입이 동일해야함! : 안의 값 내부적으로 루프를 돌림
			System.out.print(value +"\t");
		}

		/*
		 * Iterator 란?
		 * 배열 또는 리스트 계열의 collections framework 내부에서
		 * 객체를 순회하여 데이터를 반복하여 가져올 수 있는 인터페이스
		 * 
		 */
		Iterator<Integer> iter = list01.iterator();
		//반환할 값이 존재하는지 물어본다
		System.out.println();
		while(iter.hasNext()) {
			//있다면 - 출력
			int value =iter.next();
			System.out.print(value+"\t");
		}

	}

}
