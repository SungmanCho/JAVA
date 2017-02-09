package com.ktds.sungman;



public class BikeStore {
	private final int BIKE = 1;
	
	private final int BIKE_PRICE = 5000;

	private int bikestock;
	private int money;

	public BikeStore(int money, int bikestock) {
		this.money = money;
		this.bikestock = bikestock;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getBikestock() {
		return bikestock;
	}
	public void setBikestock(int bikestock) {
		this.bikestock = bikestock;
	}
	
	

	
	public void bollow(int giveMoney, Rider rider) {

		this.money += giveMoney;

		String menu = "";
		int selectedMenu = 0;
		while (true) {
			// 메뉴 출력
			System.out.println("---------------------------------");
			menu = String.format("1. 자전거(%d원) : %d개   2. 구매 종료", BIKE_PRICE, bikestock
					);
			System.out.println(menu);
			System.out.println("---------------------------------");
			System.out.print("자전거를 선택하세요 : ");
			// 사용자가 메뉴를 선택한다.
			selectedMenu = rider.selectbike();
			if (selectedMenu == BIKE) {
				if (bikestock > 0) {
					if (giveMoney >= BIKE_PRICE) {
						bikestock -= 1;
						rider.putBike(BIKE);
						giveMoney -= BIKE_PRICE;
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("재고가 부족합니다.");
				}
				if ( selectedMenu == 2 ) {
					rider.getRemainMoney(giveMoney);
					this.money -= giveMoney;
					break;
				}
				System.out.println(rider);
				System.out.println(this);
			}
		}
		
	}
			public	String toString() {
					
					System.out.println("자전거 대여점");
					String message = String.format("자전거 총량 : %d\n잔액 :%d", bikestock, money);
					return message;
				}
	}

