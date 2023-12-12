package study.code.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObjSetTest {
	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		Employee em3 = new Employee();
		Employee em4 = new Employee();
		
		em1.setEmNumber("1001");
		em1.setMyName("홍길동");

		em2.setEmNumber("1002");
		em2.setMyName("고길동");
		
		em3.setEmNumber("1001");
		em3.setMyName("홍길동");
		
		em4.setEmNumber("1004");
		em4.setMyName("고길동");
		
		Set<Employee> emSet = new HashSet<>();
		emSet = new HashSet<>(Arrays.asList(em1,em2,em3,em4)); // 데이터 넣기
		
		System.out.println(emSet.size()); // 최종 데이터 확인하기
		
		
	}

}
