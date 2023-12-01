package study.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
	public static void main(String[] args) {
		
		/* --- 만들어야 하는것들
		 *4. 학생을 5명 생성할 수 있도록 한다.
		  5. 학생의 정보는 Scanner 를 사용하여 입력 받는다.
		  6. 입력받은 학생을 비교하여, 총점기준으로 제일 높은 등수부터 출력한다.

		  7. 최고점자와 최저점자를 출력한다.*/
		
		
		
		//4. 학생 객체 5개 만들기.
		Student[] st = new Student[5];
		//입력받는 Scanner 생성하기
		Scanner scan = new Scanner(System.in);
		
		//5.학생 5명 - 점수 받고 배열에 넣기
		
		for(int i=0; i<st.length; i++) { //for문 만들어서 학생 데이터 넣기 
			
			Student st1 = new Student(); // 루프 돌때마다 공간 생성해서 안에 점수 넣기.
			
			System.out.println("학생 이름 : ");
			st1.setMyName(scan.next()); // string 받기
			
			System.out.println("영어 점수 : ");
			st1.setEng(scan.nextInt());
			
			System.out.println("수학 점수 : ");
			st1.setMath(scan.nextInt());
			
			System.out.println("국어 점수 : ");
			st1.setKor(scan.nextInt());
			
			st[i]=st1; //st 배열 안에 st1 입력값을 넣기
			
		}	scan.close();
		
		//총점 출력하기 -- 높은게 앞 낮은게 뒤로
		Student temp = null; // 객체 초기화는 -- null 넣어줘야함..계속 오류 뜨길래 보니,다시 복습하고 정확한 개념을 이해해보기..
		for(int i=0; i<st.length; i++) { //st[0],st[1] 값(앞, 뒤)값을 비교...반복
			for(int j= i+1; j<st.length; j++) {
				if(st[i].total() < st[j].total()) { //앞이 뒤보다 작으면!
					temp = st[j]; //임시변수에 값 저장
					st[j]=st[i] ; //교체!
					st[i]=temp; // 앞에 저장했던 값 넣기
				}
			}
			System.out.println(st[i].getMyName()+"의 "+" 총점 : " + st[i].total());
		}
			
			System.out.print("최고점자는 : "+st[0].getMyName() +", 최고점은 : "+ st[0].total());
			System.out.print("/ 최저점자는 : "+st[4].getMyName() +", 최저점은 : "+ st[4].total());
			
			
	}}
			
			
	/*
		// 입력 받은 값 -- 최대값 찾기
		Student max = null; //객체 초기화
	
		for(int i=0; i<st.length; i++) { 
				if(max == null) {
					max = st[i]; // 지금 최대값이 아무것도 없는 상태이기 때문에, 일단 배열에 넣어서 비교하기.
					
				}else {
					if(max.total()<st[i].total()) {//total의 값 비교 -- 0의 total을 max에 넣고 1과 비교 , Max가 작으면! 교체, 반복
						max = st[i];
					}
					}
				}
			System.out.println("최고점자는 : "+max.getMyName() +", 최고점은 : "+ max.total() );
			
		}
		}
	
		*/
	
		
		
					
				
			
		
		
		
		

	


