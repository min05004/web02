package study.code.throTest;

import java.util.InputMismatchException;

public class MyTrowsMain {
	public static void main(String[] args) {
		
		InputCls input = new InputCls();
		int val =0;
		try {
			System.out.println("숫자입력(1~10) : ");
			val = input.nextInt();
			
			if(val <1 || val >10) {
				//규칙을 위반했음. -- 임의로 예외를 발생시킨다.
				throw new InputMismatchException("범위 오류"); // 메세지 출력까지 기능을 포함.
			}
			
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage()== null ? "입력오류" : e.getMessage());
			//오류 메세지가 없으면 입력오류 있으면 범위오류 나오게!
			input.clear(); //버퍼 비우기
	}finally {
		//예외의 동작여부와 상관없이 실행되는 영영
		//예외의 발생유무와 상관없이 처리해야 하는 코드를 작성할 때
		System.out.println("finally");
		input.close();
	}
		System.out.println("출력 : "+ val);

	}
	}
