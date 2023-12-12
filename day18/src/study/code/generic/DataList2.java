package study.code.generic;

public class DataList2<E> { // 제너릭 사용 -- 사용용도는 선언할때 부여
	

	//클래스의 멤버 변수들은 자동 초기화 된다.
	private Object[] data;
	private int size;
	private final int capacity =10;
	
	public DataList2() {
		data = new Object[this.capacity];
	}
	
	//배열의 사이즈를 생성자로부터 입력
	public DataList2(int capacity) {
		data = new Object[capacity];
	}
	
	public void add(E value) {
		if(data.length == size) {
		
			Object[] temp = new Object[ size + capacity];
			System.arraycopy(value, 0, temp, 0, data.length);//배열 복사
			// 원본 , 원본에서 복사 시작 위치 , 복사대상, 대상의 시작위치,복사할 길이
			
			data = temp; //새로만든 배열로 바꾼다.
					
		}
			data[size++] = value;
		}
			//인덱스 위치에 저장된것 반환 
		public E get(int index) {
			return (E)data[index]; // 꺼낼때 형변환 해야함.
			
		}
		//현재 저장된
		public int size() {
		 return size;
		 }

}
