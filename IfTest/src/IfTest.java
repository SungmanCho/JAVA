
public class IfTest {
	public static void main(String [] args) {
		/*�ָӴϿ� ���� 1200�� �̻� �ִٸ�, ĵ Ŀ�Ǹ� �� �� �ֽ��ϴ�.
		�� ����ϴ� ���α׷�*/
		
//		�ָӴϿ� �ִ� ���� ������.
		int money = 1200;
		int age = 20;
		
		
//		�ָӴϿ� ���� 1200�� �̻����� Ȯ����.
		boolean isOver1200 = money>=1200;//true�϶� ���� ������ false�� �� ����� ���� �ʴ´�.
		if(isOver1200) {
			//true==true �� ����� �ȴ�.
			System.out.println("ĵ Ŀ�Ǹ� �� �� �ֽ��ϴ�.");
		}
//	
		//10�� �̻��� ���
		boolean isOver10 = age>=20;//true�϶� ���� ������ false�� �� ����� ���� �ʴ´�.
		if(isOver10) {
			//true==true �� ����� �ȴ�.
			System.out.println("Ŭ���� ���� �����ϴ�.");
		}
		//10�� �� ���
		boolean isDown20 = age<=19;//true�϶� ���� ������ false�� �� ����� ���� �ʴ´�.
		if(isDown20) {
			//true==true �� ����� �ȴ�.
			System.out.println("Ŭ���� ���� �Ұ����ϴ�.");
		}
		//30�� �̻��� ���
		boolean isOver30 = age>=30;//true�϶� ���� ������ false�� �� ����� ���� �ʴ´�.
		if( isOver30) {
			//true==true �� ����� �ȴ�.
			System.out.println("ȣ�� ����Ʈ Ŭ���� ���� �����ϴ�.");
		}
		//������ ���� �ſ�ī�尡 ���� ���
		//�ſ�īƮ�� �����մϴٸ� ����ϴ� ���α׷�
		
		//�ִ�= true
		//����=false �� ǥ����
		
		//������ �ִٸ�
		boolean hasCash = false;
		
		//�ſ�ī�尡 �ִٸ�
		boolean hasCreditCard = true;

		//������ ���� �ſ�ī�尡 �ִ��� Ȯ���Ѵ�.
		//boolean card = hasCash == false && hasCreditCard == true;//and�� ���� �������̴�. �Ѵ� Ʈ���̴�.
		boolean card = !hasCash&& hasCreditCard;//���� �ڵ�� �����ϴ�.!true = false,!false = true
		//������ ���� �ſ�ī�尡 �ִٸ� "�ſ�ī��� �����մϴ�."�� ����Ѵ�.
		if (card) {
			System.out.println("�ſ�ī��� �����մϴ�.");
		}
		
		
	
	}
}
