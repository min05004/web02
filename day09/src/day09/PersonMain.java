package day09;

public class PersonMain {
	public static void main(String[] args) {
		
		//객체 선언
		Person p1 = new Person();
		
		p1.myName = "홍길동";
		p1.setAge(300);
		System.out.println(p1.myInfo());
	}

}
