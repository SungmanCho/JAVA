
public class SwitchTest1 {
	public static void main(String[] args){
		/*switch(���� Ȥ�� ���ڿ� ����){
		case 1: //���¿� ���� ���� ����
		case 2:	//���¿� ���� ���� ����
		case 3: //���¿� ���� ���� ����
			default:
				//������ �۾�
		}*/
		//��� ���̱� ���μ���
		final int READY = 1;//final�� �޸� ����� �빮�ڷ� ����.
		//���� �غ��Ѵ�.
		final int WATER = 2;
		//���� �ִ´�.
		final int FIRE = 3;
		//���� ���δ�.
		final int BOIL = 4;
		//��Ḧ �ִ´�.
		final int INJECT = 5;
		//���� ����.
		final int OFF = 6;
		//����� �ȳ��Ѵ�.
		final int EAT = 7;
		
		//������ ���¸� ������ ���ں����� ����� 1�� �Ҵ��Ѵ�.
		int nowState = INJECT;//���̽� ������������ ����, ���̽� ���� �ʰ��� default�� ���´�.
		switch (nowState) {
		case READY:
			System.out.println("���� ������.");
		case WATER:
			System.out.println("���� �ִ´�.");
		case FIRE:
			System.out.println("���� Ų��");
		case BOIL:
			System.out.println("���� ���δ�.");
			break;//switch�� �����Ѵ�.
		case INJECT:
			System.out.println("����� �ִ´�.");
		case OFF:
			System.out.println("���� ����.");
		case EAT:
			System.out.println("�ȳ�.");
			
		default:
			System.out.println("�ܴ�.");//�ɼ�
			
		}
	}
}
