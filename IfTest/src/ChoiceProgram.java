import java.util.Scanner;

public class ChoiceProgram{
		Scanner input = new Scanner(System.in);
		
		void printInputNumber(){
			//다섯번 실행
			for(int i=0;i<5;i++){
			//첫 번째 입력 받음
			int[] number = new int[1];	
			
			System.out.println("계산 프로그램");
			System.out.println("1번 점수 5개의 총점과 평균,2번 섭씨->화씨,3번 BMI,4번 종료 : ");
			
			number[0]=input.nextInt();
			
			int choice = number[0];
			//일번 선택시 총점과 평균 구하는 프로그램
			if(choice==1){
				
				
				int[] scores= new int [5];
				
				
				System.out.println("첫 번째 점수를 입력하세요.");
				int numberOne = input.nextInt();
				scores[0]=numberOne;
				
				System.out.println("두 번째 점수를 입력하세요.");
				int numberTwo = input.nextInt();
				scores[1]=numberTwo;
				
				System.out.println("세 번째 점수를 입력하세요.");
				int numberThree = input.nextInt();
				scores[2]=numberThree;
				
				System.out.println("네 번째 점수를 입력하세요.");
				int numberFour = input.nextInt();
				scores[3]=numberFour;
				
				System.out.println("다섯 번째 점수를 입력하세요.");
				int numberFive = input.nextInt();
				scores[4]=numberFive;
				
				int totalPoint = scores[0] + scores[1] + scores[2] +scores[3]+scores[4];
				System.out.println(scores[0] + " + "
								+ scores[1]+ " + "
								+ scores[2] + " + "
								+scores[3] + scores[4]+" = "
								+ totalPoint+"점");
				double averagePoint = totalPoint /(scores.length*1.0);//실수로 바뀐다.
				System.out.println("평균은 " + averagePoint + " 점입니다.");
			}
			
			//이번 선택시 섭씨에서 화씨로 변환하는 프로그램
			else if (choice==2) {
				
				System.out.println("섭씨에서 화씨로 변환합니다.");
				System.out.println("섭씨를 입력해 주세요.");
				double cel = input.nextDouble();
				double fah = (cel * 1.8) + 32;
				
				System.out.println("섭씨 " + cel + 
						"은 화씨" + fah + "입니다.");
			}
			//삼번 선택시 bmi지수 구하는 프로그램
			else if (choice==3){
				
				int[] BMI = new int[2];
				System.out.println("몸무게를 입력하세요.");
				int weight = input.nextInt();
				BMI[0]=weight;
				System.out.println("키를 입력하세요.");
				int tall = input.nextInt();
				BMI[1]=tall;
				double bmi = BMI[0]/(BMI[1]*0.01*BMI[1]*0.01);
				System.out.println("BMI 지수는 " + bmi + " 입니다.");
			}
			//4번 선택시 종료
			if(choice==4){
				break;
			}
		}
	}
}

		