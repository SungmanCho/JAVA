package com.ktds.sungman;//패키지가 다르면 import를 해야함

import com.ktds.sungman.buyer.Buyer;

import com.ktds.sungman.seller.Seller;

public class Store {
	public void start(){
		
		
		/*Buyer ljs = new Buyer(0,5000000);
		
		Buyer jgu = ljs;
		
		ljs.buy();//같은 메모리를 바라봄
		
		System.out.println(ljs);
		System.out.println(jgu);*/
		
		Buyer lyj = new Buyer(0, 50000);
		Seller nym = new Seller(100, 5000000);
		
		lyj.buy(nym);//lyj가 nym한테 구매하는 것.
		
		System.out.println(lyj);//toString 호출
		System.out.println(nym);//toString 호
		/*System.out.println("장터에 오신걸을 환영해영!!!");
		Buyer jjh = new Buyer(0, 500000);
		Seller mjk = new Seller(100, 50000000);
		
		System.out.println("구매자:님 이거 주삼");
		mjk.sell();
		jjh.buy();
		
		System.out.println("판매자 : 2500원 내놔");
		jjh.pay(2500);
		
		System.out.println(mjk);
		System.out.println(jjh)*/;
	}
	public static void main(String[] args) {
		
		new Store().start();//static떔시 생성해야함
		Buyer mjk=new Buyer(0, 100000);
		mjk.buy();
		mjk.pay(2000);
		
		System.out.println(mjk);//바이어 객체를 호출하게 만듬, override가 안되있을시 객체의 주소값이 나온다.
	
		Seller jjh = new Seller(100,10000);
		
		jjh.sell(mjk);
		boolean isSoldOut = jjh.isSoldOut();
		System.out.println(isSoldOut);
		
		System.out.println(jjh);
	}
}
