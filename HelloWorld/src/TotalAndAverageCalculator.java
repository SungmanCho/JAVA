import java.util.Scanner;

/**
 * ��� �����ڸ� �̿��� �հ�/��� ���ϱ�
 * @author minchangjang
 *
 */
public class TotalAndAverageCalculator {

	Scanner input = new Scanner(System.in);
	
	void printTotalAndAverage(int[] scores)//ó���� �ϴ� �κ� ,�Ķ���ͷ� ������ �޾ƿ�.
	    {
		
		System.out.println("�հ�� ��� ���ϱ� ���α׷�");
		/*
		int[] scores = new int[4];
		System.out.println("ù ��° ���ڸ� �Է��ϼ���.");
		//int numberOne = input.nextInt();
		scores[0]=input.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		//int numberTwo = input.nextInt();
		scores[1]=input.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		//int numberThree = input.nextInt();
		scores[2]=input.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
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
		//double averagePoint = totalPoint /(double)scores.length;/�迭�� ����(4)�� �޴´�. length:int 
		double averagePoint = totalPoint /(scores.length*1.0);//�Ǽ��� �ٲ��.
		System.out.println("����� " + averagePoint + " �Դϴ�.");
		
	}
	
}