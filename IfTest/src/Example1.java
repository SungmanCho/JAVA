import java.util.Scanner;

public class Example1 {
	Scanner input = new Scanner(System.in);
	
	void printInputScores(){
		System.out.println("점수 총합과 평균 구하기 프로그램");

		
		int[] scores = new int[4];
		System.out.println("프로그래밍 점수를 입력하세요.");
		scores[0]=input.nextInt();
		
		System.out.println("경영 점수를 입력하세요.");
		scores[1]=input.nextInt();
		
		System.out.println("수학 점수를 입력하세요.");
		scores[2]=input.nextInt();
		
		System.out.println("알고리즘 점수를 입력하세요");
		scores[3]=input.nextInt();
	
		//총점을 구한다.
		int totalPoint = scores[0] + scores[1] + scores[2] +scores[3];
		/*System.out.println(+scores[0] + " + "
						+ scores[1]+ " + "
						+ scores[2] + " + "
						+scores[3] + " = "
						+"총점은 "+ totalPoint+"점입니다.");*/
		//평균을 구한다.
		double averagePoint = totalPoint /(scores.length*1.0);//실수로 바뀐다.
		//System.out.println("평균은 " + averagePoint + " 입니다.");//%f<=double 타입,%.2f<=소수점 2자리 표현, %d<=int, %s<=string
		//
		String message =  String.format("총점은 %d, 평균 %.2f 입니다.", totalPoint, averagePoint);
		System.out.println(message);
		//평균 90점 넘었을 때
		if(averagePoint>=90){	
			System.out.println("참 잘했어요!");
		}
		//평균 90 미만일 떼
		else{
			System.out.println("노력하세요!");
		}
	}
}

