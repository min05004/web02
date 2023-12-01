package study.obj.global;

public class RemoteMain {
	public static void main(String[] args) {
		
		//클래스 - 인터페이스 관계는 인터페이스 구현제 역할
		//다형성을 이용한 객체선언을 한다.
		RemoteControl sam = new Samsung();
		RemoteControl lg = new Lg();
		
		sam.powerOn();
		sam.powerOff();
		
		lg.powerOn();
		lg.powerOff();
	}

}
