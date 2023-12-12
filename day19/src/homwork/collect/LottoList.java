package homwork.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LottoList {
	public static void main(String[] args) {
		
		//1-45번 번호 넣기
		List<Integer> number = new ArrayList<>();
		for(int i=1; i<46; i++) {
			number.add(i); //번호 리스트에 넣기
		}
		//로또 당첨 번호 넣을 리스트
		List<Integer>lotto = new ArrayList<Integer>();
		// 번호 7개 고르기 -- 45개 번호를 넣은 리스트에서 ,랜덤으로 섞어서 고르기.
		Collections.shuffle(number); //번호 섞기... 랜덤 클래스로 1-45값 넣었는대 자꾸 0이 가끔 튀어나와서 ,
									//이거때매 비교 출력 값도 자꾸 안들어가져서 해결하기 위해 검색해서 다르게 해봄.
		for(int i=0; i<7; i++) {
			 lotto.add(i,number.get(i)); // 번호 7개 당첨번호에 넣기.
		}
		//당첨번호 출력하기
		System.out.print("[ 로또 당첨 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(" "+ lotto.get(i));
		}
		int bonus = lotto.get(6); //보너스 번호 넣기
		System.out.println(" / 보너스 번호 : "+ bonus+ " ] ");
		
		//사용자 번호 받기 -- 내 로또 번호
		Scanner scan = new Scanner(System.in);
		List<Integer> myLotto = new ArrayList<>(); //사용자 입력 번호 넣는 리스트
		
		System.out.println("--- 사용자 입력 번호를 입력하세요 ---");
		int count =0;
		for(int i=0; i<6; i++) {
		System.out.print((count+1)+"번 번호 입력 : ");	
		try {
		int val = scan.nextInt();
			if(val <1 || val>45) { // 숫자 입력 범위 정하기
				System.out.println("1~45숫자만 입력 가능합니다. 다시 입력하세요");
				i--;
				continue;
				}
			if(myLotto.contains(val)) { 
				System.out.println("중복된 숫자 입니다.");//중복값 제거하기
				i--;
				continue;
				}
			myLotto.add(val); // 입력받은 번호 저장하기.-- 내 로또번호 
			count++;
			}
		catch(Exception e) { // 예외 처리하기
				scan.nextLine(); //버퍼 비우기
			}finally {
				scan.close(); 
			}
		System.out.println("나의 로또 번호 : "+myLotto);
			
		//로또번호, 당첨번호 비교하기
		List<Integer> matchNum = new  ArrayList<>(); //맞는 번호 넣을 리스트
		int correct =0;
		
		for(int a : myLotto) { // 내 번호에 로또 당첨번호가 포함되어 있으면
			if(lotto.contains(a)) {
				matchNum.add(a); // 맞는 번호 리스트에 넣기
			}
				}
			
		correct = matchNum.size(); //맞는번호 개수 넣기
		System.out.println("맞은 번호 개수 : " + correct);
		// 당첨 출력하기 
		if(correct == 6 && !myLotto.contains(bonus)) { // 6개 다 맞고 보너스 번호는 포함 하지않음.
			System.out.println("축하합니다 1등 입니다!!");
		}else if (correct == 5 && myLotto.contains(bonus) ) { //5개 맞고 보너스 번호도 맞으면
			System.out.println("2등 입니다!!");
		}else if(correct == 5){ //5개만 맞으면
				System.out.println("3등 입니다!!");
		}else if(correct == 4) {
			System.out.println("4등 입니다.");
		}else if(correct == 3) {
			System.out.println("5등 입니다.");
		}else {
			System.out.println("꽝 입니다.");
		}
	}
	}
	}
		

		
		
	
	
	
