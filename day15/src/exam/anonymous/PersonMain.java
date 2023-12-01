package exam.anonymous;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p = new Person() {
			@Override
			public void introduce() {
				System.out.println("나는 생각하는 사람");
			}
			
		};
		p.introduce(); // 해당 메서드는 한번만 사용할 것.
	}

}
