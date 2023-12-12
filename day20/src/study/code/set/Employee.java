package study.code.set;

public class Employee {
	
	private String emNumber; //사번
	private String myName; //이름
	
	/*
	 * 식별할 수 있는 값으로 Hashcode를 만들어서 비교한다.
	 */
	
	
	
	public String getEmNumber() {
		return emNumber;
	}
	public void setEmNumber(String emNumber) {
		this.emNumber = emNumber;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	@Override
	public int hashCode() {
		System.out.println("-----해쉬코드 비교-----"); // 실제 돌았는지 확인하기용
		return emNumber.hashCode(); // 값 자체를 수치화
	}
	@Override
	public boolean equals(Object o) {
		System.out.println("-----값 비교-----");
		if(o instanceof Employee) { // Employee 와 Object o 타입이 같은지 확인하기
			Employee comp = (Employee)o; //같은 타입으로 형변환
			//빠른 리턴 패턴 
			return myName.equals(comp.getMyName()); // 이름(값)이 같은지 확인
		}
		return false;
	}

}
