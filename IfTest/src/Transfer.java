import java.util.Scanner;

public class Transfer {
	
	Scanner input = new Scanner(System.in);
	void printChange(){
	int[] number = new int[1];
	System.out.println("¼·¾¾ È­¾¾");
	System.out.println("1¹ø ¼·¾¾¿¡¼­ È­¾¾, 2¹ø È­¾¾¿¡¼­ ¼·¾¾ ");
	System.out.println("¹øÈ£¸¦ ¼±ÅÃÇÏ½Ã¿À : ");
	
	number[0]=input.nextInt();
	
	int choice = number[0];
	
	
	if (choice==1) {
		
		System.out.println("¼·¾¾¿¡¼­ È­¾¾·Î º¯È¯ÇÕ´Ï´Ù.");
		System.out.println("¼·¾¾¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
		double cel = input.nextDouble();
		double fah = (cel * 1.8) + 32;
		
		System.out.println("¼·¾¾ " + cel + 
				"Àº È­¾¾" + fah + "ÀÔ´Ï´Ù.");
		
	}
	
	else if(choice==2) {
		
		System.out.println("È­¾¾¿¡¼­ ¼·¾¾·Î º¯È¯ÇÕ´Ï´Ù.");
		System.out.println("È­¾¾¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
		double fah = input.nextDouble();
		double cel = (fah - 32) / 1.8;
		
		System.out.println("È­¾¾ " + fah + 
				"Àº ¼·¾¾" + cel + "ÀÔ´Ï´Ù.");
		
	}
	else {
		System.out.println("Àß¸ø µÈ ¹øÈ£ÀÔ´Ï´Ù.");
	}
	
	}
}
