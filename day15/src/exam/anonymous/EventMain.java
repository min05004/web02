package exam.anonymous;

public class EventMain {
	//내부 객체 버튼 클래스
	public class Button{
		private ButtonClickListener lisner;
		//setter -- lisner 입력받을 문 생성
		public void setListner(ButtonClickListener listener) {
			this.lisner = lisner;
		}
		public void click() {
			if(this.lisner !=  null) { //lisner가 들어왓다면, 값이 있다면
				this.click();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		EventMain main = new EventMain(); // 외부 클래스 객체화
		//내부 클래스 선언
		EventMain.Button button = main.new Button();
		//-- 버튼 공간 만들기
		
		ButtonClickListener listener = new ButtonClickListener() { //익명함수 처리
			//-- 버튼을 누르는 사용이 다양하기 때문에 버튼에 대한 일회용 이벤트 처리를 함.
			@Override
			public void click() { //객체화가 안됨 -- 자기자신을 구현만!
				System.out.println("버튼이 눌렸습니다.");
			}
		};
		button.setListner(listener);
		button.click();
	}

}
