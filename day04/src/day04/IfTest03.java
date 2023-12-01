package day04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfTest03 {
	public static void main(String[] args) {
		
		int value = (int)(Math.random()*(100-40)+1) +40;
		int value2 = (int)(Math.random()*(100-40)+1) +40;
		//소수점 계산( 평균 구하기 - )
		double avg =(double)(value+value2)/2;
		
		//소수점 구하기 - 수를 다루는 BigDecimal 이용
		BigDecimal big = new BigDecimal(avg);
		avg = big.setScale(2,RoundingMode.HALF_UP).doubleValue();
		//소수점 2쨰 자리 표현, 반올림하기 :RoundingMode.HALF_UP / doubleValue() : 최종 결과를 실수타입으로 
		
		if(avg>=60 && value >= 45 && value2 >=45) { 
			System.out.println("과목1: "+ value+", 과목2: "+value2 + ", 평균: " + avg);
			System.out.println("합격");
		}else {
			System.out.println("과목1: "+ value+", 과목2: "+value2 + ", 평균: " + avg);
			System.out.println("불합격");
			
		}

	}
}
