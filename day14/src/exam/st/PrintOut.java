package exam.st;

public class PrintOut {
	
	//정적 클래스 선언
	public static class Out {
		public void println(String str) {
			
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		
		PrintOut.Out out = new PrintOut.Out(); //외부클래스 선언 안하고 내부클래스 선언만.
		String str = "정적 내부클래스";
		
		out.println(str);
}

}


