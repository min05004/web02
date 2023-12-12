package homwork.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottoexam {
	public static void main(String[] args) {
		//45개 공을 넣기
		 List<Integer> machine =new ArrayList<>();
		 
		 //공 넣기
		 for(int i =1; i<=45; i++) {
			 machine.add(i);
		 }
		 //랜덤 클래스 생성
		 Random rand = new Random();
		 List<Integer> sysLotto = new ArrayList<>();
		 int bonusNum =0;
		 int count =0;
		 
		 while(count <7) { //공 7개 
			  //예외 처리시 위치 선정 ! while 문 안에-- 오류가 낫을때 while문도 끝나기 때문에
			 Collections.shuffle(machine);
			//랜덤 인덱스
			int index = rand.nextInt(45-count); //랜덤 돌릴수록, 최대값이 줄기때문에
			try {
			if(count<6) {
				//6보다 작을때까지는 로또 번호 수집
				sysLotto.add(machine.get(index));
			}else {
				bonusNum = machine.get(index);
			}
			count++;//카운트 증가
			machine.remove(index); // 뽑은 위치 삭제
			
			 }catch (IndexOutOfBoundsException e) {
				 System.out.println("index 오류 : " + index);
			 }
		 }  
		 System.out.println("로또 : " + sysLotto + " 보너스 번호 : " + bonusNum);
		 
		 //사용자 로또 번호 받기
		 Scanner scan = new Scanner(System.in);
		 List<Integer>myLotto = new ArrayList<>();
		 count =0;
		 
		 while(count <6) {
			 System.out.println((count+1) + " 번 째 로또 : ");
			 try {
			 int temp = scan.nextInt();
			 
			 if( temp <1 || temp > 45) {
				 System.out.println("로또 번호는 1~45 사이여야 합니다.");
				 //임의의 예외 발생
				 throw new InputMismatchException("범위 입력 오류");
			 }
			 
			 if(myLotto.contains(temp)) {
				 System.out.println("해당번호는 중복된 번호 입니다.");
				 continue;
			 }
			 myLotto.add(count++,temp); //count를 인덱스 삼아서 값 넣기.(증가하면서 값이 들어감
			 
			 }catch(InputMismatchException e) {
				 scan.nextLine(); //버퍼 비우기
				 System.out.println(e.getMessage()== null ? "입력오류: ": e.getMessage());
			 }
		 }
		 System.out.println("내 로또 : " + myLotto);
		 
		 //맞은 번호 저장 리스트
		 List<Integer> matchNumber = new ArrayList<Integer>();
		 matchNumber.addAll(sysLotto); // 원본 복사
		 //리스트 기능 중에 다른 리스트와 비교하여 같은것만 남기는 기능 -- retainAll
		 matchNumber.retainAll(myLotto); // 맞는것만 남음.
		 //내가 선택한 로또와 보너스 번호랑 같은게 있는지 확인
		 boolean isBonus = myLotto.contains(bonusNum);
		 
		 
		 int matchCount = matchNumber.size(); //맞은 개수 지정
		 System.out.print("맞은 로또 : " + matchNumber);
		 //보너스 넘버 찾기
		 System.out.println(matchCount ==5 && isBonus ? ",보너스 번호 : "+ bonusNum: "");
		 
		 //출력
		 if(matchCount == 6) { 
				System.out.println("축하합니다 1등 입니다!!");
			}else if (matchCount == 5 && isBonus ) { //5개 맞고 보너스 번호도 맞으면
				System.out.println("2등 입니다!!");
			}else if(matchCount == 5){ //5개만 맞으면
					System.out.println("3등 입니다!!");
			}else if(matchCount == 4) {
				System.out.println("4등 입니다.");
			}else if(matchCount == 3) {
				System.out.println("5등 입니다.");
			}else {
				System.out.println("꽝 입니다.");
		 
	}

}
}