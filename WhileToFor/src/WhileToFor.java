
public class WhileToFor {
	public static void main(String[] args){
		//while 기본 형식
		//1붜 10까지 출력
		int i =0;
		while(i<10){
			i++;
			System.out.println(i);
		}
			//for 기본 형식
			//1부터 10까지 출력
		
			//int j =0;
			//j=j+1;=>1
			//j+1=>1은 아니다. 이유는 할당을 하지 않아서
			//반복 구간
		
		for(int j=0 ; j<10 ; j++)//초기화 식; 조건식 ; 증감식 //1번째,2번째,4번째 순서
			{
			System.out.println(j+1);//3번째 순서
		}
	
	}
}