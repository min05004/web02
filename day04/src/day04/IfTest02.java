package day04;

public class IfTest02 {
	public static void main(String[] args) {
		//랜덤 함수로 60~100 사이 랜덤값 만들기
		int value = (int)(Math.random()*(100-60)+1) +60;
		                                 //최소값     //최대값 설정
		if(value >= 75) { //75 이상이면 합격
			System.out.println("점수 : "+value+", 합격");
		}else {
			//75 미만이면 불합격
			System.out.println("점수 : "+value+", 불합격");
			
		}
	}

}
