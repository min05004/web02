package day06;



public class WhileTest02 {
	public static void main(String[] args) {
		
		int value =0;
		int count =1;
		while(true) {
			value = (int)(Math.random()+50)+1;
			// 랜덤값이ㅣ 35면 멈추게
			if(value ==35) {
				break;
			}
			//카운트 증가
			count++;
			
		}
		System.out.println("반복횟수 : " + count);
	}

}
