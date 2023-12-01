package day09;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	private String Myname;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자 만들기
	public Student() {
		System.out.println("생성자 호출");
	}
	
	public String getMyname() {
		return Myname;
	}
	public void setMyname(String myname) {
		Myname = myname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//총점 구하기 -- 합산한 결과를 돌려주기( 점수이기 때문에 int 타입)
	public int getTotal() {
		return (this.kor + this.eng + this.math); // 클래스 내부에서도 멤버변수이기를 보여주기 위해 this.
	}
	//평균 구하기 
	public double getAvg() {
		double avg = (double)this.getTotal()/3; // 평균 -- total의 값은 int 이기 때문에,(double) 형변환
		BigDecimal dec = new BigDecimal(avg);
		return dec.setScale(2,RoundingMode.HALF_UP).doubleValue(); // 임시선언
		          //모든 숫자 형변환 가능 BigDecimal //소수점 2자리까지 반올림//doubleValue();더블타입으로 리턴
	}

}
