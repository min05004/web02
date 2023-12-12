package study.code.exam1;

public class Person2 { 
	
	private int score;
	private String myName;
	
	//생성자로 이름, 점수 받기
	public Person2(String myName, int score) {
		this.myName = myName ;
		this.score = score;
	}
	//출력
	public String toString() { // 오버라이드
		StringBuilder sb = new StringBuilder(); // 문자담기
		sb.append("이름 : " + this.myName+", "); // 이름 출력 
		sb.append("점수 : " + this.score+"\n"); // 점수 출력
		return sb.toString();
	}
	public int getScore() { // 점수값 받는 메서드
		return this.score;
	}
	
		

}
