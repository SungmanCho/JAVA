package com.ktds.sungman;

import static com.ktds.sungman.constants.MemberGradeConst.*;

public class Main {
	public void start() {
		int grade = 0;

		if (grade == ADMIN) {
			System.out.println("������");
		}
		else if(grade == MEMBER){
			System.out.println("ȸ��");
		}
		else if(grade==GUEST){
			System.out.println("�մ�");
		}
	}

	public static void main(String[] args) {
		new Main().start();
	}
}