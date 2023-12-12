package exam.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4)); 
								//(Arrays.asList(1,2,3,4)); 리스트안에 바로 배열 값을 넣을경우에!
	
		Set<Integer> set = new HashSet<>(list); //set 을 list로 바꿔줌
		
		//list를 iterator 이용하여 출력
		Iterator<Integer> inIter = list.iterator();
	
		while(inIter.hasNext()) { //값이 있을때 까지
			System.out.print(inIter.next()); //다음 값 출력
		}
		System.out.println();
		//set 를 iterator 이용하여 출력
		Iterator<Integer> inSet= set.iterator();
		while(inSet.hasNext()) {
			System.out.print(inSet.next());
		}
	}

}
