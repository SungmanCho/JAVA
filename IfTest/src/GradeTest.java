import java.util.Scanner;
/**
 * ���� ����ϴ� ���α׷�<br/>
 * 100�� A+<br/>
 * 90�� �̻��� A<br/>
 * 80�� �̻��� B<br/>
 * 70�� �̻��� C<br/>
 * 60�� �̻��� D<br/>
 * �� ���ϴ� F�� ����Ѵ�.
 * 
 * <pre>
 * �ۼ��ϰ� ���� ����
 * �������!//���� ��ġ�� �ϴ°�
 * <pre>
 * 
 * @author Cho Sung Man(xaiop777@gmail.com)
 *
 */
public class GradeTest {
Scanner input = new Scanner(System.in);
	
	void printInputScores(){
				
		//�̱� ����
		/*
		 * ��Ƽ ����
		 */
		//������ ������ �Ҵ��Ѵ�. ������ 100��
		int[] scores = new int[1];
		System.out.println("���� ���α׷�");
		System.out.println("������ �Է��ϼ��� : ");
		
		scores[0]=input.nextInt();
		
		int grade = scores[0];
		//������ 100���� ��
		if(grade==100){	
			System.out.println("A+");
		}
		//������100���� �ƴϰ� 90 �̻��� ��
		else if(grade>=90){
			System.out.println("A");
		}
		//������ 90�� �̸��̰� 80�� �̻�
		else if(grade>=80){
			System.out.println("B");
		}
		//������ 80�� �̸��̰� 70�� �̻�
		else if(grade>=70){
			System.out.println("C");
		}
		//������ 70�� �̸��̰� 60�� �̻�
		else if(grade>=60){
			System.out.println("D");
		}
		//������ 60�� �̸�
		else{
			System.out.println("F");
		}
	}
	
}