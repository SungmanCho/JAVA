
public class Main {
	public static void main(String[] args) {
		/*1���� 10������ ����ϴ� ���α׷��� �����.
		�ݺ����� ������� ���� ���*/
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);//sysout �ϰ� ��Ʈ�� �����̽�
		
		/*������ �̿��� 1���� 10���� ����ϴ� ���α׷��� �����.*/
		
		int number = 1;
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number++);
	/*	
		i=index
		i=increment*/
		
		int i = 0;
		//i���� 11���� �۴ٸ� �ݺ��� �����϶�.
		//i���� 11�� �Ǿ��� �� �ݺ��� �����Ѵ�.
		while(i<10){
			//i=i+1; , i+=1;
			i++;
			System.out.println(i);
		}// ������ �ٽ� �ö�. �ʱ� ���� 1�� ��.
	}
}
