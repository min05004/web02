package study.code.global;

public class GlobalMain {
	public static void main(String[] args) {
		
		//내부를 객체 선언하기 -- 외부클래스의 객체 선언없이 바로 내부클래스 선언가능(static 경우)
		InnerStatic.Inner st = new InnerStatic.Inner();
		// InnerStatic 안에 있는 Inner 안의 것들을 사용
		
		
		
		
	}

}
