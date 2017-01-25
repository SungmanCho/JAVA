package com.ktds.sungman;

public class Teacher {
	public void teach(String java, Student student) {
		System.out.println(java+"를 가르칩니다.");//파라미터를 추가시켜줌
		student.learn(java);//
	}
}
