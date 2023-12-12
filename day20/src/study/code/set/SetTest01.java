package study.code.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
	public static void main(String[] args) {
		
		Set<Integer>set = new HashSet<>();
		
		//set 중복 불가
		set.add(1);		
		set.add(1);		
		set.add(1);		
		set.add(2);		
		set.add(2);		
		set.add(1);		
		set.add(3);		
		
		//출력
		System.out.println(set);
		
		//삭제 -- 값이 유일하기 때문에 값 또는 객체를 직접 삭제.
		set.remove(1);
		
		set.isEmpty();
		// true : 비었으면
		set.size();
		
		
		//향상된 for 문 이용 출력
		for(int val : set) {
			System.out.println(val);
		}
		//Iterator 이용
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		}
	

}
