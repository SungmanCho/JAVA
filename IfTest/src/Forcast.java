import java.util.Scanner;

public class Forcast {
	Scanner input = new Scanner(System.in);
	void printInputForcast(){
	int[] number = new int[1];
	System.out.println("�ϱ⿹��");
	System.out.println("1�� ����, 2�� �帲 ");
	System.out.println("������ �Է��ϼ��� : ");
	
	number[0]=input.nextInt();
	
	int choice = number[0];
	if(choice==1){	
		System.out.println("������ �����ϴ�.");
	}
	else if(choice==2){	
		System.out.println("������ �帳�ϴ�.");
	}
	else {
		System.out.println("�߸� �� ��ȣ�Դϴ�.");
	}
}
}