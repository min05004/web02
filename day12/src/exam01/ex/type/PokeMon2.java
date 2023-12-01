package exam01.ex.type;

/**
 * 추상화 클래스란
 * --추상화 메서드를 지닐 수 있는 클래스
 * 
 * 추상화 메서드란
 * -- 구현화 되지않고 정의만 되어있는 상태의 메서드
 * 
 * 추상화 클래스 및 메서드는 abstract 라는 기호를 사용하여 표현
 *- 메서드의 구현여부는 코드블럭(중괄호)의 유무
 *- 그리고  abstruct 기호의 유무
 * 
 * 사용이유 
 * -- 부모클래스의 일부 기능을 구현하지 않고 정의만 하여
 * 		자식클래스 각자가 구현하도록 하기 위함.
 * 		기능은 동일하나 자식 클래스 마다 기능의 사용이 다를 경우 필요
 * 
 * 
 */
public abstract class PokeMon2 {
	
	private String myMame;
	
	public void setMyname(String myName) {
		this.myMame =myName;
	}

	public String getMyname() {
		return this.myMame;
	}
	
	public abstract void attack();
}
