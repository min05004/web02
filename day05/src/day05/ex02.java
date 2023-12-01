package day05;


import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		//up, down 게임 만들기 - 횟수제한 10번 --break 문 추가
		
		int solution = (int)(Math.random()*50)+1; // 랜덤값 받기 
		int input =0; // 입력값 변수 생성
		Scanner scan = new Scanner(System.in); // 입력받기 위한
		
		//반복 횟수 세기
		int count =0;
		
		for( int i =0; i<10 ; i++) {
			System.out.println((count+1) + " 번째 도전"); //--번째에 1부터라고 쓰기 위해 +1 추가
			System.out.println("찾을 숫자 : ");
			input = scan.nextInt(); // 숫자값 입력
			
			if(input == solution) { // 맞혔을 경우
				System.out.println("맞혔다");
				System.out.println((count+1) + " 번째에 맞춤");
				break; // 맞추면 더이상 반복문 실행 안되게
				
			}
			else if(input > solution) { // 찾는 수가 입력 수보다 작다면
				System.out.println("down");
			}
			else { 
 				System.out.println("up"); // 크다면
			}
			count++;
			//반복 횟수 세기 늘어나게
		}
		if(count == 10) { // 10번째 도전에 실패할 경우를 위한 출력
			System.out.println("찾아야 하는 수는 : " + solution + " 이었습니다.");
			
			
		}
		scan.close(); 
	}

}
