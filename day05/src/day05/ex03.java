package day05;

public class ex03 {
	public static void main(String[] args) {
		//홀짝 맞추기 -- continue 활용 
		
		int value =0;
		int sum =0;
		
		for(int i=10; i>0; i--) { // 10번 반복
			value = (int)(Math.random()*50)+1; // 랜덤값 받기 
			
			if( value %2 ==0) {
				continue; // 짝수일 경우 종료 -- 이번 루프를 종료함(다시 위 부터 시작)
				
			}
			sum = sum + value; // 짝수가 아닐 경우 실행 -- 더해짐
			System.out.print(value + ","); // 랜덤값돌렸을때 홀수인 수 출력
		}
		System.out.println();
		System.out.println("\n홀수 합: "+ sum); // \n 줄바꿈 , 최종 10번 돌려서 나온 값 출력하기
	}

}
