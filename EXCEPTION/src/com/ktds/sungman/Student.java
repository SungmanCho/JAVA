package com.ktds.sungman;

import com.ktds.sungman.exceptions.MissMatchValueException;
import com.ktds.sungman.exceptions.MissingValueException;

public class Student {
	public void start() throws MissingValueException {
		try {
			registNewStudent();
		} catch (MissMatchValueException e) {
			System.out.println(e.getMessage());// 캐치 두번한것. (ㅇ|ㅇ)는 두개 예외를 잡아내는
			// 것이다. 처리 못할 거 같으면 throws해라.

		} finally {
			System.out.println("잘 처리 됐습니다.");
		}
		System.out.println("정상적으로 수행되었습니다.");
	}

	public void registNewStudent() throws MissingValueException {
		{
			String name = "";// 아무것도 없는 것
			String school = "ktds1";

			if (name == null) {
				throw new MissingValueException("이름은 필수 입력 값입니다.");// Exception이다.
																	// throws
																	// 되자마자 밑에건
																	// 신경도 안쓴다.
																	// 자기가 던진거라서
																	// throws를
																	// 건다.
			}
			if (!school.equals("ktds")) {
				throw new MissMatchValueException("학교이름이 잘못 되었습니다.");// 런타임이라서
																		// 빨간줄이
																		// 나오지
																		// 않는다.
			}
		}
	}

	public static void main(String[] args) throws MissingValueException, MissMatchValueException {

		new Student().start();
	}

}
