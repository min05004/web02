package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		//1.1~45 사이의 번호 중 숫자를 뽑아 만든다
		//2.시스템은 6개 번호 +1개 보너스 번호
		//3.플레이어는 6개의 번호만 지님.
		//4.시스템은 랜덤함수 이용
		//5.플레이어는 스캐너 사용
		
		// 45개 번호 넣을 배열
		int[] machine = new int[45];
		// 45개 번의 공을 넣는다
				for(int i=0; i<45; i++) {
					machine[i]=i+1;
		}
		int count =0;// 뽑힌 공 개수
		int[]sys =new int[6];
		int bonusnum=0;
		
		while(true) { // count < 7 조건일 필요가 없음! 아래 조건들로 다 걸러지기에..
			
			//랜덤 인덱스 구하기
			int index = (int)(Math.random()*45); //최솟값이 0일때는 곱하기 값에 +1로 해줘야 함.
			if(machine[index] == 0) { // 인덱스 번호가 0이면 아래 코드 출력할 필요 없음
				continue;
				
			}
			if( count == 6) { // 6개의 공이 다 뽑혓다는 이야기.
			// 보너스 번호 뽑고 끝내기
			bonusnum = machine[index];
			break;
			}
			// 카운트가 6이 아닐때 
			sys[count++] = machine[index];
			machine[index]=0; // 공뽑은 위치의 값을 0으로 바꿈
		}
		
		System.out.println("로또번호 : " + Arrays.toString(sys)+ ", 보너스 : "+ bonusnum);
				
		
		count =0;
		int[] myLotto = new int[6];
		Scanner scan = new Scanner(System.in);
		
		while(count<6) {
			System.out.println((count +1 )+ "번째 로또");
			int val =scan.nextInt();
			
			if(val <1 || val >45) {
				System.out.println("로또 번호는 1에서 45 사이여야 합니다.");
				continue; //입력된 숫자가 유효하지 않기 때문에 진행할 필요가 없으니 다시
				
			}
			//중복 처리를 위한 루프
			for(int i=0; i<count; i++) {
				if(myLotto[i] ==val) { //기존값과 입력값이 같다면 중복
					val =0; //중복된 값이 있다면  0처리
					break; //뒤에 더 루프를 할 필요가 없으니까 멈추기
				}
			}
			//val 값이 0이 아니라면 중복 값이 아니라서 증가
			if(val != 0) {
				//로또 번호를 삽입하고 count 증가
				myLotto[count++]=val;
				
			}
		}
		scan.close();
		System.out.println("내 로또 번호 : " + Arrays.toString(myLotto));
		
		// 비교하기
		int[] Number = new int[6];
		int numbercount =0; // 맞은개수
		boolean isbonus = false; // 보너스 번호를 찾앗는가
		
		for(int i=0; i<myLotto.length; i++) { // 사용자가 가진 로또 중에 
			for(int j=0; j< sys.length; j++) {
				if(myLotto[i] == sys[j]) {
					Number[numbercount++] = myLotto[i];
					break;
				}
				
			}  // isBonus == false 동일.
			if(!isbonus) { // 보너스 번호를 안찾았을때 ,if 문은 참이어야 실행되는데, 부정이여서 true 이면 실행이 안됨.
				if(myLotto[i] == bonusnum) {
					isbonus = true;
				}
			}
		}
		
		System.out.print("맞은 번호 : ");
		for(int i=0; i < numbercount; i++) { //들어가는 개수만큼만 출력해야 하니까!numbercount /.length 는 맞은 값이 아닌 값은 0이 나오니까. 
			System.out.print( Number[i]+ " ");
		}
		System.out.println(numbercount == 5 && isbonus ? ", 보너스 번호 : " + bonusnum : "");
					      //조건(1항)                   // 참일때(2항)                   // 거짓일때
		// 맞은 번호가 5개고 보너스 번호가 맞았다면, ", 보너스 번호 : " + bonusnum 출력하고 , 아니라면 "" 값이 나옴
		
		if(numbercount == 6) {
			System.out.println("1등 입니다.");
		}else if (numbercount == 5 && isbonus) {
			System.out.println("2등 입니다.");
		}else if (numbercount == 5) {
			System.out.println("3등 입니다.");
		}else if(numbercount == 4) {
			System.out.println("4등 입니다.");
		}else if(numbercount == 3) {
			System.out.println("5등 입니다.");
	}else {
		System.out.println("꽝, 다음기회에");
	}

	}
	}
