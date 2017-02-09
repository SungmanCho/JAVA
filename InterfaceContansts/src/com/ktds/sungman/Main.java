package com.ktds.sungman;

import static com.ktds.sungman.constants.MemberGradeConst.*;

public class Main {
	public void start() {
		int grade = 0;

		if (grade == ADMIN) {
			System.out.println("관리자");
		}
		else if(grade == MEMBER){
			System.out.println("회원");
		}
		else if(grade==GUEST){
			System.out.println("손님");
		}
	}

	public static void main(String[] args) {
		new Main().start();
	}
}