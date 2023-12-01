package exam.inter;

public class Apple implements Phone{
	
	private int battarycapacity =40;
	private boolean isOn = false;

	@Override
	public void powerOn() {
		if(battarycapacity>30) {
			System.out.println("@@@@@power on@@@@@");
			isOn = true;
		}else {
			System.out.println("@@@@@power off@@@@@");
		}
		
	}

	@Override
	public void powerOff() {
		System.out.println("@@@@ power off @@@@");
		
	}

	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void watch() {
		
		
	if(battarycapacity >10) {
		System.out.println("-------- watching -------");
		battarycapacity -=10; //한번 볼때마다 배터리 10씩 빼기
		System.out.println("battery is"+ this.battarycapacity+"%"); //남은 배터리양 체크
	}else {
		System.out.println("Low battery"); // 출력이 안될 경우
		powerOff(); //끄기
	}
		
	}

	@Override
	public void charge() { //충전
		if(this.battarycapacity < Phone.MAX_BATTERY_CAPACITY) {
			System.out.println("start charaging");
			// 5프로이상 차이날때 5를 더하고 아니면 100에서 현재 값을 뺀만큼 더하기.
			if(Phone.MAX_BATTERY_CAPACITY - this.battarycapacity >=5){ 
				this.battarycapacity += 5;
				
			} else {
				this.battarycapacity +=(Phone.MAX_BATTERY_CAPACITY - this.battarycapacity);
			}
		}
		
	}

}
