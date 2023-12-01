package study.obj.global;

public class Samsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
		System.out.println("삼성");
	}

	@Override
	public void powerOff() {

		System.out.println("전원 꺼짐");
		System.out.println("삼성");
	}
	

}
