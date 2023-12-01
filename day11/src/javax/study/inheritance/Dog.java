package javax.study.inheritance;

public class Dog extends Animal {
	
	public Dog(String myName,String sound,String eat) {
		this.setMyName(myName);
		this.setEat(eat);
		this.setSound(sound);
		
	}
	
	public void sleep() {
		System.out.println(this.getMyName()+ " 이 잡니다..");
	}
}
