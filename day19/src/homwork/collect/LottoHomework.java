package homwork.collect;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoHomework {
	
	public static void main(String[] args) {
	
		// 로또 저장 리스트
		List<Integer> lotto = new ArrayList<>();
		int bonus =0; //보너스 번호	
		// 중복제거 하면서 번호 7개 고르기
		Random rand = new Random();
		for(int i =0; i<6; i++) {
			int temp = rand.nextInt(45)+1; //1~45까지 숫자
			if(lotto.contains(temp)) { //.contains(temp) : 찾는 대상이 있으면 참, 아니면 거짓.
				i--; // 중복이 있으면 뺌
				continue;
			}
			lotto.add(i,temp); // 로또 번호 만들기
		
		} // 로또 번호 출력 + 보너스 번호 출력하기
		System.out.print("로또 당첨 번호 : ");
			for(int i=0;i<6;i++) {
				System.out.print(lotto.get(i)-1+ " ");
		}
			bonus = lotto.get(5); //보너스 번호 넣기
			System.out.println("/ 보너스 번호 : " + bonus);
		
		//사용자에게 번호 받기
		List<Integer> Mynum = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--- 사용자 번호를 입력하세요 ---  ");
		int count =0;
		try {
			while(count < 6) {
				System.out.print("입력 번호 "+(count+1) + " 번 숫자 : ");
				int temp = scan.nextInt();
				
				if(temp < 1 || temp >45) { //입력 받을 숫자 범위 정하기!
					System.out.println("입력할 번호는 1에서 45사이만 가능합니다.");
					continue;
				}
				if(Mynum.contains(temp)){ //중복 선택 방지하기 
					System.out.println("이미 선택한 번호 입니다! 새로 선택해 주세요");
					continue;
					}
				Mynum.add(temp); //사용자 번호 저장하기
				count++;
				} 
		}catch(InputMismatchException e) { //예외 처리하기
			scan.nextLine(); // 버퍼 비우기..
			System.out.println("입력이 잘못되었습니다.");
				}
				scan.close();
			System.out.println("내 로또 번호 : "+ Mynum); // 출력해보기
			
			//맞는 번호 넣기 -- 로또랑 내 번호 비교하기.
			// 맞는 개수 확인하기 
			List<Integer>match = new ArrayList<>(); 
			int matchNum = 0; //맞은개수
				
			    matchNum = match.size();
				System.out.println(match);

				// 출력하기
				if(matchNum== 6) { // 6개 다 맞으면
					System.out.println("축하합니다 1등 입니다!!");
				}else if (matchNum == 5) { //5개 맞으면
					if(Mynum.contains(lotto.get(5))) { //보너스 번호가 맞으면
					System.out.println("2등 입니다!!");
					}else {
						System.out.println("3등 입니다!!");
					}
				}else if(matchNum== 4) {
					System.out.println("4등 입니다.");
				}else if(matchNum== 3) {
					System.out.println("5등 입니다.");
				}else {
					System.out.println("꽝 입니다.");
				}
			}
	
		}

	
		
			
			
			
			
			
		
	


