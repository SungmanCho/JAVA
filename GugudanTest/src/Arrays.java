
public class Arrays {
	public static void main(String[] args) {
		//배열 안에 있는 모든 원소를 출력한다.
		//1. 배열을 정의하고 값을 할당한다.
		String[] names = {"2pac, jay-z, eminem"};//배열 초기화 방법
		
		//2. 배열의 원소 개수를 변수에 담아 보관한다.
		int nameCount = names.length;
		//3. 배열의 원소 개수만큼 반복하며, 각 원소를 출력한다.
		//3-1. 반복값을 정의하고, 0으로 초기화한다.
		int i=0;
		//3-2. while 반복문을 반복한다. 조건은 반복값이 nameCount보다 작을 때까지만 한다.
		while (i<nameCount){
			//names[0],names[1],names[2]
		//3-3. 반복 구문: names 배열의 원소를 꺼내 출력한다.	
			System.out.println(names[i]);
		//3-4. 반복 값을 증가시킨다.
			i++;
		}
		//10개 점수의 총점을 구하는 프로그램
		//1. 점수 10개를 배열에 선언하고 초기화한다.
		int[] scores = {100, 70, 20, 30, 100, 30, 50, 60, 70, 70};
		//2. 배열의 원소 개수를 변수에 담아 보관한다.
		int scoresCount = scores.length;//문자열일땐 String, 숫자일 땐  int
		//3. 반복에 사용할 증가 값을 선언하고 0으로 초기화 한다.
		int j = 0;
		//4. 총점을 계산해 담을 변수를 선언하고 0으로 초기화 한다.
		int sum =0;
		//5. 반복을 수행하며 원소를 모두 더한다.
		while(j<scoresCount)
		{
			sum+=scores[j];//배열에 있는 숫자를 순차적으로 더한다.
			j++;
		}
		System.out.println("총점은"+sum+"입니다.");
	}
}
