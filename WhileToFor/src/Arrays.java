
public class Arrays {
	public static void main(String[] args) {
		
		String[] names = {"2pac, jay-z, eminem"};//배열 초기화 방법
		//출력
		//정수형 변수 i는 0부터 시작해 names갯수 보다 작은 동안 1씩 증가하며 반복한다.
		for(int i=0; i<names.length; i++){
			System.out.println(i);
			System.out.println(names[i]);
		}
		
		int[] scores = {100, 70, 20, 30, 100, 30, 50, 60, 70, 70};
		//합계 계산후 출력
		int sum = 0;//초기화
		
		//정수형 변수 1는 0부터 시작해 scores 갯수보다 작을 동안 1씩 증가하며 반복한다.
		for(int i=0; i<scores.length; i++){
			System.out.println("현재 i의 값 : " + i);
			System.out.println("현재 i 위치의  값 : " + scores[i]);
			System.out.println("현재까지의 점수 총합 : "+sum);
			sum= sum + scores[i];
		}
		System.out.println("최종 점수 총 합 : "+ sum);
		//foreach
		//for를 간편하게 사용하기 위한 방법
		//배열 요소를 순차로 꺼내어 준다.
		//매우매우 빠르다.
		//for보다 빠르다.
		for(int score : scores){
			System.out.println(score);//엄청나게 많이 쓴다.요소가 몇번째인지는 알고 싶을때는  구형 for를 쓰는게 낫다.
		}
	}
}
