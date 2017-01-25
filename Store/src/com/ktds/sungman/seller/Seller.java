package com.ktds.sungman.seller;

import com.ktds.sungman.buyer.Buyer;
import com.ktds.sungman.buyer.FruitBuyer;

public class Seller {
	
	/*��ǰ����*/
	
	private final int PRICE=2500;//final ����� ��
	
	/*�Ǹ��ڰ� ���� �ݾ�*/
	
	private int money;//0
	/*�Ǹ��ڰ� ���� ��ǰ�� ����*/
	
	private int productQuantity;//0
	
	public Seller(int productQuantity, int money){
		System.out.println("�Ǹ��ڸ� �����մϴ�!");
		
		setProductQuantity(productQuantity);
		setMoney(money);
		
		System.out.println(this);
	}
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return this.money;
	}
	public void setProductQuantity(int productQuantity){
		this.productQuantity= productQuantity;
	}
	public int getProductQuantity(){
		return this.productQuantity;
	}
	public void  sell(Buyer mjk) {
		this.productQuantity--;//�Ǹ��ڰ� ���� ��ǰ�� �������� �Ѱ��� ����
		mjk.pay(PRICE);//�����ڴ� ���� �����Ѵ�.
		this.money+=PRICE;//�Ǹ��ڰ� ���� �ݾ׿��� ��ǰ�� ���ݸ�ŭ ���Ѵ�.
	}
	/*����ľ��ϱ�
	@return:boolean ��� ������ false, ��� ������ true*/
	public boolean isSoldOut(){
		boolean isSoldOut = this.productQuantity == 0;
		return isSoldOut;
	}
	public String toString(){
		String message = String.format("�Ǹ����� ��ǰ ���� :%d, �Ǹ��ڰ� ���� �ݾ� : %d "
				,this.productQuantity,this.money );
		return message;
	}
	
}
