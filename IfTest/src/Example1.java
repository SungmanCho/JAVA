import java.util.Scanner;

public class Example1 {
	Scanner input = new Scanner(System.in);
	
	void printInputScores(){
		System.out.println("���� ���հ� ��� ���ϱ� ���α׷�");

		
		int[] scores = new int[4];
		System.out.println("���α׷��� ������ �Է��ϼ���.");
		scores[0]=input.nextInt();
		
		System.out.println("�濵 ������ �Է��ϼ���.");
		scores[1]=input.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���.");
		scores[2]=input.nextInt();
		
		System.out.println("�˰��� ������ �Է��ϼ���");
		scores[3]=input.nextInt();
	
		//������ ���Ѵ�.
		int totalPoint = scores[0] + scores[1] + scores[2] +scores[3];
		/*System.out.println(+scores[0] + " + "
						+ scores[1]+ " + "
						+ scores[2] + " + "
						+scores[3] + " = "
						+"������ "+ totalPoint+"���Դϴ�.");*/
		//����� ���Ѵ�.
		double averagePoint = totalPoint /(scores.length*1.0);//�Ǽ��� �ٲ��.
		//System.out.println("����� " + averagePoint + " �Դϴ�.");//%f<=double Ÿ��,%.2f<=�Ҽ��� 2�ڸ� ǥ��, %d<=int, %s<=string
		//
		String message =  String.format("������ %d, ��� %.2f �Դϴ�.", totalPoint, averagePoint);
		System.out.println(message);
		//��� 90�� �Ѿ��� ��
		if(averagePoint>=90){	
			System.out.println("�� ���߾��!");
		}
		//��� 90 �̸��� ��
		else{
			System.out.println("����ϼ���!");
		}
	}
}

