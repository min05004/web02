package study.code.str;

public class StringTest {
	public static void main(String[] args) {
		//String 선언 방법
		char [] arr = {'a','p','p','l','e'};
		String str1 = "apple"; //자동으로 생성자가 생성됨
		String str2 = new String("apple"); // new 새로운 공간을 생성!
		String str3 = String.valueOf(arr);  //배열을 결합해서 내부적으로 new로 새로운 공간이 만들어짐.
		String str4 = String.valueOf("apple"); // valueOf 은 toStrig 오버라이드
		
		
		System.out.println(str1 + " ," + str2 + ", "+ str3);
		System.out.println(str1 == str2);  // 주소값을 비교!
		System.out.println(str1 == str3);
		System.out.println(str3 == str2);
		System.out.println(str1 == str4); //true 값이 나옴 -- 주소값이 같음
	}

}
