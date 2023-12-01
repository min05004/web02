package Study.method.over;

public class Poketmon {
	
	private String myMame;
	
	public void setMyname(String myName) {
		this.myMame =myName;
	}

	public String getMyname() {
		return this.myMame;
	}
	
	//공격
	public void attack() {
		System.out.println(this.getMyname() + " 가(이) 공격합니다.");
	}
}

