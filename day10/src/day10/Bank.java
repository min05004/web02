package day10;

public class Bank {
	int money;
	
	//입금
	public void setMoney(int money) { //
		if(money <0) {
			System.out.println("값이 잘못 입력되었습니다.");
			return; //일찍종료 - 의미없는 return/ 아래 코드 실행 안되고 코드종료(break)
		}
		this.money = money; // 어떤게 클래스의 Money 인지 this. 표현
	}
	
	//돈 출력
	public int getMoney() {
		return money;
	}

}
