
public class IfTest {
	public static void main(String [] args) {
		/*주머니에 돈이 1200원 이상 있다면, 캔 커피를 살 수 있습니다.
		를 출력하는 프로그램*/
		
//		주머니에 있는 돈을 설정함.
		int money = 1200;
		int age = 20;
		
		
//		주머니에 돈이 1200원 이상인지 확인함.
		boolean isOver1200 = money>=1200;//true일때 값이 나오고 false일 때 출력이 되지 않는다.
		if(isOver1200) {
			//true==true 라서 안적어도 된다.
			System.out.println("캔 커피를 살 수 있습니다.");
		}
//	
		//10대 이상일 경우
		boolean isOver10 = age>=20;//true일때 값이 나오고 false일 때 출력이 되지 않는다.
		if(isOver10) {
			//true==true 라서 안적어도 된다.
			System.out.println("클럽에 입장 가능하다.");
		}
		//10대 일 경우
		boolean isDown20 = age<=19;//true일때 값이 나오고 false일 때 출력이 되지 않는다.
		if(isDown20) {
			//true==true 라서 안적어도 된다.
			System.out.println("클럽에 입장 불가능하다.");
		}
		//30대 이상일 경우
		boolean isOver30 = age>=30;//true일때 값이 나오고 false일 때 출력이 되지 않는다.
		if( isOver30) {
			//true==true 라서 안적어도 된다.
			System.out.println("호박 나이트 클럽에 입장 가능하다.");
		}
		//현금이 없고 신용카드가 있을 경우
		//신용카트로 결제합니다를 출력하는 프로그램
		
		//있다= true
		//없다=false 로 표현함
		
		//현금이 있다면
		boolean hasCash = false;
		
		//신용카드가 있다면
		boolean hasCreditCard = true;

		//현금이 없고 신용카드가 있는지 확인한다.
		//boolean card = hasCash == false && hasCreditCard == true;//and로 만든 연산자이다. 둘다 트루이다.
		boolean card = !hasCash&& hasCreditCard;//위에 코드와 동일하다.!true = false,!false = true
		//현금이 없고 신용카드가 있다면 "신용카드로 결제합니다."를 출력한다.
		if (card) {
			System.out.println("신용카드로 결제합니다.");
		}
		
		
	
	}
}
