package com.ktds.sungman;

import java.util.Scanner;

public class Rider {
	private int money;
	private int bikestock;

	public Rider(int money) {
		this.money=money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setBikestock(int bikestock) {
		this.bikestock = bikestock;
	}

	public int getBikestock() {
		return bikestock;
	}

	public void bollow(BikeStore bikestore, int givemoney){
		this.money -= givemoney;
		bikestore.bollow(givemoney, this);
	}
	public int selectbike() {
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		return menu;
	}
	public void putBike(int bike) {
		if ( bike == 1 ) {
			bikestock++;
		}
	}
	public void getRemainMoney(int remainMoney) {
		this.money += remainMoney;
	}
	@Override
	public String toString() {
		System.out.println("대여자 현황");
		String message = String.format("자전거 보유 수 : %d\n잔액 :%d", bikestock, money);
		return message;
	}
}


