import java.util.Scanner;

public class ForcastSub {
	Scanner input = new Scanner(System.in);
	void printInputForcast(){
		int[] number = new int[1];
		
		for(int i=0;i<3;i++){
			System.out.println("�ϱ⿹��");//�ݺ���
			System.out.println("1�� ����, 2�� �帲,3�� ���� ");
			System.out.println("������ �Է��ϼ��� : ");
	
			number[0]=input.nextInt();
	
			int choice = number[0];
			if(choice==1){	
				System.out.println("������ �����ϴ�.");
			}
			else if(choice==2){	
				System.out.println("������ �帳�ϴ�.");
			}
	//����ڰ� 3���� �����ߴٸ�, �ݺ��� �����Ѵ�.
			else if(choice==3){
				break;//��� ����
			}
			else {
				System.out.println("�߸� �� ��ȣ�Դϴ�.");
			}
		}
	}
}