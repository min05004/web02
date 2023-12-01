package study.code.anonymous;

import study.code.anonymous.AnonymousMain.DeleteButton;
import study.code.anonymous.AnonymousMain.ViewButton;

public class Component {
	
	//내부 클래스 선언

	public static class Button{
		private ButtonEnventListener listener;
		//리스너 객체를 setter를 통해서 받기
		public void setButton (ButtonEnventListener listener) {
			this.listener = listener;
		}
		
		//버튼 클릭 이벤트 메서드
		public void click(String type) {
			if(this.listener != null) {
				//리스너가 가지는 이벤트를 발생한다.
				this.listener.click(type);
			}
		}
	}
	
	public static class MultiButton{
		private ButtonEnventListener listener;
		
		/*메서드의 파라메터의 데이터 타입을
		 * 특정 객체의 부모타입으로 지정할 경우,
		 * 부모타입을 포함한 그 하위 클래스 모두를 파라메터로 받을 수 있다.
		 */
	
		public void setButton (ButtonEnventListener listener) { //ButtonEnventListener를 포함한 모든 클래스들을
			this.listener = listener;
		}
		public void click(String type) { // 비교대상 instanceof  비교객체
										//대상의 객체 타입이 비교객체와 동일한지 비교하는 연산자
			if(listener instanceof ViewButton ) {
				System.out.println("보기버튼");
				this.listener.click(type);
			}else if(listener instanceof DeleteButton ) {
				System.out.println("삭제버튼");
				this.listener.click(type);
				
			}
			
		}
	}

}
