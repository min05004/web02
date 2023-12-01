package javax.study.overload;

public class StdMain {
	public static void main(String[] args) {
		
		Student st = new Student("홍길동",500);
		System.out.println("이름 : "+st.getMyName()+", 나이 :"+st.getAge());
	}
	

}
