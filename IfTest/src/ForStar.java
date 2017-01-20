
public class ForStar {
	public static void main(String[] args) {
		
		for (int i = 1; i <6; i++) {
		//6번 반복되고 6번쨰에 종료
	
			if(i==1){
			//첫 번째 실행	
				System.out.println("%");
			}
			else if(i==2){
			//두 번째 실행	
				System.out.println("%%");
			}
			else if(i==3){
			//세 번째 실행	
				System.out.println("%%%");
			}
			else if(i==4){
			//네 번째 실행	
				System.out.println("%%%%");
			}
			else if(i==5){
			//다섯 번째 실행	
				System.out.println("%%%%%");
			}
			else{
			//여섯 번째 실행 종료	
				break;
			}
		}
	}
}
