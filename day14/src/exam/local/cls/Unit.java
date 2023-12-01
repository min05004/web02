package exam.local.cls;

public class Unit {
	
	private int speed =10;
	
	public void getUnit(String type, String unitName) { //파라메터로 유닛네임 받기
		
		class Tank{ //지역클래스 선언
			public void move() {
				System.out.println(unitName + "이(가)" + speed+ "속도로 이동");
			}
			
		}
		class Ship{ //동일
		public void move() {
			System.out.println(unitName + "이(가)" + speed+ "속도로 이동");
		}
		//내부의 쓰는 객체는 내부에서 소비. -- 지역 클래스
	}
		Tank t = null;
		Ship s = null;
		
		if(type.equals("ship")) {
			s = new Ship();
			s.move();
			
		}else if (type.equals("tank")) {
			t = new Tank();
			t.move();
		}
	
	}

}
