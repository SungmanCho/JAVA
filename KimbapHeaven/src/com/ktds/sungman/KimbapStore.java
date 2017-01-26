package com.ktds.sungman;

public class KimbapStore {
	private final int KIMBAP = 1;
	private final int RAMEN = 2;

	private final int KIMBAP_PRICE = 2500;
	private final int RAMEN_PRICE = 3000;

	private int kimbapStock;
	private int ramenStock;
	private int money;

	public KimbapStore(int money, int kimbapStock, int ramenStock) {
		this.money = money;
		this.kimbapStock = kimbapStock;
		this.ramenStock = ramenStock;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getKimbapStock() {
		return kimbapStock;
	}

	public void setKimbapStock(int kimbapStock) {
		this.kimbapStock = kimbapStock;
	}

	public int getRamenStock() {
		return ramenStock;
	}

	public void setRamenStock(int ramenStock) {
		this.ramenStock = ramenStock;
	}
	
	public void sell(int insertedMoney,Eater eater){
		
		this.money += insertedMoney;

		String menu = "";
		int selectedMenu = 0;
		while (true) {
			// �޴� ���
			System.out.println("--------------------------------------------");
			menu = String.format("1. ��ġ���(%d��), 2. �Ŷ��(%d��), 990.�������� ",KIMBAP_PRICE,RAMEN_PRICE);
			System.out.println(menu);
			
			System.out.println("--------------------------------------------");
			System.out.print("�޴��� �����ϼ��� : ");
			// ����ڰ� �޴��� �����Ѵ�.
			selectedMenu = eater.selectMenu();
			
			
			if (selectedMenu == KIMBAP) {
				if (kimbapStock > 0) {
					if (insertedMoney >= KIMBAP_PRICE) {
						kimbapStock -= 1;
						eater.putfood(KIMBAP);
						insertedMoney -= KIMBAP_PRICE;
					}
				
						else {
							System.out.println("�ܾ��� �����մϴ�.");
						}
				}
					else {
							System.out.println("��� �����մϴ�.");
					}
			}
					else if (selectedMenu == RAMEN) {
						if (ramenStock > 0) {
							if (insertedMoney >= RAMEN_PRICE) {
								ramenStock -= 1;
								eater.putfood(RAMEN);
								insertedMoney -= RAMEN_PRICE;
							}
								else {
									System.out.println("�ܾ��� �����մϴ�.");
								}
						}
								else {
									System.out.println("��� �����մϴ�.");
								}
							}else if ( selectedMenu == 990 ) {
								eater.getRemainMoney(insertedMoney);
								this.money -= insertedMoney;
								break;
								}
							System.out.println(eater);
							System.out.println(this);
					}
	
	}
	@Override
	public String toString() {
		System.out.println("���õ�� ��Ȳ");
		String message = String.format("��ġ��� ���� : %d | �Ŷ�� ���� : %d\n�Ž����� �ܾ� :%d", kimbapStock, ramenStock, money);
		return message;
	}
}

