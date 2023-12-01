package day03;

public class OpreratorTest {
	public static void main(String[] args) {
		
		byte bvalue =10;
		int ivalue =15;
		long lvalue =30;
		double dvalue =30.33;
		
		byte bsum =0;
		int isum =0;
		long lsum =0;
		double dsum = 0;
		
		//오류 byte 끼리 더해도 결과는 int
		//bsum = bvalue * 2;
		
		isum = 2100000000 + 2100000000;
		System.out.println(isum); // 오버플로우 자동형변환 
		//형식은 맞아도 결과 값이 저장변수의 범위를 넘어가면 값이 이상해진다.
		
		//int 이상의 연산대상의 결과값은 대상 중 가장 큰 타입의 데이터 타입으로 결정된다.
		dsum = 30+ lvalue+ dvalue; //double 타입으로 나옴
		
		//비교연산
		
		System.out.println(3 > 4);
		System.out.println(10 == bvalue);
		//and 기호 (a && b)
		System.out.println(bvalue == 10 && 3>4); //두조건 중 하나만 거짓이여도 거짓이 나옴.
		
		//or 기호 ( a || b)
		System.out.println(bvalue == 10 || 3>4); // 두조건 중 하나만 만족해도 참
		
		
		
	}

}
