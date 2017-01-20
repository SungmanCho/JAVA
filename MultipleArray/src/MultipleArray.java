
public class MultipleArray {
	//void printClassTotalScore(int [] scoresInClasses)//일차원 배열
	void printClassTotalScore(int [][] scoresInClasses)//이차원 배열 앞에가 행, 뒤에가 열
	{
		int totalScore1 = scoresInClasses[0][0] + scoresInClasses[0][1] + scoresInClasses[0][2];//한 줄의 점수의 총합 
		int totalScore2 = scoresInClasses[1][0] + scoresInClasses[1][1] + scoresInClasses[1][2];
		int totalScore3 = scoresInClasses[2][0] + scoresInClasses[2][1] + scoresInClasses[2][2];
		int totalScore4 = scoresInClasses[3][0] + scoresInClasses[3][1] + scoresInClasses[3][2];
		int totalScore5 = scoresInClasses[4][0] + scoresInClasses[4][1] + scoresInClasses[4][2];
		
		int totalScore = totalScore1+totalScore2+totalScore3+totalScore4+totalScore5;
		
		double avg1 = totalScore1/scoresInClasses[0].length*1.0;
		double avg2 = totalScore2/scoresInClasses[0].length*1.0;
		double avg3 = totalScore3/scoresInClasses[0].length*1.0;
		double avg4 = totalScore4/scoresInClasses[0].length*1.0;
		double avg5 = totalScore5/scoresInClasses[0].length*1.0;
		
		double avgtotal =+totalScore/(scoresInClasses[0].length*1.0+
				scoresInClasses[1].length*1.0+
				scoresInClasses[2].length*1.0+
				scoresInClasses[3].length*1.0+
				scoresInClasses[4].length*1.0);
		
		System.out.println("1반에서 3반까지의 총 점수 평균 "+avg1+"점");
		System.out.println("4반에서 6반까지의 총 점수 평균 "+avg2+"점");
		System.out.println("7반에서 9반까지의 총 점수 평균 "+avg3+"점");
		System.out.println("10반에서 12반까지의 총 점수 평균 "+avg4+"점");
		System.out.println("13반에서 15반까지의 총 점수 평균 " +avg5+"점");
		
		System.out.println("전체 반 총 점수 평균 "+avgtotal+"점");
		
		
	}
}
