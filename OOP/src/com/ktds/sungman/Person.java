package com.ktds.sungman;
//1월 24일 강의 내용
public class Person {
	private String name;
	private String job;
	/*
	Default 생성자
	*/
	public Person(){
		System.out.println("Person 기본 생성자 실행됨.");
	}
	/*생성자 오버로딩
	기본 생성자에 파라미터를 추가해 데이터를 초기화 시킨다.*/
	/*@param name
	@param job*/
	public Person(String name, String job){
		System.out.println("Person 생성자 실행됨!");
		setName(name);//셋네임 호출
		setJob(job);//셋잡 호출
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setJob(String job){
		this.job=job;
	}
	public void introduce(){
		
		String message = String.format("이름 : %s, 직업: %s", name,job);
		System.out.println(message);
	}
}
