
public class Arrays {
	public static void main(String[] args) {
		
		String[] names = {"2pac, jay-z, eminem"};//�迭 �ʱ�ȭ ���
		//���
		//������ ���� i�� 0���� ������ names���� ���� ���� ���� 1�� �����ϸ� �ݺ��Ѵ�.
		for(int i=0; i<names.length; i++){
			System.out.println(i);
			System.out.println(names[i]);
		}
		
		int[] scores = {100, 70, 20, 30, 100, 30, 50, 60, 70, 70};
		//�հ� ����� ���
		int sum = 0;//�ʱ�ȭ
		
		//������ ���� 1�� 0���� ������ scores �������� ���� ���� 1�� �����ϸ� �ݺ��Ѵ�.
		for(int i=0; i<scores.length; i++){
			System.out.println("���� i�� �� : " + i);
			System.out.println("���� i ��ġ��  �� : " + scores[i]);
			System.out.println("��������� ���� ���� : "+sum);
			sum= sum + scores[i];
		}
		System.out.println("���� ���� �� �� : "+ sum);
		//foreach
		//for�� �����ϰ� ����ϱ� ���� ���
		//�迭 ��Ҹ� ������ ������ �ش�.
		//�ſ�ſ� ������.
		//for���� ������.
		for(int score : scores){
			System.out.println(score);//��û���� ���� ����.��Ұ� ���°������ �˰� ��������  ���� for�� ���°� ����.
		}
	}
}
