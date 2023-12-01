package day09;

public class Person {
	
	public String myName;
	private int age;
	
	
	//setter  값을 저장.- 리턴값 없음, 파라메터  있음 (데이터 타입은 변수에 달렸음/ 변수의 이름과 같게 만든다.)
	public void setAge(int age) {
		this.age =age;
		//클래스 age = 파라메터 age
	}
	//getter 값을 출력 - 리턴값 있음, 파라메터 없음(출력용이니까!)
	public int getAge() {
		return this.age;
	}
	
	public String myInfo() { //파라메터 없고 리턴은 있는 메서드
		String str = "이름 : " + myName + " ";
		str += "나이 : " + age;
		
		return str;
	}

}
