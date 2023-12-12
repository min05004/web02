package stud.code.str;

public class StreamBuilderTest {
	public static void main(String[] args) {
		
		String str = "오늘 날씨가 춥다";
		//StringBuilder 선언
		StringBuilder sb = new StringBuilder();
		
		
		//StringBuilder 문자 추가
		sb.append("오늘 날씨가 춥다");
		
		//객체의 주소 출력
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(sb));
		
		//한 글자씩 추가
		str+="얌";
		sb.append("얌");
		
		//객체의 주소 출력
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(sb)); //빌더에 추가한 객체 위치값이 같음
		
		
		
		//출력
		System.out.println(str);
		//StringBuilder 또는 String Buffer 는 문자열 타입 객체가 아님.
		//문자를 다루기는 하지만 문자열 타입이 아니기 때문에
		//String에 대입하려면 String 타입으로 변환 해야한다.
		String str2=sb.toString(); 
		System.out.println(sb);
		
	}

}
