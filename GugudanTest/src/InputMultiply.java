import java.util.Scanner;

public class InputMultiply {
	Scanner input = new Scanner(System.in);
	void printInputMultiply(){
		
		System.out.println("���Ͻô� �������� �Է��ϼ���.{������ �Է°����� (1~9)���� �� ����}");
		System.out.print("���ϴ� ������ : ");
		
		int number = input.nextInt();
		
		System.out.println("");
		System.out.println("=================");
		System.out.println("������ "+number+"���� ����մϴ�.");
		
		int i= 0;
		
		while(i<9){	
			System.out.println(number+"x"+(i+1)+"="+number*(i+1));
			i++;
		}
	}
}
	