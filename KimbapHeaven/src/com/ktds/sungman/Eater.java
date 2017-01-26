package com.ktds.sungman;

import java.util.Scanner;

	


	public class Eater  {
			private int money;
			private int kimbapStock;
			private int ramenStock;
			
			
			public Eater(int money){
				this.money = money;
			}
			public int getMoney(){
				return money;
			}
			public void setMoney(int money){
				this.money= money;
			}
			public int getkimbapStock(){
				return kimbapStock;
			}
			public void setkimbapStock(int kimbapStock){
				this.kimbapStock=kimbapStock;
			}
			public int getRamenStock() {
				return ramenStock;
			}
			public void setRamenStock(int ramenStock) {
				this.ramenStock = ramenStock;
			}
		
			/**
			 * 선불한다.
			 * @param vendingMachine
			 * @param insertedMoney
			 */
			public void pay(KimbapStore kimbapStore,int insertedMoney) {
				this.money -= insertedMoney;
				kimbapStore.sell (insertedMoney,this);
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
			 * 메뉴를 고른다.
			 * @param foodType
			 */
			public void putfood(int foodType) {
				if ( foodType == 1 ) {
					kimbapStock++;
				}
				else if ( foodType == 2 ) {
					ramenStock++;
				}
			}
			
			/**
			 * 김밥천국에서 잔돈을 거슬러 받는다.
			 * @param remainMoney
			 */
			
			public void getRemainMoney(int remainMoney) {
				this.money += remainMoney;
			}
			
			@Override
			public String toString() {
				System.out.println("구매자");
				String message = String.format("구입한 참치김밥 개수 : %d | 구입한 신라면 개수 : %d\n잔액 :%d", kimbapStock, ramenStock, money);
				return message;
			}

	}
			

