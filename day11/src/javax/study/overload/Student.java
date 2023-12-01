package javax.study.overload;

public class Student {
	
	private String myName;
	private int age;
	
	//기본 생성자 
	//public Student() {
		
	//}
	
	//오버로드 - 같은 이름을 가진 또다른 메서드를 만들수 있음
	//단, 파라메터 개수가 다르거나, 개수는 같더라도 타입이 달라야함
	
	public Student(String myName, int age) { // 파라메터가 있는 생성자가 기본 생성자로 설정
		//this.age= age;
		//this.myName = myName;  --- 내부에서 사용하는 것이기에 이렇게 사용해도 됨.
		this.setAge(age);
		this.setMyName(myName); //다만 로직(기능)이 들어가는 경우는 내.외부와 상관없이 getter,setter사용해야함
		}
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
