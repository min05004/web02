package study.cod.innerclass;

import java.util.Scanner;

public class InnerTest01 {
	
	// 인스턴스 클래스 1
	private Scanner scan; // = new Scanner(System.in); 가능
	
	// 생성자를 통한 선언
	public InnerTest01() {
	
		//맴버로 지니는 객체가 있다면 보통 생성자를 통한 선언을 가진다.
		scan = new Scanner(System.in);
	}
	//스캐너 종료 함수
	public void scanClose() {
		if(scan != null) {
			scan.close();
		}
	}
	
	public static void main(String[] args) {
		InnerTest01 in = new InnerTest01();
		System.out.println("숫자를 입력 하세요");
		int number = in.scan.nextInt();  // private Scanner scan; 인대 어떻게 호출? -- 내부에 같이 존재하기에..!!
		
	}

}
