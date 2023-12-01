package day07;

public class ArrayTest01 {
	public static void main(String[] args) {
		// 배열을 선언
		int arr01[] =new int[5];
		int []arr02 =new int[4]; //위치 둘다 됨.* 2번째가 더 선호
		
		// 코드에 숫자를 넣는 행위는 지양, 호출해서 반영하는걸 지향.
		for(int i =0; i<arr02.length; i++) { // 배열의 길이보다 번호가 하나 적음!!: i<arr01.length
			arr02[i] =(int)(Math.random()*50)+1; // 50까지 랜덤값 베열에 넣기
		}
		System.out.println("배열 : " + arr02);
		for(int i =0; i<arr02.length; i++) {
			System.out.println("arr02["+i+"]"+ arr02[i]);//각 번호마다 어떤게 출력되는지 확인
		}
	

	}
	}
	
	


