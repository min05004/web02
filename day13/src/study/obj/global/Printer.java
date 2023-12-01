package study.obj.global;

import java.util.Scanner;

public class Printer {
	
	
	/**
	 * 상수는
	 * 1. 모두 대문자로
	 * 2.음절이 2음절 이상일 경우 각 음절 사이 언더바
	 */
	
	public static final double PI =3.14;
	public static final Scanner scan = new Scanner(System.in); //매번 사용할때마다 꺼내쓰지 말고 하나 만들어넣고 사용. 	
																//System.out.println(); -- out이 static
	
	//일반 메서드 
	public void print(int num) {
		System.out.println(num);
		
	}
	// static 메서드 -- 클래스 메서드 
	public static void print(double d) { //메서드 오버로드 
		System.out.println(d);
	}
	/* static 메서드 내부에서는 
	 * 클래스가 가지는 멤버변수 또는 메서드를 사용 할 수 없다.
	 * -- 컴파일 되는 시점이 다르기 때문에!
	 */
	public static void print(String str) {
		System.out.println(str);
	}
}
