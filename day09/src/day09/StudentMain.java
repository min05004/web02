package day09;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		//학생 3명을 넣을 수 있는 배열
		//클래스는 그 자체로 타입이됨.
		Student[]stArray = new Student[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<stArray.length; i++) {
			//학생 객체를 만든다
			
			Student st = new Student(); //반복문이 실행될때 마다 공간이 새로 만들어짐.
			
			System.out.println((i+1)+ "번째 학생 이름 : ");
			st.setMyname(scan.next()); // next : String 받는 스캐너 함수
			System.out.println((i+1)+ "번째 학생 국어 : ");
			st.setKor(scan.nextInt());
			System.out.println((i+1)+ "번째 학생 영어 : ");
			st.setEng(scan.nextInt());
			System.out.println((i+1)+ "번째 학생 수학 : ");
			st.setMath(scan.nextInt());
			
			//배열에 저장
			stArray[i] =st;
		}
		scan.close();
		//가장 높은 점수를 받은 학생 객체 만들기
		Student maxStd = null ; // 객체 초기화 하는 방법 *
		
		for(int i=0; i< stArray.length; i++) {
			if(maxStd == null) { //최고점자가 없음,현재 학생이 최고점자가 된다
				maxStd = stArray[i]; //배열에 넣기
			}else {
				if(maxStd.getTotal() < stArray[i].getTotal()) { // 현재 최고점이 현재 학생보다 비교대상 학생의 총점이 높으면 교체
					maxStd = stArray[i]; // 교체 -- 최고점인 사람만 남음
				}
			}
		}
		
		//출력
		for(int i=0; i<stArray.length; i++) {
			Student st = stArray[i];
			
			System.out.print("이름 : " + st.getMyname());
			System.out.print(", 국어 : " + st.getKor());
			System.out.print(", 영어 : " + st.getEng());
			System.out.print(", 수학 : " + st.getMath());
			System.out.print(", 총점 : " + st.getTotal());
			System.out.println(", 평균 : " + st.getAvg());
		}
		//최고점자 학생의 이름과 총점 출력하기
		System.out.println("최고점자 : " + maxStd.getMyname() + ", 총점 : " + maxStd.getTotal());
		}
		
		
		
	}


