package com.ktds.sungman;

public class Car {
	private String modelName;
	private int oilbankVolume;
	private int money;
	private int oilStock;

	public Car(String modelName, int oilbankVolume, int money,int oilStock) {
		this.modelName=modelName;
		this.oilbankVolume=oilbankVolume;
		this. money=money;
		this.oilStock=oilStock;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getOilbankVolume() {
		return oilbankVolume;
	}

	public void setOilbankVolume(int oilbankVolume) {
		this.oilbankVolume = oilbankVolume;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public int getOilStock() {
		return oilStock;
	}
	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}
	public void fillOil(OilBank oilBank){
		oilStock=oilbankVolume;
		
		this.money = (oilbankVolume*oilBank.getPricePerLiter());		
		}
}