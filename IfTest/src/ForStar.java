
public class ForStar {
	public static void main(String[] args) {
		
		for (int i = 1; i <6; i++) {
		//6�� �ݺ��ǰ� 6������ ����
	
			if(i==1){
			//ù ��° ����	
				System.out.println("%");
			}
			else if(i==2){
			//�� ��° ����	
				System.out.println("%%");
			}
			else if(i==3){
			//�� ��° ����	
				System.out.println("%%%");
			}
			else if(i==4){
			//�� ��° ����	
				System.out.println("%%%%");
			}
			else if(i==5){
			//�ټ� ��° ����	
				System.out.println("%%%%%");
			}
			else{
			//���� ��° ���� ����	
				break;
			}
		}
	}
}
