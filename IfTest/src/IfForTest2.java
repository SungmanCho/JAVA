
public class IfForTest2 {
	public static void main(String[] args) {
		/*	
		1���� 100 ���̿� �����ϴ� ��� ¦���� ����ϱ�
		*/
		//1. 1���� 100���� �ݺ� �Ѵ�.
		for (int i = 1; i <101; i++) {
		
		//2. i �� �P������ Ȯ���Ѵ�.
			if(i%2==1){
				//3. i ���� Ȧ����� �ݺ��� �ǳʶڴ�.
				continue;//for�� while���� ����� �����ϴ�.
			}
			System.out.println(i);
		}
		
		
	}
}
