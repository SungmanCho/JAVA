package com.ktds.sungman;

public class AirConditioner extends AirCleaner {
	
	private int temp = 26;

	/*�ù漳�� �µ�*/
	@Override
	public void powerOn(){
		
/*		���� ��
*/		
		System.out.println("�������� �մϴ�.");
		System.out.println("�ÿ��� ���ϴ�.");
		
		cooling();
		
		System.out.println("����û���� ������ : " + super.manufactor);
		System.out.println("����û���� ��������: " + super.origin);
		super.powerOn();
	}
	
/*	�µ� ���߱�
 * 
*/
	
	public void cooling(){
		temp--;
		System.out.println("���� ���� �µ��� " + temp + "�� �Դϴ�.");

	}
}
