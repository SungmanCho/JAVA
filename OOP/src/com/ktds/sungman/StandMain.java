package com.ktds.sungman;

public class StandMain {
	public static void main(String[] args) {
		
		Stand stand = new Stand();
		
		
		stand.on();
		//stand.light =10; ������ ���� �� ��//private�� ��⶧���� ������ �Ұ����ϴ�. 
		//public�϶��� ����
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		stand.off();
		
		stand.brightnessControlUp();
		stand.brightnessControlDown();
		
		
	}
}
