package study.code.throTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCls {
	
	private Scanner scan;
	
	public InputCls() {
		scan = new Scanner(System.in);
	}
	/*
	 * 예외 처리 던지기
	 * 메서드 내에서 발생한 예외를 직접 처리하지 않고
	 * 메서드를 호출한 대상에서 처리하도록 예외를 던지는 방법
	 */
	public int nextInt() throws InputMismatchException, NullPointerException { // 발생할것 같은 예외를 던짐.
		return scan.nextInt();
	}
	//버퍼 비우기
	public void clear() throws NullPointerException {
		scan.nextLine();
	}
	public void close() {
		scan.close();
	}
	

}
