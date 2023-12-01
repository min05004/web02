package study.code.str;

import java.util.Arrays;

public class StringTest02 {
	public static void main(String[] args) {
		String str1 = "안녕하세요 날씨가 춥네요";
		//긴문장 쓰기
		String str2 = """
					긴문장 쓰기
					긴문장 쓰기2
						"""; // 블럭 형태로 사용.
		
		//1.문자 바꾸기
		String str3 = "apple, apple , mango, grape, banana , grape";
		//원본에 영향을 주지 않는다. -- 실행 할때만 ,바뀜
		System.out.println(str3.replace("apple","kiwe")); //정규식 허용하지 않음.
		System.out.println(str3.replaceAll("apple","water melon"));
		/*
		 * 자바에서는 replaceAll 을 사용
		 * 둘다 변경에 대한 기능은 같음, replaceAll 이 정규식을 허용하여 좀더 폭넓게 사용이 가능.
		 */
		
		//2.문장 나누기 -> 문자열을 나눠서 배열로 만들수 있음(기준값에 의해 나눔)
		//.split(기준문자); -- 기준문자를 기준으로 잘라서 배열에 넣음.
		String[]arr =str3.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		//3.원하는 문자 구간을 잘라서 출력  -- 배열과 똑같은 인덱스를 가짐.(띄어쓰기도 문자)
		String str4 = "오늘도 수고하셨습니다. 잘자요~";
		String subStr = str4.substring(13);
		/* substring(beginIndex); -- 시작위치부터 끝까지
		 * substring(beginIndex, endIndex); -- 시작부터 마지막 위치 전까지!
		 */
		System.out.println(subStr);
		System.out.println(str4.substring(0,3));
		
		
		//4.String 타입 변형 -- .valueOf() 문자열을 포함한 다른 타입들을 문자 타입으로 변환하는 메서드
		String.valueOf(20);
		
		//5.charAt(index); - 인덱스 위치에 있는 문자 출력.
		System.out.println(str4.charAt(0));
		
		//6.문자안에 특정 단어가 포함되어있는지 찾기
		String str5 = "사과,행복,불행,천운,천국,사과";
		//특정 문자가 존재하는 지 알아보는 메서드
		//존재하지 않는다면 -1 ,존재한다면 해당 문자의 시작위치 반환
		//중복값이 잇는 경우 첫번째 문자가 있는 위치가 나온다.
		System.out.println("로또 있는가 : "+ str5.indexOf("로또"));
		System.out.println("사과 있는가 : "+ str5.indexOf("사과")); //중복이라 맨처음 단어 인덱스가 나옴.
		
		//7. 검색하는 문자의 마지막 위치 가져오기
		//lastIndexOf(단어); -- 확장자 찾을때 많이 사용
		
		System.out.println("천운 있는가 : "+ str5.lastIndexOf("천운"));
		System.out.println("사과 있는가 : "+ str5.lastIndexOf("사과")); 
		//8. 문자 비교하기
		System.out.println("비교1: "+ "apple".equals("Apple"));
		System.out.println("비교2: "+ "apple".equals("apple"));
		//대소문자 비교
		System.out.println("비교3: "+ "apple".equalsIgnoreCase("Apple"));
	}

}
