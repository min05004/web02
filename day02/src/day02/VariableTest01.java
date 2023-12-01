package day02;

public class VariableTest01 {
	public static void main(String[] args) {
		// 정수 선언
		int inValue01 = 10;
		byte byValue01 =5;
		double dValue01 =30.44;
		
		int inValue02 ;
		//초기화 해야하는 이유
	//	inValue02 = inValue02 + 10;

		// float 안쓰는 이유
		float fValue = 10.33f; // f 붙여서 사용,타입과 값의 허용범위가 같아야 = 대입이 가능하기 때문에 허용범위를 맞춰줌
	
		char ch01 = 'a';
		char ch02 = '\0';
		/*
		 * 문자는 실제로 컴퓨터 상에서 숫자로 저장.
		 * 컴퓨터의 문자와 숫자를 대응하는 규칙을 정의해놓은
		 * 규격표를 아스키코드표라고 한다
		 * 때문에 문자 타입일지라도, 숫자값을 대입할 수 있다.
		 */
		char ch03 =97;
		String str = "";
		System.out.print(ch02);
		
		str= "안녕하세요";
	    System.out.println(str);

		System.out.println(dValue01);
		System.out.println(inValue01);
		System.out.println(ch01);
		System.out.println(ch02);
		
		
		
	int a= 15;
	int sum =0;
	
	sum = a++; //  선 연산 후 증감
	sum = ++a; // 선 증감 후 연산
	
	
	
	
	
	

}
}