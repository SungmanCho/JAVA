package com.ktds.sungman.coffee;

public class Cafe {
	public static void main(String[] args) {
	
	
	
	CoffeeMachine espressoMachine = new CoffeeMachine();
	espressoMachine.espresso();
	//Sub class is a Super class
	System.out.println("========================라뗴 머신=====================");
	CoffeeMachine latteMachine = new LatteMachine();
	((LatteMachine)latteMachine).latte();//캐스팅하는 범위를 잡아준다.
	//LatteMachine latte = (LatteMachine) latteMachine;  위에꺼랑 같음.
	latteMachine.espresso();
	
	System.out.println(espressoMachine);
	System.out.println(latteMachine);
	
	}
}
