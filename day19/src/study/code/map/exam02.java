package study.code.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exam02 {
	public static void main(String[] args) {
		/*
		 * 검색을 빨리해서 꺼내는 게 목적 - 중간삽입,삭제 없음(순서가 없기 때문에)
		 */
		
		Map<String, Integer> map = new HashMap<>();
		//Map<String, Integer> map = new LinkedHashMap<>(); -- 입력한 순서대로 출력하고 싶을경우
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		// 키는 중복이 불가 - 중복키가 입력될 경우 값 업테이트
		map.put("four", 40);
		
		//삭제
		map.remove("one"); //삭제할 키값을 넣음.
		
		//출력
		//1. KeySet 이용
		Set<String> keySet = map.keySet(); // 루프 돌릴려면 , 향상된 for문을 사용해야함!
		//이유는 : index가 없기 때문에, Iterator이용하여 만들어서 루프가 가능
		for(String key : keySet) {
			System.out.println("키 : "+key + " 값 : "+ map.get(key)
			);
		}
		
	}

}
