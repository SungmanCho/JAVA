package com.ktds.sungman;

public class Room2 {
	public static void main(String[] args) {
		
		AirCleaner airCleaner = new AirConditioner();//서브 클래스가 슈퍼 클래스에 할당이 된다.
		airCleaner.powerOn();
		System.out.println(airCleaner);
		
	}
}
