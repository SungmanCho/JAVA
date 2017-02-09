package com.ktds.sungman;

public class OilBank {
	private int oilstock;
	private int pricePerLiter;
	private int budget;

	public OilBank(int oilstock, int pricePerLiter,int budget) {
		
		this.oilstock = oilstock;
		this.pricePerLiter=pricePerLiter;
		this.budget=budget;
	}

	public OilBank(String string) {
		// TODO Auto-generated constructor stub
	}

	public void setOilstock(int oilstock) {
		this.oilstock = oilstock;
	}

	public int getOilstock() {
		return oilstock;
	}

	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public int getPricePerLiter() {
		return pricePerLiter;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getBudget() {
		return budget;
	}

	public void filling(Car car) {
		this.oilstock -= car.getOilbankVolume();// 리터만큼 뻄,car에게 주유한다. car 인스턴스
		car.fillOil();
		this.budget += (pricePerLiter * car.getOilbankVolume());

	}
}
