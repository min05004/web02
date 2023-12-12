package study.code.exam1;

public class Person implements Comparable<Person> { // implements Comparable<Person>
	
	private int score;
	private String myName;
	
	//생성자로 이름, 점수 받기
	public Person(String myName, int score) {
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
	@Override // 정렬하기
	public int compareTo(Person o) { //파라메터 안 -> 뒤에 오는 다음 person 
		
		int result =0;
		//1이면 변경 아니면 유지. 
		result = this.score > o.getScore() ? 1: -1;
		return result;
	}

}
