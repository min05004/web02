package exam.Inner.cls;

import exam.Inner.cls.Calculator.Calc;

public class CalcMain {
	public static void main(String[] args) {
		//외부 클래스 먼저 선언
		Calculator cal = new Calculator(12, 20);
		
		//내부 클래스 선언 -- Calculator 가 가지고있는 clac 객체를 만드는데 , 외부클래스 객체가 가지고 있는
															//new Calc(); 내부클래스 만들기
		Calculator.Calc clac = cal.new Calc();
		
		//내부클래스 메서드 실행 
		System.out.println("더하기 값: "+ clac.add());
	}

}
