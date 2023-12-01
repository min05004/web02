package study.homework;

public class Student {

	/*1. 학생 객체를 만든다
	2. 객체는  이름 , 국어, 영어, 수학  정보를 담는 맴버변수가 있다.
	3. 메서드로는 getter/stter 와  총점 과 평균을 구하는 메서드가 각각 존재한다.


	4. 학생을 5명 생성할 수 있도록 한다.
	5. 학생의 정보는 Scanner 를 사용하여 입력 받는다.
	6. 입력받은 학생을 비교하여, 총점기준으로 제일 높은 등수부터 출력한다.

	7. 최고점자와 최저점자를 출력한다.

	--------OPTION--------------------
	각 과목당 평균점수를 출력해보도록 한다.
	옵션은 할수 있는사람만 하세요
	*/
	
	
	
	// 1.국어, 영어 , 수학 , 학생 이름 변수 만들기
	
	private int kor;
	private int Math;
	private int eng;
	private String myName;
	
		
	
	//기본  학생 생성자 만들기
	public Student() {
		
	}
	
	//getter, setter 만들기


	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return Math;
	}

	public void setMath(int math) {
		Math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
	//총점 과 평균을 구하는 메서드 만들기
	//2.총점
	public int total() {
		return (this.kor + this.eng + this.Math);
		}
	//3.평균
	public double avg() {
		double avg;
		return 
		avg = this.total()/3;	
	
}
}
	