
public class CalculatorMain {
	public static void main(String[] args) {
		int[] points = {100,20,23};
		
		ArrayCalculator arrayCalculator = new ArrayCalculator();
		arrayCalculator.calculator(points);
		
		String strPoint ="50 40 20"; //0=>50, 1=>40, 2=>20
		String[] strPoints = strPoint.split(" ");
		//strPoint.toCharArray()//암호화 처리할때 쓴다.
		//int number1 = (int) strPoints[0]; //래퍼런스 타입은 래퍼런스 타입으로만 바꿀수 있다.
		//int number1 =(Integer) strPoints[0];//잘못된 예시
		int number1 = Integer.parseInt(strPoints[0]);
		int number2 = Integer.parseInt(strPoints[1]);
		int number3 = Integer.parseInt(strPoints[2]);
		
		int[] points2={number1, number2, number3};
		
		//Interger.parseInt("10.5");//점을 문자로 취급한다.
		//Integer.parseInt(" 10 ");//띄어쓰기도 문자(null)로 취급한다.
		arrayCalculator.calculator(points2);
	}
}
