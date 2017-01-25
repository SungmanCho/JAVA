package com.ktds.sungman.vendingmachine;

public class VendingMachine {
	private final int COKE = 1;
	private final int CYDER = 2;
	private final int LETSBE = 3;
	
	private final int COKE_PRICE = 700;
	private final int CYDER_PRICE = 800;
	private final int LETSBE_PRICE = 500;

	private int cokeStock;
	private int cyderStock;
	private int letsbeStock;
	private int money;
	public VendingMachine(int money, int cokeStock, int cyderStock, int letsbeStock) {
		this.money = money;
		this.cokeStock = cokeStock;
		this.cyderStock = cyderStock;
		this.letsbeStock = letsbeStock;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCokeStock() {
		return cokeStock;
	}

	public void setCokeStock(int cokeStock) {
		this.cokeStock = cokeStock;
	}

	public int getCyderStock() {
		return cyderStock;
	}

	public void setCyderStock(int cyderStock) {
		this.cyderStock = cyderStock;
	}

	public int getLetsbeStock() {
		return letsbeStock;
	}

	public void setLetsbeStock(int letsbeStock) {
		this.letsbeStock = letsbeStock;
	}

	public void sell(int insertedMoney, Buyer buyer) {

		this.money += insertedMoney;

		String menu = "";
		int selectedMenu = 0;

		while (true) {
			// 메뉴 출력
			System.out.println("---------------------------------");
			menu = String.format("1. 콜라(%d원) : %d개  |  2. 사이다(%d원) : %d개  |  3. 커피(%d원) : %d개  |  4. 구매 종료", COKE_PRICE, cokeStock,
					CYDER_PRICE, cyderStock, LETSBE_PRICE, letsbeStock);
			System.out.println(menu);
			System.out.println("---------------------------------");
			
			System.out.println("돈을 넣으세요: ");
			insertedMoney=buyer.insertedMoney();
			System.out.print("메뉴를 선택하세요 : ");
			// 사용자가 메뉴를 선택한다.
			selectedMenu = buyer.selectMenu();
			
			if (selectedMenu == COKE) {
				if (cokeStock > 0) {
					if (insertedMoney >= COKE_PRICE) {
						cokeStock -= 1;
						buyer.putDrink(COKE);
						insertedMoney -= COKE_PRICE;
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("재고가 부족합니다.");
				}
			} else if (selectedMenu == CYDER) {
				if (cyderStock > 0) {
					if (insertedMoney >= CYDER_PRICE) {
						cyderStock -= 1;
						buyer.putDrink(CYDER);
						insertedMoney -= CYDER_PRICE;
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("재고가 부족합니다.");
				}
			} else if (selectedMenu == LETSBE) {
				if (letsbeStock > 0) {
					if (insertedMoney >= LETSBE_PRICE) {
						letsbeStock -= 1;
						buyer.putDrink(LETSBE);
						insertedMoney -= LETSBE_PRICE;
					} else {
						System.out.println("잔액이 부족합니다.");
					}
				} else {
					System.out.println("재고가 부족합니다.");
				}
			} else if ( selectedMenu == 4 ) {
				buyer.getRemainMoney(insertedMoney);
				this.money -= insertedMoney;
				break;
			}
			
			System.out.println(buyer);
			System.out.println(this);
		}

	}
	
	@Override
	public String toString() {
		System.out.println("자판기");
		String message = String.format("콜라 개수 : %d | 사이다 개수 : %d | 커피 개수 : %d\n잔액 :%d", cokeStock, cyderStock, letsbeStock, money);
		return message;
	}

	
}
