
public class CalculatorMain {
	public static void main(String[] args) {
		int[] points = {100,20,23};
		
		ArrayCalculator arrayCalculator = new ArrayCalculator();
		arrayCalculator.calculator(points);
		
		String strPoint ="50 40 20"; //0=>50, 1=>40, 2=>20
		String[] strPoints = strPoint.split(" ");
		//strPoint.toCharArray()//��ȣȭ ó���Ҷ� ����.
		//int number1 = (int) strPoints[0]; //���۷��� Ÿ���� ���۷��� Ÿ�����θ� �ٲܼ� �ִ�.
		//int number1 =(Integer) strPoints[0];//�߸��� ����
		int number1 = Integer.parseInt(strPoints[0]);
		int number2 = Integer.parseInt(strPoints[1]);
		int number3 = Integer.parseInt(strPoints[2]);
		
		int[] points2={number1, number2, number3};
		
		//Interger.parseInt("10.5");//���� ���ڷ� ����Ѵ�.
		//Integer.parseInt(" 10 ");//���⵵ ����(null)�� ����Ѵ�.
		arrayCalculator.calculator(points2);
	}
}
