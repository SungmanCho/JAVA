
public class MultipleArray {
	public static void main(String[] args){
		int [][] nums= {
				{2,4,6,8,10,12,14,16,18},
				{3,6,9,12,15,18,21,24,27},
				{4,8,12,16,20,24,28,32,36}
				
		};//������ �迭 ����� �ڵ�//f5 : process������ ����, F6:��ɼ��� ���پ� ����, F7:�Ѵܰ����� ����, F8:����� ����
		
		int i = 0;
		int j=0;
		//1. ���� ������ ������ ������ ��´�.
		
		int rowCount = nums.length;//3 ���� ����
		//2. ���� ������ŭ i�� ���� ��Ű�� �ݺ��Ѵ�.
		while(i<rowCount){
			//3. i��° ���� �迭 ���� ������ ������ ������ ��´�.
			int colCount = nums[i].length;
			//4. i��° ���� �迭 ���� ������ŭ j�� ������Ű�� �ݺ��Ѵ�.
			while(j<colCount){	
				System.out.println(nums[i][j]);
				j++;
			
		}
			//5. j�� �ʱ�ȭ�Ѵ�.
			j=0;//���� ������ �ʰ��� �� 0���� �ʱ�ȭ
			i++;
		}
	}
}
