package com.ktds.sungman;


public class Main {
	
	public void start(){
		Rider rider = new Rider(10000);
		BikeStore bikestore = new BikeStore(20000, 100);
		
		rider.bollow(bikestore, 10000);
		
		System.out.println(rider);
		System.out.println(bikestore);
	}

	public static void main(String[] args){
		new Main().start();
	}
}

