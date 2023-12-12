package study.code.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest01 {
	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<>();
		Random rand = new Random(); //클래스 랜덤함수
		//데이터 중복제거 하면서 넣기
		for(int i =0; i<10; i++) {
			int temp = rand.nextInt(50)+1; // nextInt(50)+1 : 0부터 이기 때문에, 1부터 50 하려면 +1 
			
			if(list.contains(temp)) { //list.contains(temp) : 찾는 대상이 있으면 참, 아니면 거짓.
				i--; // 중복이 있으면 뺌
				continue;
			}
			//리스트에 값 넣기
			list.add(i,temp); // 배열 i에 temp 값을 넣음.
		}
		// 출력
		System.out.println(list); // 출력만 할꺼라면!(tostring 오버라이딩,11부터 가능)  
		
	}

}
