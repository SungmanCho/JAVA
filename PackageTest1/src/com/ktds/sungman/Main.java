package com.ktds.sungman;

import com.ktds.sungman.hospital.Doctor;

public class Main {
	public static void main(String[] args){
		
		System.out.println("�ȳ��ϼ���! ��Ű�� �׽�Ʈ �Դϴ�.");
		
		/*com.ktds.sungman.hospital.Doctor doctor = 
				new com.ktds.sungman.hospital.Doctor();*/ //��Ī�� �ȴ�
		Doctor doctor = new Doctor();
		doctor.hello();
				
	}
}
