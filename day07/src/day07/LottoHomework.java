package day07;

import java.util.Arrays;
import java.util.Scanner;

public class LottoHomework {
	public static void main(String[] args) {
		/*
		 	1. 로또는 1 에서 45 사이에서 숫자를 선택한다.
			
			2. system 로또는 6개의 번호와 1개의 보너스 번호를가진다.
			3. 플레이어는 6개의 번호를 가진다.
			
			4. system이 가진 번호는  보너스 번호를 포함하여 모두 중복되지 않는다.
			5. 플레이어가 가진 번호는 중복되지 않는다.
			
			
			6. system 로또는 랜덤함수를 이용하여  만든다
			7. 플레이어가 가진번호는 스캐너를 사용하여 직접 입력 받는다.
			
			
			8.입력된 값을 비교하여  맞은 번호와 등수를 구한다.
			
			9. 번호를 비교할 때 각 자리는 의미 없고, 번호가 포함되면 된다
			ex) 1, 2,3,4,5  /   2, 1, 4,3, 5     = 두개는 번호가 모두 일치한다.
			
			
			등수 판단
			
			1. 1등은 6개 번호가 모두 맞아야 한다.
			2. 2등은 5개의 번호와 나머지 1개 번호가 보너스번호와 일치한다.
			3. 3등은 5개의 번호가 맞는다.
			4. 4등은 4개의 번호가 맞는다.
			5. 5등은 3개의 번호가 맞는다.
			
			
			출력
			  출력은 다음과 같다
			
			
			system 로또 번호 :  4, 11, 23, 44, 35, 22,  보너스번호 : 5
			사용자 로또 번호 :  4,  23,43, 35, 22,  6

				맞은 번호 : 4, 23, 35
				등수 : 5등입니다!
		 */
		
		// 로또번호 6개 / 1 보너스 점수 출력
	
		int[]lottoscore = new int [7]; // 7개 당첨 번호 변수
		
		for(int i =0; i<lottoscore.length; i++) {
			//로또 번호 랜덤값넣기
			int val =(int)(Math.random()*45)+1;
			lottoscore[i]= val; // 배열에 번호 값 넣기
			
			//중복찾기  - 현재 내위치 값 제외해야함 i 보다 작을때
			for(int j =0; j < i; j++) {
				if(val == lottoscore[j]) { // 중복일 때
					i--; // 증감식에 의해서 증가할 것이니 하나빼면 제자리.
					break; // 중복이 있으면 루프 나옴
				}
			}
		}
		// 로또,보너스 번호 출력
		System.out.print("system 로또 번호: ");
		for(int i=0; i<6; i++) {
			System.out.print(lottoscore[i]+" ");
		}
		System.out.print("보너스 번호 : " + lottoscore[6]);
		System.out.println(); //개행
			
			
		
		//사용자에게 번호 받기
		int[] play = new int[6]; // 사용자 입력 로또번호 넣는 공간
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사용자 입력 번호 : " );
		for (int i = 0; i < play.length; i++) {
			 play[i] = scan.nextInt();
			}
			
		// 당첨 번호 출력하기  - lotto 배열과 play 배열 비교. / 플레이 번호 하나를 로또 번호 하나랑 쭉 다 비교 반복.
		int count =0;
		for( int i=0; i<6; i++) {
			for(int j=0; j<6 ;j++) {
				if(play[i] == lottoscore[j]) {
					count++;
					}
				}
			}
		// 사용자 보너스 번호 넣는 공간
		int bonus =0;
		Scanner bonusscan2 = new Scanner(System.in);
		
		System.out.println("사용자 보너스 입력 번호 : " );
		for (int i = 0; i < play.length; i++) {
			bonus = bonusscan2.nextInt();
		//  출력	
		if(count == 6) {
			System.out.println("맞은번호 : " + count + "개" );
			System.out.println("1등 입니다.");
			
		} else if (count == 5) {
			if (lottoscore[6] == bonus) {
				System.out.println("2등 입니다.");
			} else {
				System.out.println("3등 입니다..");
			}
		}
		else if(count==4) {
			System.out.println("4등 입니다.");
		}
		else if(count==3) {
			System.out.println("5등 입니다.");
		}
	}
	
		scan.close();
}
		
}

		
			
			
			
			
				
			
			
		
	
	
