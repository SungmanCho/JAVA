package com.ktds.sungman.buyer;
import com.ktds.sungman.seller.FruitSeller;//��Ű���� �޶�

public class FruitBuyer {
	
	/*seller���� ��ǰ�� �����ϰ� seller���� �����Ѵ�.
	 * @author sungman
	 * 
	 * 
	 * *
		/*��ǰ ����*/

		private int productQuantity;
	/*�����ڰ� ���� �ݾ�*/

		private int money;

		public FruitBuyer(int productQuantity, int money){
			System.out.println("�����ڸ� �����մϴ�!");
		//�ʱⰪ ����
			setProductQuantity(productQuantity);
			setMoney(money);
		
		//��Ȳ����ϱ�
			System.out.println(this);//toString�� ȣ���Ѵ�.
		}
		
		public void setProductQuantity(int productQuantity){
			this.productQuantity = productQuantity;
		}
	/*��ǰ ������ ��ȯ�� (��¿�)
	@return*/

		public int getProoductQuantity(int productQuantity) {
			return this.productQuantity;
		}
		
		public void setMoney(int money){
			this.money =money;
		}
		
		public int getMoney(){
			return this.money;
		}

	//�����ϱ� �����ڰ� ���� ��ǰ ������ 1 �����ش�.
		//@param productQuantity : ������ ����
		public void buy() {
			this.productQuantity++;//��ü�� mkj
		}	
	//�����ϱ� 
	//�����ڰ� ���� ������ ������ ���� �A��.
	//@param money : ������ �ݾ�
		public void buy(FruitSeller seller) {
			seller.sell(this);
			
			this.productQuantity++;//�޸��ּҸ� �ѱ�
			
		}
		public void pay(int money){
			this.money-=money;//��ü�� mkj
		}
		//������ ��Ȳ �ľ��ϱ�
		//@Override
		public String toString() {
			
			String message= String.format("������ ��ǰ ���� : %d ���� �� : %d",
			this.productQuantity,this.money);
			return message;
			
		}

		
		
	}


