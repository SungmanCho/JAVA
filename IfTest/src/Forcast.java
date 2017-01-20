import java.util.Scanner;

public class Forcast {
	Scanner input = new Scanner(System.in);
	void printInputForcast(){
	int[] number = new int[1];
	System.out.println("일기예보");
	System.out.println("1번 맑음, 2번 흐림 ");
	System.out.println("날씨를 입력하세요 : ");
	
	number[0]=input.nextInt();
	
	int choice = number[0];
	if(choice==1){	
		System.out.println("날씨가 좋습니다.");
	}
	else if(choice==2){	
		System.out.println("날씨가 흐립니다.");
	}
	else {
		System.out.println("잘못 된 번호입니다.");
	}
}
}