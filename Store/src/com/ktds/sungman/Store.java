package com.ktds.sungman;//��Ű���� �ٸ��� import�� �ؾ���

import com.ktds.sungman.buyer.Buyer;

import com.ktds.sungman.seller.Seller;

public class Store {
	public void start(){
		
		
		/*Buyer ljs = new Buyer(0,5000000);
		
		Buyer jgu = ljs;
		
		ljs.buy();//���� �޸𸮸� �ٶ�
		
		System.out.println(ljs);
		System.out.println(jgu);*/
		
		Buyer lyj = new Buyer(0, 50000);
		Seller nym = new Seller(100, 5000000);
		
		lyj.buy(nym);//lyj�� nym���� �����ϴ� ��.
		
		System.out.println(lyj);//toString ȣ��
		System.out.println(nym);//toString ȣ
		/*System.out.println("���Ϳ� ���Ű��� ȯ���ؿ�!!!");
		Buyer jjh = new Buyer(0, 500000);
		Seller mjk = new Seller(100, 50000000);
		
		System.out.println("������:�� �̰� �ֻ�");
		mjk.sell();
		jjh.buy();
		
		System.out.println("�Ǹ��� : 2500�� ����");
		jjh.pay(2500);
		
		System.out.println(mjk);
		System.out.println(jjh)*/;
	}
	public static void main(String[] args) {
		
		new Store().start();//static���� �����ؾ���
		Buyer mjk=new Buyer(0, 100000);
		mjk.buy();
		mjk.pay(2000);
		
		System.out.println(mjk);//���̾� ��ü�� ȣ���ϰ� ����, override�� �ȵ������� ��ü�� �ּҰ��� ���´�.
	
		Seller jjh = new Seller(100,10000);
		
		jjh.sell(mjk);
		boolean isSoldOut = jjh.isSoldOut();
		System.out.println(isSoldOut);
		
		System.out.println(jjh);
	}
}
