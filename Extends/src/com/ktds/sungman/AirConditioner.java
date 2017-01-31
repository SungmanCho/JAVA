package com.ktds.sungman;

public class AirConditioner extends AirCleaner {
	
	private int temp = 26;

	/*냉방설정 온도*/
	@Override
	public void powerOn(){
		
/*		전원 켬
*/		
		System.out.println("에어컨을 켭니다.");
		System.out.println("시원해 집니다.");
		
		cooling();
		
		System.out.println("공기청정기 제조사 : " + super.manufactor);
		System.out.println("공기청정기 제조국가: " + super.origin);
		super.powerOn();
	}
	
/*	온도 낮추기
 * 
*/
	
	public void cooling(){
		temp--;
		System.out.println("현재 설정 온도는 " + temp + "도 입니다.");

	}
}
