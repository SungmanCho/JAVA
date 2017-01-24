package com.ktds.sungman;

public class StudentMain {
	public static void  main(String[] args){
	Student csm = new Student();//메소드
	
	csm.study();
	csm.name();
	//csm.setName("조성만");
	//csm.name = "조성만";
	csm.eat();
	csm.test();
	
	csm.setStudy("study");
	csm.setName("원빈");
	csm.setEat("맥도날드");
	csm.setTest("오디션");
	
	csm.study();
	csm.name();
	//csm.setName("조성만");//메소드이다.
	//csm.name = "조성만";
	csm.eat();
	csm.test();
	}
}

