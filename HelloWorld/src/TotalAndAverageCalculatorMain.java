
public class TotalAndAverageCalculatorMain {
	
	public static void main(String[] args) {
		
		TotalAndAverageCalculator totalAndAverageCalculator
		= new TotalAndAverageCalculator();
	/*	
		int[] scores = new int[4];//�迭�� �ޱ� ���ؼ� ����. 4���� ���� ������ 4���� ���ϱ� ������ ����
		scores[0] = 100;
		scores[1] = 40;
		scores[2] = 60;
		scores[3] = 80;*/
		
		int[] scores =new int[]{100,90,100,7};//�ڽ��� ���� ��ŭ �迭�� �������, �迭�� �Ҷ� �ַ� ���̾�
		//int[] scores1={100,90,100,70};// ���������� �̰� ���� �ȴ�.
		totalAndAverageCalculator.printTotalAndAverage(scores);//�迭�� ���� �ѱ� �հ踦 ���ϰ� ����� ���ϴ� ���� �Ѵ�.
		String message= "�ȳ��ϼ���. �� �̸��� �������Դϴ�. ������ �ݰ����ϴ�."; //���ڿ� Ÿ��
		
		String[] splitedMessage = message.split(" ");//���ڿ��� ���� �� ĭ�� �ɰ�� �ִ´�.
		System.out.println(splitedMessage[0]);
		System.out.println(splitedMessage[1]);
		System.out.println(splitedMessage[2]);
		System.out.println(splitedMessage[3]);
		System.out.println(splitedMessage[4]);
		System.out.println(splitedMessage[5]);
		System.out.println(splitedMessage[6]);
		
		String message1 = "������::27";
		String[] info = message1.split("::");//::�� �������� �̸��� ���̷� ������.
		System.out.println(info[0]);
		System.out.println(info[1]);
		//		String str = new String("")
		/*
		for(int i=0; i<scores.length; i++){
			System.out.println(scores[i]);
		}
		}
       */
		}
}