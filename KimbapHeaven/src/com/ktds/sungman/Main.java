package com.ktds.sungman;

public class Main {
	


	public void start(){
		Eater eater = new Eater(10000);
		KimbapStore kimbapStore = new KimbapStore(20000, 10, 10);
		
		eater.pay(kimbapStore,10000 );
		
		System.out.println(eater);
		System.out.println(kimbapStore);
	}

	public static void main(String[] args){
		new Main().start();
	}
}
