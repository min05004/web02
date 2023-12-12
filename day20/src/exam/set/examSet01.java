package exam.set;

import java.util.HashSet;
import java.util.Set;

public class examSet01 {
	public static void main(String[] args) {
		
		//set 선언
		Set<Integer>set = new HashSet<>();
		
		// 추가 , 중복확인하기
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);

		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		
		System.out.println(set);
		
		//지우기 
		set.remove(3); 
		System.out.println(set);
		
		//set.clear : 객체 형태만 남기고 안의 데이터는 지운다.
		
		System.out.println("Set 크기 : "+set.size());
		System.out.println("Set 3의 존재 : "+set.contains(3));
		System.out.println("Set 1의 존재 : "+set.contains(1));
		
	}

}
