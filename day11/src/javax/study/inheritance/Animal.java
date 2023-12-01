package javax.study.inheritance;

public class Animal {
	
	private String myName;
	private String sound;
	private String eat;
	
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	
	
	public void getInfo() {
		System.out.println(this.getMyName() + " (는)은 "+ this.getSound()+" 하고 울고, "
							+this.getEat()+ "을 먹습니다.");
	}
	

}
