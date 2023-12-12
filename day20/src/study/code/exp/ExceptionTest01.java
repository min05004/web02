package study.code.exp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Integer>list = new ArrayList<>();
		
		int count =0;
		while(count < 3){
			/*
			 * try{} 에는 예외가 발생할 가능성이 있는 코드들을 넣는다
			 * catch 메서드는 파라메터로 처리할 예외를 갖는다.
			 * 구현은 예외처리 내용을 적는다.
			 */
		
			try {
				System.out.println((count + 1)+ " 번째 숫자를 입력하세요 : ");
				int value = scan.nextInt();
				list.add(value);
				count ++;
			}catch(InputMismatchException e) {
				//예외처리 코드
				scan.nextLine();// 기존 버퍼안에 있는 내용을 지워줘야 함 - . nextLine(); , scan.close;
				System.out.println("입력 오류 ! 다시 입력하세요!");
			
			}
		}	
			System.out.println(list);
			
		
	}

}
	
