import java.util.Scanner;

public class ChoiceProgram{
		Scanner input = new Scanner(System.in);
		
		void printInputNumber(){
			//�ټ��� ����
			for(int i=0;i<5;i++){
			//ù ��° �Է� ����
			int[] number = new int[1];	
			
			System.out.println("��� ���α׷�");
			System.out.println("1�� ���� 5���� ������ ���,2�� ����->ȭ��,3�� BMI,4�� ���� : ");
			
			number[0]=input.nextInt();
			
			int choice = number[0];
			//�Ϲ� ���ý� ������ ��� ���ϴ� ���α׷�
			if(choice==1){
				
				
				int[] scores= new int [5];
				
				
				System.out.println("ù ��° ������ �Է��ϼ���.");
				int numberOne = input.nextInt();
				scores[0]=numberOne;
				
				System.out.println("�� ��° ������ �Է��ϼ���.");
				int numberTwo = input.nextInt();
				scores[1]=numberTwo;
				
				System.out.println("�� ��° ������ �Է��ϼ���.");
				int numberThree = input.nextInt();
				scores[2]=numberThree;
				
				System.out.println("�� ��° ������ �Է��ϼ���.");
				int numberFour = input.nextInt();
				scores[3]=numberFour;
				
				System.out.println("�ټ� ��° ������ �Է��ϼ���.");
				int numberFive = input.nextInt();
				scores[4]=numberFive;
				
				int totalPoint = scores[0] + scores[1] + scores[2] +scores[3]+scores[4];
				System.out.println(scores[0] + " + "
								+ scores[1]+ " + "
								+ scores[2] + " + "
								+scores[3] + scores[4]+" = "
								+ totalPoint+"��");
				double averagePoint = totalPoint /(scores.length*1.0);//�Ǽ��� �ٲ��.
				System.out.println("����� " + averagePoint + " ���Դϴ�.");
			}
			
			//�̹� ���ý� �������� ȭ���� ��ȯ�ϴ� ���α׷�
			else if (choice==2) {
				
				System.out.println("�������� ȭ���� ��ȯ�մϴ�.");
				System.out.println("������ �Է��� �ּ���.");
				double cel = input.nextDouble();
				double fah = (cel * 1.8) + 32;
				
				System.out.println("���� " + cel + 
						"�� ȭ��" + fah + "�Դϴ�.");
			}
			//��� ���ý� bmi���� ���ϴ� ���α׷�
			else if (choice==3){
				
				int[] BMI = new int[2];
				System.out.println("�����Ը� �Է��ϼ���.");
				int weight = input.nextInt();
				BMI[0]=weight;
				System.out.println("Ű�� �Է��ϼ���.");
				int tall = input.nextInt();
				BMI[1]=tall;
				double bmi = BMI[0]/(BMI[1]*0.01*BMI[1]*0.01);
				System.out.println("BMI ������ " + bmi + " �Դϴ�.");
			}
			//4�� ���ý� ����
			if(choice==4){
				break;
			}
		}
	}
}

		