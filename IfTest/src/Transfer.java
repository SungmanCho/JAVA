import java.util.Scanner;

public class Transfer {
	
	Scanner input = new Scanner(System.in);
	void printChange(){
	int[] number = new int[1];
	System.out.println("���� ȭ��");
	System.out.println("1�� �������� ȭ��, 2�� ȭ������ ���� ");
	System.out.println("��ȣ�� �����Ͻÿ� : ");
	
	number[0]=input.nextInt();
	
	int choice = number[0];
	
	
	if (choice==1) {
		
		System.out.println("�������� ȭ���� ��ȯ�մϴ�.");
		System.out.println("������ �Է��� �ּ���.");
		double cel = input.nextDouble();
		double fah = (cel * 1.8) + 32;
		
		System.out.println("���� " + cel + 
				"�� ȭ��" + fah + "�Դϴ�.");
		
	}
	
	else if(choice==2) {
		
		System.out.println("ȭ������ ������ ��ȯ�մϴ�.");
		System.out.println("ȭ���� �Է��� �ּ���.");
		double fah = input.nextDouble();
		double cel = (fah - 32) / 1.8;
		
		System.out.println("ȭ�� " + fah + 
				"�� ����" + cel + "�Դϴ�.");
		
	}
	else {
		System.out.println("�߸� �� ��ȣ�Դϴ�.");
	}
	
	}
}
