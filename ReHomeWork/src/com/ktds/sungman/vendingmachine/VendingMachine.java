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
			// �޴� ���
			System.out.println("---------------------------------");
			menu = String.format("1. �ݶ�(%d��) : %d��  |  2. ���̴�(%d��) : %d��  |  3. Ŀ��(%d��) : %d��  |  4. ���� ����", COKE_PRICE, cokeStock,
					CYDER_PRICE, cyderStock, LETSBE_PRICE, letsbeStock);
			System.out.println(menu);
			System.out.println("---------------------------------");
			
			System.out.println("���� ��������: ");
			insertedMoney=buyer.insertedMoney();
			System.out.print("�޴��� �����ϼ��� : ");
			// ����ڰ� �޴��� �����Ѵ�.
			selectedMenu = buyer.selectMenu();
			
			if (selectedMenu == COKE) {
				if (cokeStock > 0) {
					if (insertedMoney >= COKE_PRICE) {
						cokeStock -= 1;
						buyer.putDrink(COKE);
						insertedMoney -= COKE_PRICE;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				} else {
					System.out.println("��� �����մϴ�.");
				}
			} else if (selectedMenu == CYDER) {
				if (cyderStock > 0) {
					if (insertedMoney >= CYDER_PRICE) {
						cyderStock -= 1;
						buyer.putDrink(CYDER);
						insertedMoney -= CYDER_PRICE;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				} else {
					System.out.println("��� �����մϴ�.");
				}
			} else if (selectedMenu == LETSBE) {
				if (letsbeStock > 0) {
					if (insertedMoney >= LETSBE_PRICE) {
						letsbeStock -= 1;
						buyer.putDrink(LETSBE);
						insertedMoney -= LETSBE_PRICE;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}
				} else {
					System.out.println("��� �����մϴ�.");
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
		System.out.println("���Ǳ�");
		String message = String.format("�ݶ� ���� : %d | ���̴� ���� : %d | Ŀ�� ���� : %d\n�ܾ� :%d", cokeStock, cyderStock, letsbeStock, money);
		return message;
	}

	
}
