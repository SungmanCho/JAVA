
public class MultipleArray {
	//void printClassTotalScore(int [] scoresInClasses)//������ �迭
	void printClassTotalScore(int [][] scoresInClasses)//������ �迭 �տ��� ��, �ڿ��� ��
	{
		int totalScore1 = scoresInClasses[0][0] + scoresInClasses[0][1] + scoresInClasses[0][2];//�� ���� ������ ���� 
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
		
		System.out.println("1�ݿ��� 3�ݱ����� �� ���� ��� "+avg1+"��");
		System.out.println("4�ݿ��� 6�ݱ����� �� ���� ��� "+avg2+"��");
		System.out.println("7�ݿ��� 9�ݱ����� �� ���� ��� "+avg3+"��");
		System.out.println("10�ݿ��� 12�ݱ����� �� ���� ��� "+avg4+"��");
		System.out.println("13�ݿ��� 15�ݱ����� �� ���� ��� " +avg5+"��");
		
		System.out.println("��ü �� �� ���� ��� "+avgtotal+"��");
		
		
	}
}
