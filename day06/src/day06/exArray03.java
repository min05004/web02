package day06;

public class exArray03 {
	public static void main(String[] args) {
		
		int []cards = {1,6,9,8,2,7};
		int[]newcard = new int[5];
		
		
		//복사 메서드 이용해서 깊은 복사하기
		System.arraycopy(cards, 1, newcard, 0,newcard.length);
		
		System.out.println("card: ");
		for(int i =0; i<cards.length; i++) {
			System.out.print(cards[i]+"\t");
		}
		System.out.println();
		
		System.out.println("newcard: ");
		for(int i =0; i<newcard.length; i++) {
			System.out.print(newcard[i]+"\t");
		
	}
	

}
}