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
			 * �����Ѵ�.
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
			 * �޴��� ����.
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
			 * ���õ������ �ܵ��� �Ž��� �޴´�.
			 * @param remainMoney
			 */
			
			public void getRemainMoney(int remainMoney) {
				this.money += remainMoney;
			}
			
			@Override
			public String toString() {
				System.out.println("������");
				String message = String.format("������ ��ġ��� ���� : %d | ������ �Ŷ�� ���� : %d\n�ܾ� :%d", kimbapStock, ramenStock, money);
				return message;
			}

	}
			

