package study.code.throTest;

import java.util.InputMismatchException;

public class TrowsMain {
	public static void main(String[] args) {
		
		InputCls input = new InputCls();
		int val =0;
		try {
			System.out.println("숫자입력 : ");
			val = input.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("입력오류");
			input.clear();
	}finally {
		//예외의 동작여부와 상관없이 실행되는 영영
		//예외의 발생유무와 상관없이 처리해야 하는 코드를 작성할 때
		System.out.println("finally");
		input.close();
	}
		System.out.println("출력 : "+ val);

	}
	}
