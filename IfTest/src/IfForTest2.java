
public class IfForTest2 {
	public static void main(String[] args) {
		/*	
		1부터 100 사이에 존재하는 모든 짝수를 출력하기
		*/
		//1. 1부터 100까지 반복 한다.
		for (int i = 1; i <101; i++) {
		
		//2. i 값 홓수인지 확인한다.
			if(i%2==1){
				//3. i 값이 홀수라면 반복을 건너뛴다.
				continue;//for와 while에만 사용이 가능하다.
			}
			System.out.println(i);
		}
		
		
	}
}
