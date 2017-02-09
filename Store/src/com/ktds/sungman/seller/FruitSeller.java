package com.ktds.sungman.seller;
import com.ktds.sungman.buyer.FruitBuyer;
public class FruitSeller {
		
		/*��ǰ����*/
		
		private final int APPLE=2500;//final ����� ��
		private final int PINEAPPLE=8000;
		private final int WATERMELON=10000;
		/*�Ǹ��ڰ� ���� �ݾ�*/
		
		private int money;//0
		/*�Ǹ��ڰ� ���� ��ǰ�� ����*/
		
		private int productQuantity;//0
		
		public FruitSeller(int productQuantity, int money){
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
		public void  sell(FruitBuyer buyer) {
			this.productQuantity--;//�Ǹ��ڰ� ���� ��ǰ�� �������� �Ѱ��� ����
			buyer.pay(APPLE);//�����ڴ� ���� �����Ѵ�.
			this.money+=APPLE;//�Ǹ��ڰ� ���� �ݾ׿��� ��ǰ�� ���ݸ�ŭ ���Ѵ�.
			buyer.pay(PINEAPPLE);//�����ڴ� ���� �����Ѵ�.
			this.money+=PINEAPPLE;//�Ǹ��ڰ� ���� �ݾ׿��� ��ǰ�� ���ݸ�ŭ ���Ѵ�.
			buyer.pay(WATERMELON);//�����ڴ� ���� �����Ѵ�.
			this.money+=WATERMELON;//�Ǹ��ڰ� ���� �ݾ׿��� ��ǰ�� ���ݸ�ŭ ���Ѵ�.
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
