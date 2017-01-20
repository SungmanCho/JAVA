import java.util.Scanner;

/**
 * 산술 연산자를 이용해 합계/평균 구하기
 * @author minchangjang
 *
 */
public class TotalAndAverageCalculator {

	Scanner input = new Scanner(System.in);
	
	void printTotalAndAverage(int[] scores)//처리를 하는 부분 ,파라미터로 집합을 받아옴.
	    {
		
		System.out.println("합계와 평균 구하기 프로그램");
		/*
		int[] scores = new int[4];
		System.out.println("첫 번째 숫자를 입력하세요.");
		//int numberOne = input.nextInt();
		scores[0]=input.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		//int numberTwo = input.nextInt();
		scores[1]=input.nextInt();
		System.out.println("세 번째 숫자를 입력하세요.");
		//int numberThree = input.nextInt();
		scores[2]=input.nextInt();
		System.out.println("네 번째 숫자를 입력하세요.");
		//int numberFour = input.nextInt();
		scores[3]=input.nextInt();
		*/
		int totalPoint = scores[0] + scores[1] + scores[2] +scores[3];
		System.out.println(scores[0] + " + "
						+ scores[1]+ " + "
						+ scores[2] + " + "
						+scores[3] + " = "
						+ totalPoint);
		
		//int averagePoint = totalPoint / 4;
		//double averagePoint = totalPoint /(double)scores.length;/배열의 길이(4)를 받는다. length:int 
		double averagePoint = totalPoint /(scores.length*1.0);//실수로 바뀐다.
		System.out.println("평균은 " + averagePoint + " 입니다.");
		
	}
	
}