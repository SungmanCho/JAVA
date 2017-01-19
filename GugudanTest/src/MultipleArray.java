
public class MultipleArray {
	public static void main(String[] args){
		int [][] nums= {
				{2,4,6,8,10,12,14,16,18},
				{3,6,9,12,15,18,21,24,27},
				{4,8,12,16,20,24,28,32,36}
				
		};//다차원 배열 만드는 코드//f5 : process안으로 접근, F6:명령수행 한줄씩 실행, F7:한단계위로 실행, F8:디버그 종료
		
		int i = 0;
		int j=0;
		//1. 행의 갯수를 가져와 변수에 담는다.
		
		int rowCount = nums.length;//3 행의 갯수
		//2. 행의 갯수만큼 i를 증가 시키며 반복한다.
		while(i<rowCount){
			//3. i번째 행의 배열 원소 갯수를 가져와 변수에 담는다.
			int colCount = nums[i].length;
			//4. i번째 행의 배열 원소 갯수만큼 j를 증가시키어 반복한다.
			while(j<colCount){	
				System.out.println(nums[i][j]);
				j++;
			
		}
			//5. j를 초기화한다.
			j=0;//행의 갯수를 초과할 시 0으로 초기화
			i++;
		}
	}
}
