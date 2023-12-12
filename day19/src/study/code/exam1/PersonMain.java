package study.code.exam1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("김철수",290);
		Person p2 = new Person("김영희",295);
		Person p3 = new Person("김길동",285);
		
		List<Person> list = Arrays.asList(p1,p2,p3); // 나열된 애들을 list로 바꿔줌
		
		System.out.println("정렬 전 : \n"+ list);
		//sort 
		Collections.sort(list); //Collections.sort -- collection의 보조 메서드 //.sort는 comparable을 상속한  
		System.out.println("정렬 후 : \n" + list);
	}

}
