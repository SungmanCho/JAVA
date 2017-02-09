package com.ktds.sungman;

public class EXCEPTION {
	public static void main(String[] args) {
		try {
			convertStringToNumber(null);
		} catch (Exception e) {
			
			System.out.println("문자를 다시 생성합니다.");
			System.out.println(e.getMessage());

		}
	}

	public static void convertStringToNumber(String str) throws Exception {
		if (str == null) {
			throw new Exception("파라미터를 작성해 주세요!!!!!");// 트라이 캐치 책임을 전가하는 것이다.
		}
		int convertedNumber = Integer.parseInt("NUM");
	}
}
