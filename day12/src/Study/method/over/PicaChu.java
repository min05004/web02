package Study.method.over;

public class PicaChu extends Poketmon {
	
	@Override  //어노테이션
	public void attack() {   // 리메이크에 가깝.. 부모에 있는 메서드를 재구성!
		System.out.println(this.getMyname() + "가(이) 100만 볼트 공격");
	}

}
