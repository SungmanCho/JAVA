package com.ktds.sungman.coffee;

public class Barista {
	
	public void coffee(CoffeeMachine coffeeMachine){
		
		if(coffeeMachine instanceof CoffeeMachine){
			coffeeMachine.espresso();
		}
		else if(coffeeMachine instanceof LatteMachine){
			
			coffeeMachine.espresso();
			coffeeMachine.latte();
		
		}
}
}