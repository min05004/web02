package Study.method.over;

public class PokeMonWorld {
	public static void main(String[] args) {
		
		
		PicaChu pi =new PicaChu();
		Turttle t = new Turttle();
		pi.setMyname("피카츄");
		t.setMyname("꼬부기");
		
		pi.attack();
		t.attack();
		
		
		Poketmon m = new Turttle(); //부모가 준 것을 재정의 했기 때문에!! 재정의한 값이 나옴..!
		m.setMyname("꼬북꼬북");
		
		m.attack();
	
	}

}
