package com.ktds.sungman.vendingmachine;

public class Street {
	

	private int money;

	public void start(){
		Buyer buyer = new Buyer(money);
		VendingMachine vendingMachine = new VendingMachine(20000, 10, 10, 10);
		
		buyer.buy(vendingMachine, money);
		
		System.out.println(buyer);
		System.out.println(vendingMachine);
	}

	public static void main(String[] args){
		new Street().start();
	}
}