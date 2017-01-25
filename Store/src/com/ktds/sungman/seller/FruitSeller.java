package com.ktds.sungman.seller;
import com.ktds.sungman.buyer.FruitBuyer;
public class FruitSeller {
		
		/*상품가격*/
		
		private final int APPLE=2500;//final 상수라서 씀
		private final int PINEAPPLE=8000;
		private final int WATERMELON=10000;
		/*판매자가 가진 금액*/
		
		private int money;//0
		/*판매자가 가진 상품의 개수*/
		
		private int productQuantity;//0
		
		public FruitSeller(int productQuantity, int money){
			System.out.println("판매자를 생성합니다!");
			
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
			this.productQuantity--;//판매자가 가진 상품의 개수에서 한개를 뺀다
			buyer.pay(APPLE);//구매자는 돈을 지불한다.
			this.money+=APPLE;//판매자가 가진 금액에서 상품의 가격만큼 더한다.
			buyer.pay(PINEAPPLE);//구매자는 돈을 지불한다.
			this.money+=PINEAPPLE;//판매자가 가진 금액에서 상품의 가격만큼 더한다.
			buyer.pay(WATERMELON);//구매자는 돈을 지불한다.
			this.money+=WATERMELON;//판매자가 가진 금액에서 상품의 가격만큼 더한다.
		}
		/*재고파악하기
		@return:boolean 재고가 있으면 false, 재고가 없으면 true*/
		public boolean isSoldOut(){
			boolean isSoldOut = this.productQuantity == 0;
			return isSoldOut;
		}
		public String toString(){
			String message = String.format("판매자의 상품 개수 :%d, 판매자가 가진 금액 : %d "
					,this.productQuantity,this.money );
			return message;
		}
		
}
