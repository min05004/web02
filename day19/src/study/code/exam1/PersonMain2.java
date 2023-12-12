package study.code.exam1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain2 {
	public static void main(String[] args) {
		
		Person p1 = new Person("김철수",290);
		Person p2 = new Person("김영희",295);
		Person p3 = new Person("김길동",285);
		
		List<Person> list = Arrays.asList(p1,p2,p3); // 나열된 애들을 list로 바꿔줌
		
		System.out.println("정렬 전 : \n"+ list);
		
		//비교하는 자  -> 람다식 이용(일회용 -- 한번만 비교할때, 객체를 상속하지 않고 만들수 있음.)
		Comparator<Person> comparator = (com1,com2) ->{ // 앞, 뒤 
			return com1.getScore()> com2.getScore()	? 1: -1; //0보다 크면 동작, 0보다 작으면 동작하지 않음.
			}; //앞이 뒤보다 더 크면 바꾼다 (오름차순)
			
			Collections.sort(list, comparator);
			System.out.println("정렬 후 : \n"+ list);
		
	}

}
