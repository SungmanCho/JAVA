package com.ktds.sungman;

public class ArmyMain {

	public static void main(String[] args){
		
		Army army = new Army();
		
		Person kdj = army.makeArmy("김도준");//person을 반환한다.
		System.out.println(kdj.getName());
		System.out.println(kdj.getJob());
		
		Person csm = army.makeArmy("조성만");//person을 반환한다.
		System.out.println(csm.getName());
		System.out.println(csm.getJob());
	}
}
