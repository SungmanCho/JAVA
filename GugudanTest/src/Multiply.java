import java.util.Scanner;

public class Multiply {
	Scanner input = new Scanner(System.in);
	void printMultiply(){
		System.out.println("���Ͻô� �������� �Է��ϼ���.(�Է¹��� 2~9)");
		System.out.print("���ϴ� ������ : ");
		
		int number = input.nextInt();
		
		System.out.println("");
		System.out.println("=================");
		System.out.println("������ "+number+"���� ����մϴ�.");
		
		int i=0;
		while(i<9){
			i++;
			System.out.println(number+"X"+i+"="+(number*i));
		}
		
		
	}
	
}
