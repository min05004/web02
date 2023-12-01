package exam01.ex.type;

public class Bus extends Car{
	
	public Bus(String myName) {
		super(myName);
	}

	public void getInfo() {
		System.out.println("버스 이름은 "+this.getmyname()+"입니다.");
	}
}
