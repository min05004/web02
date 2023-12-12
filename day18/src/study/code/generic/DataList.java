package study.code.generic;

public class DataList {
	

	//클래스의 멤버 변수들은 자동 초기화 된다.
	private Object[] data;
	private int size;
	private final int capacity =10;
	
	public DataList() { // 외부로부터 데이터를 받아오기
		data = new Object[this.capacity];
	}
	
	//배열의 사이즈를 생성자로부터 입력
	public DataList(int capacity) {
		data = new Object[capacity];
	}
	
	public void add(Object value) {
		if(data.length == size) { // 배열 사이즈랑 실제 저장된 사이즈가 같다면?
		
			Object[] temp = new Object[ size + capacity]; //임시저장
			System.arraycopy(value, 0, temp, 0, data.length);//배열 복사
			            // 원본 , 원본에서 복사 시작 위치 , 복사대상, 대상의 시작위치,복사할 길이
			data = temp; //새로만든 배열로 바꾼다.
		}
			data[size++] = value; //  안같다면 ?, 안늘렸다면 ->배열에 넣기
		}

		
		

			//인덱스 위치에 저장된것 반환
		public Object get(int index) {
			return data[index];
			
		}
		//현재 저장된
		public int size() {
		 return size;
		 }

}
