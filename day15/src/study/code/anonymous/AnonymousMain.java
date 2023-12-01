package study.code.anonymous;

import javax.annotation.processing.SupportedSourceVersion;
import javax.swing.plaf.multi.MultiButtonUI;

import study.code.anonymous.Component.MultiButton;

public class AnonymousMain {
	public static void main(String[] args) {
		
		//버튼 선언
		Component.Button button = new Component.Button();
		
		ButtonEnventListener listner = new ButtonEnventListener() {
			//익명 클래스 선언
			//객체의 선언과 추상메서드의 구현을 동시에 한다.
			//추상 메서드는 객체 선언할 때 만들어짐에 따라 유일한 기능을 지닌 메서드가 된다.
			@Override
			public void click(String type) {
				if(type.equals("read")) { //String 타입의 같다는 .equals
					System.out.println("읽기 버튼 동작");
				}else if(type.equals("write")) {
					System.out.println("쓰기 버튼 동작");
				}
				
			}
		}; //내가 구현해야할 코드 존재 -) 끝에 ; 들어감(선언과 생성 동시)
		
		//구현된 버튼이벤트객체를 세팅
		button.setButton(listner);
		
		//버튼 클릭
		button.click("read");
		button.click("write");
		
		
	}
	
	//리스너를 상속한 구현 클래스
	
	public static class ViewButton implements ButtonEnventListener {
		public void click(String type) {
			if(type.equals("view")) {
				System.out.println("보기 버튼 동작");
			}
		}
		
	}

	public static class DeleteButton implements ButtonEnventListener {
		public void click(String type) {
			if(type.equals("delete")) {
				System.out.println("삭제 버튼 동작");
			}
		}
		
	}

}
