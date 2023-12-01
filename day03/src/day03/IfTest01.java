package day03;

import java.util.Scanner; // ctr + shfit + o 
//같은 폴더 내 같은 이름 사용 불가능.

public class IfTest01 {
	public static void main(String[] args) {
		
		//scanner 사용 , 스캐너 선언**외우기
		Scanner scan = new Scanner(System.in);
		
		int value =0;
		System.out.println("값을 넣어주세요");
		value = scan.nextInt(); //정수값 넣기
		
		//입력한 값이 10 이상이면 출력
		if(value >= 10) {
			System.out.println("합격");
		}else {
			System.out.println("종료");
		}
		scan.close(); //scanner 사용 후 닫기! - 키보드 입력을 없애 줘야 또 다른 input을 넣어줄수 잇음
	}
}
