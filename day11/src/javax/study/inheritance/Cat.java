package javax.study.inheritance;

public class Cat extends Animal { //상속하기
	
	public Cat(String myName,String sound,String eat) {
		this.setMyName(myName);
		this.setEat(eat);
		this.setSound(sound);
	}


}
