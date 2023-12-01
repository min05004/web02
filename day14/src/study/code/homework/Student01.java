package study.code.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student01 {
	
	private String myMane;
	private int kor;
	private int eng;
	private int math;
	public String getMyMane() {
		return myMane;
	}
	public void setMyMane(String myMane) {
		this.myMane = myMane;
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
	
	
	//총점
	public int getTotal() {
		return (this.getEng()+this.getKor()+this.getMath());
	}
	//평균	
	public double getAvg() {
		double avg = (double)this.getTotal() /3;
		
		return new BigDecimal(avg).setScale(2,RoundingMode.HALF_UP).doubleValue();
		//new BigDecimal(avg) -- 객체 선언하고 한번쓰고 말꺼라서 굳이 공간에 담진 않음..!
		//RoundingMode.HALF_UP -- 클래스 . 상수
		
		
	}
	
	@Override
	public String toString() { // 오버라이드  -- 각 점수 출력 쉽게하기
		String str = "" ;
		str+= "이름 : " + this.getMyMane()+" , ";
		str+= "국어 : " + this.getKor()+" , ";
		str+= "영어 : " + this.getEng()+" , ";
		str+= "수학 : " + this.getMath()+" , ";
		str+= "총점 : " + this.getTotal()+" , ";
		str+= "평균 : " + this.getAvg()+" \n";
		
		return str;
		
	}

}
