package day04;

import java.util.Scanner;
/* if else if 문
 * - 다중조건문 연속적으로 연결되는 경우에
 * 
 * 각자의 조건이 유기적이지 않을떄는 if문 쪼개쓰기.
 *
 * 
 */
public class IfTest04 {
	public static void main(String[] args) {
		
		int score =0; // 변수 초기화 
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("점수입력 : ");
		score = scan.nextInt();
		
		if(score >=90) {
			System.out.println("점수 : " + score +", 학점 : A");
		}else if (score >=80) {
			System.out.println("점수 : " + score +", 학점 : B");
		}else if(score >=70) {
			System.out.println("점수 : " + score +", 학점 : C");
		}else if(score >=60) {
			System.out.println("점수 : " + score +", 학점 : D");
		}else {
			System.out.println("점수 : " + score +", 학점 : F");
		}
		scan.close(); //입력 대기상태를 해지하는 용
	}

}
