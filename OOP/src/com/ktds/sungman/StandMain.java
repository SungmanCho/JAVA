package com.ktds.sungman;

public class StandMain {
	public static void main(String[] args) {
		
		Stand stand = new Stand();
		
		
		stand.on();
		//stand.light =10; 강제로 값을 준 것//private를 썼기때문에 접근이 불가능하다. 
		//public일때만 가능
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		stand.off();
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		
	}
}
