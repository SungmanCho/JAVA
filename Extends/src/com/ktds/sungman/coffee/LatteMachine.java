package com.ktds.sungman.coffee;

public class LatteMachine extends CoffeeMachine {
	public LatteMachine(){
		super.atm =15;
		
	}
	@Override
	public void latte(){
		System.out.println(super.atm+ "������� ī��󶼸� �����մϴ�.");
	}
}
