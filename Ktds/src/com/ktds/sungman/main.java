package com.ktds.sungman;

public class main {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		teacher.teach("Oracle Database",student);//외부에서 입력되는 값을 받아야함.안에 있는 것은 파라미터이다.
	
		
	}
}
