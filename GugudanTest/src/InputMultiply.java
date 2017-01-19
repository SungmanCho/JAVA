import java.util.Scanner;

public class InputMultiply {
	Scanner input = new Scanner(System.in);
	void printInputMultiply(){
		
		System.out.println("원하시는 구구단을 입력하세요.{계산범위 입력값에서 (1~9)곱한 것 까지}");
		System.out.print("원하는 구구단 : ");
		
		int number = input.nextInt();
		
		System.out.println("");
		System.out.println("=================");
		System.out.println("구구단 "+number+"단을 출력합니다.");
		
		int i= 0;
		
		while(i<9){	
			System.out.println(number+"x"+(i+1)+"="+number*(i+1));
			i++;
		}
	}
}
	