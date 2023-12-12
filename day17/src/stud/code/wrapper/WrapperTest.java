package stud.code.wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		
		//정수형 타입 - int
		Integer num01 = 10; //String 처럼 new 키워드 자동생성이라 안써도 됨.(객체)
		Integer num02 = new Integer(10);  
		//Wrapper 클래스는 생성자를 통한 선언 사용금지
		//valueOf 를 통해 객체 선언 가능.
		Integer num03 = Integer.valueOf(10);
		//객체이기 때문에 .equals 비교 가능.
		System.out.println(num03.equals(num02));
		//자동 형변환도 가능 
		System.out.println(num03.intValue() == num02.intValue());
		
		//형변환 - 숫자형 문자 -> 숫자 타입 
		Integer ch01 = Integer.valueOf("10"); //선언(값만 넣어도 가능) 또는 형변환 가능 // 자신의 데이터 타입 ,문자, 정수 받을수 있음.
		int ch02 = Integer.parseInt("10"); //문자형변환 전용 
		
		//Boxing 기능에는 autoBoxing 과 autoUnBoxing 기능이 존재
		//autoBoxing 은 일반 데이터를 객체형태로 싸는것.
		//autoUnBoxing 기능은 객체형태의 데이터를 일반타입으로 내려주는 것.
		
		int ch03 = Integer.valueOf("10");//autoUnBoxing
		
		System.out.println();
		
		
	}

}
