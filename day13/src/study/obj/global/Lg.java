package study.obj.global;

public class Lg implements RemoteControl {

	@Override
	public void powerOn() {

		System.out.println("전원 켜짐");
		System.out.println("엘지");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
		System.out.println("엘지");
		
	}
	

}
