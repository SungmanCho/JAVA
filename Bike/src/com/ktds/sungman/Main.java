package com.ktds.sungman;


public class Main {
	
	public void start(){
		Rider rider = new Rider(100000);
		BikeStore bikestore = new BikeStore(100000,100);
		
		bikestore.bollow(5000,rider);
		
		System.out.println(rider);
		System.out.println();
		System.out.println(bikestore);
	}

	public static void main(String[] args){
		new Main().start();
	}
}

