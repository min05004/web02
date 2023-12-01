package day06;

public class exArray01 {
	public static void main(String[] args) {
		
		int[]arr1 = {1,3,5,7,9};
		int[]arr2 = null;
		//얕은복사 : 대입했을때 따로 공간이 만들어지는것이 아니라 , 실제 하나의 참조값을 바라보고 있음.
		arr2 =arr1;
		
		for(int i=0; i< arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
			
		}
		
		arr2[1]=11;
		arr1[0]=8;
		
		System.out.println();
		System.out.println("바꿈");
		for(int i=0; i< arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
	}

}
}
