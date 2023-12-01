package study.code.ramda;

public class CompareMain {
	public static void main(String[] args) {
		
		Compare com1 = new Compare() {

			@Override
			public int compareTo(int x, int y) {
				// int result = x > y? 1: x <y ? -1 : 0;  //x가 y보다 크다면 1, 작다면 -1, 같다면 0(삼항연산자)
				return x > y? 1: x <y ? -1 : 0; // 함수형 인터페이스 구현
			}
		};
		
		// 람다식 선언 , 클래스를 없애서 표현 (클래스가 없기 때문에 두개 이상의 메서드를 사용하기 어려움/ 구분 어렵기에)
		//Compare com2 = (x,y) -> { return x > y? 1: x <y ? -1 : 0;};
		// 한줄이 리턴일 때 중괄호  생략 가능
		Compare com2 = (x,y) ->  x > y? 1: x <y ? -1 : 0;
		// 변수 넣기
		int num1 = 20;
		int num2 = 15;
		//출력
		if(com2.compareTo(num1, num2)== 1) {
			System.out.println(num1 + " 이 " + num2 + " 보다 크다");
		}else if(com2.compareTo(num1, num2)== -1) {
			System.out.println(num1 + " 이 " + num2 + " 보다 작다");
		}else {
			System.out.println(num1 + " 이 " + num2 + " 는 같다");
		}
		
	}

}
