
public class TotalAndAverageCalculatorMain {
	
	public static void main(String[] args) {
		
		TotalAndAverageCalculator totalAndAverageCalculator
		= new TotalAndAverageCalculator();
	/*	
		int[] scores = new int[4];//배열을 받기 위해서 만듬. 4개를 만든 이유는 4개를 원하기 떄문에 만든
		scores[0] = 100;
		scores[1] = 40;
		scores[2] = 60;
		scores[3] = 80;*/
		
		int[] scores =new int[]{100,90,100,7};//자신이 쓴거 만큼 배열이 만들어짐, 배열로 할때 주로 많이씀
		//int[] scores1={100,90,100,70};// 귀찮을때는 이거 쓰면 된다.
		totalAndAverageCalculator.printTotalAndAverage(scores);//배열을 전부 넘김 합계를 구하고 평균을 구하는 일을 한다.
		String message= "안녕하세요. 제 이름은 조성만입니다. 만나서 반갑습니다."; //문자열 타입
		
		String[] splitedMessage = message.split(" ");//문자열로 띄어쓰기 한 칸을 쪼개어서 넣는다.
		System.out.println(splitedMessage[0]);
		System.out.println(splitedMessage[1]);
		System.out.println(splitedMessage[2]);
		System.out.println(splitedMessage[3]);
		System.out.println(splitedMessage[4]);
		System.out.println(splitedMessage[5]);
		System.out.println(splitedMessage[6]);
		
		String message1 = "조성만::27";
		String[] info = message1.split("::");//::를 기준으로 이름과 나이로 나눈다.
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