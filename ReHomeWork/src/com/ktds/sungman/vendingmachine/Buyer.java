package com.ktds.sungman.vendingmachine;

import java.util.Scanner;

public class Buyer {
		private int money;
		private int cokeStock;
		private int cyderStock;
		private int letsbeStock;
		
		public Buyer(int money){
			this.money = money;
		}
		public int getMoney(){
			return money;
		}
		public void setMoney(int money){
			this.money= money;
		}
		public int getCokeStock(){
			return cokeStock;
		}
		public void setCokeStock(int cokeStock){
			this.cokeStock=cokeStock;
		}
		public int getCyderStock(){
			return cyderStock;
		}
		public void setCyderStock(int cyderStock){
			this.cyderStock=cyderStock;
		}
		public int getLetsbeStock(){
			return letsbeStock;
		}
		public void setLetsbeStock(int letsbeStock){
			this.letsbeStock=letsbeStock;
		}
		/**
		 * ���Ǳ⿡ ���� �ְ� �����Ѵ�.
		 * @param vendingMachine
		 * @param insertedMoney
		 */
		public void buy(VendingMachine vendingMachine, int insertedMoney) {
			this.money -= insertedMoney;
			vendingMachine.sell(insertedMoney, this);
		}
		
		public int selectMenu() {
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			return menu;
		}
		public int insertedMoney() {
			Scanner input = new Scanner(System.in);
			int menu = input.nextInt();
			return menu;
		}
		
		/**
		 * ���Ǳ⿡�� ���Ḧ ������.
		 * @param drinkType
		 */
		public void putDrink(int drinkType) {
			if ( drinkType == 1 ) {
				cokeStock++;
			}
			else if ( drinkType == 2 ) {
				cyderStock++;
			}
			else if ( drinkType == 3 ) {
				letsbeStock++;
			}
		}
		
		/**
		 * ���Ǳ⿡�� �ܵ��� �Ž��� �޴´�.
		 * @param remainMoney
		 */
		public void getRemainMoney(int remainMoney) {
			this.money += remainMoney;
		}
		
		@Override
		public String toString() {
			System.out.println("������");
			String message = String.format("������ �ݶ� ���� : %d | ������ ���̴� ���� : %d | ������ Ŀ�� ���� : %d\n�ܾ� :%d", cokeStock, cyderStock, letsbeStock, money);
			return message;
		}

}
		
