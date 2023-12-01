package day06;

public class exArray02 {
	public static void main(String[] args) {
		
		int[]arr1 = {1,3,5,7,9};
		int[]arr2 = new int[5];
		
		
		//첫번째 배열의 값을 루프를 이용해서 대입
		for(int i =0; i< arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		
		arr2[1]=11;
		arr1[0]=8;
		
		System.out.println();
		System.out.println("arr2 값 출력 : ");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]+"\t");
		}
	}

	
}
