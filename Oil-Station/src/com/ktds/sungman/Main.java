package com.ktds.sungman;

public class Main {
	
	public static void main(String[] args) {
		OilBank oilBank=new OilBank("");
		oilBank.setOilstock(5000);
		oilBank.setPricePerLiter(1480);
		oilBank.setBudget(0);
		
		Car car = new Car("���׽ý�",50,600000000,300);
		
		oilBank.filling(car);
		
		System.out.println("=========����============");
		System.out.println(oilBank.getOilstock());
		System.out.println(oilBank.getBudget());
		
		System.out.println("=====================ī=================");
		System.out.println(car.getModelName());
		System.out.println(car.getMoney());
		System.out.println(car.getOilbankVolume());
		System.out.println(car.getOilStock());
		
	}
}
