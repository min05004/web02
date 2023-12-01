package day10;

public class Student {
	
	private int age;
	private String myName;
	private String school;
		
	
	//기본 생성자
	public Student() {
		
	}
	
	//생성자를 통해서 데이터를 받고 싶을때
	public Student(int age,String myName) {
		this.age =age;
		this.myName =myName;
	}
	
	// 오버로드
	public Student(int age,String myName,String school) {
		this(age,myName); //생성자로써도 사용이 가능.** 위에 나이와 이름 만든 생성자를 받음.
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
