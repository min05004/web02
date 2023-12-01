package day05;

public class ex05 {
	public static void main(String[] args) {
		
		// 총 5명의 학생 시험점수 60점 넘으면 합격 그렇지 않으면 불합격
		//5명 학생 점수 90,25,67,45,80 일 경우
		/*
		 * 1. 학생 점수 넣기
		 * 2.넣은 값 비교해서 합격, 불합격 출력.
		 *
		 */
		int[]check ={90,25,67,45,80};
		//배열 값 주기
		for(int i=0; i<check.length; i++) {
			if(check[i]>60) {
				System.out.println((i+1)+" 번 학생 " +"합격입니다.");
			}
			else {
				System.out.println((i+1)+" 번 학생 "+"불합격입니다.");
			}
				
			}
		System.out.println("---------------------------");
			
		// 이중 for문 구구단 예제 해보기
		/*1. 구구단 앞에 단 그대로 곱하는 수 증가 9까지.
		 * 
		 * 
		 * 
		 */
			for(int j =2; j<10; j++) { //2단부터 ~9 단까지
				for(int k=1; k<10; k++) { //곱하는 수 9까지 만들기
					System.out.print(j+"X"+k+"="+j*k+"\t"); // 구구단 출력하기
				}
				System.out.println();
				System.out.println(j+"단 입니다.");// 개행
			}
		
		
		
		/*
		 * 별찍기 예제 해보기
		 * 1.점점 늘어나는 별찍기
		 * 2.거꾸로 별찍기
		 *
		 */
		for(int i =0; i<7; i++) { //6줄
			for(int j=0; j<=i; j++) { // i가 0일때 j가 0만 해당,1번 찍음
				System.out.print("*"); // 별찍기
			}
			System.out.println(); //개행
		}

	}
}
	


