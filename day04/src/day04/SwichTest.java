package day04;

import java.lang.runtime.SwitchBootstraps;

public class SwichTest {
	public static void main(String[] args) {
		
		int value = (int)(Math.random()*(100-50)+1) +50;
	
		//Swich case 구문
		switch (value/10) {
		case 10:
			System.out.println("점수: "+ value + ", 학점 : A");
			break;
		case 9:
			System.out.println("점수: "+ value + ", 학점 : A");
			break;
		case 8:
			System.out.println("점수: "+ value + ", 학점 : B");
			break;
		case 7:
			System.out.println("점수: "+ value + ", 학점 : C");
			break;
		case 6:
			System.out.println("점수: "+ value + ", 학점 : D");
			break;

		default:
			System.out.println("점수 : "+ value + ", 학점 : F");
			break;
		
	}

}
}
