package Study.global;

public class Calculator {
	//변수의 static 붙이는 경우 
	//1. 상수만들기
	//Static 붙이는 변수는 대부분 public 선언.
	//보통 상수를 만들때 사용 
	//상수는 모두 대문자 처리 - 음절을 이을때 언더바_를 사용한다.
	
	public static final double PI =3.14;
	
	//2. static 메서드에 사용할 변수를 만들 때 쓴다
	
	private static int r =5;
	
	//클래스 메서드 만들기
	//1.자주 사용하는 메서드를 객체 선언없이 사용하려고 할때
	public static double circleWidth() {
		return r * r * PI;
	}


}
