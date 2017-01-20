import java.util.Scanner;
/**
 * 학점 계산하는 프로그램<br/>
 * 100점 A+<br/>
 * 90점 이상은 A<br/>
 * 80점 이상은 B<br/>
 * 70점 이상은 C<br/>
 * 60점 이상은 D<br/>
 * 그 이하는 F를 출력한다.
 * 
 * <pre>
 * 작성하고 싶은 내용
 * 취업하자!//엔터 안치고 하는것
 * <pre>
 * 
 * @author Cho Sung Man(xaiop777@gmail.com)
 *
 */
public class GradeTest {
Scanner input = new Scanner(System.in);
	
	void printInputScores(){
				
		//싱글 라인
		/*
		 * 멀티 라인
		 */
		//점수를 변수에 할당한다. 만점은 100점
		int[] scores = new int[1];
		System.out.println("성적 프로그램");
		System.out.println("성적을 입력하세요 : ");
		
		scores[0]=input.nextInt();
		
		int grade = scores[0];
		//점수가 100점일 떄
		if(grade==100){	
			System.out.println("A+");
		}
		//점수가100점이 아니고 90 이상일 때
		else if(grade>=90){
			System.out.println("A");
		}
		//점수가 90점 미만이고 80점 이상
		else if(grade>=80){
			System.out.println("B");
		}
		//점수가 80점 미만이고 70점 이상
		else if(grade>=70){
			System.out.println("C");
		}
		//점수가 70점 미만이고 60점 이상
		else if(grade>=60){
			System.out.println("D");
		}
		//점수가 60점 미만
		else{
			System.out.println("F");
		}
	}
	
}