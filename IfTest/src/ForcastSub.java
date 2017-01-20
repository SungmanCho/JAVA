import java.util.Scanner;

public class ForcastSub {
	Scanner input = new Scanner(System.in);
	void printInputForcast(){
		int[] number = new int[1];
		
		for(int i=0;i<3;i++){
			System.out.println("일기예보");//반복문
			System.out.println("1번 맑음, 2번 흐림,3번 종료 ");
			System.out.println("날씨를 입력하세요 : ");
	
			number[0]=input.nextInt();
	
			int choice = number[0];
			if(choice==1){	
				System.out.println("날씨가 좋습니다.");
			}
			else if(choice==2){	
				System.out.println("날씨가 흐립니다.");
			}
	//사용자가 3번을 선택했다면, 반복을 종료한다.
			else if(choice==3){
				break;//즉시 종료
			}
			else {
				System.out.println("잘못 된 번호입니다.");
			}
		}
	}
}