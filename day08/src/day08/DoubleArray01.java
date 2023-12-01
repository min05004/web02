package day08;

public class DoubleArray01 {
	public static void main(String[] args) {
		
		int [][] arr = new int [3][4]; // 기본 선언 방법
		int [][] arr2 = new int [3][]; // 행만 부여하고 열은 생략 가능, 나중에 열을 선언 해줘야함. // 각 행마다 열의 개수가 달라도 상관없음.
		int [][] arr3 = {{1,2,3},{4,5,6},{7,8,9}};// 최초 선언시에만 가능. // 하나의 중괄호가 행으로 취급.
		int [][] arr4 = {{1,2,3,10},{4,5},{7,8,9,11,12}}; // 최초 선언시에만 가능. // 하나의 중괄호가 행으로 취급.
		
		// 2번째 선언인 경우 행에 대한 열을 부여
	    for( int i =0; i< arr2.length; i++) {
	    	arr2[i] = new int [i+1]; // 행마다 부여하는 열의 값을 만들어줌.
	    }
	    for( int i =0; i< arr4.length; i++) {
	    	for(int j=0; j<arr4[i].length; j++) {
	    		//행에 대한 열의 개수가 각각 다를 수 있기 때문에 각 행에 대한 열의 길이를 조건으로 줘야한다.
	    		System.out.print(arr4[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	    
	    	
	}

}
