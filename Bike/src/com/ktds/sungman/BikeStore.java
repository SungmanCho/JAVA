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
			// �޴� ���
			System.out.println("---------------------------------");
			menu = String.format("1. ������(%d��) : %d��   2. ���� ����", BIKE_PRICE, bikestock
					);
			System.out.println(menu);
			System.out.println("---------------------------------");
			System.out.print("�����Ÿ� �����ϼ��� : ");
			// ����ڰ� �޴��� �����Ѵ�.
			selectedMenu = rider.selectbike();
			if (selectedMenu == BIKE) {
				if (bikestock > 0) {
					if (giveMoney >= BIKE_PRICE) {
						bikestock -= 1;
						rider.putBike(BIKE);
						giveMoney -= BIKE_PRICE;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				} else {
					System.out.println("��� �����մϴ�.");
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
					
					System.out.println("������ �뿩��");
					String message = String.format("������ �ѷ� : %d\n�ܾ� :%d", bikestock, money);
					return message;
				}
	}

