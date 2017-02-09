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
		 * 자판기에 돈을 넣고 구매한다.
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
		 * 자판기에서 음료를 꺼낸다.
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
		 * 자판기에서 잔돈을 거슬러 받는다.
		 * @param remainMoney
		 */
		public void getRemainMoney(int remainMoney) {
			this.money += remainMoney;
		}
		
		@Override
		public String toString() {
			System.out.println("구매자");
			String message = String.format("구입한 콜라 개수 : %d | 구입한 사이다 개수 : %d | 구입한 커피 개수 : %d\n잔액 :%d", cokeStock, cyderStock, letsbeStock, money);
			return message;
		}

}
		
