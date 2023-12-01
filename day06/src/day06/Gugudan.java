package day06;

public class Gugudan {
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) { // 2~9단까지 
			for(int j =2; j<10; j++) { //곱하는 수 1~9까지
				System.out.print(i+"X"+j+"="+(i*j)+"\t");// \t을 사용할땐 띄어쓰기 하지말기
			}
			//라인변경
			System.out.println();
		}
	}

}
