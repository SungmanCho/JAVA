package com.ktds.sungman;

public class StudentMain {
	public static void  main(String[] args){
	Student csm = new Student();//�޼ҵ�
	
	csm.study();
	csm.name();
	//csm.setName("������");
	//csm.name = "������";
	csm.eat();
	csm.test();
	
	csm.setStudy("study");
	csm.setName("����");
	csm.setEat("�Ƶ�����");
	csm.setTest("�����");
	
	csm.study();
	csm.name();
	//csm.setName("������");//�޼ҵ��̴�.
	//csm.name = "������";
	csm.eat();
	csm.test();
	}
}

