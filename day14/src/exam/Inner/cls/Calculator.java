package exam.Inner.cls;

public class Calculator {
	private int val1;
	private int val2;
	
	public Calculator(int val1,int val2) { //생성자를 통해 받기
		this.val1= val1;
		this.val2= val2;
	}
	
	//내부클래스 - 인스턴스 클래스 선언
	//외부 클래스의 변수 메서드 사용 가능.
	public class Calc{
		public int add() {
			return val1+val2;
		}
	}
	

}
