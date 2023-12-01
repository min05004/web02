package day03;

public class ChangeValueTest {

	public static void main(String[] args) {
	
		int num = 10;
		long lv01 =0;
		//자동 형변환
		//보통 작은 타입의 값을 큰 타입 변수에 대입 할 때 진행됨
		//별도의 지시없이 형변환이 이뤄짐.
		lv01 = num;
		System.out.println(lv01);
		
		//강제형변환
		//오류
		//num  = lv01;
		num = (int) lv01;
		// 자바 현재 숫자 강제형변환 됨..!
		
		char ch = 'B';
		int convert = 0;
		//문자는 아스키코드표에 의하여 대응하는 숫자갑이 있기 떄문에 자동형변환 가능.
		convert = ch;
		
		String str = "";
		//문자를 <-> 문자열로 형변환 불가능
		//str= ch;
		//ch = str ;
		
		System.out.println(ch+" 문자변환 : "+convert);
		int sum =0;
		int value =10;
		
		//증감연산자가 앞에 놓이는 경우
		sum = ++value;
		System.out.println("sum="+sum+",value="+value);
		//증감연산자가 뒤에 놓이는 경우
		sum = value++;
		System.out.println("sum="+sum+",value="+value);
		
		
	}

}
