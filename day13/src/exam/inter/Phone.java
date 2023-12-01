package exam.inter;

public interface Phone {
	
	
	public static final int MAX_BATTERY_CAPACITY =100;
	
	public abstract void powerOn(); //추상화 메서드만 가능! 
	// **public abstract가 공통으로 들어감 -- 생략 가능( private 안됨 접근해서 구현해야하기 때문에)
	void powerOff(); // 
	boolean isOn();
	void watch();
	void charge();

}
