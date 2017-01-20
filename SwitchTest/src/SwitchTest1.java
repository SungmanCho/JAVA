
public class SwitchTest1 {
	public static void main(String[] args){
		/*switch(숫자 혹은 문자열 변수){
		case 1: //상태에 따른 진행 로직
		case 2:	//상태에 따른 진행 로직
		case 3: //상태에 따른 진행 로직
			default:
				//마무리 작업
		}*/
		//라면 끓이기 프로세스
		final int READY = 1;//final이 달린 상수는 대문자로 쓴다.
		//냄비를 준비한다.
		final int WATER = 2;
		//물을 넣는다.
		final int FIRE = 3;
		//물을 끓인다.
		final int BOIL = 4;
		//재료를 넣는다.
		final int INJECT = 5;
		//불을 끈다.
		final int OFF = 6;
		//라면을 냠냠한다.
		final int EAT = 7;
		
		//현재의 상태를 저장할 숫자변수를 만들고 1을 할당한다.
		int nowState = INJECT;//케이스 선택지점부터 시작, 케이스 범위 초과시 default값 나온다.
		switch (nowState) {
		case READY:
			System.out.println("냄비를 꺼낸다.");
		case WATER:
			System.out.println("물을 넣는다.");
		case FIRE:
			System.out.println("불을 킨다");
		case BOIL:
			System.out.println("물을 끓인다.");
			break;//switch를 종료한다.
		case INJECT:
			System.out.println("라면을 넣는다.");
		case OFF:
			System.out.println("불을 끈다.");
		case EAT:
			System.out.println("냠냠.");
			
		default:
			System.out.println("잔다.");//옵션
			
		}
	}
}
