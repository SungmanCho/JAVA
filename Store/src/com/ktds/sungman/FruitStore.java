package com.ktds.sungman;

import com.ktds.sungman.buyer.FruitBuyer;
import com.ktds.sungman.seller.FruitSeller;

	public class FruitStore {
		public void start(){
		
			FruitBuyer wow = new FruitBuyer(0, 10000);
			FruitSeller woo = new FruitSeller(100, 5000000);
		
			wow.buy(woo);//lyj�� nym���� �����ϴ� ��.
		
			System.out.println(wow);//toString ȣ��
			System.out.println(woo);//toString ȣ��
		}
	}
	

