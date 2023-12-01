package study.cod.innerclass;

public class Calc {
	
	private int val1;
	private int val2;
	
	public Calc(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	/**
	 * 클래스의 정적 메서드 또는 변수는 일반 메서드 내에서 사용이 가능하다.
	 * 이유는>
	 * 일반 메서드를 실제 호출하여 사용할 때에는 
	 * 객체를 선언하여 인스턴스화가 되었을 때이기 때문
	 * 그때는 객체도 사용메모리(heap)에 등록되어 사용가능상태가 됨.
	 * 
	 */
	//실제 계산하는 내부클래스 - 인스턴스 클래스
	public class Calculator {
		//일반적인 내부 클래스는 외부 클래스의 멤버변수 메서드 둘다 사용 가능
		//외부 클래스 정적변수 또는 메서드 사용안됨
		public int add() {
			return val1+val2;
		}
		
		public int minus() {
			return val1-val2 ;
		}
		
	}

}
