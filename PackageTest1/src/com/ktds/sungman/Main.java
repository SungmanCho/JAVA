package com.ktds.sungman;

import com.ktds.sungman.hospital.Doctor;

public class Main {
	public static void main(String[] args){
		
		System.out.println("안녕하세요! 패키지 테스트 입니다.");
		
		/*com.ktds.sungman.hospital.Doctor doctor = 
				new com.ktds.sungman.hospital.Doctor();*/ //약칭이 된다
		Doctor doctor = new Doctor();
		doctor.hello();
				
	}
}
