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
			// 메뉴 출력
			System.out.println("--------------------------------------------");
			menu = String.format("1. 참치김밥(%d원), 2. 신라면(%d원), 990.구매종료 ",KIMBAP_PRICE,RAMEN_PRICE);
			System.out.println(menu);
			
			System.out.println("--------------------------------------------");
			System.out.print("메뉴를 선택하세요 : ");
			// 사용자가 메뉴를 선택한다.
			selectedMenu = eater.selectMenu();
			
			
			if (selectedMenu == KIMBAP) {
				if (kimbapStock > 0) {
					if (insertedMoney >= KIMBAP_PRICE) {
						kimbapStock -= 1;
						eater.putfood(KIMBAP);
						insertedMoney -= KIMBAP_PRICE;
					}
				
						else {
							System.out.println("잔액이 부족합니다.");
						}
				}
					else {
							System.out.println("재고가 부족합니다.");
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
									System.out.println("잔액이 부족합니다.");
								}
						}
								else {
									System.out.println("재고가 부족합니다.");
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
		System.out.println("김밥천국 현황");
		String message = String.format("참치김밥 개수 : %d | 신라면 개수 : %d\n거스름돈 잔액 :%d", kimbapStock, ramenStock, money);
		return message;
	}
}

