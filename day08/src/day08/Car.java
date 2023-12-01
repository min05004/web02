package day08;

public class Car {
	
	//멤버변수 만들기
	String name;
	String company;
	String type;	
	int price;
	int years;
	
	private boolean myflag;
		
	
	
	public void printInfo() {
		String info ="";
		
		info += "제조사 : "+ company +"\n";
		info += "이름 : "+ name +"\n";
		info += "타입 : "+ type +"\n";
		info += "연식 : "+ years +"\n";
		info += "기격 : "+ price +"만원";
		
		System.out.println(info);
		
	}




	
	
}
