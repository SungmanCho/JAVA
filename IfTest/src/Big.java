import java.util.Scanner;

public class Big {
	Scanner input = new Scanner(System.in);
	
	void inputBig(){
		
		int[] number = new int[3];
		
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		number[0]=input.nextInt();
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		number[1]=input.nextInt();
		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		number[2]=input.nextInt();
		
		int bigNumber;
		if (number[0]>number[1]) {
	
			bigNumber=number[0];
			}
		else{
			
			bigNumber=number[1];
			}
		if(number[2]>bigNumber){
			bigNumber=number[2];
		}
		String message =  String.format("%d, %d, %d �� ���� ���� ���� %d�Դϴ�.",number[0],number[1],number[2],bigNumber);
		System.out.println(message);
	}
	
	
}
