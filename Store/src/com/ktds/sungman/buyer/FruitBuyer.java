package com.ktds.sungman.buyer;
import com.ktds.sungman.seller.FruitSeller;//패키지가 달라서

public class FruitBuyer {
	
	/*seller에게 상품을 구매하고 seller에게 지불한다.
	 * @author sungman
	 * 
	 * 
	 * *
		/*상품 개수*/

		private int productQuantity;
	/*구매자가 가진 금액*/

		private int money;

		public FruitBuyer(int productQuantity, int money){
			System.out.println("구매자를 생성합니다!");
		//초기값 세팅
			setProductQuantity(productQuantity);
			setMoney(money);
		
		//현황출력하기
			System.out.println(this);//toString을 호출한다.
		}
		
		public void setProductQuantity(int productQuantity){
			this.productQuantity = productQuantity;
		}
	/*상품 개수를 반환함 (출력용)
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

	//구매하기 구매자가 가진 상품 개수에 1 더해준다.
		//@param productQuantity : 지불할 물건
		public void buy() {
			this.productQuantity++;//객체는 mkj
		}	
	//지불하기 
	//구매자가 가진 돈에서 지불할 돈을 뺸다.
	//@param money : 지불할 금액
		public void buy(FruitSeller seller) {
			seller.sell(this);
			
			this.productQuantity++;//메모리주소를 넘김
			
		}
		public void pay(int money){
			this.money-=money;//객체는 mkj
		}
		//구매자 현황 파악하기
		//@Override
		public String toString() {
			
			String message= String.format("구매한 상품 개수 : %d 가진 돈 : %d",
			this.productQuantity,this.money);
			return message;
			
		}

		
		
	}


