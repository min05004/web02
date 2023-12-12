package study.code.generic;


public class StorageMain {
	public static void main(String[] args) {
		
		DataList list = new DataList();
		
		list.add(10);//정수
		list.add(10.11); //실수
		list.add("안녕"); //문자열
		
		System.out.println("저장된 개수 : "+ list.size());
		
		
		//출력
		for(int i =0; i<list.size(); i++) {
			Object obj = list.get(i);
			
			if(obj instanceof Integer) { //만약 정수 타입이라면
				System.out.println("정수 : "+(Integer)obj);
			}else if(obj instanceof Double) {
				System.out.println("실수 : "+(Double)obj);
				
			}else if(obj instanceof String) {
				System.out.println("문자 : "+(String)obj);
			}
		}
		
		}

}
