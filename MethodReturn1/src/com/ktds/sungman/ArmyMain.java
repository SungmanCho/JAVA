package com.ktds.sungman;

public class ArmyMain {

	public static void main(String[] args){
		
		Army army = new Army();
		
		Person kdj = army.makeArmy("�赵��");//person�� ��ȯ�Ѵ�.
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());
		
		Person csm = army.makeArmy("������");//person�� ��ȯ�Ѵ�.
		System.out.println(csm.getName());
		System.out.println(csm.getJob());
	}
}
