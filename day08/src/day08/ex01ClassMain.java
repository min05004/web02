package day08;

public class ex01ClassMain {
	public static void main(String[] args) {
		
		ex01Class st1 = new ex01Class();
		ex01Class st2 = new ex01Class();
		
		st1.Myname = " 홍길동";
		st2.Myname = " 고길동";
		
		st1.schoolinfo(); //객체를 선언한 다음에 생성 - 인스턴스 호출
		//ex01Class.schoolinfo(); // static으로 만들었기 때문에 클래스 호출
	}

}
