package study.obj.global;

public class PrintMain {
	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		//멤버메서드 또는 변수는 인스턴스를 통해서 호출
		p.print(10);
		//클래스 변수 또는 메서드는 클래스를 통해서 호출 -- static
		Printer.print(10.11);
		//클래스 메서드는 인스턴스를 통해서도 호출이 가능하지만 , 하지않는다 -- static은 클래스를 통해서 호출하기에
		// p.print("안녕"); 가능은하지만 하지말기. Printer.print로 호출(클래스 호출)
		
		double circleWidth = Math.pow(5, 2)*Printer.PI; //Math.pow(5, 2) -) 5의 2제곱
											//클래스 자체 내에서 호출
		System.out.println(circleWidth);

}
}
