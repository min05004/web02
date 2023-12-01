package day07;

public class ArrayTest02 {
	public static void main(String[] args) {
		// 배열 10칸 만들고 랜덤값 넣어서 제일 큰수 출력	
		int arr03[]= new int[10];
		int max =0; //최대 값 변수는 나올수 있는 수 중 가장 작은거, 최솟값은 제일 큰거.
		
		for(int i=0; i<arr03.length; i++) {
			int val =(int)(Math.random()*50)+1; // 랜덤값 변수 만들기
			arr03[i] =val; //변수 val에 담기 
			
			if(max < val) {
				//최대값 교체 
				max = val;
			}
			
	}
	
		for(int i =0; i<arr03.length; i++) {
			System.out.println("arr02["+i+"]"+ arr03[i]);

	}
		System.out.println("최대값 : " + max);
	}
}