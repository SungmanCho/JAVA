package com.ktds.sungman.coffee;

public class Cafe {
	public static void main(String[] args) {
	
	
	
	CoffeeMachine espressoMachine = new CoffeeMachine();
	espressoMachine.espresso();
	//Sub class is a Super class
	System.out.println("========================��� �ӽ�=====================");
	CoffeeMachine latteMachine = new LatteMachine();
	((LatteMachine)latteMachine).latte();//ĳ�����ϴ� ������ ����ش�.
	//LatteMachine latte = (LatteMachine) latteMachine;  �������� ����.
	latteMachine.espresso();
	
	System.out.println(espressoMachine);
	System.out.println(latteMachine);
	
	}
}
