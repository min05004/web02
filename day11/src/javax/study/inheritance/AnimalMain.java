package javax.study.inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		
		Cat cat =new Cat("고양이","야옹","생선");
		Dog dog =new Dog("강아지","멍멍","닭다리");
		
		cat.getInfo();
		dog.getInfo();
		
		dog.sleep();
		
		//강아지를 다형성을 이용하여 만들기
		//다형성을 이용한 선언 - 부모타입을 이용한 객체선언
		Animal dog2 = new Dog ("강아지2","월월","소고기");
		dog2.getInfo();
		//클래스 간의 상속에서 부모타입으로 객체를 선언할 경우- 부모가 물려준것만 사용가능!
		//dog2.sleep();
	}

}
