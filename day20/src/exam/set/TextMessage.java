package exam.set;

public class TextMessage {
	//메세지 식별번호
	
	private int msgNum;
	private String message;
	
	public TextMessage(int msgNum,String message) {
		//private 변수는 내부에서도 get/setter 추천
		this.setMsgNum(msgNum);
		this.setMessage(message);
		
		
	}
	public int getMsgNum() {
		return msgNum;
	}
	public void setMsgNum(int msgNum) {
		this.msgNum = msgNum;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	//hashcode 메서드 재정의
	@Override
	public int hashCode() {
		return this.getMsgNum();// 식별데이터 
	}
	
	@Override
	public boolean equals(Object obj) { // equals 는 boolean 타입.
		if(obj instanceof TextMessage) { // 같은 타입인지 , 아닌지
			TextMessage compare = (TextMessage)obj; // (TextMessage) 형변환
			if(this.getMessage().equals(compare.getMessage() )){ // 실제 메세지의 내용이 같은지
				return true; //빠른 반환 -- 문장이 내려오기 전에 리턴값이 나옴
			}
		}
		return false; //같지 않으면 리턴값 false
	}

}
