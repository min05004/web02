package day06;

public class WhileTest01 {
	public static void main(String[] args) {
		
		int count =1;
		int sum =0;
		
		while(count <= 10) {
			sum = sum+ count;
			//카운트 증가
			count++;
		} 
		System.out.println("합 : "+ sum);
		
		
		count =0;
		
	}

}
